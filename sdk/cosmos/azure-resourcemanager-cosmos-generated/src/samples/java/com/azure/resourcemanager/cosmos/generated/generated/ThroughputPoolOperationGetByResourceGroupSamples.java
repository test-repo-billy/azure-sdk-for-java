// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/**
 * Samples for ThroughputPoolOperation GetByResourceGroup.
 */
public final class ThroughputPoolOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/throughputPool/
     * CosmosDBThroughputPoolGet.json
     */
    /**
     * Sample code: CosmosDB ThroughputPool Get.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBThroughputPoolGet(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.throughputPoolOperations().getByResourceGroupWithResponse("rgName", "tp1",
            com.azure.core.util.Context.NONE);
    }
}
