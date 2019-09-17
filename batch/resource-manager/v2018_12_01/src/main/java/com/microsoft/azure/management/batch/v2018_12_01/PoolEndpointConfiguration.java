/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2018_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The endpoint configuration for a pool.
 */
public class PoolEndpointConfiguration {
    /**
     * A list of inbound NAT pools that can be used to address specific ports
     * on an individual compute node externally.
     * The maximum number of inbound NAT pools per Batch pool is 5. If the
     * maximum number of inbound NAT pools is exceeded the request fails with
     * HTTP status code 400.
     */
    @JsonProperty(value = "inboundNatPools", required = true)
    private List<InboundNatPool> inboundNatPools;

    /**
     * Get the maximum number of inbound NAT pools per Batch pool is 5. If the maximum number of inbound NAT pools is exceeded the request fails with HTTP status code 400.
     *
     * @return the inboundNatPools value
     */
    public List<InboundNatPool> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the maximum number of inbound NAT pools per Batch pool is 5. If the maximum number of inbound NAT pools is exceeded the request fails with HTTP status code 400.
     *
     * @param inboundNatPools the inboundNatPools value to set
     * @return the PoolEndpointConfiguration object itself.
     */
    public PoolEndpointConfiguration withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
        return this;
    }

}
