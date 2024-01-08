// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for RouteMaps Delete.
 */
public final class RouteMapsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/RouteMapDelete.json
     */
    /**
     * Sample code: RouteMapDelete.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void routeMapDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeMaps().delete("rg1", "virtualHub1", "routeMap1", com.azure.core.util.Context.NONE);
    }
}
