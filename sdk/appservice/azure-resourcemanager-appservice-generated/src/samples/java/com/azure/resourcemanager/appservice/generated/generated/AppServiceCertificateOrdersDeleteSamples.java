// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for AppServiceCertificateOrders Delete.
 */
public final class AppServiceCertificateOrdersDeleteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2023-12-01/examples/DeleteAppServiceCertificateOrder.json
     */
    /**
     * Sample code: Delete App Service Certificate Order.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        deleteAppServiceCertificateOrder(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.appServiceCertificateOrders()
            .deleteByResourceGroupWithResponse("testrg123", "SampleCertificateOrderName",
                com.azure.core.util.Context.NONE);
    }
}
