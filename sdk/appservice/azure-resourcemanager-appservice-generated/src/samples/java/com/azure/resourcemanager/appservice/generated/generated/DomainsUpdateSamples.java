// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.models.DnsType;
import com.azure.resourcemanager.appservice.generated.models.Domain;

/**
 * Samples for Domains Update.
 */
public final class DomainsUpdateSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.DomainRegistration/stable/2023-12-01/examples/UpdateAppServiceDomain.json
     */
    /**
     * Sample code: Update App Service Domain.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        updateAppServiceDomain(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        Domain resource = manager.domains()
            .getByResourceGroupWithResponse("testrg123", "example.com", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withPrivacy(false)
            .withAutoRenew(true)
            .withDnsType(DnsType.DEFAULT_DOMAIN_REGISTRAR_DNS)
            .apply();
    }
}
