// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentity;
import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlane;
import com.azure.resourcemanager.mobilenetwork.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PacketCoreControlPlanes UpdateTags.
 */
public final class PacketCoreControlPlanesUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-02-01/examples/
     * PacketCoreControlPlanePatch.json
     */
    /**
     * Sample code: Patch packet core control plane.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void
        patchPacketCoreControlPlane(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        PacketCoreControlPlane resource = manager.packetCoreControlPlanes()
            .getByResourceGroupWithResponse("rg1", "TestPacketCoreCP", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).withIdentity(new ManagedServiceIdentity()
            .withType(ManagedServiceIdentityType.USER_ASSIGNED)
            .withUserAssignedIdentities(mapOf(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/testUserAssignedManagedIdentity",
                new UserAssignedIdentity())))
            .apply();
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
