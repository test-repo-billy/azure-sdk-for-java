// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

/**
 * Samples for SshPublicKeys Delete.
 */
public final class SshPublicKeysDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * sshPublicKeyExamples/SshPublicKey_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: SshPublicKey_Delete_MinimumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        sshPublicKeyDeleteMinimumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sshPublicKeys().deleteByResourceGroupWithResponse("rgcompute", "aaaaaaaaaaaaaaaaaaa",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * sshPublicKeyExamples/SshPublicKey_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: SshPublicKey_Delete_MaximumSet_Gen.
     * 
     * @param manager Entry point to ComputeManager.
     */
    public static void
        sshPublicKeyDeleteMaximumSetGen(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.sshPublicKeys().deleteByResourceGroupWithResponse("rgcompute", "aaaaaaaaaa",
            com.azure.core.util.Context.NONE);
    }
}
