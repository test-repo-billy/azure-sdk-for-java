/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Public IP Address associated with azure firewall.
 */
public class AzureFirewallPublicIPAddress {
    /**
     * Public IP Address value.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * Get public IP Address value.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set public IP Address value.
     *
     * @param address the address value to set
     * @return the AzureFirewallPublicIPAddress object itself.
     */
    public AzureFirewallPublicIPAddress withAddress(String address) {
        this.address = address;
        return this;
    }

}
