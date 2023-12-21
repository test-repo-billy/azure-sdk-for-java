/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Read-write endpoint of the failover group instance.
 */
public class FailoverGroupReadWriteEndpoint {
    /**
     * Failover policy of the read-write endpoint for the failover group. If
     * failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes
     * is required. Possible values include: 'Manual', 'Automatic'.
     */
    @JsonProperty(value = "failoverPolicy", required = true)
    private ReadWriteEndpointFailoverPolicy failoverPolicy;

    /**
     * Grace period before failover with data loss is attempted for the
     * read-write endpoint. If failoverPolicy is Automatic then
     * failoverWithDataLossGracePeriodMinutes is required.
     */
    @JsonProperty(value = "failoverWithDataLossGracePeriodMinutes")
    private Integer failoverWithDataLossGracePeriodMinutes;

    /**
     * Get failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required. Possible values include: 'Manual', 'Automatic'.
     *
     * @return the failoverPolicy value
     */
    public ReadWriteEndpointFailoverPolicy failoverPolicy() {
        return this.failoverPolicy;
    }

    /**
     * Set failover policy of the read-write endpoint for the failover group. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required. Possible values include: 'Manual', 'Automatic'.
     *
     * @param failoverPolicy the failoverPolicy value to set
     * @return the FailoverGroupReadWriteEndpoint object itself.
     */
    public FailoverGroupReadWriteEndpoint withFailoverPolicy(ReadWriteEndpointFailoverPolicy failoverPolicy) {
        this.failoverPolicy = failoverPolicy;
        return this;
    }

    /**
     * Get grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     *
     * @return the failoverWithDataLossGracePeriodMinutes value
     */
    public Integer failoverWithDataLossGracePeriodMinutes() {
        return this.failoverWithDataLossGracePeriodMinutes;
    }

    /**
     * Set grace period before failover with data loss is attempted for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     *
     * @param failoverWithDataLossGracePeriodMinutes the failoverWithDataLossGracePeriodMinutes value to set
     * @return the FailoverGroupReadWriteEndpoint object itself.
     */
    public FailoverGroupReadWriteEndpoint withFailoverWithDataLossGracePeriodMinutes(Integer failoverWithDataLossGracePeriodMinutes) {
        this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
        return this;
    }

}
