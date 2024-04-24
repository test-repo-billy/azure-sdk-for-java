// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

/**
 * Samples for DataManagerForAgricultureResources Delete.
 */
public final class DataManagerForAgricultureResourcesDeleteSamples {
    /*
     * x-ms-original-file: specification/agrifood/resource-manager/Microsoft.AgFoodPlatform/preview/2023-06-01-preview/examples/DataManagerForAgricultureResources_Delete.json
     */
    /**
     * Sample code: DataManagerForAgricultureResources_Delete.
     * 
     * @param manager Entry point to AgriFoodManager.
     */
    public static void
        dataManagerForAgricultureResourcesDelete(com.azure.resourcemanager.agrifood.AgriFoodManager manager) {
        manager.dataManagerForAgricultureResources()
            .deleteByResourceGroupWithResponse("examples-rg", "examples-dataManagerForAgricultureResourceName",
                com.azure.core.util.Context.NONE);
    }
}
