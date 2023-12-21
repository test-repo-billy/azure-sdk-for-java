/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The effective network security group association.
 */
public class EffectiveNetworkSecurityGroupAssociation {
    /**
     * The ID of the subnet if assigned.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /**
     * The ID of the network interface if assigned.
     */
    @JsonProperty(value = "networkInterface")
    private SubResource networkInterface;

    /**
     * Get the ID of the subnet if assigned.
     *
     * @return the subnet value
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the ID of the subnet if assigned.
     *
     * @param subnet the subnet value to set
     * @return the EffectiveNetworkSecurityGroupAssociation object itself.
     */
    public EffectiveNetworkSecurityGroupAssociation withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the ID of the network interface if assigned.
     *
     * @return the networkInterface value
     */
    public SubResource networkInterface() {
        return this.networkInterface;
    }

    /**
     * Set the ID of the network interface if assigned.
     *
     * @param networkInterface the networkInterface value to set
     * @return the EffectiveNetworkSecurityGroupAssociation object itself.
     */
    public EffectiveNetworkSecurityGroupAssociation withNetworkInterface(SubResource networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }

}
