// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for DeletedServers ListByLocation.
 */
public final class DeletedServersListByLocationSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DeletedServerList.json
     */
    /**
     * Sample code: List deleted servers.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void listDeletedServers(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.deletedServers().listByLocation("japaneast", com.azure.core.util.Context.NONE);
    }
}
