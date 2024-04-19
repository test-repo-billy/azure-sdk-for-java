// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confluent.fluent.models.AccessRoleBindingNameListSuccessResponseInner;
import com.azure.resourcemanager.confluent.models.ConfluentListMetadata;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AccessRoleBindingNameListSuccessResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessRoleBindingNameListSuccessResponseInner model = BinaryData.fromString(
            "{\"kind\":\"btkuwhh\",\"metadata\":{\"first\":\"k\",\"last\":\"oxafn\",\"prev\":\"lpichk\",\"next\":\"mkcdyhbpkkpwdre\",\"total_size\":1405054510},\"data\":[\"qfovljxywsuws\"]}")
            .toObject(AccessRoleBindingNameListSuccessResponseInner.class);
        Assertions.assertEquals("btkuwhh", model.kind());
        Assertions.assertEquals("k", model.metadata().first());
        Assertions.assertEquals("oxafn", model.metadata().last());
        Assertions.assertEquals("lpichk", model.metadata().prev());
        Assertions.assertEquals("mkcdyhbpkkpwdre", model.metadata().next());
        Assertions.assertEquals(1405054510, model.metadata().totalSize());
        Assertions.assertEquals("qfovljxywsuws", model.data().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessRoleBindingNameListSuccessResponseInner model = new AccessRoleBindingNameListSuccessResponseInner()
            .withKind("btkuwhh").withMetadata(new ConfluentListMetadata().withFirst("k").withLast("oxafn")
                .withPrev("lpichk").withNext("mkcdyhbpkkpwdre").withTotalSize(1405054510))
            .withData(Arrays.asList("qfovljxywsuws"));
        model = BinaryData.fromObject(model).toObject(AccessRoleBindingNameListSuccessResponseInner.class);
        Assertions.assertEquals("btkuwhh", model.kind());
        Assertions.assertEquals("k", model.metadata().first());
        Assertions.assertEquals("oxafn", model.metadata().last());
        Assertions.assertEquals("lpichk", model.metadata().prev());
        Assertions.assertEquals("mkcdyhbpkkpwdre", model.metadata().next());
        Assertions.assertEquals(1405054510, model.metadata().totalSize());
        Assertions.assertEquals("qfovljxywsuws", model.data().get(0));
    }
}
