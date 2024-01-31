// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

/**
 * Samples for WorkbookTemplates Delete.
 */
public final class WorkbookTemplatesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2020-11-20/examples/
     * WorkbookTemplateDelete.json
     */
    /**
     * Sample code: WorkbookTemplateDelete.
     * 
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void
        workbookTemplateDelete(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbookTemplates().deleteByResourceGroupWithResponse("my-resource-group", "my-template-resource",
            com.azure.core.util.Context.NONE);
    }
}
