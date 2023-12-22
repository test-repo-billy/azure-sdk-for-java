// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for DatabaseRecommendedActions ListByDatabaseAdvisor.
 */
public final class DatabaseRecommendedActionsListByDatabaseAdvisorSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * DatabaseRecommendedActionList.json
     */
    /**
     * Sample code: List of database recommended actions.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void listOfDatabaseRecommendedActions(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databaseRecommendedActions().listByDatabaseAdvisorWithResponse("workloadinsight-demos", "misosisvr",
            "IndexAdvisor_test_3", "CreateIndex", com.azure.core.util.Context.NONE);
    }
}
