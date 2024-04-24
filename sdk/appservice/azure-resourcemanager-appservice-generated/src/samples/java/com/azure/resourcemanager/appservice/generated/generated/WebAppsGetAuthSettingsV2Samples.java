// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for WebApps GetAuthSettingsV2.
 */
public final class WebAppsGetAuthSettingsV2Samples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ListAuthSettingsV2.json
     */
    /**
     * Sample code: List Auth Settings V2.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void listAuthSettingsV2(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps().getAuthSettingsV2WithResponse("testrg123", "sitef6141", com.azure.core.util.Context.NONE);
    }
}
