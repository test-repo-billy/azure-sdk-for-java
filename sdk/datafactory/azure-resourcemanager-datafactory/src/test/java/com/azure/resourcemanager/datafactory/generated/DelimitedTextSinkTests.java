// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DelimitedTextSink;
import com.azure.resourcemanager.datafactory.models.DelimitedTextWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class DelimitedTextSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DelimitedTextSink model = BinaryData.fromString(
            "{\"type\":\"qaq\",\"storeSettings\":{\"type\":\"johwwtlerhpf\",\"maxConcurrentConnections\":\"datarqnjush\",\"disableMetricsCollection\":\"datahtvnqcmrrgmlwgo\",\"copyBehavior\":\"datascsddlcnwbi\",\"metadata\":[{\"name\":\"datangeffrghwd\",\"value\":\"dataowhrrguvdrggucw\"},{\"name\":\"datalmsikl\",\"value\":\"datam\"},{\"name\":\"datacphgimi\",\"value\":\"datahrbs\"}],\"\":{\"qfbgeblp\":\"dataublouelf\",\"swgfjrg\":\"datawckmnpzubzq\"}},\"formatSettings\":{\"type\":\"uop\",\"quoteAllText\":\"dataklfswzsyigxsyxhy\",\"fileExtension\":\"dataczab\",\"maxRowsPerFile\":\"dataeu\",\"fileNamePrefix\":\"datazf\",\"\":{\"sspcutgkm\":\"dataa\"}},\"writeBatchSize\":\"datalnhgisiwzzk\",\"writeBatchTimeout\":\"dataqrngl\",\"sinkRetryCount\":\"datatu\",\"sinkRetryWait\":\"datafwdkpadktsyy\",\"maxConcurrentConnections\":\"dataojrfqtfk\",\"disableMetricsCollection\":\"dataupmdajqpdvvzb\",\"\":{\"mvtqhn\":\"dataxokiffqpwdyzset\",\"cprkqywyb\":\"dataoij\"}}")
            .toObject(DelimitedTextSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DelimitedTextSink model = new DelimitedTextSink().withWriteBatchSize("datalnhgisiwzzk")
            .withWriteBatchTimeout("dataqrngl")
            .withSinkRetryCount("datatu")
            .withSinkRetryWait("datafwdkpadktsyy")
            .withMaxConcurrentConnections("dataojrfqtfk")
            .withDisableMetricsCollection("dataupmdajqpdvvzb")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("datarqnjush")
                .withDisableMetricsCollection("datahtvnqcmrrgmlwgo")
                .withCopyBehavior("datascsddlcnwbi")
                .withMetadata(
                    Arrays.asList(new MetadataItem().withName("datangeffrghwd").withValue("dataowhrrguvdrggucw"),
                        new MetadataItem().withName("datalmsikl").withValue("datam"),
                        new MetadataItem().withName("datacphgimi").withValue("datahrbs")))
                .withAdditionalProperties(mapOf("type", "johwwtlerhpf")))
            .withFormatSettings(new DelimitedTextWriteSettings().withQuoteAllText("dataklfswzsyigxsyxhy")
                .withFileExtension("dataczab")
                .withMaxRowsPerFile("dataeu")
                .withFileNamePrefix("datazf"));
        model = BinaryData.fromObject(model).toObject(DelimitedTextSink.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
