// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/**
 * Samples for RuleSets ListResourceUsage.
 */
public final class RuleSetsListResourceUsageSamples {
    /*
     * x-ms-original-file:
     * specification/cdn/resource-manager/Microsoft.Cdn/stable/2024-02-01/examples/RuleSets_ListResourceUsage.json
     */
    /**
     * Sample code: RuleSets_ListResourceUsage.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void ruleSetsListResourceUsage(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles().manager().serviceClient().getRuleSets().listResourceUsage("RG", "profile1", "ruleSet1",
            com.azure.core.util.Context.NONE);
    }
}
