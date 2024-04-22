// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.SkipTarget;
import com.azure.resourcemanager.containerservicefleet.models.TargetType;
import org.junit.jupiter.api.Assertions;

public final class SkipTargetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkipTarget model
            = BinaryData.fromString("{\"type\":\"Member\",\"name\":\"twwrqp\"}").toObject(SkipTarget.class);
        Assertions.assertEquals(TargetType.MEMBER, model.type());
        Assertions.assertEquals("twwrqp", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkipTarget model = new SkipTarget().withType(TargetType.MEMBER).withName("twwrqp");
        model = BinaryData.fromObject(model).toObject(SkipTarget.class);
        Assertions.assertEquals(TargetType.MEMBER, model.type());
        Assertions.assertEquals("twwrqp", model.name());
    }
}
