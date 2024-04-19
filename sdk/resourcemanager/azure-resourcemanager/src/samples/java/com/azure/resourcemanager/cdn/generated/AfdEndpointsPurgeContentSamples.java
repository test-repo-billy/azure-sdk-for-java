// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.resourcemanager.cdn.models.AfdPurgeParameters;
import java.util.Arrays;

/**
 * Samples for AfdEndpoints PurgeContent.
 */
public final class AfdEndpointsPurgeContentSamples {
    /*
     * x-ms-original-file:
     * specification/cdn/resource-manager/Microsoft.Cdn/stable/2024-02-01/examples/AFDEndpoints_PurgeContent.json
     */
    /**
     * Sample code: AFDEndpoints_PurgeContent.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void aFDEndpointsPurgeContent(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles().manager().serviceClient().getAfdEndpoints().purgeContent(
            "RG", "profile1", "endpoint1", new AfdPurgeParameters().withContentPaths(Arrays.asList("/folder1"))
                .withDomains(Arrays.asList("endpoint1-abcdefghijklmnop.z01.azurefd.net")),
            com.azure.core.util.Context.NONE);
    }
}
