// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.MdeOnboardingDataInner;
import com.azure.resourcemanager.security.fluent.models.MdeOnboardingDataListInner;
import java.util.Arrays;

public final class MdeOnboardingDataListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MdeOnboardingDataListInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{},\"id\":\"ibyqunyowxwlmdj\",\"name\":\"kv\",\"type\":\"g\"},{\"properties\":{},\"id\":\"p\",\"name\":\"bodacizsjq\",\"type\":\"hkr\"},{\"properties\":{},\"id\":\"eibq\",\"name\":\"p\",\"type\":\"kghv\"}]}")
            .toObject(MdeOnboardingDataListInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MdeOnboardingDataListInner model = new MdeOnboardingDataListInner().withValue(
            Arrays.asList(new MdeOnboardingDataInner(), new MdeOnboardingDataInner(), new MdeOnboardingDataInner()));
        model = BinaryData.fromObject(model).toObject(MdeOnboardingDataListInner.class);
    }
}
