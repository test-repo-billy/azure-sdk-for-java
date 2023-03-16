// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/** Samples for Applications Get. */
public final class ApplicationsGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2022-09-09/examples/Application_Get.json
     */
    /**
     * Sample code: Application_Get.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGet(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .applications()
            .getWithResponse("resourceGroup1", "applicationGroup1", "application1", com.azure.core.util.Context.NONE);
    }
}
