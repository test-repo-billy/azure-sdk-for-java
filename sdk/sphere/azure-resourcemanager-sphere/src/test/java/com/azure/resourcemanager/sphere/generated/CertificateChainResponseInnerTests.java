// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.CertificateChainResponseInner;

public final class CertificateChainResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CertificateChainResponseInner model
            = BinaryData.fromString("{\"certificateChain\":\"cph\"}").toObject(CertificateChainResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CertificateChainResponseInner model = new CertificateChainResponseInner();
        model = BinaryData.fromObject(model).toObject(CertificateChainResponseInner.class);
    }
}
