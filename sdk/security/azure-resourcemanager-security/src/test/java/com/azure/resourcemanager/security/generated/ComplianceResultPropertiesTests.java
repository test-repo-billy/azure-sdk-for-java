// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ComplianceResultProperties;

public final class ComplianceResultPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComplianceResultProperties model
            = BinaryData.fromString("{\"resourceStatus\":\"NotHealthy\"}").toObject(ComplianceResultProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComplianceResultProperties model = new ComplianceResultProperties();
        model = BinaryData.fromObject(model).toObject(ComplianceResultProperties.class);
    }
}
