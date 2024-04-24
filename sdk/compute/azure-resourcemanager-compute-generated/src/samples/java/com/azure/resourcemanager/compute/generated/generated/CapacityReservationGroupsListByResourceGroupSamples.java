// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.ExpandTypesForGetCapacityReservationGroups;

/**
 * Samples for CapacityReservationGroups ListByResourceGroup.
 */
public final class CapacityReservationGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/capacityReservationExamples/CapacityReservationGroup_ListByResourceGroup.json
     */
    /**
     * Sample code: List capacity reservation groups in resource group.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void listCapacityReservationGroupsInResourceGroup(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.capacityReservationGroups()
            .listByResourceGroup("myResourceGroup", ExpandTypesForGetCapacityReservationGroups.VIRTUAL_MACHINES_REF,
                com.azure.core.util.Context.NONE);
    }
}
