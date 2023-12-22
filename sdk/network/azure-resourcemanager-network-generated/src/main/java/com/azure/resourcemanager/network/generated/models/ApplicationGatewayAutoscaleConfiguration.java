// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application Gateway autoscale configuration.
 */
@Fluent
public final class ApplicationGatewayAutoscaleConfiguration {
    /*
     * Lower bound on number of Application Gateway capacity.
     */
    @JsonProperty(value = "minCapacity", required = true)
    private int minCapacity;

    /*
     * Upper bound on number of Application Gateway capacity.
     */
    @JsonProperty(value = "maxCapacity")
    private Integer maxCapacity;

    /**
     * Creates an instance of ApplicationGatewayAutoscaleConfiguration class.
     */
    public ApplicationGatewayAutoscaleConfiguration() {
    }

    /**
     * Get the minCapacity property: Lower bound on number of Application Gateway capacity.
     * 
     * @return the minCapacity value.
     */
    public int minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set the minCapacity property: Lower bound on number of Application Gateway capacity.
     * 
     * @param minCapacity the minCapacity value to set.
     * @return the ApplicationGatewayAutoscaleConfiguration object itself.
     */
    public ApplicationGatewayAutoscaleConfiguration withMinCapacity(int minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * Get the maxCapacity property: Upper bound on number of Application Gateway capacity.
     * 
     * @return the maxCapacity value.
     */
    public Integer maxCapacity() {
        return this.maxCapacity;
    }

    /**
     * Set the maxCapacity property: Upper bound on number of Application Gateway capacity.
     * 
     * @param maxCapacity the maxCapacity value to set.
     * @return the ApplicationGatewayAutoscaleConfiguration object itself.
     */
    public ApplicationGatewayAutoscaleConfiguration withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
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
