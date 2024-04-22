// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/**
 * Samples for Secrets ListByProfile.
 */
public final class SecretsListByProfileSamples {
    /*
     * x-ms-original-file:
     * specification/cdn/resource-manager/Microsoft.Cdn/stable/2024-02-01/examples/Secrets_ListByProfile.json
     */
    /**
     * Sample code: Secrets_ListByProfile.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void secretsListByProfile(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cdnProfiles().manager().serviceClient().getSecrets().listByProfile("RG", "profile1",
            com.azure.core.util.Context.NONE);
    }
}
