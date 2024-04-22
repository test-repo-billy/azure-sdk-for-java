// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SnowflakeDatasetTypeProperties;

public final class SnowflakeDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnowflakeDatasetTypeProperties model
            = BinaryData.fromString("{\"schema\":\"datayga\",\"table\":\"datahpwmdkyfgye\"}")
                .toObject(SnowflakeDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnowflakeDatasetTypeProperties model
            = new SnowflakeDatasetTypeProperties().withSchema("datayga").withTable("datahpwmdkyfgye");
        model = BinaryData.fromObject(model).toObject(SnowflakeDatasetTypeProperties.class);
    }
}
