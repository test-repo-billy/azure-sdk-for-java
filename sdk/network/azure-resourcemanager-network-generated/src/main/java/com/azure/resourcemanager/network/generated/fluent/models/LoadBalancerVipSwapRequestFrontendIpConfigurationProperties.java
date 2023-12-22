// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of VIP swap request's frontend IP configuration object.
 */
@Fluent
public final class LoadBalancerVipSwapRequestFrontendIpConfigurationProperties {
    /*
     * A reference to public IP address resource.
     */
    @JsonProperty(value = "publicIPAddress")
    private SubResource publicIpAddress;

    /**
     * Creates an instance of LoadBalancerVipSwapRequestFrontendIpConfigurationProperties class.
     */
    public LoadBalancerVipSwapRequestFrontendIpConfigurationProperties() {
    }

    /**
     * Get the publicIpAddress property: A reference to public IP address resource.
     * 
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: A reference to public IP address resource.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the LoadBalancerVipSwapRequestFrontendIpConfigurationProperties object itself.
     */
    public LoadBalancerVipSwapRequestFrontendIpConfigurationProperties
        withPublicIpAddress(SubResource publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
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
