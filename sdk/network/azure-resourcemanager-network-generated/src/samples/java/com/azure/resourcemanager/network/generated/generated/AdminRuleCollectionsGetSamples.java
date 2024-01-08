// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/**
 * Samples for AdminRuleCollections Get.
 */
public final class AdminRuleCollectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * NetworkManagerAdminRuleCollectionGet.json
     */
    /**
     * Sample code: Gets security admin rule collection.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void
        getsSecurityAdminRuleCollection(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.adminRuleCollections().getWithResponse("rg1", "testNetworkManager", "myTestSecurityConfig",
            "testRuleCollection", com.azure.core.util.Context.NONE);
    }
}
