// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for ExpressRouteCrossConnections GetByResourceGroup.
 */
public final class ExpressRouteCrossConnectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * ExpressRouteCrossConnectionGet.json
     */
    /**
     * Sample code: GetExpressRouteCrossConnection.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        getExpressRouteCrossConnection(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCrossConnections().getByResourceGroupWithResponse("CrossConnection-SiliconValley",
            "<circuitServiceKey>", com.azure.core.util.Context.NONE);
    }
}
