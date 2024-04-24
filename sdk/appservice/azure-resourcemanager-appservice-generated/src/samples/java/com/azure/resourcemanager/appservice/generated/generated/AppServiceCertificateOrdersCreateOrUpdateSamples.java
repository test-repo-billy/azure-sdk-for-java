// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceCertificate;
import com.azure.resourcemanager.appservice.generated.models.CertificateProductType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AppServiceCertificateOrders CreateOrUpdate.
 */
public final class AppServiceCertificateOrdersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2023-12-01/examples/CreateAppServiceCertificateOrder.json
     */
    /**
     * Sample code: Create Certificate order.
     * 
     * @param manager Entry point to AppServiceManager.
     */
    public static void
        createCertificateOrder(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.appServiceCertificateOrders()
            .define("SampleCertificateOrderName")
            .withRegion("Global")
            .withExistingResourceGroup("testrg123")
            .withCertificates(mapOf("SampleCertName1",
                new AppServiceCertificate().withKeyVaultId("fakeTokenPlaceholder")
                    .withKeyVaultSecretName("fakeTokenPlaceholder"),
                "SampleCertName2",
                new AppServiceCertificate().withKeyVaultId("fakeTokenPlaceholder")
                    .withKeyVaultSecretName("fakeTokenPlaceholder")))
            .withDistinguishedName("CN=SampleCustomDomain.com")
            .withValidityInYears(2)
            .withKeySize(2048)
            .withProductType(CertificateProductType.STANDARD_DOMAIN_VALIDATED_SSL)
            .withAutoRenew(true)
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
