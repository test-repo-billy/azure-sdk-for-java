// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.SecurityPartnerProvider;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SecurityPartnerProviders UpdateTags.
 */
public final class SecurityPartnerProvidersUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * SecurityPartnerProviderUpdateTags.json
     */
    /**
     * Sample code: Update Security Partner Provider Tags.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        updateSecurityPartnerProviderTags(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        SecurityPartnerProvider resource = manager.securityPartnerProviders()
            .getByResourceGroupWithResponse("rg1", "securityPartnerProvider", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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
