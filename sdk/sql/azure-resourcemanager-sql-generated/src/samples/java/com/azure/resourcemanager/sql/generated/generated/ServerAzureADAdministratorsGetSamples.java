// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.AdministratorName;

/**
 * Samples for ServerAzureADAdministrators Get.
 */
public final class ServerAzureADAdministratorsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/AdministratorGet.json
     */
    /**
     * Sample code: Gets a Azure Active Directory administrator.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        getsAAzureActiveDirectoryAdministrator(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.serverAzureADAdministrators().getWithResponse("sqlcrudtest-4799", "sqlcrudtest-6440",
            AdministratorName.ACTIVE_DIRECTORY, com.azure.core.util.Context.NONE);
    }
}
