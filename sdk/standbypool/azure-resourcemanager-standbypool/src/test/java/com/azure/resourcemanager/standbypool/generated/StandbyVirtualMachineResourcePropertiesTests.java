// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachineResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class StandbyVirtualMachineResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StandbyVirtualMachineResourceProperties model
            = BinaryData.fromString("{\"virtualMachineResourceId\":\"hm\",\"provisioningState\":\"Succeeded\"}")
                .toObject(StandbyVirtualMachineResourceProperties.class);
        Assertions.assertEquals("hm", model.virtualMachineResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StandbyVirtualMachineResourceProperties model
            = new StandbyVirtualMachineResourceProperties().withVirtualMachineResourceId("hm");
        model = BinaryData.fromObject(model).toObject(StandbyVirtualMachineResourceProperties.class);
        Assertions.assertEquals("hm", model.virtualMachineResourceId());
    }
}
