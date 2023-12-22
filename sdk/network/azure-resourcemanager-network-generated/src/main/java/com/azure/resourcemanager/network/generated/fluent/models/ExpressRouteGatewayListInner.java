// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of ExpressRoute gateways.
 */
@Fluent
public final class ExpressRouteGatewayListInner {
    /*
     * List of ExpressRoute gateways.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteGatewayInner> value;

    /**
     * Creates an instance of ExpressRouteGatewayListInner class.
     */
    public ExpressRouteGatewayListInner() {
    }

    /**
     * Get the value property: List of ExpressRoute gateways.
     * 
     * @return the value value.
     */
    public List<ExpressRouteGatewayInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of ExpressRoute gateways.
     * 
     * @param value the value value to set.
     * @return the ExpressRouteGatewayListInner object itself.
     */
    public ExpressRouteGatewayListInner withValue(List<ExpressRouteGatewayInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
