// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

import com.azure.resourcemanager.servicelinker.models.AzureResource;
import com.azure.resourcemanager.servicelinker.models.CreateOrUpdateDryrunParameters;
import com.azure.resourcemanager.servicelinker.models.DryrunPatch;
import com.azure.resourcemanager.servicelinker.models.SecretAuthInfo;
import com.azure.resourcemanager.servicelinker.models.ValueSecretInfo;

/**
 * Samples for LinkersOperation UpdateDryrun.
 */
public final class LinkersOperationUpdateDryrunSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2023-11-01-preview/examples/
     * PatchDryrun.json
     */
    /**
     * Sample code: PatchDryrun.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void patchDryrun(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkersOperations().updateDryrun(
            "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
            "dryrunName",
            new DryrunPatch().withParameters(new CreateOrUpdateDryrunParameters()
                .withTargetService(new AzureResource().withId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.DocumentDb/databaseAccounts/test-acc/mongodbDatabases/test-db"))
                .withAuthInfo(
                    new SecretAuthInfo().withName("name").withSecretInfo(new ValueSecretInfo().withValue("secret")))),
            com.azure.core.util.Context.NONE);
    }
}
