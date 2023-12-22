// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for DatabaseColumns ListByTable.
 */
public final class DatabaseColumnsListByTableSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DatabaseColumnListByTable.
     * json
     */
    /**
     * Sample code: List database columns.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void listDatabaseColumns(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databaseColumns().listByTable("myRG", "serverName", "myDatabase", "dbo", "table1", null,
            com.azure.core.util.Context.NONE);
    }
}
