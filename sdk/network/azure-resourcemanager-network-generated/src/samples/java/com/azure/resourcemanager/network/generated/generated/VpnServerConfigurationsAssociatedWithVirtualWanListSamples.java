// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for VpnServerConfigurationsAssociatedWithVirtualWan List.
 */
public final class VpnServerConfigurationsAssociatedWithVirtualWanListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * GetVirtualWanVpnServerConfigurations.json
     */
    /**
     * Sample code: GetVirtualWanVpnServerConfigurations.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        getVirtualWanVpnServerConfigurations(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.vpnServerConfigurationsAssociatedWithVirtualWans().list("rg1", "wan1",
            com.azure.core.util.Context.NONE);
    }
}
