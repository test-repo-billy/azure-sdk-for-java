// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

/**
 * Samples for Experiments ExecutionDetails.
 */
public final class ExperimentsExecutionDetailsSamples {
    /*
     * x-ms-original-file:
     * specification/chaos/resource-manager/Microsoft.Chaos/stable/2024-01-01/examples/DetailsExperiment.json
     */
    /**
     * Sample code: Get experiment execution details.
     * 
     * @param manager Entry point to ChaosManager.
     */
    public static void getExperimentExecutionDetails(com.azure.resourcemanager.chaos.ChaosManager manager) {
        manager.experiments().executionDetailsWithResponse("exampleRG", "exampleExperiment",
            "f24500ad-744e-4a26-864b-b76199eac333", com.azure.core.util.Context.NONE);
    }
}
