// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.SupportEngineer;

public final class SupportEngineerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SupportEngineer model = BinaryData.fromString("{\"emailAddress\":\"nsvs\"}").toObject(SupportEngineer.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SupportEngineer model = new SupportEngineer();
        model = BinaryData.fromObject(model).toObject(SupportEngineer.class);
    }
}
