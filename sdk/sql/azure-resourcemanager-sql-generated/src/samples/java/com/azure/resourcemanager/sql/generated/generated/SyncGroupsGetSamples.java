// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for SyncGroups Get.
 */
public final class SyncGroupsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/SyncGroupGet.json
     */
    /**
     * Sample code: Get a sync group.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void getASyncGroup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.syncGroups().getWithResponse("syncgroupcrud-65440", "syncgroupcrud-8475", "syncgroupcrud-4328",
            "syncgroupcrud-3187", com.azure.core.util.Context.NONE);
    }
}
