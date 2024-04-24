// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for Diagnostics ListSiteDetectors.
 */
public final class DiagnosticsListSiteDetectorsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/Diagnostics_ListSiteDetectors.json
     */
    /**
     * Sample code: List App Detectors.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void listAppDetectors(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.diagnostics()
            .listSiteDetectors("Sample-WestUSResourceGroup", "SampleApp", "availability",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/Diagnostics_ListSiteDetectorsSlot.json
     */
    /**
     * Sample code: List App Slot Detectors.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void listAppSlotDetectors(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.diagnostics()
            .listSiteDetectors("Sample-WestUSResourceGroup", "SampleApp", "availability",
                com.azure.core.util.Context.NONE);
    }
}
