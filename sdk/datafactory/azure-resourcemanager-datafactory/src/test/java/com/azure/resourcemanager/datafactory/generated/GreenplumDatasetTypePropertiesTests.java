// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.GreenplumDatasetTypeProperties;

public final class GreenplumDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GreenplumDatasetTypeProperties model = BinaryData
            .fromString("{\"tableName\":\"dataptgvnaqyjukka\",\"table\":\"datanewl\",\"schema\":\"datanopffemi\"}")
            .toObject(GreenplumDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GreenplumDatasetTypeProperties model = new GreenplumDatasetTypeProperties().withTableName("dataptgvnaqyjukka")
            .withTable("datanewl")
            .withSchema("datanopffemi");
        model = BinaryData.fromObject(model).toObject(GreenplumDatasetTypeProperties.class);
    }
}
