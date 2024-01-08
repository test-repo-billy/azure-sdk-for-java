// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.BackendAddressPoolInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ListBackendAddressPool API service call.
 */
@Fluent
public final class LoadBalancerBackendAddressPoolListResult {
    /*
     * A list of backend address pools in a load balancer.
     */
    @JsonProperty(value = "value")
    private List<BackendAddressPoolInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of LoadBalancerBackendAddressPoolListResult class.
     */
    public LoadBalancerBackendAddressPoolListResult() {
    }

    /**
     * Get the value property: A list of backend address pools in a load balancer.
     * 
     * @return the value value.
     */
    public List<BackendAddressPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of backend address pools in a load balancer.
     * 
     * @param value the value value to set.
     * @return the LoadBalancerBackendAddressPoolListResult object itself.
     */
    public LoadBalancerBackendAddressPoolListResult withValue(List<BackendAddressPoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
