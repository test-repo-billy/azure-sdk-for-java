// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Deployment operation parameters.
 */
@Fluent
public final class Deployment {
    /*
     * The location to store the deployment data.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The deployment properties.
     */
    @JsonProperty(value = "properties", required = true)
    private DeploymentProperties properties;

    /*
     * Deployment tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Creates an instance of Deployment class.
     */
    public Deployment() {
    }

    /**
     * Get the location property: The location to store the deployment data.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location to store the deployment data.
     * 
     * @param location the location value to set.
     * @return the Deployment object itself.
     */
    public Deployment withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: The deployment properties.
     * 
     * @return the properties value.
     */
    public DeploymentProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The deployment properties.
     * 
     * @param properties the properties value to set.
     * @return the Deployment object itself.
     */
    public Deployment withProperties(DeploymentProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the tags property: Deployment tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Deployment tags.
     * 
     * @param tags the tags value to set.
     * @return the Deployment object itself.
     */
    public Deployment withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property properties in model Deployment"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Deployment.class);
}
