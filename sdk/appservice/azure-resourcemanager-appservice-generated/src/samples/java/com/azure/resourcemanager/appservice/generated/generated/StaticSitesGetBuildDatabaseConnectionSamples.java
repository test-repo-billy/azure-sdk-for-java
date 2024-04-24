// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for StaticSites GetBuildDatabaseConnection.
 */
public final class StaticSitesGetBuildDatabaseConnectionSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetStaticSiteBuildDatabaseConnection.json
     */
    /**
     * Sample code: Get overview of database connections for the static site build.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void getOverviewOfDatabaseConnectionsForTheStaticSiteBuild(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.staticSites()
            .getBuildDatabaseConnectionWithResponse("rg", "testStaticSite0", "default", "default",
                com.azure.core.util.Context.NONE);
    }
}
