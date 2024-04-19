// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.FileWorkspaceDetailsProperties;

public final class FileWorkspaceDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileWorkspaceDetailsProperties model = BinaryData
            .fromString("{\"createdOn\":\"2021-03-26T11:46:42Z\",\"expirationTime\":\"2021-11-12T04:23:21Z\"}")
            .toObject(FileWorkspaceDetailsProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileWorkspaceDetailsProperties model = new FileWorkspaceDetailsProperties();
        model = BinaryData.fromObject(model).toObject(FileWorkspaceDetailsProperties.class);
    }
}
