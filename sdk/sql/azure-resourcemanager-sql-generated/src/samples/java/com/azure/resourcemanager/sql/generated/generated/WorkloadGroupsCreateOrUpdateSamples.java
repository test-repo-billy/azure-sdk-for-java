// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for WorkloadGroups CreateOrUpdate.
 */
public final class WorkloadGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * CreateOrUpdateWorkloadGroupMin.json
     */
    /**
     * Sample code: Create a workload group with the required properties specified.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void createAWorkloadGroupWithTheRequiredPropertiesSpecified(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.workloadGroups().define("smallrc")
            .withExistingDatabase("Default-SQL-SouthEastAsia", "testsvr", "testdb").withMinResourcePercent(0)
            .withMaxResourcePercent(100).withMinResourcePercentPerRequest(3.0).create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * CreateOrUpdateWorkloadGroupMax.json
     */
    /**
     * Sample code: Create a workload group with all properties specified.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        createAWorkloadGroupWithAllPropertiesSpecified(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.workloadGroups().define("smallrc")
            .withExistingDatabase("Default-SQL-SouthEastAsia", "testsvr", "testdb").withMinResourcePercent(0)
            .withMaxResourcePercent(100).withMinResourcePercentPerRequest(3.0).withMaxResourcePercentPerRequest(3.0D)
            .withImportance("normal").withQueryExecutionTimeout(0).create();
    }
}
