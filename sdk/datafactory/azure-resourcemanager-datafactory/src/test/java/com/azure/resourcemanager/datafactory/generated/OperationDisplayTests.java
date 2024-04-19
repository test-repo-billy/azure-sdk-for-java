// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model = BinaryData
            .fromString(
                "{\"description\":\"xinpmqnjaq\",\"provider\":\"xj\",\"resource\":\"r\",\"operation\":\"vcputegj\"}")
            .toObject(OperationDisplay.class);
        Assertions.assertEquals("xinpmqnjaq", model.description());
        Assertions.assertEquals("xj", model.provider());
        Assertions.assertEquals("r", model.resource());
        Assertions.assertEquals("vcputegj", model.operation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model = new OperationDisplay().withDescription("xinpmqnjaq")
            .withProvider("xj")
            .withResource("r")
            .withOperation("vcputegj");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("xinpmqnjaq", model.description());
        Assertions.assertEquals("xj", model.provider());
        Assertions.assertEquals("r", model.resource());
        Assertions.assertEquals("vcputegj", model.operation());
    }
}
