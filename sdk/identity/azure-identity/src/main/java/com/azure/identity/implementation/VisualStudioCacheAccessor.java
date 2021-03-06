// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.implementation;

import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.CredentialUnavailableException;
import com.azure.identity.KnownAuthorityHosts;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.aad.msal4jextensions.persistence.mac.KeyChainAccessor;
import com.sun.jna.Platform;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * This class allows access to Visual Studio Code cached credential data.
 */
public class VisualStudioCacheAccessor {
    private static final String PLATFORM_NOT_SUPPORTED_ERROR = "Platform could not be determined for VS Code"
                                               + " credential authentication.";
    private final ClientLogger logger = new ClientLogger(VisualStudioCacheAccessor.class);
    private static final Pattern REFRESH_TOKEN_PATTERN = Pattern.compile("^[-_.a-zA-Z0-9]+$");


    private JsonNode getUserSettings() {
        JsonNode output = null;
        String homeDir = System.getProperty("user.home");
        String settingsPath = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            if (Platform.isWindows()) {
                settingsPath = Paths.get(System.getenv("APPDATA"), "Code", "User", "settings.json")
                        .toString();
            } else if (Platform.isMac()) {
                settingsPath = Paths.get(homeDir, "Library",
                        "Application Support", "Code", "User", "settings.json").toString();
            } else if (Platform.isLinux()) {
                settingsPath = Paths.get(homeDir, ".config", "Code", "User", "settings.json")
                        .toString();
            }  else {
                throw logger.logExceptionAsError(
                        new CredentialUnavailableException(PLATFORM_NOT_SUPPORTED_ERROR));
            }
            File settingsFile = new File(settingsPath);
            output = mapper.readTree(settingsFile);
        } catch (Exception e) {
            return null;
        }
        return output;
    }

    /**
     * Get the user configured settings of Visual Studio code.
     *
     * @return a Map containing Vs Code user settings
     */
    public Map<String, String> getUserSettingsDetails() {
        JsonNode userSettings = getUserSettings();
        Map<String, String> details = new HashMap<>();

        String tenant = null;
        String cloud = "Azure";

        if (userSettings != null && !userSettings.isNull()) {
            if (userSettings.has("azure.tenant")) {
                tenant = userSettings.get("azure.tenant").asText();
            }

            if (userSettings.has("azure.cloud")) {
                cloud = userSettings.get("azure.cloud").asText();
            }
        }

        if (!CoreUtils.isNullOrEmpty(tenant)) {
            details.put("tenant", tenant);
        }

        details.put("cloud", cloud);
        return details;
    }



    /**
     * Get the credential for the specified service and account name.
     *
     * @param serviceName the name of the service to lookup.
     * @param accountName the account of the service to lookup.
     * @return the credential.
     */
    public String getCredentials(String serviceName, String accountName) {
        String credential;

        if (Platform.isWindows()) {

            try {
                WindowsCredentialAccessor winCredAccessor =
                        new WindowsCredentialAccessor(serviceName, accountName);
                credential = winCredAccessor.read();
            } catch (Exception e) {
                throw logger.logExceptionAsError(new CredentialUnavailableException(
                        "Failed to read Vs Code credentials from Windows Credential API.", e));
            }

        } else if (Platform.isMac()) {

            try {
                KeyChainAccessor keyChainAccessor = new KeyChainAccessor(null,
                        serviceName, accountName);

                byte[] readCreds = keyChainAccessor.read();
                credential = new String(readCreds, StandardCharsets.UTF_8);
            } catch (Exception e) {
                throw logger.logExceptionAsError(new CredentialUnavailableException(
                        "Failed to read Vs Code credentials from Mac Native Key Chain.", e));
            }

        } else if (Platform.isLinux()) {

            try {
                LinuxKeyRingAccessor keyRingAccessor = new LinuxKeyRingAccessor(
                        "org.freedesktop.Secret.Generic", "service",
                        serviceName, "account", accountName);

                byte[] readCreds = keyRingAccessor.read();
                credential = new String(readCreds, StandardCharsets.UTF_8);
            } catch (Exception e) {
                throw logger.logExceptionAsError(new CredentialUnavailableException(
                        "Failed to read Vs Code credentials from Linux Key Ring.", e));
            }

        } else {
            throw logger.logExceptionAsError(
                new CredentialUnavailableException(PLATFORM_NOT_SUPPORTED_ERROR));
        }

        if (CoreUtils.isNullOrEmpty(credential) || !isRefreshTokenString(credential)) {
            throw logger.logExceptionAsError(
                    new CredentialUnavailableException("Please authenticate via Azure Tools plugin in VS Code IDE."));
        }
        return credential;
    }

    private boolean isRefreshTokenString(String str) {
        return REFRESH_TOKEN_PATTERN.matcher(str).matches();
    }

    /**
     * Get the auth host of the specified {@code azureEnvironment}.
     *
     * @return the auth host.
     */
    public String getAzureAuthHost(String cloud) {

        switch (cloud) {
            case "Azure":
                return KnownAuthorityHosts.AZURE_CLOUD;
            case "AzureChina":
                return KnownAuthorityHosts.AZURE_CHINA_CLOUD;
            case "AzureGermanCloud":
                return KnownAuthorityHosts.AZURE_GERMAN_CLOUD;
            case "AzureUSGovernment":
                return KnownAuthorityHosts.AZURE_US_GOVERNMENT;
            default:
                return KnownAuthorityHosts.AZURE_CLOUD;
        }
    }

}
