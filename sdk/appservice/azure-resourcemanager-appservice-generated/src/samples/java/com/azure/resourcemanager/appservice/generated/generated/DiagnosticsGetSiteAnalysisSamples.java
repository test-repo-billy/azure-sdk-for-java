// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for Diagnostics GetSiteAnalysis.
 */
public final class DiagnosticsGetSiteAnalysisSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/Diagnostics_GetSiteAnalysisSlot.json
     */
    /**
     * Sample code: Get App Slot Analysis.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void getAppSlotAnalysis(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.diagnostics()
            .getSiteAnalysisWithResponse("Sample-WestUSResourceGroup", "SampleApp", "availability", "appanalysis",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/Diagnostics_GetSiteAnalysis.json
     */
    /**
     * Sample code: Get App Analysis.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void getAppAnalysis(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.diagnostics()
            .getSiteAnalysisWithResponse("Sample-WestUSResourceGroup", "SampleApp", "availability", "appanalysis",
                com.azure.core.util.Context.NONE);
    }
}
