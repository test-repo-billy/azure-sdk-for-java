// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.ManagedShortTermRetentionPolicyName;

/**
 * Samples for ManagedBackupShortTermRetentionPolicies Get.
 */
public final class ManagedBackupShortTermRetentionPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * GetManagedShortTermRetentionPolicy.json
     */
    /**
     * Sample code: Get the short term retention policy for the database.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        getTheShortTermRetentionPolicyForTheDatabase(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.managedBackupShortTermRetentionPolicies().getWithResponse("Default-SQL-SouthEastAsia", "testsvr",
            "testdb", ManagedShortTermRetentionPolicyName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
