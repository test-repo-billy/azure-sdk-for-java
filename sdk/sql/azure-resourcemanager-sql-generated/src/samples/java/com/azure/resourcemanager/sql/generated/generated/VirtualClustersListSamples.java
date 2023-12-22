// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for VirtualClusters List.
 */
public final class VirtualClustersListSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2022-05-01-preview/examples/VirtualClusterList.json
     */
    /**
     * Sample code: List virtualClusters.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void listVirtualClusters(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.virtualClusters().list(com.azure.core.util.Context.NONE);
    }
}
