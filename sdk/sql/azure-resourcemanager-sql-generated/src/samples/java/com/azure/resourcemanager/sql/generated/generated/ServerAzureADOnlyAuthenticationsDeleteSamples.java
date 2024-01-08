// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.AuthenticationName;

/**
 * Samples for ServerAzureADOnlyAuthentications Delete.
 */
public final class ServerAzureADOnlyAuthenticationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/AzureADOnlyAuthDelete.json
     */
    /**
     * Sample code: Deletes Azure Active Directory only authentication object.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void deletesAzureActiveDirectoryOnlyAuthenticationObject(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.serverAzureADOnlyAuthentications().delete("sqlcrudtest-4799", "sqlcrudtest-6440",
            AuthenticationName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
