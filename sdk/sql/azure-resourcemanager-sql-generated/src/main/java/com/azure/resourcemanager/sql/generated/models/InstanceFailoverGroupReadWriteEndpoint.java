// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Read-write endpoint of the failover group instance.
 */
@Fluent
public final class InstanceFailoverGroupReadWriteEndpoint {
    /*
     * Failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then
     * failoverWithDataLossGracePeriodMinutes is required.
     */
    @JsonProperty(value = "failoverPolicy", required = true)
    private ReadWriteEndpointFailoverPolicy failoverPolicy;

    /*
     * Grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is
     * Automatic then failoverWithDataLossGracePeriodMinutes is required.
     */
    @JsonProperty(value = "failoverWithDataLossGracePeriodMinutes")
    private Integer failoverWithDataLossGracePeriodMinutes;

    /**
     * Creates an instance of InstanceFailoverGroupReadWriteEndpoint class.
     */
    public InstanceFailoverGroupReadWriteEndpoint() {
    }

    /**
     * Get the failoverPolicy property: Failover policy of the read-write endpoint for the failover group. If
     * failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     * @return the failoverPolicy value.
     */
    public ReadWriteEndpointFailoverPolicy failoverPolicy() {
        return this.failoverPolicy;
    }

    /**
     * Set the failoverPolicy property: Failover policy of the read-write endpoint for the failover group. If
     * failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     * 
     * @param failoverPolicy the failoverPolicy value to set.
     * @return the InstanceFailoverGroupReadWriteEndpoint object itself.
     */
    public InstanceFailoverGroupReadWriteEndpoint withFailoverPolicy(ReadWriteEndpointFailoverPolicy failoverPolicy) {
        this.failoverPolicy = failoverPolicy;
        return this;
    }

    /**
     * Get the failoverWithDataLossGracePeriodMinutes property: Grace period before failover with data loss is
     * attempted for the read-write endpoint. If failoverPolicy is Automatic then
     * failoverWithDataLossGracePeriodMinutes is required.
     * 
     * @return the failoverWithDataLossGracePeriodMinutes value.
     */
    public Integer failoverWithDataLossGracePeriodMinutes() {
        return this.failoverWithDataLossGracePeriodMinutes;
    }

    /**
     * Set the failoverWithDataLossGracePeriodMinutes property: Grace period before failover with data loss is
     * attempted for the read-write endpoint. If failoverPolicy is Automatic then
     * failoverWithDataLossGracePeriodMinutes is required.
     * 
     * @param failoverWithDataLossGracePeriodMinutes the failoverWithDataLossGracePeriodMinutes value to set.
     * @return the InstanceFailoverGroupReadWriteEndpoint object itself.
     */
    public InstanceFailoverGroupReadWriteEndpoint
        withFailoverWithDataLossGracePeriodMinutes(Integer failoverWithDataLossGracePeriodMinutes) {
        this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (failoverPolicy() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property failoverPolicy in model InstanceFailoverGroupReadWriteEndpoint"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InstanceFailoverGroupReadWriteEndpoint.class);
}
