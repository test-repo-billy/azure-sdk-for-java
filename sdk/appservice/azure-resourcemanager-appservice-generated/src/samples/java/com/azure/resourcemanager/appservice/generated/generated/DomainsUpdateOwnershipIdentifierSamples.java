// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.models.DomainOwnershipIdentifier;

/**
 * Samples for Domains UpdateOwnershipIdentifier.
 */
public final class DomainsUpdateOwnershipIdentifierSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.DomainRegistration/stable/2023-12-01/examples/UpdateAppServiceDomainOwnershipIdentifier.json
     */
    /**
     * Sample code: Update App Service Domain OwnershipIdentifier.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void updateAppServiceDomainOwnershipIdentifier(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        DomainOwnershipIdentifier resource = manager.domains()
            .getOwnershipIdentifierWithResponse("testrg123", "example.com", "SampleOwnershipId",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withOwnershipId("SampleOwnershipId").apply();
    }
}
