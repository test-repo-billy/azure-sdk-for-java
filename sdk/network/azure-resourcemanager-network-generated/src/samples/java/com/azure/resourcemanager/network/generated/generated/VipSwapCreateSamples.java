// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.fluent.models.SwapResourceInner;
import com.azure.resourcemanager.network.generated.models.SlotType;
import com.azure.resourcemanager.network.generated.models.SwapResourceProperties;

/**
 * Samples for VipSwap Create.
 */
public final class VipSwapCreateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/CloudServiceSwapPut.json
     */
    /**
     * Sample code: Put vip swap operation.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void putVipSwapOperation(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.vipSwaps().create("rg1", "testCloudService",
            new SwapResourceInner().withProperties(new SwapResourceProperties().withSlotType(SlotType.PRODUCTION)),
            com.azure.core.util.Context.NONE);
    }
}
