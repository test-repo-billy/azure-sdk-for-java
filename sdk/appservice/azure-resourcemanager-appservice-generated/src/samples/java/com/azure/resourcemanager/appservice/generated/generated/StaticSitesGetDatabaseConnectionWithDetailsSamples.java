// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for StaticSites GetDatabaseConnectionWithDetails.
 */
public final class StaticSitesGetDatabaseConnectionWithDetailsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetStaticSiteDatabaseConnectionWithDetails.json
     */
    /**
     * Sample code: Get details of database connections for the static site.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void getDetailsOfDatabaseConnectionsForTheStaticSite(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.staticSites()
            .getDatabaseConnectionWithDetailsWithResponse("rg", "testStaticSite0", "default",
                com.azure.core.util.Context.NONE);
    }
}
