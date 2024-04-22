// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BlobEventsTrigger;
import com.azure.resourcemanager.datafactory.models.BlobEventTypes;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BlobEventsTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobEventsTrigger model = BinaryData.fromString(
            "{\"type\":\"ifv\",\"typeProperties\":{\"blobPathBeginsWith\":\"pswasveym\",\"blobPathEndsWith\":\"bmffcryyykwwhscu\",\"ignoreEmptyBlobs\":false,\"events\":[\"Microsoft.Storage.BlobDeleted\",\"Microsoft.Storage.BlobDeleted\",\"Microsoft.Storage.BlobCreated\",\"Microsoft.Storage.BlobDeleted\"],\"scope\":\"lzbzcgzhdrvkz\"},\"pipelines\":[{\"pipelineReference\":{\"referenceName\":\"qrvz\",\"name\":\"beiqopjzzglgxvqd\"},\"parameters\":{\"wbpbi\":\"datazkzkhbiee\",\"t\":\"datateprq\"}},{\"pipelineReference\":{\"referenceName\":\"wapmtyfgswp\",\"name\":\"nvxtvmbwydqo\"},\"parameters\":{\"i\":\"datayjebgveuazwkze\"}},{\"pipelineReference\":{\"referenceName\":\"drrgzguupw\",\"name\":\"ohz\"},\"parameters\":{\"dlxqjshyyrcr\":\"databsncorini\"}},{\"pipelineReference\":{\"referenceName\":\"z\",\"name\":\"faurmqpk\"},\"parameters\":{\"dnpeamslvpxsy\":\"databltfxhmrhhxli\"}}],\"description\":\"dyaauls\",\"runtimeState\":\"Disabled\",\"annotations\":[\"datac\"],\"\":{\"h\":\"databxgxgr\",\"ndvaf\":\"dataabhkyaspccwiev\",\"yxlcgycvcspcfx\":\"datacvn\",\"ioqtafmbxtn\":\"dataal\"}}")
            .toObject(BlobEventsTrigger.class);
        Assertions.assertEquals("dyaauls", model.description());
        Assertions.assertEquals("qrvz", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("beiqopjzzglgxvqd", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("pswasveym", model.blobPathBeginsWith());
        Assertions.assertEquals("bmffcryyykwwhscu", model.blobPathEndsWith());
        Assertions.assertEquals(false, model.ignoreEmptyBlobs());
        Assertions.assertEquals(BlobEventTypes.MICROSOFT_STORAGE_BLOB_DELETED, model.events().get(0));
        Assertions.assertEquals("lzbzcgzhdrvkz", model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobEventsTrigger model = new BlobEventsTrigger().withDescription("dyaauls")
            .withAnnotations(Arrays.asList("datac"))
            .withPipelines(Arrays.asList(
                new TriggerPipelineReference()
                    .withPipelineReference(
                        new PipelineReference().withReferenceName("qrvz").withName("beiqopjzzglgxvqd"))
                    .withParameters(mapOf("wbpbi", "datazkzkhbiee", "t", "datateprq")),
                new TriggerPipelineReference()
                    .withPipelineReference(
                        new PipelineReference().withReferenceName("wapmtyfgswp").withName("nvxtvmbwydqo"))
                    .withParameters(mapOf("i", "datayjebgveuazwkze")),
                new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("drrgzguupw").withName("ohz"))
                    .withParameters(mapOf("dlxqjshyyrcr", "databsncorini")),
                new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("z").withName("faurmqpk"))
                    .withParameters(mapOf("dnpeamslvpxsy", "databltfxhmrhhxli"))))
            .withBlobPathBeginsWith("pswasveym")
            .withBlobPathEndsWith("bmffcryyykwwhscu")
            .withIgnoreEmptyBlobs(false)
            .withEvents(Arrays.asList(BlobEventTypes.MICROSOFT_STORAGE_BLOB_DELETED,
                BlobEventTypes.MICROSOFT_STORAGE_BLOB_DELETED, BlobEventTypes.MICROSOFT_STORAGE_BLOB_CREATED,
                BlobEventTypes.MICROSOFT_STORAGE_BLOB_DELETED))
            .withScope("lzbzcgzhdrvkz");
        model = BinaryData.fromObject(model).toObject(BlobEventsTrigger.class);
        Assertions.assertEquals("dyaauls", model.description());
        Assertions.assertEquals("qrvz", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("beiqopjzzglgxvqd", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("pswasveym", model.blobPathBeginsWith());
        Assertions.assertEquals("bmffcryyykwwhscu", model.blobPathEndsWith());
        Assertions.assertEquals(false, model.ignoreEmptyBlobs());
        Assertions.assertEquals(BlobEventTypes.MICROSOFT_STORAGE_BLOB_DELETED, model.events().get(0));
        Assertions.assertEquals("lzbzcgzhdrvkz", model.scope());
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
