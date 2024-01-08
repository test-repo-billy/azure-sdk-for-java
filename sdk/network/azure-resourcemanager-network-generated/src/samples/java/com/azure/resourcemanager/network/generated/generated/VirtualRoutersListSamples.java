// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for VirtualRouters List.
 */
public final class VirtualRoutersListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * VirtualRouterListBySubscription.json
     */
    /**
     * Sample code: List all Virtual Routers for a given subscription.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        listAllVirtualRoutersForAGivenSubscription(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualRouters().list(com.azure.core.util.Context.NONE);
    }
}
