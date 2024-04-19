// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ThreatProtectionState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Properties of server Threat Protection state.
 */
@Fluent
public final class ServerThreatProtectionProperties {
    /*
     * Specifies the state of the Threat Protection, whether it is enabled or disabled or a state has not been applied yet on the specific server.
     */
    @JsonProperty(value = "state", required = true)
    private ThreatProtectionState state;

    /*
     * Specifies the UTC creation time of the policy.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /**
     * Creates an instance of ServerThreatProtectionProperties class.
     */
    public ServerThreatProtectionProperties() {
    }

    /**
     * Get the state property: Specifies the state of the Threat Protection, whether it is enabled or disabled or a
     * state has not been applied yet on the specific server.
     * 
     * @return the state value.
     */
    public ThreatProtectionState state() {
        return this.state;
    }

    /**
     * Set the state property: Specifies the state of the Threat Protection, whether it is enabled or disabled or a
     * state has not been applied yet on the specific server.
     * 
     * @param state the state value to set.
     * @return the ServerThreatProtectionProperties object itself.
     */
    public ServerThreatProtectionProperties withState(ThreatProtectionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the creationTime property: Specifies the UTC creation time of the policy.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property state in model ServerThreatProtectionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerThreatProtectionProperties.class);
}
