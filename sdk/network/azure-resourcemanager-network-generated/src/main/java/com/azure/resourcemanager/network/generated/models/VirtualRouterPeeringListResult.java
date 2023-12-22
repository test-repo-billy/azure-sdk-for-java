// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualRouterPeeringInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ListVirtualRouterPeerings API service call.
 */
@Fluent
public final class VirtualRouterPeeringListResult {
    /*
     * List of VirtualRouterPeerings in a VirtualRouter.
     */
    @JsonProperty(value = "value")
    private List<VirtualRouterPeeringInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of VirtualRouterPeeringListResult class.
     */
    public VirtualRouterPeeringListResult() {
    }

    /**
     * Get the value property: List of VirtualRouterPeerings in a VirtualRouter.
     * 
     * @return the value value.
     */
    public List<VirtualRouterPeeringInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of VirtualRouterPeerings in a VirtualRouter.
     * 
     * @param value the value value to set.
     * @return the VirtualRouterPeeringListResult object itself.
     */
    public VirtualRouterPeeringListResult withValue(List<VirtualRouterPeeringInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the VirtualRouterPeeringListResult object itself.
     */
    public VirtualRouterPeeringListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
