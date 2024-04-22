// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.CheckNameAvailabilityResultInner;

public final class CheckNameAvailabilityResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityResultInner model
            = BinaryData.fromString("{\"nameAvailable\":false,\"reason\":\"Invalid\",\"message\":\"sop\"}")
                .toObject(CheckNameAvailabilityResultInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityResultInner model = new CheckNameAvailabilityResultInner();
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResultInner.class);
    }
}
