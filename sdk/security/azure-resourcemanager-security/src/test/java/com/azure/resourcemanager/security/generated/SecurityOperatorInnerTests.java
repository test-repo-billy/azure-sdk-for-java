// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecurityOperatorInner;
import com.azure.resourcemanager.security.models.Identity;
import com.azure.resourcemanager.security.models.ResourceIdentityType;
import org.junit.jupiter.api.Assertions;

public final class SecurityOperatorInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityOperatorInner model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"xywr\",\"tenantId\":\"pyklyhpluodpvru\",\"type\":\"SystemAssigned\"},\"id\":\"gzibthostgktstv\",\"name\":\"xeclzedqbcvhzlhp\",\"type\":\"odqkdlwwqfb\"}")
            .toObject(SecurityOperatorInner.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityOperatorInner model
            = new SecurityOperatorInner().withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED));
        model = BinaryData.fromObject(model).toObject(SecurityOperatorInner.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
    }
}
