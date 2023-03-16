// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/** Samples for ScalingPlans ListByResourceGroup. */
public final class ScalingPlansListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2022-09-09/examples/ScalingPlan_ListByResourceGroup.json
     */
    /**
     * Sample code: ScalingPlans_ListByResourceGroup.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansListByResourceGroup(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans().listByResourceGroup("resourceGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
