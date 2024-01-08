// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ServerTrustGroups Delete.
 */
public final class ServerTrustGroupsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerTrustGroupDelete.json
     */
    /**
     * Sample code: Drop server trust group.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void dropServerTrustGroup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.serverTrustGroups().delete("Default", "Japan East", "server-trust-group-test",
            com.azure.core.util.Context.NONE);
    }
}
