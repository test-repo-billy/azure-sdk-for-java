// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

/**
 * Samples for Workbooks GetByResourceGroup.
 */
public final class WorkbooksGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2023-06-01/examples/WorkbookGet1.
     * json
     */
    /**
     * Sample code: WorkbookGet1.
     * 
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookGet1(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbooks().getByResourceGroupWithResponse("my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2",
            null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2023-06-01/examples/
     * WorkbookManagedGet.json
     */
    /**
     * Sample code: WorkbookManagedGet.
     * 
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void
        workbookManagedGet(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbooks().getByResourceGroupWithResponse("my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2",
            null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2023-06-01/examples/WorkbookGet.json
     */
    /**
     * Sample code: WorkbookGet.
     * 
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookGet(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbooks().getByResourceGroupWithResponse("my-resource-group", "deadb33f-5e0d-4064-8ebb-1a4ed0313eb2",
            null, com.azure.core.util.Context.NONE);
    }
}
