// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteLinkedBackendArmResourceInner;

/**
 * Samples for StaticSites ValidateBackendForBuild.
 */
public final class StaticSitesValidateBackendForBuildSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ValidateLinkedBackendForStaticSiteBuild.json
     */
    /**
     * Sample code: Validate if backend can be linked to static site build.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void validateIfBackendCanBeLinkedToStaticSiteBuild(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.staticSites()
            .validateBackendForBuild("rg", "testStaticSite0", "default", "testBackend",
                new StaticSiteLinkedBackendArmResourceInner().withBackendResourceId(
                    "/subscription/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/backendRg/providers/Microsoft.Web/sites/testBackend")
                    .withRegion("West US 2"),
                com.azure.core.util.Context.NONE);
    }
}
