// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for PeerExpressRouteCircuitConnections List.
 */
public final class PeerExpressRouteCircuitConnectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * PeerExpressRouteCircuitConnectionList.json
     */
    /**
     * Sample code: List Peer ExpressRouteCircuit Connection.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        listPeerExpressRouteCircuitConnection(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.peerExpressRouteCircuitConnections().list("rg1", "ExpressRouteARMCircuitA", "AzurePrivatePeering",
            com.azure.core.util.Context.NONE);
    }
}
