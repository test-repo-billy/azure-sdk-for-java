// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ElasticPools Failover.
 */
public final class ElasticPoolsFailoverSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/FailoverElasticPool.json
     */
    /**
     * Sample code: Failover an elastic pool.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void failoverAnElasticPool(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.elasticPools().failover("group1", "testServer", "testElasticPool", com.azure.core.util.Context.NONE);
    }
}
