// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storageactions.models.StorageTaskAssignmentsListResult;

public final class StorageTaskAssignmentsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageTaskAssignmentsListResult model = BinaryData
            .fromString(
                "{\"value\":[{\"id\":\"qzntypm\"},{\"id\":\"p\"},{\"id\":\"c\"}],\"nextLink\":\"qjsdpydnfyhxdeo\"}")
            .toObject(StorageTaskAssignmentsListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageTaskAssignmentsListResult model = new StorageTaskAssignmentsListResult();
        model = BinaryData.fromObject(model).toObject(StorageTaskAssignmentsListResult.class);
    }
}
