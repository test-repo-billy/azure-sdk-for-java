// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EnvironmentVariable model.
 */
@Fluent
public final class EnvironmentVariable {
    /*
     * Environment variable name
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Environment variable value
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Creates an instance of EnvironmentVariable class.
     */
    public EnvironmentVariable() {
    }

    /**
     * Get the name property: Environment variable name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Environment variable name.
     * 
     * @param name the name value to set.
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Environment variable value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Environment variable value.
     * 
     * @param value the value value to set.
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model EnvironmentVariable"));
        }
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model EnvironmentVariable"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EnvironmentVariable.class);
}
