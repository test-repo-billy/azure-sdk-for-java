// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

/**
 * Samples for EmailServices ListVerifiedExchangeOnlineDomains.
 */
public final class EmailServicesListVerifiedExchangeOnlineDomainsSamples {
    /*
     * x-ms-original-file:
     * specification/communication/resource-manager/Microsoft.Communication/stable/2023-04-01/examples/emailServices/
     * getVerifiedExchangeOnlineDomains.json
     */
    /**
     * Sample code: Get verified Exchange Online domains.
     * 
     * @param manager Entry point to CommunicationManager.
     */
    public static void
        getVerifiedExchangeOnlineDomains(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.emailServices().listVerifiedExchangeOnlineDomainsWithResponse(com.azure.core.util.Context.NONE);
    }
}
