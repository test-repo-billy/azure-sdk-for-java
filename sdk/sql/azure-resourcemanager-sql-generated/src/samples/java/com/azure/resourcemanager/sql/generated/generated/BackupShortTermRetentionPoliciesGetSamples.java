// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.ShortTermRetentionPolicyName;

/**
 * Samples for BackupShortTermRetentionPolicies Get.
 */
public final class BackupShortTermRetentionPoliciesGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2021-02-01-preview/examples/GetShortTermRetentionPolicy.
     * json
     */
    /**
     * Sample code: Get the short term retention policy for the database.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        getTheShortTermRetentionPolicyForTheDatabase(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.backupShortTermRetentionPolicies().getWithResponse("Default-SQL-SouthEastAsia", "testsvr", "testdb",
            ShortTermRetentionPolicyName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
