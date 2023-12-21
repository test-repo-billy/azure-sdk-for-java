/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IP address range in the CIDR scheme.
 */
public class IPRange {
    /**
     * The friendly name for the IP address range.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The IP address.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * The subnet mask prefix length (see CIDR notation).
     */
    @JsonProperty(value = "subnetPrefixLength")
    private Integer subnetPrefixLength;

    /**
     * Get the friendly name for the IP address range.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the friendly name for the IP address range.
     *
     * @param name the name value to set
     * @return the IPRange object itself.
     */
    public IPRange withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the IP address.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the IP address.
     *
     * @param address the address value to set
     * @return the IPRange object itself.
     */
    public IPRange withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the subnet mask prefix length (see CIDR notation).
     *
     * @return the subnetPrefixLength value
     */
    public Integer subnetPrefixLength() {
        return this.subnetPrefixLength;
    }

    /**
     * Set the subnet mask prefix length (see CIDR notation).
     *
     * @param subnetPrefixLength the subnetPrefixLength value to set
     * @return the IPRange object itself.
     */
    public IPRange withSubnetPrefixLength(Integer subnetPrefixLength) {
        this.subnetPrefixLength = subnetPrefixLength;
        return this;
    }

}
