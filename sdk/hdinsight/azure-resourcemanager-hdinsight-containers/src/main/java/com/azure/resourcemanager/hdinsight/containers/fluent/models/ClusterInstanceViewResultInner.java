// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewResultProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cluster Instance View.
 */
@Fluent
public final class ClusterInstanceViewResultInner {
    /*
     * Name of the instance view.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Properties of the instance view.
     */
    @JsonProperty(value = "properties", required = true)
    private ClusterInstanceViewResultProperties properties;

    /**
     * Creates an instance of ClusterInstanceViewResultInner class.
     */
    public ClusterInstanceViewResultInner() {
    }

    /**
     * Get the name property: Name of the instance view.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the instance view.
     * 
     * @param name the name value to set.
     * @return the ClusterInstanceViewResultInner object itself.
     */
    public ClusterInstanceViewResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Properties of the instance view.
     * 
     * @return the properties value.
     */
    public ClusterInstanceViewResultProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the instance view.
     * 
     * @param properties the properties value to set.
     * @return the ClusterInstanceViewResultInner object itself.
     */
    public ClusterInstanceViewResultInner withProperties(ClusterInstanceViewResultProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model ClusterInstanceViewResultInner"));
        }
        if (properties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property properties in model ClusterInstanceViewResultInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterInstanceViewResultInner.class);
}
