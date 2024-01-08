// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for VirtualWans Delete.
 */
public final class VirtualWansDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/VirtualWANDelete.json
     */
    /**
     * Sample code: VirtualWANDelete.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualWANDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualWans().delete("rg1", "virtualWan1", com.azure.core.util.Context.NONE);
    }
}
