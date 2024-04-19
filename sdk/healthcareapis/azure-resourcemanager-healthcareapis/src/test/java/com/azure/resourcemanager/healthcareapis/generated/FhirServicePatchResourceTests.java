// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.FhirServicePatchResource;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityIdentity;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityType;
import com.azure.resourcemanager.healthcareapis.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FhirServicePatchResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FhirServicePatchResource model = BinaryData.fromString(
            "{\"identity\":{\"type\":\"SystemAssigned,UserAssigned\",\"principalId\":\"5f1e7b9b-c97f-42e1-b88f-a26dca8549c8\",\"tenantId\":\"d711ea4f-ba8c-4fe5-9da1-fded2bf43131\",\"userAssignedIdentities\":{\"fbtkuwhhmhyk\":{\"principalId\":\"57ecb925-822e-4f35-a7e8-ef62abdc0a45\",\"clientId\":\"602c6b64-ab70-4589-9e5d-50e9fb1c3eef\"},\"xafnndlpichko\":{\"principalId\":\"8c4ea974-6984-4a12-9dbe-8a47b1d0b0e6\",\"clientId\":\"d9a20670-5ccd-48ac-bca3-59593a265d4f\"},\"cdyhbpkkpwdreqn\":{\"principalId\":\"82e0fc70-28df-48c4-b855-043f1ec6a81f\",\"clientId\":\"8110969a-eb23-4a38-b7c6-54613c821c4f\"},\"qfovljxywsuws\":{\"principalId\":\"a260f4d8-91a2-4499-a1b6-11a785d0e521\",\"clientId\":\"a3fd0c3a-700b-4fc9-98d5-dd895bac830b\"}}},\"tags\":{\"r\":\"ndsytgadg\"}}")
            .toObject(FhirServicePatchResource.class);
        Assertions.assertEquals("ndsytgadg", model.tags().get("r"));
        Assertions.assertEquals(ServiceManagedIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FhirServicePatchResource model
            = new FhirServicePatchResource().withTags(mapOf("r", "ndsytgadg"))
                .withIdentity(new ServiceManagedIdentityIdentity()
                    .withType(ServiceManagedIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf("fbtkuwhhmhyk", new UserAssignedIdentity(), "xafnndlpichko",
                        new UserAssignedIdentity(), "cdyhbpkkpwdreqn", new UserAssignedIdentity(), "qfovljxywsuws",
                        new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(FhirServicePatchResource.class);
        Assertions.assertEquals("ndsytgadg", model.tags().get("r"));
        Assertions.assertEquals(ServiceManagedIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
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
