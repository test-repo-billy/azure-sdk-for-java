// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.fluent.models.TargetInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TargetInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TargetInner model = BinaryData.fromString(
            "{\"location\":\"knnqvsaznq\",\"properties\":{\"mkycgra\":\"dataorudsgsa\"},\"id\":\"wjue\",\"name\":\"aeburuvdmo\",\"type\":\"s\"}")
            .toObject(TargetInner.class);
        Assertions.assertEquals("knnqvsaznq", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TargetInner model
            = new TargetInner().withLocation("knnqvsaznq").withProperties(mapOf("mkycgra", "dataorudsgsa"));
        model = BinaryData.fromObject(model).toObject(TargetInner.class);
        Assertions.assertEquals("knnqvsaznq", model.location());
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
