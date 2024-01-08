// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ElasticPools ListMetrics.
 */
public final class ElasticPoolsListMetricsSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/ElasticPoolMetricsListWithFilter.json
     */
    /**
     * Sample code: List database usage metrics.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void listDatabaseUsageMetrics(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.elasticPools().listMetrics("sqlcrudtest-6730", "sqlcrudtest-9007", "3481",
            "name/value eq 'cpu_percent' and timeGrain eq '00:10:00' and startTime eq '2017-06-02T18:35:00Z' and endTime eq '2017-06-02T18:55:00Z'",
            com.azure.core.util.Context.NONE);
    }
}
