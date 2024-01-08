// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP Configuration of a VPN Gateway Resource.
 */
@Fluent
public final class VpnGatewayIpConfiguration {
    /*
     * The identifier of the IP configuration for a VPN Gateway.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The public IP address of this IP configuration.
     */
    @JsonProperty(value = "publicIpAddress")
    private String publicIpAddress;

    /*
     * The private IP address of this IP configuration.
     */
    @JsonProperty(value = "privateIpAddress")
    private String privateIpAddress;

    /**
     * Creates an instance of VpnGatewayIpConfiguration class.
     */
    public VpnGatewayIpConfiguration() {
    }

    /**
     * Get the id property: The identifier of the IP configuration for a VPN Gateway.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The identifier of the IP configuration for a VPN Gateway.
     * 
     * @param id the id value to set.
     * @return the VpnGatewayIpConfiguration object itself.
     */
    public VpnGatewayIpConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the publicIpAddress property: The public IP address of this IP configuration.
     * 
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: The public IP address of this IP configuration.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the VpnGatewayIpConfiguration object itself.
     */
    public VpnGatewayIpConfiguration withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the privateIpAddress property: The private IP address of this IP configuration.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private IP address of this IP configuration.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the VpnGatewayIpConfiguration object itself.
     */
    public VpnGatewayIpConfiguration withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
