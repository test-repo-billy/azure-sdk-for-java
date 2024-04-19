// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.models.ListDeviceGroupsRequest;
import org.junit.jupiter.api.Assertions;

public final class ListDeviceGroupsRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListDeviceGroupsRequest model
            = BinaryData.fromString("{\"deviceGroupName\":\"q\"}").toObject(ListDeviceGroupsRequest.class);
        Assertions.assertEquals("q", model.deviceGroupName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListDeviceGroupsRequest model = new ListDeviceGroupsRequest().withDeviceGroupName("q");
        model = BinaryData.fromObject(model).toObject(ListDeviceGroupsRequest.class);
        Assertions.assertEquals("q", model.deviceGroupName());
    }
}
