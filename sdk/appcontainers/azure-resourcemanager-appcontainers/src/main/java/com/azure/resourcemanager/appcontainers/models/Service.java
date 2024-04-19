// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container App to be a dev service.
 */
@Fluent
public final class Service {
    /*
     * Dev ContainerApp service type
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of Service class.
     */
    public Service() {
    }

    /**
     * Get the type property: Dev ContainerApp service type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Dev ContainerApp service type.
     * 
     * @param type the type value to set.
     * @return the Service object itself.
     */
    public Service withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property type in model Service"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Service.class);
}
