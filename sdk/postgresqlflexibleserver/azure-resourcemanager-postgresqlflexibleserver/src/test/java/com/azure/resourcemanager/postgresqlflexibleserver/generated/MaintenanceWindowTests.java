// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MaintenanceWindow;
import org.junit.jupiter.api.Assertions;

public final class MaintenanceWindowTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MaintenanceWindow model =
            BinaryData
                .fromString(
                    "{\"customWindow\":\"fvovbvmeuecivy\",\"startHour\":343837467,\"startMinute\":1240635196,\"dayOfWeek\":1339093969}")
                .toObject(MaintenanceWindow.class);
        Assertions.assertEquals("fvovbvmeuecivy", model.customWindow());
        Assertions.assertEquals(343837467, model.startHour());
        Assertions.assertEquals(1240635196, model.startMinute());
        Assertions.assertEquals(1339093969, model.dayOfWeek());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MaintenanceWindow model =
            new MaintenanceWindow()
                .withCustomWindow("fvovbvmeuecivy")
                .withStartHour(343837467)
                .withStartMinute(1240635196)
                .withDayOfWeek(1339093969);
        model = BinaryData.fromObject(model).toObject(MaintenanceWindow.class);
        Assertions.assertEquals("fvovbvmeuecivy", model.customWindow());
        Assertions.assertEquals(343837467, model.startHour());
        Assertions.assertEquals(1240635196, model.startMinute());
        Assertions.assertEquals(1339093969, model.dayOfWeek());
    }
}
