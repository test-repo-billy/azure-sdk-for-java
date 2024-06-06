// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The request payload of get SSIS object metadata. */
@Fluent
public final class GetSsisObjectMetadataRequest {
    /*
     * Metadata path.
     */
    @JsonProperty(value = "metadataPath")
    private String metadataPath;

    /** Creates an instance of GetSsisObjectMetadataRequest class. */
    public GetSsisObjectMetadataRequest() {}

    /**
     * Get the metadataPath property: Metadata path.
     *
     * @return the metadataPath value.
     */
    public String getMetadataPath() {
        return this.metadataPath;
    }

    /**
     * Set the metadataPath property: Metadata path.
     *
     * @param metadataPath the metadataPath value to set.
     * @return the GetSsisObjectMetadataRequest object itself.
     */
    public GetSsisObjectMetadataRequest setMetadataPath(String metadataPath) {
        this.metadataPath = metadataPath;
        return this;
    }
}
