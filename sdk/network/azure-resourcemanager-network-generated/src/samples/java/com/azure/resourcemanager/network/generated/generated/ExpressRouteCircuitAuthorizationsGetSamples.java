// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for ExpressRouteCircuitAuthorizations Get.
 */
public final class ExpressRouteCircuitAuthorizationsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * ExpressRouteCircuitAuthorizationGet.json
     */
    /**
     * Sample code: Get ExpressRouteCircuit Authorization.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        getExpressRouteCircuitAuthorization(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCircuitAuthorizations().getWithResponse("rg1", "circuitName", "authorizationName",
            com.azure.core.util.Context.NONE);
    }
}
