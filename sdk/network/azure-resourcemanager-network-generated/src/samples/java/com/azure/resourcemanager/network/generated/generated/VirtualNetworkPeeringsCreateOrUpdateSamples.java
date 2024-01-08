// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.SyncRemoteAddressSpace;

/**
 * Samples for VirtualNetworkPeerings CreateOrUpdate.
 */
public final class VirtualNetworkPeeringsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/VirtualNetworkPeeringSync.
     * json
     */
    /**
     * Sample code: Sync Peering.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void syncPeering(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkPeerings().define("peer").withExistingVirtualNetwork("peerTest", "vnet1")
            .withAllowVirtualNetworkAccess(true).withAllowForwardedTraffic(true).withAllowGatewayTransit(false)
            .withUseRemoteGateways(false)
            .withRemoteVirtualNetwork(new SubResource().withId(
                "/subscriptions/subid/resourceGroups/peerTest/providers/Microsoft.Network/virtualNetworks/vnet2"))
            .withSyncRemoteAddressSpace(SyncRemoteAddressSpace.TRUE).create();
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/VirtualNetworkPeeringCreate.
     * json
     */
    /**
     * Sample code: Create peering.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void createPeering(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkPeerings().define("peer").withExistingVirtualNetwork("peerTest", "vnet1")
            .withAllowVirtualNetworkAccess(true).withAllowForwardedTraffic(true).withAllowGatewayTransit(false)
            .withUseRemoteGateways(false)
            .withRemoteVirtualNetwork(new SubResource().withId(
                "/subscriptions/subid/resourceGroups/peerTest/providers/Microsoft.Network/virtualNetworks/vnet2"))
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * VirtualNetworkPeeringCreateWithRemoteVirtualNetworkEncryption.json
     */
    /**
     * Sample code: Create peering with remote virtual network encryption.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void createPeeringWithRemoteVirtualNetworkEncryption(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkPeerings().define("peer").withExistingVirtualNetwork("peerTest", "vnet1")
            .withAllowVirtualNetworkAccess(true).withAllowForwardedTraffic(true).withAllowGatewayTransit(false)
            .withUseRemoteGateways(false)
            .withRemoteVirtualNetwork(new SubResource().withId(
                "/subscriptions/subid/resourceGroups/peerTest/providers/Microsoft.Network/virtualNetworks/vnet2"))
            .create();
    }
}
