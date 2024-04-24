// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for AppServiceEnvironments Suspend.
 */
public final class AppServiceEnvironmentsSuspendSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/AppServiceEnvironments_Suspend.json
     */
    /**
     * Sample code: Suspend an App Service Environment.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        suspendAnAppServiceEnvironment(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.appServiceEnvironments().suspend("test-rg", "test-ase", com.azure.core.util.Context.NONE);
    }
}
