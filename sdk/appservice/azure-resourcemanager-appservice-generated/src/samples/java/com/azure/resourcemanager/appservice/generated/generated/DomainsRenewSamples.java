// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for Domains Renew.
 */
public final class DomainsRenewSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.DomainRegistration/stable/2023-12-01/examples/RenewDomain.json
     */
    /**
     * Sample code: Renew an existing domain.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void renewAnExistingDomain(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.domains().renewWithResponse("RG", "example.com", com.azure.core.util.Context.NONE);
    }
}
