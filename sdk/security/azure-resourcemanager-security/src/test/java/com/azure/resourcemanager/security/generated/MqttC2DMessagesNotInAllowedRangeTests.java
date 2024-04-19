// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.MqttC2DMessagesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class MqttC2DMessagesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MqttC2DMessagesNotInAllowedRange model = BinaryData.fromString(
            "{\"ruleType\":\"MqttC2DMessagesNotInAllowedRange\",\"timeWindowSize\":\"PT186H57M45S\",\"minThreshold\":57810350,\"maxThreshold\":322115555,\"displayName\":\"vynuqqkotauratn\",\"description\":\"ppfzsclef\",\"isEnabled\":true}")
            .toObject(MqttC2DMessagesNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(57810350, model.minThreshold());
        Assertions.assertEquals(322115555, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT186H57M45S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MqttC2DMessagesNotInAllowedRange model = new MqttC2DMessagesNotInAllowedRange().withIsEnabled(true)
            .withMinThreshold(57810350).withMaxThreshold(322115555).withTimeWindowSize(Duration.parse("PT186H57M45S"));
        model = BinaryData.fromObject(model).toObject(MqttC2DMessagesNotInAllowedRange.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(57810350, model.minThreshold());
        Assertions.assertEquals(322115555, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT186H57M45S"), model.timeWindowSize());
    }
}
