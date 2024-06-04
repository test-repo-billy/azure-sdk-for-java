// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.resourcemanager.hybridcompute.models.MachineExtensionProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for MachineExtensions CreateOrUpdate.
 */
public final class MachineExtensionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-03-31-preview/examples/extension/Extension_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update a Machine Extension.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void
        createOrUpdateAMachineExtension(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.machineExtensions()
            .define("CustomScriptExtension")
            .withRegion("eastus2euap")
            .withExistingMachine("myResourceGroup", "myMachine")
            .withProperties(
                new MachineExtensionProperties().withPublisher("Microsoft.Compute")
                    .withType("CustomScriptExtension")
                    .withTypeHandlerVersion("1.10")
                    .withSettings(mapOf("commandToExecute",
                        "powershell.exe -c \"Get-Process | Where-Object { $_.CPU -gt 10000 }\"")))
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
