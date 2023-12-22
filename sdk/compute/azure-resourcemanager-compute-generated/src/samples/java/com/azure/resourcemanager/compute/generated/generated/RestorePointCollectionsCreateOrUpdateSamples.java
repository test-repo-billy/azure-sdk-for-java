// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.RestorePointCollectionSourceProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for RestorePointCollections CreateOrUpdate.
 */
public final class RestorePointCollectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * restorePointExamples/RestorePointCollection_CreateOrUpdate_ForCrossRegionCopy.json
     */
    /**
     * Sample code: Create or update a restore point collection for cross region copy.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void createOrUpdateARestorePointCollectionForCrossRegionCopy(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.restorePointCollections().define("myRpc").withRegion("norwayeast")
            .withExistingResourceGroup("myResourceGroup").withTags(mapOf("myTag1", "tagValue1"))
            .withSource(new RestorePointCollectionSourceProperties().withId(
                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/restorePointCollections/sourceRpcName"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * restorePointExamples/RestorePointCollection_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a restore point collection.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        createOrUpdateARestorePointCollection(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.restorePointCollections().define("myRpc").withRegion("norwayeast")
            .withExistingResourceGroup("myResourceGroup").withTags(mapOf("myTag1", "tagValue1"))
            .withSource(new RestorePointCollectionSourceProperties().withId(
                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM"))
            .create();
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
