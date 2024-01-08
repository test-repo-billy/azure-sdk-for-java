// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for VirtualWans List.
 */
public final class VirtualWansListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/VirtualWANList.json
     */
    /**
     * Sample code: VirtualWANList.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualWANList(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualWans().list(com.azure.core.util.Context.NONE);
    }
}
