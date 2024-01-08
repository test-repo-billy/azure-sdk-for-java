// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for VpnConnections Delete.
 */
public final class VpnConnectionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/VpnConnectionDelete.json
     */
    /**
     * Sample code: VpnConnectionDelete.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void vpnConnectionDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.vpnConnections().delete("rg1", "gateway1", "vpnConnection1", com.azure.core.util.Context.NONE);
    }
}
