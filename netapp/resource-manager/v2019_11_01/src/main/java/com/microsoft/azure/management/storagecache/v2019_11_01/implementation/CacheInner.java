/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_11_01.implementation;

import com.microsoft.azure.management.storagecache.v2019_11_01.CacheHealth;
import java.util.List;
import com.microsoft.azure.management.storagecache.v2019_11_01.ProvisioningStateType;
import com.microsoft.azure.management.storagecache.v2019_11_01.CacheUpgradeStatus;
import com.microsoft.azure.management.storagecache.v2019_11_01.CacheSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A Cache instance. Follows Azure Resource Manager standards:
 * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/resource-api-reference.md.
 */
@JsonFlatten
public class CacheInner extends Resource {
    /**
     * The size of this Cache, in GB.
     */
    @JsonProperty(value = "properties.cacheSizeGB")
    private Integer cacheSizeGB;

    /**
     * Health of the Cache.
     */
    @JsonProperty(value = "properties.health", access = JsonProperty.Access.WRITE_ONLY)
    private CacheHealth health;

    /**
     * Array of IP addresses that can be used by clients mounting this Cache.
     */
    @JsonProperty(value = "properties.mountAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> mountAddresses;

    /**
     * ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property.
     * Possible values include: 'Succeeded', 'Failed', 'Cancelled', 'Creating',
     * 'Deleting', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningStateType provisioningState;

    /**
     * Subnet used for the Cache.
     */
    @JsonProperty(value = "properties.subnet")
    private String subnet;

    /**
     * Upgrade status of the Cache.
     */
    @JsonProperty(value = "properties.upgradeStatus")
    private CacheUpgradeStatus upgradeStatus;

    /**
     * SKU for the Cache.
     */
    @JsonProperty(value = "sku")
    private CacheSku sku;

    /**
     * Get the size of this Cache, in GB.
     *
     * @return the cacheSizeGB value
     */
    public Integer cacheSizeGB() {
        return this.cacheSizeGB;
    }

    /**
     * Set the size of this Cache, in GB.
     *
     * @param cacheSizeGB the cacheSizeGB value to set
     * @return the CacheInner object itself.
     */
    public CacheInner withCacheSizeGB(Integer cacheSizeGB) {
        this.cacheSizeGB = cacheSizeGB;
        return this;
    }

    /**
     * Get health of the Cache.
     *
     * @return the health value
     */
    public CacheHealth health() {
        return this.health;
    }

    /**
     * Get array of IP addresses that can be used by clients mounting this Cache.
     *
     * @return the mountAddresses value
     */
    public List<String> mountAddresses() {
        return this.mountAddresses;
    }

    /**
     * Get aRM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property. Possible values include: 'Succeeded', 'Failed', 'Cancelled', 'Creating', 'Deleting', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ProvisioningStateType provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set aRM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property. Possible values include: 'Succeeded', 'Failed', 'Cancelled', 'Creating', 'Deleting', 'Updating'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the CacheInner object itself.
     */
    public CacheInner withProvisioningState(ProvisioningStateType provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get subnet used for the Cache.
     *
     * @return the subnet value
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set subnet used for the Cache.
     *
     * @param subnet the subnet value to set
     * @return the CacheInner object itself.
     */
    public CacheInner withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get upgrade status of the Cache.
     *
     * @return the upgradeStatus value
     */
    public CacheUpgradeStatus upgradeStatus() {
        return this.upgradeStatus;
    }

    /**
     * Set upgrade status of the Cache.
     *
     * @param upgradeStatus the upgradeStatus value to set
     * @return the CacheInner object itself.
     */
    public CacheInner withUpgradeStatus(CacheUpgradeStatus upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
        return this;
    }

    /**
     * Get sKU for the Cache.
     *
     * @return the sku value
     */
    public CacheSku sku() {
        return this.sku;
    }

    /**
     * Set sKU for the Cache.
     *
     * @param sku the sku value to set
     * @return the CacheInner object itself.
     */
    public CacheInner withSku(CacheSku sku) {
        this.sku = sku;
        return this;
    }

}
