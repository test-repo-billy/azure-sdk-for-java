// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for WorkflowRuns Cancel.
 */
public final class WorkflowRunsCancelSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/WorkflowRuns_Cancel.json
     */
    /**
     * Sample code: Cancel a workflow run.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void cancelAWorkflowRun(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.workflowRuns()
            .cancelWithResponse("test-resource-group", "test-name", "test-workflow",
                "08586676746934337772206998657CU22", com.azure.core.util.Context.NONE);
    }
}
