// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointProperty;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkServiceConnectionStateProperty;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model = BinaryData.fromString(
            "{\"privateEndpoint\":{\"id\":\"jaesgvvsccya\"},\"privateLinkServiceConnectionState\":{\"status\":\"uq\",\"description\":\"hwyg\",\"actionsRequired\":\"vdnkfxusem\"},\"provisioningState\":\"zrmuhapfcqdps\",\"groupIds\":[\"vpsvuoymgcce\",\"vezrypqlmfeo\",\"erqwkyhkobopg\"]}")
            .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("jaesgvvsccya", model.privateEndpoint().id());
        Assertions.assertEquals("uq", model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("hwyg", model.privateLinkServiceConnectionState().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model = new PrivateEndpointConnectionProperties()
            .withPrivateEndpoint(new PrivateEndpointProperty().withId("jaesgvvsccya"))
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionStateProperty().withStatus("uq").withDescription("hwyg"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("jaesgvvsccya", model.privateEndpoint().id());
        Assertions.assertEquals("uq", model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("hwyg", model.privateLinkServiceConnectionState().description());
    }
}
