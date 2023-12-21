// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventStatusInner;
import com.azure.resourcemanager.mediaservices.models.LiveEventGetStatusResult;
import com.azure.resourcemanager.mediaservices.models.LiveEventHealthStatus;
import com.azure.resourcemanager.mediaservices.models.LiveEventIngestion;
import com.azure.resourcemanager.mediaservices.models.LiveEventState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LiveEventGetStatusResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveEventGetStatusResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"state\":\"Stopped\",\"healthStatus\":\"Poor\",\"healthDescriptions\":[\"osytxitcskfckt\",\"umiekkezzi\",\"hlyfjhdgqgg\"],\"lastUpdatedTime\":\"2021-09-22T21:29:13Z\",\"ingestion\":{\"streamName\":\"ygaeqidbqfatpxl\",\"begin\":\"2021-09-20T22:01:43Z\",\"end\":\"2021-08-27T05:14:18Z\",\"endReason\":\"moadsuvarmy\",\"ingestInterruptions\":[]},\"trackStatus\":[]}]}")
                .toObject(LiveEventGetStatusResult.class);
        Assertions.assertEquals(LiveEventState.STOPPED, model.value().get(0).state());
        Assertions.assertEquals(LiveEventHealthStatus.POOR, model.value().get(0).healthStatus());
        Assertions.assertEquals("osytxitcskfckt", model.value().get(0).healthDescriptions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-22T21:29:13Z"), model.value().get(0).lastUpdatedTime());
        Assertions.assertEquals("ygaeqidbqfatpxl", model.value().get(0).ingestion().streamName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-20T22:01:43Z"), model.value().get(0).ingestion().begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-27T05:14:18Z"), model.value().get(0).ingestion().end());
        Assertions.assertEquals("moadsuvarmy", model.value().get(0).ingestion().endReason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveEventGetStatusResult model =
            new LiveEventGetStatusResult()
                .withValue(
                    Arrays
                        .asList(
                            new LiveEventStatusInner()
                                .withState(LiveEventState.STOPPED)
                                .withHealthStatus(LiveEventHealthStatus.POOR)
                                .withHealthDescriptions(Arrays.asList("osytxitcskfckt", "umiekkezzi", "hlyfjhdgqgg"))
                                .withLastUpdatedTime(OffsetDateTime.parse("2021-09-22T21:29:13Z"))
                                .withIngestion(
                                    new LiveEventIngestion()
                                        .withStreamName("ygaeqidbqfatpxl")
                                        .withBegin(OffsetDateTime.parse("2021-09-20T22:01:43Z"))
                                        .withEnd(OffsetDateTime.parse("2021-08-27T05:14:18Z"))
                                        .withEndReason("moadsuvarmy")
                                        .withIngestInterruptions(Arrays.asList()))
                                .withTrackStatus(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(LiveEventGetStatusResult.class);
        Assertions.assertEquals(LiveEventState.STOPPED, model.value().get(0).state());
        Assertions.assertEquals(LiveEventHealthStatus.POOR, model.value().get(0).healthStatus());
        Assertions.assertEquals("osytxitcskfckt", model.value().get(0).healthDescriptions().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-22T21:29:13Z"), model.value().get(0).lastUpdatedTime());
        Assertions.assertEquals("ygaeqidbqfatpxl", model.value().get(0).ingestion().streamName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-20T22:01:43Z"), model.value().get(0).ingestion().begin());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-27T05:14:18Z"), model.value().get(0).ingestion().end());
        Assertions.assertEquals("moadsuvarmy", model.value().get(0).ingestion().endReason());
    }
}
