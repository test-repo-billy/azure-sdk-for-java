// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for ManagedServerDnsAliases Delete.
 */
public final class ManagedServerDnsAliasesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2021-11-01-preview/examples/ManagedServerDnsAliasDelete.
     * json
     */
    /**
     * Sample code: Delete managed server DNS alias.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void deleteManagedServerDNSAlias(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.managedServerDnsAliases().delete("Default", "dns-mi", "dns-alias-mi", com.azure.core.util.Context.NONE);
    }
}
