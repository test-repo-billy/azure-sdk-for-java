// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ContainerRegistry;
import org.junit.jupiter.api.Assertions;

public final class ContainerRegistryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerRegistry model
            = BinaryData.fromString("{\"containerRegistryServer\":\"x\",\"identityResourceId\":\"it\"}")
                .toObject(ContainerRegistry.class);
        Assertions.assertEquals("x", model.containerRegistryServer());
        Assertions.assertEquals("it", model.identityResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerRegistry model = new ContainerRegistry().withContainerRegistryServer("x").withIdentityResourceId("it");
        model = BinaryData.fromObject(model).toObject(ContainerRegistry.class);
        Assertions.assertEquals("x", model.containerRegistryServer());
        Assertions.assertEquals("it", model.identityResourceId());
    }
}
