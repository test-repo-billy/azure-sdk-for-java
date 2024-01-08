// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for VirtualNetworkTaps List.
 */
public final class VirtualNetworkTapsListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/VirtualNetworkTapListAll.json
     */
    /**
     * Sample code: List all virtual network taps.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllVirtualNetworkTaps(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworkTaps().list(com.azure.core.util.Context.NONE);
    }
}
