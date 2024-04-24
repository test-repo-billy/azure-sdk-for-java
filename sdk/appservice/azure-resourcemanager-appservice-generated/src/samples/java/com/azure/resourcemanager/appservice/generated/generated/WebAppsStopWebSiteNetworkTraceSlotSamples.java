// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for WebApps StopWebSiteNetworkTraceSlot.
 */
public final class WebAppsStopWebSiteNetworkTraceSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/StopWebSiteNetworkTrace.json
     */
    /**
     * Sample code: Stop a currently running network trace operation for a site.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void stopACurrentlyRunningNetworkTraceOperationForASite(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .stopWebSiteNetworkTraceSlotWithResponse("testrg123", "SampleApp", "Production",
                com.azure.core.util.Context.NONE);
    }
}
