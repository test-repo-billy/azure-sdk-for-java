// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for SshPublicKeys List.
 */
public final class SshPublicKeysListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/sshPublicKeyExamples/SshPublicKey_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: SshPublicKey_ListBySubscription_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void sshPublicKeyListBySubscriptionMinimumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sshPublicKeys().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/sshPublicKeyExamples/SshPublicKey_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: SshPublicKey_ListBySubscription_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void sshPublicKeyListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sshPublicKeys().list(com.azure.core.util.Context.NONE);
    }
}
