// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.models.MetricsStatusRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MetricsStatusRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetricsStatusRequest model
            = BinaryData.fromString("{\"azureResourceIds\":[\"khbzhfepgzg\",\"e\"],\"userEmail\":\"zloc\"}")
                .toObject(MetricsStatusRequest.class);
        Assertions.assertEquals("khbzhfepgzg", model.azureResourceIds().get(0));
        Assertions.assertEquals("zloc", model.userEmail());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetricsStatusRequest model
            = new MetricsStatusRequest().withAzureResourceIds(Arrays.asList("khbzhfepgzg", "e")).withUserEmail("zloc");
        model = BinaryData.fromObject(model).toObject(MetricsStatusRequest.class);
        Assertions.assertEquals("khbzhfepgzg", model.azureResourceIds().get(0));
        Assertions.assertEquals("zloc", model.userEmail());
    }
}
