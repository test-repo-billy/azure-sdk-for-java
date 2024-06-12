// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

/**
 * Samples for Solutions CreateOrUpdate.
 */
public final class SolutionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/Solutions_CreateOrUpdate.json
     */
    /**
     * Sample code: Solutions_CreateOrUpdate.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void solutionsCreateOrUpdate(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.solutions()
            .define("abc.partner")
            .withExistingFarmBeat("examples-rg", "examples-farmbeatsResourceName")
            .create();
    }
}
