// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for VpnGateways ListByResourceGroup.
 */
public final class VpnGatewaysListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/VpnGatewayListByResourceGroup
     * .json
     */
    /**
     * Sample code: VpnGatewayListByResourceGroup.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        vpnGatewayListByResourceGroup(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.vpnGateways().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
