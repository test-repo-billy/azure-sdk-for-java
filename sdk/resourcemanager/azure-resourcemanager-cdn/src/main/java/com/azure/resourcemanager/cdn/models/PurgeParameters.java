// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Parameters required for content purge.
 */
@Fluent
public final class PurgeParameters {
    /*
     * The path to the content to be purged. Can describe a file path or a wild card directory.
     */
    @JsonProperty(value = "contentPaths", required = true)
    private List<String> contentPaths;

    /**
     * Creates an instance of PurgeParameters class.
     */
    public PurgeParameters() {
    }

    /**
     * Get the contentPaths property: The path to the content to be purged. Can describe a file path or a wild card
     * directory.
     * 
     * @return the contentPaths value.
     */
    public List<String> contentPaths() {
        return this.contentPaths;
    }

    /**
     * Set the contentPaths property: The path to the content to be purged. Can describe a file path or a wild card
     * directory.
     * 
     * @param contentPaths the contentPaths value to set.
     * @return the PurgeParameters object itself.
     */
    public PurgeParameters withContentPaths(List<String> contentPaths) {
        this.contentPaths = contentPaths;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contentPaths() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property contentPaths in model PurgeParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PurgeParameters.class);
}
