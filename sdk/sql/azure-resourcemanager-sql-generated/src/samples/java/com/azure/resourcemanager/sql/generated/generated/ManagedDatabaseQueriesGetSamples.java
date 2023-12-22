// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ManagedDatabaseQueries Get.
 */
public final class ManagedDatabaseQueriesGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ManagedInstanceQueryGet.json
     */
    /**
     * Sample code: Obtain query properties.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void obtainQueryProperties(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.managedDatabaseQueries().getWithResponse("sqlcrudtest-7398", "sqlcrudtest-4645", "database_1", "42",
            com.azure.core.util.Context.NONE);
    }
}
