// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.ActiveConfigurationParameter;
import java.util.Arrays;

/**
 * Samples for ResourceProvider ListActiveSecurityAdminRules.
 */
public final class ResourceProviderListActiveSecurityAdminRulesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * NetworkManagerActiveSecurityAdminRulesList.json
     */
    /**
     * Sample code: List Active Security Admin Rules.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        listActiveSecurityAdminRules(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.resourceProviders().listActiveSecurityAdminRulesWithResponse(
            "myResourceGroup", "testNetworkManager", new ActiveConfigurationParameter()
                .withRegions(Arrays.asList("westus")).withSkipToken("fakeTokenPlaceholder"),
            null, com.azure.core.util.Context.NONE);
    }
}
