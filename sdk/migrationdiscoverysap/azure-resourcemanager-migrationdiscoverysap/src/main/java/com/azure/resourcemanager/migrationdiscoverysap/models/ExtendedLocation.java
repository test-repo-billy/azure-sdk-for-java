// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The extended location definition.
 */
@Fluent
public final class ExtendedLocation {
    /*
     * The extended location type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The extended location name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of ExtendedLocation class.
     */
    public ExtendedLocation() {
    }

    /**
     * Get the type property: The extended location type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The extended location type.
     * 
     * @param type the type value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The extended location name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The extended location name.
     * 
     * @param name the name value to set.
     * @return the ExtendedLocation object itself.
     */
    public ExtendedLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property type in model ExtendedLocation"));
        }
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model ExtendedLocation"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExtendedLocation.class);
}
