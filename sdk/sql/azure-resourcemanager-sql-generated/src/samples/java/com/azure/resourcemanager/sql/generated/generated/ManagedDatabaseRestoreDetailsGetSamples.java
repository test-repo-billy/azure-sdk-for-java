// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.RestoreDetailsName;

/**
 * Samples for ManagedDatabaseRestoreDetails Get.
 */
public final class ManagedDatabaseRestoreDetailsGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-05-01-preview/examples/
     * ManagedDatabaseRestoreDetails.json
     */
    /**
     * Sample code: Managed database restore details.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void managedDatabaseRestoreDetails(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.managedDatabaseRestoreDetails().getWithResponse("Default-SQL-SouthEastAsia", "managedInstance",
            "testdb", RestoreDetailsName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
