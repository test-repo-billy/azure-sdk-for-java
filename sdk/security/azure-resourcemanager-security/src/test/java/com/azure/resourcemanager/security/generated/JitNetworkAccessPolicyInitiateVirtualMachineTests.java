// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyInitiatePort;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyInitiateVirtualMachine;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JitNetworkAccessPolicyInitiateVirtualMachineTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JitNetworkAccessPolicyInitiateVirtualMachine model = BinaryData.fromString(
            "{\"id\":\"gfjzcvaax\",\"ports\":[{\"number\":1298140340,\"allowedSourceAddressPrefix\":\"ahfxwccok\",\"endTimeUtc\":\"2021-10-20T21:37:03Z\"}]}")
            .toObject(JitNetworkAccessPolicyInitiateVirtualMachine.class);
        Assertions.assertEquals("gfjzcvaax", model.id());
        Assertions.assertEquals(1298140340, model.ports().get(0).number());
        Assertions.assertEquals("ahfxwccok", model.ports().get(0).allowedSourceAddressPrefix());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-20T21:37:03Z"), model.ports().get(0).endTimeUtc());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JitNetworkAccessPolicyInitiateVirtualMachine model
            = new JitNetworkAccessPolicyInitiateVirtualMachine().withId("gfjzcvaax")
                .withPorts(Arrays.asList(new JitNetworkAccessPolicyInitiatePort().withNumber(1298140340)
                    .withAllowedSourceAddressPrefix("ahfxwccok")
                    .withEndTimeUtc(OffsetDateTime.parse("2021-10-20T21:37:03Z"))));
        model = BinaryData.fromObject(model).toObject(JitNetworkAccessPolicyInitiateVirtualMachine.class);
        Assertions.assertEquals("gfjzcvaax", model.id());
        Assertions.assertEquals(1298140340, model.ports().get(0).number());
        Assertions.assertEquals("ahfxwccok", model.ports().get(0).allowedSourceAddressPrefix());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-20T21:37:03Z"), model.ports().get(0).endTimeUtc());
    }
}
