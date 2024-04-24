// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.models.Site;

/**
 * Samples for WebApps Update.
 */
public final class WebAppsUpdateSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/UpdateWebApp.json
     */
    /**
     * Sample code: Update web app.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void updateWebApp(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        Site resource = manager.webApps()
            .getByResourceGroupWithResponse("testrg123", "sitef6141", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withServerFarmId(
                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Web/serverfarms/DefaultAsp")
            .apply();
    }
}
