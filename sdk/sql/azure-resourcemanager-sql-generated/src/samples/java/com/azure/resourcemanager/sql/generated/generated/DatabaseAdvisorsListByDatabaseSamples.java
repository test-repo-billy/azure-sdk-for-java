// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for DatabaseAdvisors ListByDatabase.
 */
public final class DatabaseAdvisorsListByDatabaseSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DatabaseAdvisorList.json
     */
    /**
     * Sample code: List of database advisors.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void listOfDatabaseAdvisors(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databaseAdvisors().listByDatabaseWithResponse("workloadinsight-demos", "misosisvr",
            "IndexAdvisor_test_3", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * DatabaseRecommendedActionListExpand.json
     */
    /**
     * Sample code: List of database recommended actions for all advisors.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        listOfDatabaseRecommendedActionsForAllAdvisors(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.databaseAdvisors().listByDatabaseWithResponse("workloadinsight-demos", "misosisvr",
            "IndexAdvisor_test_3", "recommendedActions", com.azure.core.util.Context.NONE);
    }
}
