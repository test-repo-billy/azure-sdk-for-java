// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for Usage List.
 */
public final class UsageListSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * computeRPCommonExamples/Usage_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Usage_List_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void usageListMinimumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.usages().list("_--", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * computeRPCommonExamples/Usage_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Usage_List_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void usageListMaximumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.usages().list("4_.", com.azure.core.util.Context.NONE);
    }
}
