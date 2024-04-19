// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.VMInfoInner;
import org.junit.jupiter.api.Assertions;

public final class VMInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMInfoInner model = BinaryData
            .fromString("{\"vmId\":\"wska\",\"agentVersion\":\"ktzlcuiywg\",\"agentStatus\":\"wgndrvynhzgpp\"}")
            .toObject(VMInfoInner.class);
        Assertions.assertEquals("wska", model.vmId());
        Assertions.assertEquals("ktzlcuiywg", model.agentVersion());
        Assertions.assertEquals("wgndrvynhzgpp", model.agentStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMInfoInner model
            = new VMInfoInner().withVmId("wska").withAgentVersion("ktzlcuiywg").withAgentStatus("wgndrvynhzgpp");
        model = BinaryData.fromObject(model).toObject(VMInfoInner.class);
        Assertions.assertEquals("wska", model.vmId());
        Assertions.assertEquals("ktzlcuiywg", model.agentVersion());
        Assertions.assertEquals("wgndrvynhzgpp", model.agentStatus());
    }
}
