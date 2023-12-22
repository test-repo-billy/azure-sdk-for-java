// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpDdosProtectionStatusResultInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for GetVirtualNetworkDdosProtectionStatusOperation.
 */
@Fluent
public final class VirtualNetworkDdosProtectionStatusResult {
    /*
     * The Ddos Protection Status Result for each public ip under a virtual network.
     */
    @JsonProperty(value = "value")
    private List<PublicIpDdosProtectionStatusResultInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of VirtualNetworkDdosProtectionStatusResult class.
     */
    public VirtualNetworkDdosProtectionStatusResult() {
    }

    /**
     * Get the value property: The Ddos Protection Status Result for each public ip under a virtual network.
     * 
     * @return the value value.
     */
    public List<PublicIpDdosProtectionStatusResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The Ddos Protection Status Result for each public ip under a virtual network.
     * 
     * @param value the value value to set.
     * @return the VirtualNetworkDdosProtectionStatusResult object itself.
     */
    public VirtualNetworkDdosProtectionStatusResult withValue(List<PublicIpDdosProtectionStatusResultInner> value) {
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
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the VirtualNetworkDdosProtectionStatusResult object itself.
     */
    public VirtualNetworkDdosProtectionStatusResult withNextLink(String nextLink) {
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
