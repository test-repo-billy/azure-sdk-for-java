// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for StaticSites GetStaticSiteBuilds.
 */
public final class StaticSitesGetStaticSiteBuildsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetStaticSiteBuilds.json
     */
    /**
     * Sample code: Get all builds for a static site.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        getAllBuildsForAStaticSite(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.staticSites().getStaticSiteBuilds("rg", "testStaticSite0", com.azure.core.util.Context.NONE);
    }
}
