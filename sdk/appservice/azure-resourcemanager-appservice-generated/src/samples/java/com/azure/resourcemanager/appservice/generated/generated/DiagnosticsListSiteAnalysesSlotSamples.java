// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for Diagnostics ListSiteAnalysesSlot.
 */
public final class DiagnosticsListSiteAnalysesSlotSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/Diagnostics_ListSiteAnalyses.json
     */
    /**
     * Sample code: List App Analyses.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void listAppAnalyses(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.diagnostics()
            .listSiteAnalysesSlot("Sample-WestUSResourceGroup", "SampleApp", "availability", "Production",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/Diagnostics_ListSiteAnalysesSlot.json
     */
    /**
     * Sample code: List App Slot Analyses.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void listAppSlotAnalyses(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.diagnostics()
            .listSiteAnalysesSlot("Sample-WestUSResourceGroup", "SampleApp", "availability", "staging",
                com.azure.core.util.Context.NONE);
    }
}
