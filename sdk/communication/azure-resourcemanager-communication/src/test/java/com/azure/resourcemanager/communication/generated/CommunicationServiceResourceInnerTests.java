// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.fluent.models.CommunicationServiceResourceInner;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentity;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.communication.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CommunicationServiceResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunicationServiceResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Updating\",\"hostName\":\"ljfmppee\",\"dataLocation\":\"vmgxsab\",\"notificationHubId\":\"qduujitcjczdz\",\"version\":\"ndhkrw\",\"immutableResourceId\":\"appd\",\"linkedDomains\":[\"kvwrwjfeu\",\"nhutjeltmrldhugj\",\"zdatqxhocdg\"]},\"identity\":{\"principalId\":\"3be39144-f5db-4d95-a423-901fe2c71743\",\"tenantId\":\"5eed8049-2baf-4291-8ae1-a28d5ca55c0f\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"icndvkaozwyifty\":{\"principalId\":\"2dba58c6-e1b7-48a0-8457-6f9eda4da645\",\"clientId\":\"39146c26-b00c-4f50-8261-625c41383ead\"},\"urokft\":{\"principalId\":\"2affca77-44bb-412b-923b-629c333f41b1\",\"clientId\":\"d9e394ab-bcf6-427f-8a26-28182ed95220\"},\"lniwpwcukjfkgiaw\":{\"principalId\":\"8680008c-30a6-4d01-8316-a3a6716c164d\",\"clientId\":\"19d70193-a0f9-41f3-ba3a-40df75ed6670\"}}},\"location\":\"lryplwckbasyy\",\"tags\":{\"phejkotynqgoulz\":\"dhsgcba\",\"gakeqsr\":\"dlikwyqkgfgibma\",\"qqedqytbciqfou\":\"yb\"},\"id\":\"lmmnkzsmodmglo\",\"name\":\"gpbkwtmut\",\"type\":\"uqktap\"}")
            .toObject(CommunicationServiceResourceInner.class);
        Assertions.assertEquals("lryplwckbasyy", model.location());
        Assertions.assertEquals("dhsgcba", model.tags().get("phejkotynqgoulz"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("vmgxsab", model.dataLocation());
        Assertions.assertEquals("kvwrwjfeu", model.linkedDomains().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunicationServiceResourceInner model = new CommunicationServiceResourceInner().withLocation("lryplwckbasyy")
            .withTags(mapOf("phejkotynqgoulz", "dhsgcba", "gakeqsr", "dlikwyqkgfgibma", "qqedqytbciqfou", "yb"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf("icndvkaozwyifty", new UserAssignedIdentity(), "urokft",
                    new UserAssignedIdentity(), "lniwpwcukjfkgiaw", new UserAssignedIdentity())))
            .withDataLocation("vmgxsab")
            .withLinkedDomains(Arrays.asList("kvwrwjfeu", "nhutjeltmrldhugj", "zdatqxhocdg"));
        model = BinaryData.fromObject(model).toObject(CommunicationServiceResourceInner.class);
        Assertions.assertEquals("lryplwckbasyy", model.location());
        Assertions.assertEquals("dhsgcba", model.tags().get("phejkotynqgoulz"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("vmgxsab", model.dataLocation());
        Assertions.assertEquals("kvwrwjfeu", model.linkedDomains().get(0));
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
