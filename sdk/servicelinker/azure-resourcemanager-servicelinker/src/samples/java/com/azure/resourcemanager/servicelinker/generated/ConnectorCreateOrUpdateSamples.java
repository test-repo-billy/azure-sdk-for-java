// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

import com.azure.resourcemanager.servicelinker.models.AzureResource;
import com.azure.resourcemanager.servicelinker.models.SecretAuthInfo;
import com.azure.resourcemanager.servicelinker.models.SecretStore;

/**
 * Samples for Connector CreateOrUpdate.
 */
public final class ConnectorCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2023-04-01-preview/examples/PutConnector.json
     */
    /**
     * Sample code: PutConnector.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void putConnector(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.connectors()
            .define("connectorName")
            .withExistingLocation("00000000-0000-0000-0000-000000000000", "test-rg", "westus")
            .withTargetService(new AzureResource().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.DocumentDb/databaseAccounts/test-acc/mongodbDatabases/test-db"))
            .withAuthInfo(new SecretAuthInfo())
            .withSecretStore(new SecretStore().withKeyVaultId("fakeTokenPlaceholder"))
            .create();
    }
}
