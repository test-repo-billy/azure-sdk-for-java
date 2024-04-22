// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.models.OrganizationInfo;
import org.junit.jupiter.api.Assertions;

public final class OrganizationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OrganizationInfo model
            = BinaryData.fromString("{\"organizationId\":\"amiheognarxz\"}").toObject(OrganizationInfo.class);
        Assertions.assertEquals("amiheognarxz", model.organizationId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OrganizationInfo model = new OrganizationInfo().withOrganizationId("amiheognarxz");
        model = BinaryData.fromObject(model).toObject(OrganizationInfo.class);
        Assertions.assertEquals("amiheognarxz", model.organizationId());
    }
}
