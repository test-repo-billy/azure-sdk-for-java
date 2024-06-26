// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.models.CommunicationServiceResourceUpdate;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentity;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.communication.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CommunicationServiceResourceUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunicationServiceResourceUpdate model = BinaryData.fromString(
            "{\"properties\":{\"linkedDomains\":[\"jvtbvpyss\",\"dnrujqguhmuouqfp\"]},\"identity\":{\"principalId\":\"6211b490-391f-4b88-a622-b29fa0524dee\",\"tenantId\":\"49124dfc-70a5-407e-941f-67e66e775255\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"tnwu\":{\"principalId\":\"d34810c6-782e-42c1-9285-10f9e3568d49\",\"clientId\":\"5d70e04d-9075-4b18-8d87-b46281661276\"}}},\"tags\":{\"x\":\"a\",\"hr\":\"fizuckyf\"}}")
            .toObject(CommunicationServiceResourceUpdate.class);
        Assertions.assertEquals("a", model.tags().get("x"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("jvtbvpyss", model.linkedDomains().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunicationServiceResourceUpdate model
            = new CommunicationServiceResourceUpdate().withTags(mapOf("x", "a", "hr", "fizuckyf"))
                .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                    .withUserAssignedIdentities(mapOf("tnwu", new UserAssignedIdentity())))
                .withLinkedDomains(Arrays.asList("jvtbvpyss", "dnrujqguhmuouqfp"));
        model = BinaryData.fromObject(model).toObject(CommunicationServiceResourceUpdate.class);
        Assertions.assertEquals("a", model.tags().get("x"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("jvtbvpyss", model.linkedDomains().get(0));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
