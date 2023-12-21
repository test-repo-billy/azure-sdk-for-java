/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.microsoft.azure.management.network.v2018_04_01.implementation.NetworkInterfaceIPConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application gateway backendhealth http settings.
 */
public class ApplicationGatewayBackendHealthServer {
    /**
     * IP address or FQDN of backend server.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * Reference of IP configuration of backend server.
     */
    @JsonProperty(value = "ipConfiguration")
    private NetworkInterfaceIPConfigurationInner ipConfiguration;

    /**
     * Health of backend server. Possible values include: 'Unknown', 'Up',
     * 'Down', 'Partial', 'Draining'.
     */
    @JsonProperty(value = "health")
    private ApplicationGatewayBackendHealthServerHealth health;

    /**
     * Get iP address or FQDN of backend server.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set iP address or FQDN of backend server.
     *
     * @param address the address value to set
     * @return the ApplicationGatewayBackendHealthServer object itself.
     */
    public ApplicationGatewayBackendHealthServer withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get reference of IP configuration of backend server.
     *
     * @return the ipConfiguration value
     */
    public NetworkInterfaceIPConfigurationInner ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Set reference of IP configuration of backend server.
     *
     * @param ipConfiguration the ipConfiguration value to set
     * @return the ApplicationGatewayBackendHealthServer object itself.
     */
    public ApplicationGatewayBackendHealthServer withIpConfiguration(NetworkInterfaceIPConfigurationInner ipConfiguration) {
        this.ipConfiguration = ipConfiguration;
        return this;
    }

    /**
     * Get health of backend server. Possible values include: 'Unknown', 'Up', 'Down', 'Partial', 'Draining'.
     *
     * @return the health value
     */
    public ApplicationGatewayBackendHealthServerHealth health() {
        return this.health;
    }

    /**
     * Set health of backend server. Possible values include: 'Unknown', 'Up', 'Down', 'Partial', 'Draining'.
     *
     * @param health the health value to set
     * @return the ApplicationGatewayBackendHealthServer object itself.
     */
    public ApplicationGatewayBackendHealthServer withHealth(ApplicationGatewayBackendHealthServerHealth health) {
        this.health = health;
        return this;
    }

}
