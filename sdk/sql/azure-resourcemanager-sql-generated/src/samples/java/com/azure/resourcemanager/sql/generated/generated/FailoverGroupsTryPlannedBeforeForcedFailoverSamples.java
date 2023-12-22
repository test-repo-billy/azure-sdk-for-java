// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for FailoverGroups TryPlannedBeforeForcedFailover.
 */
public final class FailoverGroupsTryPlannedBeforeForcedFailoverSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2023-02-01-preview/examples/
     * FailoverGroupTryPlannedBeforeForcedFailover.json
     */
    /**
     * Sample code: Try planned before forced failover of a failover group.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        tryPlannedBeforeForcedFailoverOfAFailoverGroup(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.failoverGroups().tryPlannedBeforeForcedFailover("Default", "failovergroupsecondaryserver",
            "failovergrouptest3", com.azure.core.util.Context.NONE);
    }
}
