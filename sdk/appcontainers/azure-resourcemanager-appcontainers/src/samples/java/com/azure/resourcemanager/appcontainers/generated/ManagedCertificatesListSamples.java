// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ManagedCertificates List.
 */
public final class ManagedCertificatesListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2023-11-02-preview/examples/
     * ManagedCertificates_ListByManagedEnvironment.json
     */
    /**
     * Sample code: List Managed Certificates by Managed Environment.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listManagedCertificatesByManagedEnvironment(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedCertificates().list("examplerg", "testcontainerenv", com.azure.core.util.Context.NONE);
    }
}
