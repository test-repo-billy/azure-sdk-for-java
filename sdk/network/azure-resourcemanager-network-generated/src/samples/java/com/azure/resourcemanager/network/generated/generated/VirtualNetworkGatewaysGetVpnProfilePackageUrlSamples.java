// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for VirtualNetworkGateways GetVpnProfilePackageUrl.
 */
public final class VirtualNetworkGatewaysGetVpnProfilePackageUrlSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * VirtualNetworkGatewayGetVpnProfilePackageUrl.json
     */
    /**
     * Sample code: GetVirtualNetworkGatewayVPNProfilePackageURL.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualNetworkGatewayVPNProfilePackageURL(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkGateways().getVpnProfilePackageUrl("rg1", "vpngw", com.azure.core.util.Context.NONE);
    }
}
