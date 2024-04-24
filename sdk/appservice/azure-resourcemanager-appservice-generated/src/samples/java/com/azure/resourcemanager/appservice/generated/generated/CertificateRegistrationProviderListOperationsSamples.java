// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for CertificateRegistrationProvider ListOperations.
 */
public final class CertificateRegistrationProviderListOperationsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2023-12-01/examples/ListOperations.json
     */
    /**
     * Sample code: List operations.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void listOperations(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.certificateRegistrationProviders().listOperations(com.azure.core.util.Context.NONE);
    }
}
