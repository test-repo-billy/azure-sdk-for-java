// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ServerTrustGroups ListByLocation.
 */
public final class ServerTrustGroupsListByLocationSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerTrustGroupList.json
     */
    /**
     * Sample code: List server trust groups.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void listServerTrustGroups(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.serverTrustGroups().listByLocation("Default", "Japan East", com.azure.core.util.Context.NONE);
    }
}
