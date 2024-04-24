// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for WebApps ListSlotSiteDeploymentStatusesSlot.
 */
public final class WebAppsListSlotSiteDeploymentStatusesSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ListSiteDeploymentStatusSlot.json
     */
    /**
     * Sample code: List Deployment Status Slot.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        listDeploymentStatusSlot(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .listSlotSiteDeploymentStatusesSlot("rg", "testSite", "stage", com.azure.core.util.Context.NONE);
    }
}
