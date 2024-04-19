// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AsyncOperationStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AsyncOperationStatusInner model = BinaryData.fromString(
            "{\"id\":\"egukgjnpiucg\",\"name\":\"evqzntypmrbp\",\"status\":\"zcdrqjsdpydnfyhx\",\"resourceId\":\"oejzi\",\"startTime\":\"2021-10-16T23:09:14Z\",\"endTime\":\"2021-04-16T21:39:11Z\",\"percentComplete\":44.46839055655801,\"properties\":\"datazfbishcbkhaj\"}")
            .toObject(AsyncOperationStatusInner.class);
        Assertions.assertEquals("egukgjnpiucg", model.id());
        Assertions.assertEquals("evqzntypmrbp", model.name());
        Assertions.assertEquals("zcdrqjsdpydnfyhx", model.status());
        Assertions.assertEquals("oejzi", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-16T23:09:14Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-16T21:39:11Z"), model.endTime());
        Assertions.assertEquals(44.46839055655801D, model.percentComplete());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AsyncOperationStatusInner model = new AsyncOperationStatusInner().withId("egukgjnpiucg")
            .withName("evqzntypmrbp").withStatus("zcdrqjsdpydnfyhx").withResourceId("oejzi")
            .withStartTime(OffsetDateTime.parse("2021-10-16T23:09:14Z"))
            .withEndTime(OffsetDateTime.parse("2021-04-16T21:39:11Z")).withPercentComplete(44.46839055655801D)
            .withProperties("datazfbishcbkhaj");
        model = BinaryData.fromObject(model).toObject(AsyncOperationStatusInner.class);
        Assertions.assertEquals("egukgjnpiucg", model.id());
        Assertions.assertEquals("evqzntypmrbp", model.name());
        Assertions.assertEquals("zcdrqjsdpydnfyhx", model.status());
        Assertions.assertEquals("oejzi", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-16T23:09:14Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-16T21:39:11Z"), model.endTime());
        Assertions.assertEquals(44.46839055655801D, model.percentComplete());
    }
}
