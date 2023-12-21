// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationGatewaySku model. */
@Fluent
public final class ApplicationGatewaySku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewaySku.class);

    /*
     * Name of an application gateway SKU.
     */
    @JsonProperty(value = "name")
    private ApplicationGatewaySkuName name;

    /*
     * Tier of an application gateway.
     */
    @JsonProperty(value = "tier")
    private ApplicationGatewayTier tier;

    /*
     * Capacity (instance count) of an application gateway.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: Name of an application gateway SKU.
     *
     * @return the name value.
     */
    public ApplicationGatewaySkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of an application gateway SKU.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withName(ApplicationGatewaySkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Tier of an application gateway.
     *
     * @return the tier value.
     */
    public ApplicationGatewayTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Tier of an application gateway.
     *
     * @param tier the tier value to set.
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withTier(ApplicationGatewayTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: Capacity (instance count) of an application gateway.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Capacity (instance count) of an application gateway.
     *
     * @param capacity the capacity value to set.
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withCapacity(Integer capacity) {
        this.capacity = capacity;
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
