// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for StaticSites GetUserProvidedFunctionAppsForStaticSiteBuild.
 */
public final class StaticSitesGetUserProvidedFunctionAppsForStaticSiteBuildSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetUserProvidedFunctionAppsForStaticSiteBuild.json
     */
    /**
     * Sample code: Get details of the user provided function apps registered with a static site build.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void getDetailsOfTheUserProvidedFunctionAppsRegisteredWithAStaticSiteBuild(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.staticSites()
            .getUserProvidedFunctionAppsForStaticSiteBuild("rg", "testStaticSite0", "default",
                com.azure.core.util.Context.NONE);
    }
}
