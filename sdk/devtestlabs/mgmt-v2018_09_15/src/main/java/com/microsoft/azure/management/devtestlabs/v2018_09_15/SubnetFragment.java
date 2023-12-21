/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subnet information.
 */
public class SubnetFragment {
    /**
     * The resource ID of the subnet.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * The name of the subnet as seen in the lab.
     */
    @JsonProperty(value = "labSubnetName")
    private String labSubnetName;

    /**
     * The permission policy of the subnet for allowing public IP addresses
     * (i.e. Allow, Deny)). Possible values include: 'Default', 'Deny',
     * 'Allow'.
     */
    @JsonProperty(value = "allowPublicIp")
    private UsagePermissionType allowPublicIp;

    /**
     * Get the resource ID of the subnet.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resource ID of the subnet.
     *
     * @param resourceId the resourceId value to set
     * @return the SubnetFragment object itself.
     */
    public SubnetFragment withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the name of the subnet as seen in the lab.
     *
     * @return the labSubnetName value
     */
    public String labSubnetName() {
        return this.labSubnetName;
    }

    /**
     * Set the name of the subnet as seen in the lab.
     *
     * @param labSubnetName the labSubnetName value to set
     * @return the SubnetFragment object itself.
     */
    public SubnetFragment withLabSubnetName(String labSubnetName) {
        this.labSubnetName = labSubnetName;
        return this;
    }

    /**
     * Get the permission policy of the subnet for allowing public IP addresses (i.e. Allow, Deny)). Possible values include: 'Default', 'Deny', 'Allow'.
     *
     * @return the allowPublicIp value
     */
    public UsagePermissionType allowPublicIp() {
        return this.allowPublicIp;
    }

    /**
     * Set the permission policy of the subnet for allowing public IP addresses (i.e. Allow, Deny)). Possible values include: 'Default', 'Deny', 'Allow'.
     *
     * @param allowPublicIp the allowPublicIp value to set
     * @return the SubnetFragment object itself.
     */
    public SubnetFragment withAllowPublicIp(UsagePermissionType allowPublicIp) {
        this.allowPublicIp = allowPublicIp;
        return this;
    }

}
