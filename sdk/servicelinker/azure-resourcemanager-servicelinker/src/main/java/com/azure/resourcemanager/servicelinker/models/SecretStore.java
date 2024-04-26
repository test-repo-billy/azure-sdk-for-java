// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An option to store secret value in secure place.
 */
@Fluent
public final class SecretStore {
    /*
     * The key vault id to store secret
     */
    @JsonProperty(value = "keyVaultId")
    private String keyVaultId;

    /**
     * Creates an instance of SecretStore class.
     */
    public SecretStore() {
    }

    /**
     * Get the keyVaultId property: The key vault id to store secret.
     * 
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the keyVaultId property: The key vault id to store secret.
     * 
     * @param keyVaultId the keyVaultId value to set.
     * @return the SecretStore object itself.
     */
    public SecretStore withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
