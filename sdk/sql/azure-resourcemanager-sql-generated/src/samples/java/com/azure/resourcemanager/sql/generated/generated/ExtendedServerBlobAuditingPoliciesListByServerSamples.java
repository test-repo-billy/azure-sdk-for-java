// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ExtendedServerBlobAuditingPolicies ListByServer.
 */
public final class ExtendedServerBlobAuditingPoliciesListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/
     * ServerExtendedAuditingSettingsList.json
     */
    /**
     * Sample code: List extended auditing settings of a server.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        listExtendedAuditingSettingsOfAServer(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.extendedServerBlobAuditingPolicies().listByServer("blobauditingtest-4799", "blobauditingtest-6440",
            com.azure.core.util.Context.NONE);
    }
}
