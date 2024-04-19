// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlow;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DataFlowTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlow model = BinaryData.fromString(
            "{\"type\":\"fhvfsl\",\"description\":\"ntjlr\",\"annotations\":[\"datakskyrioovzid\",\"dataxwaabzmifrygznmm\"],\"folder\":{\"name\":\"izkzobgo\"}}")
            .toObject(DataFlow.class);
        Assertions.assertEquals("ntjlr", model.description());
        Assertions.assertEquals("izkzobgo", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlow model = new DataFlow().withDescription("ntjlr")
            .withAnnotations(Arrays.asList("datakskyrioovzid", "dataxwaabzmifrygznmm"))
            .withFolder(new DataFlowFolder().withName("izkzobgo"));
        model = BinaryData.fromObject(model).toObject(DataFlow.class);
        Assertions.assertEquals("ntjlr", model.description());
        Assertions.assertEquals("izkzobgo", model.folder().name());
    }
}
