// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for WebApps StartWebSiteNetworkTraceOperation.
 */
public final class WebAppsStartWebSiteNetworkTraceOperationSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/StartWebSiteNetworkTraceOperation.json
     */
    /**
     * Sample code: Start a new network trace operation for a site.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void startANewNetworkTraceOperationForASite(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps()
            .startWebSiteNetworkTraceOperation("testrg123", "SampleApp", 60, null, null,
                com.azure.core.util.Context.NONE);
    }
}
