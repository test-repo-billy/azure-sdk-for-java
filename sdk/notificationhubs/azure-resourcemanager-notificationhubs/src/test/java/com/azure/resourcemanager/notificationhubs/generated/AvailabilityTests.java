// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.notificationhubs.models.Availability;

public final class AvailabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Availability model = BinaryData.fromString("{\"timeGrain\":\"xhniskxfbkpycgk\",\"blobDuration\":\"ndnhj\"}")
            .toObject(Availability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Availability model = new Availability();
        model = BinaryData.fromObject(model).toObject(Availability.class);
    }
}
