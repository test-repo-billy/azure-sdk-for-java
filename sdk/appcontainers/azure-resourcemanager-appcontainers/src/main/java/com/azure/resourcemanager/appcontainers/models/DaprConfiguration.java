// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration properties Dapr component.
 */
@Immutable
public final class DaprConfiguration {
    /*
     * The version of Dapr
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Creates an instance of DaprConfiguration class.
     */
    public DaprConfiguration() {
    }

    /**
     * Get the version property: The version of Dapr.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
