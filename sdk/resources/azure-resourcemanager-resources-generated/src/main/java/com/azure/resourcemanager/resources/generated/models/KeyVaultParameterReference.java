// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Key Vault parameter reference.
 */
@Fluent
public final class KeyVaultParameterReference {
    /*
     * Azure Key Vault reference.
     */
    @JsonProperty(value = "keyVault", required = true)
    private KeyVaultReference keyVault;

    /*
     * Azure Key Vault secret name.
     */
    @JsonProperty(value = "secretName", required = true)
    private String secretName;

    /*
     * Azure Key Vault secret version.
     */
    @JsonProperty(value = "secretVersion")
    private String secretVersion;

    /**
     * Creates an instance of KeyVaultParameterReference class.
     */
    public KeyVaultParameterReference() {
    }

    /**
     * Get the keyVault property: Azure Key Vault reference.
     * 
     * @return the keyVault value.
     */
    public KeyVaultReference keyVault() {
        return this.keyVault;
    }

    /**
     * Set the keyVault property: Azure Key Vault reference.
     * 
     * @param keyVault the keyVault value to set.
     * @return the KeyVaultParameterReference object itself.
     */
    public KeyVaultParameterReference withKeyVault(KeyVaultReference keyVault) {
        this.keyVault = keyVault;
        return this;
    }

    /**
     * Get the secretName property: Azure Key Vault secret name.
     * 
     * @return the secretName value.
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: Azure Key Vault secret name.
     * 
     * @param secretName the secretName value to set.
     * @return the KeyVaultParameterReference object itself.
     */
    public KeyVaultParameterReference withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secretVersion property: Azure Key Vault secret version.
     * 
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: Azure Key Vault secret version.
     * 
     * @param secretVersion the secretVersion value to set.
     * @return the KeyVaultParameterReference object itself.
     */
    public KeyVaultParameterReference withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVault() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property keyVault in model KeyVaultParameterReference"));
        } else {
            keyVault().validate();
        }
        if (secretName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property secretName in model KeyVaultParameterReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeyVaultParameterReference.class);
}
