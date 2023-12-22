// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.ServerConnectionType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a server connection policy.
 */
@Fluent
public final class ServerConnectionPolicyProperties {
    /*
     * The server connection type.
     */
    @JsonProperty(value = "connectionType", required = true)
    private ServerConnectionType connectionType;

    /**
     * Creates an instance of ServerConnectionPolicyProperties class.
     */
    public ServerConnectionPolicyProperties() {
    }

    /**
     * Get the connectionType property: The server connection type.
     * 
     * @return the connectionType value.
     */
    public ServerConnectionType connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: The server connection type.
     * 
     * @param connectionType the connectionType value to set.
     * @return the ServerConnectionPolicyProperties object itself.
     */
    public ServerConnectionPolicyProperties withConnectionType(ServerConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionType() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property connectionType in model ServerConnectionPolicyProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerConnectionPolicyProperties.class);
}
