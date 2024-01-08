// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Read-only endpoint of the failover group instance.
 */
@Fluent
public final class FailoverGroupReadOnlyEndpoint {
    /*
     * Failover policy of the read-only endpoint for the failover group.
     */
    @JsonProperty(value = "failoverPolicy")
    private ReadOnlyEndpointFailoverPolicy failoverPolicy;

    /*
     * The target partner server where the read-only endpoint points to.
     */
    @JsonProperty(value = "targetServer")
    private String targetServer;

    /**
     * Creates an instance of FailoverGroupReadOnlyEndpoint class.
     */
    public FailoverGroupReadOnlyEndpoint() {
    }

    /**
     * Get the failoverPolicy property: Failover policy of the read-only endpoint for the failover group.
     * 
     * @return the failoverPolicy value.
     */
    public ReadOnlyEndpointFailoverPolicy failoverPolicy() {
        return this.failoverPolicy;
    }

    /**
     * Set the failoverPolicy property: Failover policy of the read-only endpoint for the failover group.
     * 
     * @param failoverPolicy the failoverPolicy value to set.
     * @return the FailoverGroupReadOnlyEndpoint object itself.
     */
    public FailoverGroupReadOnlyEndpoint withFailoverPolicy(ReadOnlyEndpointFailoverPolicy failoverPolicy) {
        this.failoverPolicy = failoverPolicy;
        return this;
    }

    /**
     * Get the targetServer property: The target partner server where the read-only endpoint points to.
     * 
     * @return the targetServer value.
     */
    public String targetServer() {
        return this.targetServer;
    }

    /**
     * Set the targetServer property: The target partner server where the read-only endpoint points to.
     * 
     * @param targetServer the targetServer value to set.
     * @return the FailoverGroupReadOnlyEndpoint object itself.
     */
    public FailoverGroupReadOnlyEndpoint withTargetServer(String targetServer) {
        this.targetServer = targetServer;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
