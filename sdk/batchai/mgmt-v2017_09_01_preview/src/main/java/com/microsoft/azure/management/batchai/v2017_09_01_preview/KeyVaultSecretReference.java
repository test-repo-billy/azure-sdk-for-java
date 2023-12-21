/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a reference to Key Vault Secret.
 */
public class KeyVaultSecretReference {
    /**
     * Fully qualified resource Id for the Key Vault.
     */
    @JsonProperty(value = "sourceVault", required = true)
    private ResourceId sourceVault;

    /**
     * The URL referencing a secret in a Key Vault.
     */
    @JsonProperty(value = "secretUrl", required = true)
    private String secretUrl;

    /**
     * Get the sourceVault value.
     *
     * @return the sourceVault value
     */
    public ResourceId sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault value.
     *
     * @param sourceVault the sourceVault value to set
     * @return the KeyVaultSecretReference object itself.
     */
    public KeyVaultSecretReference withSourceVault(ResourceId sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the secretUrl value.
     *
     * @return the secretUrl value
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl value.
     *
     * @param secretUrl the secretUrl value to set
     * @return the KeyVaultSecretReference object itself.
     */
    public KeyVaultSecretReference withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

}
