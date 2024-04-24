// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for StaticSites DeleteDatabaseConnection.
 */
public final class StaticSitesDeleteDatabaseConnectionSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/DeleteStaticSiteDatabaseConnection.json
     */
    /**
     * Sample code: Delete a database connection from a static site.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void deleteADatabaseConnectionFromAStaticSite(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.staticSites()
            .deleteDatabaseConnectionWithResponse("rg", "testStaticSite0", "default", com.azure.core.util.Context.NONE);
    }
}
