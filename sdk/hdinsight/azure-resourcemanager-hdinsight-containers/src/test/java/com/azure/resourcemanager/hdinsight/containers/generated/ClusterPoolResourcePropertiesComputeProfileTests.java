// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolResourcePropertiesComputeProfile;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolResourcePropertiesComputeProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolResourcePropertiesComputeProfile model
            = BinaryData.fromString("{\"vmSize\":\"kryhtnapczwlokj\",\"count\":1793570177}")
                .toObject(ClusterPoolResourcePropertiesComputeProfile.class);
        Assertions.assertEquals("kryhtnapczwlokj", model.vmSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolResourcePropertiesComputeProfile model
            = new ClusterPoolResourcePropertiesComputeProfile().withVmSize("kryhtnapczwlokj");
        model = BinaryData.fromObject(model).toObject(ClusterPoolResourcePropertiesComputeProfile.class);
        Assertions.assertEquals("kryhtnapczwlokj", model.vmSize());
    }
}
