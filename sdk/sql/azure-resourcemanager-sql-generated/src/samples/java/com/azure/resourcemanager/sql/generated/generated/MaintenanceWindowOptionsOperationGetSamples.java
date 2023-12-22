// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for MaintenanceWindowOptionsOperation Get.
 */
public final class MaintenanceWindowOptionsOperationGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/GetMaintenanceWindowOptions.
     * json
     */
    /**
     * Sample code: Gets a list of available maintenance windows for a selected database.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void getsAListOfAvailableMaintenanceWindowsForASelectedDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.maintenanceWindowOptionsOperations().getWithResponse("Default-SQL-SouthEastAsia", "testsvr", "testdb",
            "current", com.azure.core.util.Context.NONE);
    }
}
