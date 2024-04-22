// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.IdentityProfile;
import org.junit.jupiter.api.Assertions;

public final class IdentityProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IdentityProfile model = BinaryData
            .fromString("{\"msiResourceId\":\"dphlxaolt\",\"msiClientId\":\"qtrgqjbpfzfsinzg\",\"msiObjectId\":\"f\"}")
            .toObject(IdentityProfile.class);
        Assertions.assertEquals("dphlxaolt", model.msiResourceId());
        Assertions.assertEquals("qtrgqjbpfzfsinzg", model.msiClientId());
        Assertions.assertEquals("f", model.msiObjectId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IdentityProfile model = new IdentityProfile().withMsiResourceId("dphlxaolt").withMsiClientId("qtrgqjbpfzfsinzg")
            .withMsiObjectId("f");
        model = BinaryData.fromObject(model).toObject(IdentityProfile.class);
        Assertions.assertEquals("dphlxaolt", model.msiResourceId());
        Assertions.assertEquals("qtrgqjbpfzfsinzg", model.msiClientId());
        Assertions.assertEquals("f", model.msiObjectId());
    }
}
