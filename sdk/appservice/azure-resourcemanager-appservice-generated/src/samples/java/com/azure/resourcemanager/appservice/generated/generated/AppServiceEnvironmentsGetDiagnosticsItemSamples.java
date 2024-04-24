// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for AppServiceEnvironments GetDiagnosticsItem.
 */
public final class AppServiceEnvironmentsGetDiagnosticsItemSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/AppServiceEnvironments_GetDiagnosticsItem.json
     */
    /**
     * Sample code: Get a diagnostics item for an App Service Environment.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void getADiagnosticsItemForAnAppServiceEnvironment(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.appServiceEnvironments()
            .getDiagnosticsItemWithResponse("test-rg", "test-ase", "test-diagnostic", com.azure.core.util.Context.NONE);
    }
}
