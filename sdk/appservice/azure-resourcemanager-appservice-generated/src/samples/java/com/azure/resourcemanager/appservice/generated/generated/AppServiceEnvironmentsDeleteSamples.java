// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for AppServiceEnvironments Delete.
 */
public final class AppServiceEnvironmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/AppServiceEnvironments_Delete.json
     */
    /**
     * Sample code: Delete an App Service Environment.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        deleteAnAppServiceEnvironment(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.appServiceEnvironments().delete("test-rg", "test-ase", null, com.azure.core.util.Context.NONE);
    }
}
