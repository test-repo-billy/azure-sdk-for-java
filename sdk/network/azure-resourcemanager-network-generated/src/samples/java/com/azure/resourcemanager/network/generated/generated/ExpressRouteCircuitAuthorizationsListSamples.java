// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for ExpressRouteCircuitAuthorizations List.
 */
public final class ExpressRouteCircuitAuthorizationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * ExpressRouteCircuitAuthorizationList.json
     */
    /**
     * Sample code: List ExpressRouteCircuit Authorization.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        listExpressRouteCircuitAuthorization(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCircuitAuthorizations().list("rg1", "circuitName", com.azure.core.util.Context.NONE);
    }
}
