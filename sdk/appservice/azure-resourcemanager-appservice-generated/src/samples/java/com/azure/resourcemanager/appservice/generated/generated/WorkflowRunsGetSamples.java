// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for WorkflowRuns Get.
 */
public final class WorkflowRunsGetSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/WorkflowRuns_Get.json
     */
    /**
     * Sample code: Get a run for a workflow.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void getARunForAWorkflow(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.workflowRuns()
            .getWithResponse("test-resource-group", "test-name", "test-workflow", "08586676746934337772206998657CU22",
                com.azure.core.util.Context.NONE);
    }
}
