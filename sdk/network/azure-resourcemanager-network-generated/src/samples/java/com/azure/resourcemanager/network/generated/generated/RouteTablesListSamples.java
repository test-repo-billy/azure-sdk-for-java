// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for RouteTables List.
 */
public final class RouteTablesListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/RouteTableListAll.json
     */
    /**
     * Sample code: List all route tables.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllRouteTables(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.routeTables().list(com.azure.core.util.Context.NONE);
    }
}
