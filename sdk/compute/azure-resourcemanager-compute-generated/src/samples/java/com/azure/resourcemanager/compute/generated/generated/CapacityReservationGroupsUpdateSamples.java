// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.CapacityReservationGroup;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for CapacityReservationGroups Update.
 */
public final class CapacityReservationGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/capacityReservationExamples/CapacityReservationGroup_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: CapacityReservationGroup_Update_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void capacityReservationGroupUpdateMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        CapacityReservationGroup resource = manager.capacityReservationGroups()
            .getByResourceGroupWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaaaa", null,
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/capacityReservationExamples/CapacityReservationGroup_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: CapacityReservationGroup_Update_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void capacityReservationGroupUpdateMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        CapacityReservationGroup resource = manager.capacityReservationGroups()
            .getByResourceGroupWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaaaaa", null,
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("key5355", "fakeTokenPlaceholder")).apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
