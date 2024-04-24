// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for WebApps GetAuthSettings.
 */
public final class WebAppsGetAuthSettingsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ListAuthSettings.json
     */
    /**
     * Sample code: List Auth Settings.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void listAuthSettings(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps().getAuthSettingsWithResponse("testrg123", "sitef6141", com.azure.core.util.Context.NONE);
    }
}
