/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information used to connect to an Azure Fileshare.
 */
public class AzureFileShareConfiguration {
    /**
     * The Azure Storage account name.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /**
     * The Azure Files URL.
     * This is of the form 'https://{account}.file.core.windows.net/'.
     */
    @JsonProperty(value = "azureFileUrl", required = true)
    private String azureFileUrl;

    /**
     * The Azure Storage account key.
     */
    @JsonProperty(value = "accountKey", required = true)
    private String accountKey;

    /**
     * The relative path on the compute node where the file system will be
     * mounted.
     * All file systems are mounted relative to the Batch mounts directory,
     * accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /**
     * Additional command line options to pass to the mount command.
     * These are 'net use' options in Windows and 'mount' options in Linux.
     */
    @JsonProperty(value = "mountOptions")
    private String mountOptions;

    /**
     * Get the accountName value.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName value.
     *
     * @param accountName the accountName value to set
     * @return the AzureFileShareConfiguration object itself.
     */
    public AzureFileShareConfiguration withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get this is of the form 'https://{account}.file.core.windows.net/'.
     *
     * @return the azureFileUrl value
     */
    public String azureFileUrl() {
        return this.azureFileUrl;
    }

    /**
     * Set this is of the form 'https://{account}.file.core.windows.net/'.
     *
     * @param azureFileUrl the azureFileUrl value to set
     * @return the AzureFileShareConfiguration object itself.
     */
    public AzureFileShareConfiguration withAzureFileUrl(String azureFileUrl) {
        this.azureFileUrl = azureFileUrl;
        return this;
    }

    /**
     * Get the accountKey value.
     *
     * @return the accountKey value
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey value.
     *
     * @param accountKey the accountKey value to set
     * @return the AzureFileShareConfiguration object itself.
     */
    public AzureFileShareConfiguration withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get all file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     *
     * @return the relativeMountPath value
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set all file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     *
     * @param relativeMountPath the relativeMountPath value to set
     * @return the AzureFileShareConfiguration object itself.
     */
    public AzureFileShareConfiguration withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

    /**
     * Get these are 'net use' options in Windows and 'mount' options in Linux.
     *
     * @return the mountOptions value
     */
    public String mountOptions() {
        return this.mountOptions;
    }

    /**
     * Set these are 'net use' options in Windows and 'mount' options in Linux.
     *
     * @param mountOptions the mountOptions value to set
     * @return the AzureFileShareConfiguration object itself.
     */
    public AzureFileShareConfiguration withMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

}
