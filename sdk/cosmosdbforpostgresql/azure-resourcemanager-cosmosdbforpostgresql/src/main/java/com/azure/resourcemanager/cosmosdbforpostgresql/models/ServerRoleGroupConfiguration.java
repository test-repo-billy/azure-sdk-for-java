// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents server role group configuration value.
 */
@Fluent
public final class ServerRoleGroupConfiguration {
    /*
     * The role of servers in the server role group.
     */
    @JsonProperty(value = "role", required = true)
    private ServerRole role;

    /*
     * Value of the configuration.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * Default value of the configuration.
     */
    @JsonProperty(value = "defaultValue", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultValue;

    /*
     * Source of the configuration.
     */
    @JsonProperty(value = "source", access = JsonProperty.Access.WRITE_ONLY)
    private String source;

    /**
     * Creates an instance of ServerRoleGroupConfiguration class.
     */
    public ServerRoleGroupConfiguration() {
    }

    /**
     * Get the role property: The role of servers in the server role group.
     * 
     * @return the role value.
     */
    public ServerRole role() {
        return this.role;
    }

    /**
     * Set the role property: The role of servers in the server role group.
     * 
     * @param role the role value to set.
     * @return the ServerRoleGroupConfiguration object itself.
     */
    public ServerRoleGroupConfiguration withRole(ServerRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get the value property: Value of the configuration.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the configuration.
     * 
     * @param value the value value to set.
     * @return the ServerRoleGroupConfiguration object itself.
     */
    public ServerRoleGroupConfiguration withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the defaultValue property: Default value of the configuration.
     * 
     * @return the defaultValue value.
     */
    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * Get the source property: Source of the configuration.
     * 
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (role() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property role in model ServerRoleGroupConfiguration"));
        }
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model ServerRoleGroupConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerRoleGroupConfiguration.class);
}
