// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBPrivateEndpointConnectionGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        getsPrivateEndpointConnection(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.privateEndpointConnections().getWithResponse("rg1", "ddb1", "privateEndpointConnectionName",
            com.azure.core.util.Context.NONE);
    }
}
