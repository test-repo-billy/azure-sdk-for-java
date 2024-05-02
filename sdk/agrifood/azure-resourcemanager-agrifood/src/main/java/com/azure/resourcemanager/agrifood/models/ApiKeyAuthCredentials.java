// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiKeyAuthCredentials class for ApiKey based Auth.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "kind", defaultImpl = ApiKeyAuthCredentials.class, visible = true)
@JsonTypeName("ApiKeyAuthCredentials")
@Fluent
public final class ApiKeyAuthCredentials extends AuthCredentials {
    /*
     * Enum for different types of AuthCredentials supported.
     */
    @JsonTypeId
    @JsonProperty(value = "kind", required = true)
    private AuthCredentialsKind kind = AuthCredentialsKind.API_KEY_AUTH_CREDENTIALS;

    /*
     * Properties of the key vault.
     */
    @JsonProperty(value = "apiKey", required = true)
    private KeyVaultProperties apiKey;

    /**
     * Creates an instance of ApiKeyAuthCredentials class.
     */
    public ApiKeyAuthCredentials() {
    }

    /**
     * Get the kind property: Enum for different types of AuthCredentials supported.
     * 
     * @return the kind value.
     */
    @Override
    public AuthCredentialsKind kind() {
        return this.kind;
    }

    /**
     * Get the apiKey property: Properties of the key vault.
     * 
     * @return the apiKey value.
     */
    public KeyVaultProperties apiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: Properties of the key vault.
     * 
     * @param apiKey the apiKey value to set.
     * @return the ApiKeyAuthCredentials object itself.
     */
    public ApiKeyAuthCredentials withApiKey(KeyVaultProperties apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (apiKey() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property apiKey in model ApiKeyAuthCredentials"));
        } else {
            apiKey().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApiKeyAuthCredentials.class);
}
