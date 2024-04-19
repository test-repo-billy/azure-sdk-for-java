// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDatabricksDeltaLakeImportCommand;
import com.azure.resourcemanager.datafactory.models.AzureDatabricksDeltaLakeSink;

public final class AzureDatabricksDeltaLakeSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDatabricksDeltaLakeSink model = BinaryData.fromString(
            "{\"type\":\"x\",\"preCopyScript\":\"dataogowfqrykikhfgw\",\"importSettings\":{\"type\":\"mkfy\",\"dateFormat\":\"dataazi\",\"timestampFormat\":\"datah\",\"\":{\"znf\":\"dataavfsehbxbqionnq\",\"pvxcqj\":\"dataiboyexjcrwwdtey\",\"mv\":\"datawtiasfbp\"}},\"writeBatchSize\":\"datarysnszsehoegvwb\",\"writeBatchTimeout\":\"datarndxbkvzwqgmfhl\",\"sinkRetryCount\":\"datayed\",\"sinkRetryWait\":\"datafncwiyfzuw\",\"maxConcurrentConnections\":\"dataaaxstn\",\"disableMetricsCollection\":\"datavv\",\"\":{\"wzbzedhcxyg\":\"datatuj\"}}")
            .toObject(AzureDatabricksDeltaLakeSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDatabricksDeltaLakeSink model
            = new AzureDatabricksDeltaLakeSink().withWriteBatchSize("datarysnszsehoegvwb")
                .withWriteBatchTimeout("datarndxbkvzwqgmfhl")
                .withSinkRetryCount("datayed")
                .withSinkRetryWait("datafncwiyfzuw")
                .withMaxConcurrentConnections("dataaaxstn")
                .withDisableMetricsCollection("datavv")
                .withPreCopyScript("dataogowfqrykikhfgw")
                .withImportSettings(
                    new AzureDatabricksDeltaLakeImportCommand().withDateFormat("dataazi").withTimestampFormat("datah"));
        model = BinaryData.fromObject(model).toObject(AzureDatabricksDeltaLakeSink.class);
    }
}
