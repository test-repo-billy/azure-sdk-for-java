// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for PeerExpressRouteCircuitConnections Get.
 */
public final class PeerExpressRouteCircuitConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * PeerExpressRouteCircuitConnectionGet.json
     */
    /**
     * Sample code: PeerExpressRouteCircuitConnectionGet.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        peerExpressRouteCircuitConnectionGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.peerExpressRouteCircuitConnections().getWithResponse("rg1", "ExpressRouteARMCircuitA",
            "AzurePrivatePeering", "60aee347-e889-4a42-8c1b-0aae8b1e4013", com.azure.core.util.Context.NONE);
    }
}
