/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01.implementation;

import com.microsoft.azure.management.storage.v2019_04_01.CorsRules;
import com.microsoft.azure.management.storage.v2019_04_01.DeleteRetentionPolicy;
import com.microsoft.azure.management.storage.v2019_04_01.ChangeFeed;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The properties of a storage account’s Blob service.
 */
@JsonFlatten
public class BlobServicePropertiesInner extends ProxyResource {
    /**
     * Specifies CORS rules for the Blob service. You can include up to five
     * CorsRule elements in the request. If no CorsRule elements are included
     * in the request body, all CORS rules will be deleted, and CORS will be
     * disabled for the Blob service.
     */
    @JsonProperty(value = "properties.cors")
    private CorsRules cors;

    /**
     * DefaultServiceVersion indicates the default version to use for requests
     * to the Blob service if an incoming request’s version is not specified.
     * Possible values include version 2008-10-27 and all more recent versions.
     */
    @JsonProperty(value = "properties.defaultServiceVersion")
    private String defaultServiceVersion;

    /**
     * The blob service properties for soft delete.
     */
    @JsonProperty(value = "properties.deleteRetentionPolicy")
    private DeleteRetentionPolicy deleteRetentionPolicy;

    /**
     * Automatic Snapshot is enabled if set to true.
     */
    @JsonProperty(value = "properties.automaticSnapshotPolicyEnabled")
    private Boolean automaticSnapshotPolicyEnabled;

    /**
     * The blob service properties for change feed events.
     */
    @JsonProperty(value = "properties.changeFeed")
    private ChangeFeed changeFeed;

    /**
     * Get specifies CORS rules for the Blob service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Blob service.
     *
     * @return the cors value
     */
    public CorsRules cors() {
        return this.cors;
    }

    /**
     * Set specifies CORS rules for the Blob service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Blob service.
     *
     * @param cors the cors value to set
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withCors(CorsRules cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get defaultServiceVersion indicates the default version to use for requests to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27 and all more recent versions.
     *
     * @return the defaultServiceVersion value
     */
    public String defaultServiceVersion() {
        return this.defaultServiceVersion;
    }

    /**
     * Set defaultServiceVersion indicates the default version to use for requests to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27 and all more recent versions.
     *
     * @param defaultServiceVersion the defaultServiceVersion value to set
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withDefaultServiceVersion(String defaultServiceVersion) {
        this.defaultServiceVersion = defaultServiceVersion;
        return this;
    }

    /**
     * Get the blob service properties for soft delete.
     *
     * @return the deleteRetentionPolicy value
     */
    public DeleteRetentionPolicy deleteRetentionPolicy() {
        return this.deleteRetentionPolicy;
    }

    /**
     * Set the blob service properties for soft delete.
     *
     * @param deleteRetentionPolicy the deleteRetentionPolicy value to set
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy) {
        this.deleteRetentionPolicy = deleteRetentionPolicy;
        return this;
    }

    /**
     * Get automatic Snapshot is enabled if set to true.
     *
     * @return the automaticSnapshotPolicyEnabled value
     */
    public Boolean automaticSnapshotPolicyEnabled() {
        return this.automaticSnapshotPolicyEnabled;
    }

    /**
     * Set automatic Snapshot is enabled if set to true.
     *
     * @param automaticSnapshotPolicyEnabled the automaticSnapshotPolicyEnabled value to set
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withAutomaticSnapshotPolicyEnabled(Boolean automaticSnapshotPolicyEnabled) {
        this.automaticSnapshotPolicyEnabled = automaticSnapshotPolicyEnabled;
        return this;
    }

    /**
     * Get the blob service properties for change feed events.
     *
     * @return the changeFeed value
     */
    public ChangeFeed changeFeed() {
        return this.changeFeed;
    }

    /**
     * Set the blob service properties for change feed events.
     *
     * @param changeFeed the changeFeed value to set
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withChangeFeed(ChangeFeed changeFeed) {
        this.changeFeed = changeFeed;
        return this;
    }

}
