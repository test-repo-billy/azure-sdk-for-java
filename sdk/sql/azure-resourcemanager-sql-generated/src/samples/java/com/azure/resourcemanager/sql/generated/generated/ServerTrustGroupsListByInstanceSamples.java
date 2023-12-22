// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ServerTrustGroups ListByInstance.
 */
public final class ServerTrustGroupsListByInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * ServerTrustGroupListByManagedInstance.json
     */
    /**
     * Sample code: List server trust groups by managed instance.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        listServerTrustGroupsByManagedInstance(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.serverTrustGroups().listByInstance("Default-SQL-SouthEastAsia", "managedInstance-1",
            com.azure.core.util.Context.NONE);
    }
}
