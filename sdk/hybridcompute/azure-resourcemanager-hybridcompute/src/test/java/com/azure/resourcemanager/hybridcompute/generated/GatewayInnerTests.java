// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.GatewayInner;
import com.azure.resourcemanager.hybridcompute.models.GatewayType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GatewayInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Creating\",\"gatewayId\":\"vxwc\",\"gatewayType\":\"Public\",\"gatewayEndpoint\":\"c\",\"allowedFeatures\":[\"lsfeaenwabfatkld\",\"xbjhwuaanozjosph\"]},\"location\":\"ulpjr\",\"tags\":{\"cskfcktqumiekk\":\"glrvimjwosytxi\"},\"id\":\"zzikhlyfjhdg\",\"name\":\"gge\",\"type\":\"dunyg\"}")
            .toObject(GatewayInner.class);
        Assertions.assertEquals("ulpjr", model.location());
        Assertions.assertEquals("glrvimjwosytxi", model.tags().get("cskfcktqumiekk"));
        Assertions.assertEquals(GatewayType.PUBLIC, model.gatewayType());
        Assertions.assertEquals("lsfeaenwabfatkld", model.allowedFeatures().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayInner model = new GatewayInner().withLocation("ulpjr")
            .withTags(mapOf("cskfcktqumiekk", "glrvimjwosytxi"))
            .withGatewayType(GatewayType.PUBLIC)
            .withAllowedFeatures(Arrays.asList("lsfeaenwabfatkld", "xbjhwuaanozjosph"));
        model = BinaryData.fromObject(model).toObject(GatewayInner.class);
        Assertions.assertEquals("ulpjr", model.location());
        Assertions.assertEquals("glrvimjwosytxi", model.tags().get("cskfcktqumiekk"));
        Assertions.assertEquals(GatewayType.PUBLIC, model.gatewayType());
        Assertions.assertEquals("lsfeaenwabfatkld", model.allowedFeatures().get(0));
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
