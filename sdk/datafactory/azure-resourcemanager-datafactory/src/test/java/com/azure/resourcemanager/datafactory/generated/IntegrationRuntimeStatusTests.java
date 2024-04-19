// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeStatus;
import com.azure.resourcemanager.datafactory.models.ManagedIntegrationRuntimeStatus;

public final class IntegrationRuntimeStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeStatus model = BinaryData.fromString(
            "{\"type\":\"Managed\",\"dataFactoryName\":\"skrdqmhjj\",\"state\":\"AccessDenied\",\"\":{\"xuutkncwscwsv\":\"datawky\",\"micykvceoveilo\":\"dataxotogtwrupqsxv\"}}")
            .toObject(IntegrationRuntimeStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeStatus model = new ManagedIntegrationRuntimeStatus();
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeStatus.class);
    }
}
