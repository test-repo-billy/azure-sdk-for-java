// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for ExpressRouteCircuitConnections Get.
 */
public final class ExpressRouteCircuitConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * ExpressRouteCircuitConnectionGet.json
     */
    /**
     * Sample code: ExpressRouteCircuitConnectionGet.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        expressRouteCircuitConnectionGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCircuitConnections().getWithResponse("rg1", "ExpressRouteARMCircuitA",
            "AzurePrivatePeering", "circuitConnectionUSAUS", com.azure.core.util.Context.NONE);
    }
}
