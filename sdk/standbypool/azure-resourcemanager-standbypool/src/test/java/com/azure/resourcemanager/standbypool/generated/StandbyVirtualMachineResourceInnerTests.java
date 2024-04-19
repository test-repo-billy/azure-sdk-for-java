// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.fluent.models.StandbyVirtualMachineResourceInner;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachineResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class StandbyVirtualMachineResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StandbyVirtualMachineResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"virtualMachineResourceId\":\"uhrhcffcyddgl\",\"provisioningState\":\"Succeeded\"},\"id\":\"jqkwpyeicx\",\"name\":\"qciwqvhkhixuigdt\",\"type\":\"pbobjo\"}")
            .toObject(StandbyVirtualMachineResourceInner.class);
        Assertions.assertEquals("uhrhcffcyddgl", model.properties().virtualMachineResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StandbyVirtualMachineResourceInner model = new StandbyVirtualMachineResourceInner().withProperties(
            new StandbyVirtualMachineResourceProperties().withVirtualMachineResourceId("uhrhcffcyddgl"));
        model = BinaryData.fromObject(model).toObject(StandbyVirtualMachineResourceInner.class);
        Assertions.assertEquals("uhrhcffcyddgl", model.properties().virtualMachineResourceId());
    }
}
