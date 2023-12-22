// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for NetworkVirtualApplianceConnections Delete.
 */
public final class NetworkVirtualApplianceConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * NetworkVirtualApplianceConnectionDelete.json
     */
    /**
     * Sample code: NetworkVirtualApplianceConnectionDelete.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        networkVirtualApplianceConnectionDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkVirtualApplianceConnections().delete("rg1", "nva1", "connection1",
            com.azure.core.util.Context.NONE);
    }
}
