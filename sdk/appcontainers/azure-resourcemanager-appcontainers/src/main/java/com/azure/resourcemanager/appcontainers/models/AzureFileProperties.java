// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure File Properties.
 */
@Fluent
public final class AzureFileProperties {
    /*
     * Storage account name for azure file.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /*
     * Storage account key for azure file.
     */
    @JsonProperty(value = "accountKey")
    private String accountKey;

    /*
     * Access mode for storage
     */
    @JsonProperty(value = "accessMode")
    private AccessMode accessMode;

    /*
     * Azure file share name.
     */
    @JsonProperty(value = "shareName")
    private String shareName;

    /**
     * Creates an instance of AzureFileProperties class.
     */
    public AzureFileProperties() {
    }

    /**
     * Get the accountName property: Storage account name for azure file.
     * 
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Storage account name for azure file.
     * 
     * @param accountName the accountName value to set.
     * @return the AzureFileProperties object itself.
     */
    public AzureFileProperties withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the accountKey property: Storage account key for azure file.
     * 
     * @return the accountKey value.
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: Storage account key for azure file.
     * 
     * @param accountKey the accountKey value to set.
     * @return the AzureFileProperties object itself.
     */
    public AzureFileProperties withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the accessMode property: Access mode for storage.
     * 
     * @return the accessMode value.
     */
    public AccessMode accessMode() {
        return this.accessMode;
    }

    /**
     * Set the accessMode property: Access mode for storage.
     * 
     * @param accessMode the accessMode value to set.
     * @return the AzureFileProperties object itself.
     */
    public AzureFileProperties withAccessMode(AccessMode accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * Get the shareName property: Azure file share name.
     * 
     * @return the shareName value.
     */
    public String shareName() {
        return this.shareName;
    }

    /**
     * Set the shareName property: Azure file share name.
     * 
     * @param shareName the shareName value to set.
     * @return the AzureFileProperties object itself.
     */
    public AzureFileProperties withShareName(String shareName) {
        this.shareName = shareName;
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
