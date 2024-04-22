// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.AuthenticationType;
import com.azure.resourcemanager.mobilenetwork.models.HttpsServerCertificate;
import com.azure.resourcemanager.mobilenetwork.models.LocalDiagnosticsAccessConfiguration;
import org.junit.jupiter.api.Assertions;

public final class LocalDiagnosticsAccessConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LocalDiagnosticsAccessConfiguration model = BinaryData.fromString(
            "{\"authenticationType\":\"AAD\",\"httpsServerCertificate\":{\"certificateUrl\":\"isgwbnbbeldawkz\",\"provisioning\":{\"state\":\"Failed\",\"reason\":\"urqhaka\"}}}")
            .toObject(LocalDiagnosticsAccessConfiguration.class);
        Assertions.assertEquals(AuthenticationType.AAD, model.authenticationType());
        Assertions.assertEquals("isgwbnbbeldawkz", model.httpsServerCertificate().certificateUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LocalDiagnosticsAccessConfiguration model
            = new LocalDiagnosticsAccessConfiguration().withAuthenticationType(AuthenticationType.AAD)
                .withHttpsServerCertificate(new HttpsServerCertificate().withCertificateUrl("isgwbnbbeldawkz"));
        model = BinaryData.fromObject(model).toObject(LocalDiagnosticsAccessConfiguration.class);
        Assertions.assertEquals(AuthenticationType.AAD, model.authenticationType());
        Assertions.assertEquals("isgwbnbbeldawkz", model.httpsServerCertificate().certificateUrl());
    }
}
