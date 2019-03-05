/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reverse replication input properties.
 */
public class ReverseReplicationInputProperties {
    /**
     * Failover direction.
     */
    @JsonProperty(value = "failoverDirection")
    private String failoverDirection;

    /**
     * Provider specific reverse replication input.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ReverseReplicationProviderSpecificInput providerSpecificDetails;

    /**
     * Get failover direction.
     *
     * @return the failoverDirection value
     */
    public String failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set failover direction.
     *
     * @param failoverDirection the failoverDirection value to set
     * @return the ReverseReplicationInputProperties object itself.
     */
    public ReverseReplicationInputProperties withFailoverDirection(String failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get provider specific reverse replication input.
     *
     * @return the providerSpecificDetails value
     */
    public ReverseReplicationProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set provider specific reverse replication input.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the ReverseReplicationInputProperties object itself.
     */
    public ReverseReplicationInputProperties withProviderSpecificDetails(ReverseReplicationProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

}
