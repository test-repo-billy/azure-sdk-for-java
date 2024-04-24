// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for WebApps ListProductionSiteDeploymentStatuses.
 */
public final class WebAppsListProductionSiteDeploymentStatusesSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ListSiteDeploymentStatus.json
     */
    /**
     * Sample code: List Deployment Status.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void listDeploymentStatus(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps().listProductionSiteDeploymentStatuses("rg", "testSite", com.azure.core.util.Context.NONE);
    }
}
