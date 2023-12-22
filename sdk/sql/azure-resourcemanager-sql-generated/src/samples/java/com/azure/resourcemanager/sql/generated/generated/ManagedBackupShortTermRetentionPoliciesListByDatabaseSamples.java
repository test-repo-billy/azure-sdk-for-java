// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ManagedBackupShortTermRetentionPolicies ListByDatabase.
 */
public final class ManagedBackupShortTermRetentionPoliciesListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * GetListManagedShortTermRetentionPolicy.json
     */
    /**
     * Sample code: Get the short term retention policy list for the database.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        getTheShortTermRetentionPolicyListForTheDatabase(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.managedBackupShortTermRetentionPolicies().listByDatabase("Default-SQL-SouthEastAsia", "testsvr",
            "testdb", com.azure.core.util.Context.NONE);
    }
}
