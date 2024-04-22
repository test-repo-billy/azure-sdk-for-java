// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for GlobalParameters ListByFactory.
 */
public final class GlobalParametersListByFactorySamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/GlobalParameters_ListByFactory.json
     */
    /**
     * Sample code: GlobalParameters_ListByFactory.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void globalParametersListByFactory(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.globalParameters()
            .listByFactory("exampleResourceGroup", "exampleFactoryName", com.azure.core.util.Context.NONE);
    }
}
