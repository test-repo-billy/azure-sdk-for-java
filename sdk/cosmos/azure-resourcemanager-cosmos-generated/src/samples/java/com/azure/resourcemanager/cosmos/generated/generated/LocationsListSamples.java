// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/**
 * Samples for Locations List.
 */
public final class LocationsListSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBLocationList.json
     */
    /**
     * Sample code: CosmosDBLocationList.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void cosmosDBLocationList(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.locations().list(com.azure.core.util.Context.NONE);
    }
}
