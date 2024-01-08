// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for WorkloadGroups Delete.
 */
public final class WorkloadGroupsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DeleteWorkloadGroup.json
     */
    /**
     * Sample code: Delete a workload group.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void deleteAWorkloadGroup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.workloadGroups().delete("Default-SQL-SouthEastAsia", "testsvr", "testdb", "wlm_workloadgroup",
            com.azure.core.util.Context.NONE);
    }
}
