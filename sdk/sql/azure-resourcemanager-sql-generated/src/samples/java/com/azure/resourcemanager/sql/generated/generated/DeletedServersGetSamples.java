// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for DeletedServers Get.
 */
public final class DeletedServersGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/DeletedServerGet.json
     */
    /**
     * Sample code: Get deleted server.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void getDeletedServer(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.deletedServers().getWithResponse("japaneast", "sqlcrudtest-d-1414", com.azure.core.util.Context.NONE);
    }
}
