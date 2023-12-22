// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.ProximityPlacementGroupInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List Proximity Placement Group operation response.
 */
@Fluent
public final class ProximityPlacementGroupListResult {
    /*
     * The list of proximity placement groups
     */
    @JsonProperty(value = "value", required = true)
    private List<ProximityPlacementGroupInner> value;

    /*
     * The URI to fetch the next page of proximity placement groups.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ProximityPlacementGroupListResult class.
     */
    public ProximityPlacementGroupListResult() {
    }

    /**
     * Get the value property: The list of proximity placement groups.
     * 
     * @return the value value.
     */
    public List<ProximityPlacementGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of proximity placement groups.
     * 
     * @param value the value value to set.
     * @return the ProximityPlacementGroupListResult object itself.
     */
    public ProximityPlacementGroupListResult withValue(List<ProximityPlacementGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of proximity placement groups.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of proximity placement groups.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ProximityPlacementGroupListResult object itself.
     */
    public ProximityPlacementGroupListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property value in model ProximityPlacementGroupListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProximityPlacementGroupListResult.class);
}
