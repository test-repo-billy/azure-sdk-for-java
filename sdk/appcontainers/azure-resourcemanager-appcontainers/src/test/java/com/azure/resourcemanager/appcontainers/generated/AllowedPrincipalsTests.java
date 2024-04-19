// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.AllowedPrincipals;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AllowedPrincipalsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllowedPrincipals model = BinaryData.fromString(
            "{\"groups\":[\"ajionpimexgstxg\",\"po\",\"gmaajrm\"],\"identities\":[\"wzrlovmclwhij\",\"oejctbzaqsqsy\"]}")
            .toObject(AllowedPrincipals.class);
        Assertions.assertEquals("ajionpimexgstxg", model.groups().get(0));
        Assertions.assertEquals("wzrlovmclwhij", model.identities().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllowedPrincipals model = new AllowedPrincipals().withGroups(Arrays.asList("ajionpimexgstxg", "po", "gmaajrm"))
            .withIdentities(Arrays.asList("wzrlovmclwhij", "oejctbzaqsqsy"));
        model = BinaryData.fromObject(model).toObject(AllowedPrincipals.class);
        Assertions.assertEquals("ajionpimexgstxg", model.groups().get(0));
        Assertions.assertEquals("wzrlovmclwhij", model.identities().get(0));
    }
}
