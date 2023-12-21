/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure VM disk input details.
 */
public class A2AVmDiskInputDetails {
    /**
     * The disk Uri.
     */
    @JsonProperty(value = "diskUri")
    private String diskUri;

    /**
     * The recovery VHD storage account Id.
     */
    @JsonProperty(value = "recoveryAzureStorageAccountId")
    private String recoveryAzureStorageAccountId;

    /**
     * The primary staging storage account Id.
     */
    @JsonProperty(value = "primaryStagingAzureStorageAccountId")
    private String primaryStagingAzureStorageAccountId;

    /**
     * Get the disk Uri.
     *
     * @return the diskUri value
     */
    public String diskUri() {
        return this.diskUri;
    }

    /**
     * Set the disk Uri.
     *
     * @param diskUri the diskUri value to set
     * @return the A2AVmDiskInputDetails object itself.
     */
    public A2AVmDiskInputDetails withDiskUri(String diskUri) {
        this.diskUri = diskUri;
        return this;
    }

    /**
     * Get the recovery VHD storage account Id.
     *
     * @return the recoveryAzureStorageAccountId value
     */
    public String recoveryAzureStorageAccountId() {
        return this.recoveryAzureStorageAccountId;
    }

    /**
     * Set the recovery VHD storage account Id.
     *
     * @param recoveryAzureStorageAccountId the recoveryAzureStorageAccountId value to set
     * @return the A2AVmDiskInputDetails object itself.
     */
    public A2AVmDiskInputDetails withRecoveryAzureStorageAccountId(String recoveryAzureStorageAccountId) {
        this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
        return this;
    }

    /**
     * Get the primary staging storage account Id.
     *
     * @return the primaryStagingAzureStorageAccountId value
     */
    public String primaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId;
    }

    /**
     * Set the primary staging storage account Id.
     *
     * @param primaryStagingAzureStorageAccountId the primaryStagingAzureStorageAccountId value to set
     * @return the A2AVmDiskInputDetails object itself.
     */
    public A2AVmDiskInputDetails withPrimaryStagingAzureStorageAccountId(String primaryStagingAzureStorageAccountId) {
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        return this;
    }

}
