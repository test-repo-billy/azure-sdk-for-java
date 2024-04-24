// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for Global GetDeletedWebAppSnapshots.
 */
public final class GlobalGetDeletedWebAppSnapshotsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetDeletedWebAppSnapshots.json
     */
    /**
     * Sample code: Get Deleted Web App Snapshots.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        getDeletedWebAppSnapshots(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.globals().getDeletedWebAppSnapshotsWithResponse("9", com.azure.core.util.Context.NONE);
    }
}
