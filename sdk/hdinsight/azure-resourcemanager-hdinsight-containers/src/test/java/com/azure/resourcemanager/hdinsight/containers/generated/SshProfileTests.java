// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.SshProfile;
import org.junit.jupiter.api.Assertions;

public final class SshProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SshProfile model
            = BinaryData.fromString("{\"count\":1278137451,\"podPrefix\":\"erfuwuttt\"}").toObject(SshProfile.class);
        Assertions.assertEquals(1278137451, model.count());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SshProfile model = new SshProfile().withCount(1278137451);
        model = BinaryData.fromObject(model).toObject(SshProfile.class);
        Assertions.assertEquals(1278137451, model.count());
    }
}
