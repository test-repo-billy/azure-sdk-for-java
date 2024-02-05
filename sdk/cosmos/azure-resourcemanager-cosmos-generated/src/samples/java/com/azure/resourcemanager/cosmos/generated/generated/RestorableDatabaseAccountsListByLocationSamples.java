// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.generated;

/**
 * Samples for RestorableDatabaseAccounts ListByLocation.
 */
public final class RestorableDatabaseAccountsListByLocationSamples {
    /*
     * x-ms-original-file:
     * specification/cosmos-db/resource-manager/Microsoft.DocumentDB/preview/2024-01-15-preview/examples/
     * CosmosDBRestorableDatabaseAccountList.json
     */
    /**
     * Sample code: CosmosDBRestorableDatabaseAccountList.
     * 
     * @param manager Entry point to CosmosDBManager.
     */
    public static void
        cosmosDBRestorableDatabaseAccountList(com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager) {
        manager.restorableDatabaseAccounts().listByLocation("West US", com.azure.core.util.Context.NONE);
    }
}
