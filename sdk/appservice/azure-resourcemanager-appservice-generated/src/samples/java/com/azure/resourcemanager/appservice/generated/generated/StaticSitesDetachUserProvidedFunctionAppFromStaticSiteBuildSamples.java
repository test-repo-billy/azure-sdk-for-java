// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for StaticSites DetachUserProvidedFunctionAppFromStaticSiteBuild.
 */
public final class StaticSitesDetachUserProvidedFunctionAppFromStaticSiteBuildSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/DetachUserProvidedFunctionAppFromStaticSiteBuild.json
     */
    /**
     * Sample code: Detach the user provided function app from the static site build.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void detachTheUserProvidedFunctionAppFromTheStaticSiteBuild(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.staticSites()
            .detachUserProvidedFunctionAppFromStaticSiteBuildWithResponse("rg", "testStaticSite0", "12",
                "testFunctionApp", com.azure.core.util.Context.NONE);
    }
}
