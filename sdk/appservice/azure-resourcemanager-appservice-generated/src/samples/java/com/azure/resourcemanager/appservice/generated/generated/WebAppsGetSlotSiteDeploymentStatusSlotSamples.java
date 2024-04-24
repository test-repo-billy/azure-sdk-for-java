// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for WebApps GetSlotSiteDeploymentStatusSlot.
 */
public final class WebAppsGetSlotSiteDeploymentStatusSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetSiteDeploymentStatusSlot.json
     */
    /**
     * Sample code: Get Deployment Status Slot.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        getDeploymentStatusSlot(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .getSlotSiteDeploymentStatusSlot("rg", "testSite", "stage", "eacfd68b-3bbd-4ad9-99c5-98614d89c8e5",
                com.azure.core.util.Context.NONE);
    }
}
