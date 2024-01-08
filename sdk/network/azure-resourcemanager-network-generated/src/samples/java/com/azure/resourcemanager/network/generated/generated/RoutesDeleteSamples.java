// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for Routes Delete.
 */
public final class RoutesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/RouteTableRouteDelete.json
     */
    /**
     * Sample code: Delete route.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteRoute(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routes().delete("rg1", "testrt", "route1", com.azure.core.util.Context.NONE);
    }
}
