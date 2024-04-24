// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

/**
 * Samples for CertificateOrdersDiagnostics GetAppServiceCertificateOrderDetectorResponse.
 */
public final class CertificateOrdersDiagnosticsGetAppServiceCertificateOrderDetectorResponseSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2023-12-01/examples/Diagnostics_GetAppServiceCertificateOrderDetectorResponse.json
     */
    /**
     * Sample code: Get app service certificate order detector response.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void getAppServiceCertificateOrderDetectorResponse(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.certificateOrdersDiagnostics()
            .getAppServiceCertificateOrderDetectorResponseWithResponse("Sample-WestUSResourceGroup",
                "SampleCertificateOrderName", "AutoRenewStatus", null, null, null, com.azure.core.util.Context.NONE);
    }
}
