// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for ExpressRouteCrossConnections ListArpTable.
 */
public final class ExpressRouteCrossConnectionsListArpTableSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * ExpressRouteCrossConnectionsArpTable.json
     */
    /**
     * Sample code: GetExpressRouteCrossConnectionsArpTable.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        getExpressRouteCrossConnectionsArpTable(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.expressRouteCrossConnections().listArpTable("CrossConnection-SiliconValley", "<circuitServiceKey>",
            "AzurePrivatePeering", "primary", com.azure.core.util.Context.NONE);
    }
}
