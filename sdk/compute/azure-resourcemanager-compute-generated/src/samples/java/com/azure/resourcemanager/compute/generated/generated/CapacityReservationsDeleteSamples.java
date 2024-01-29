// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for CapacityReservations Delete.
 */
public final class CapacityReservationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * capacityReservationExamples/CapacityReservation_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: CapacityReservation_Delete_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        capacityReservationDeleteMaximumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.capacityReservations().delete("rgcompute", "aaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * capacityReservationExamples/CapacityReservation_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: CapacityReservation_Delete_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        capacityReservationDeleteMinimumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.capacityReservations().delete("rgcompute", "aaa", "aaaaaa", com.azure.core.util.Context.NONE);
    }
}
