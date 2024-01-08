// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for DatabaseUsages ListByDatabase.
 */
public final class DatabaseUsagesListByDatabaseSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2021-02-01-preview/examples/GetDatabaseUsages.json
     */
    /**
     * Sample code: Gets database usages.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void getsDatabaseUsages(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databaseUsages().listByDatabase("Default-SQL-SouthEastAsia", "testsvr", "testdb",
            com.azure.core.util.Context.NONE);
    }
}
