// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.AksClusterProfileAksClusterAgentPoolIdentityProfile;
import org.junit.jupiter.api.Assertions;

public final class AksClusterProfileAksClusterAgentPoolIdentityProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AksClusterProfileAksClusterAgentPoolIdentityProfile model = BinaryData.fromString(
            "{\"msiResourceId\":\"ctazakljlahbcryf\",\"msiClientId\":\"dfdosygexp\",\"msiObjectId\":\"ojakhmsbzjhcrze\"}")
            .toObject(AksClusterProfileAksClusterAgentPoolIdentityProfile.class);
        Assertions.assertEquals("ctazakljlahbcryf", model.msiResourceId());
        Assertions.assertEquals("dfdosygexp", model.msiClientId());
        Assertions.assertEquals("ojakhmsbzjhcrze", model.msiObjectId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AksClusterProfileAksClusterAgentPoolIdentityProfile model
            = new AksClusterProfileAksClusterAgentPoolIdentityProfile().withMsiResourceId("ctazakljlahbcryf")
                .withMsiClientId("dfdosygexp").withMsiObjectId("ojakhmsbzjhcrze");
        model = BinaryData.fromObject(model).toObject(AksClusterProfileAksClusterAgentPoolIdentityProfile.class);
        Assertions.assertEquals("ctazakljlahbcryf", model.msiResourceId());
        Assertions.assertEquals("dfdosygexp", model.msiClientId());
        Assertions.assertEquals("ojakhmsbzjhcrze", model.msiObjectId());
    }
}
