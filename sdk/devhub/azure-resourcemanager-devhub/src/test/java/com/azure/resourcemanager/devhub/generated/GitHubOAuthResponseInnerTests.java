// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthResponseInner;
import org.junit.jupiter.api.Assertions;

public final class GitHubOAuthResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitHubOAuthResponseInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"username\":\"ikxwc\"},\"id\":\"yscnpqxu\",\"name\":\"ivyqniwbybrkxvd\",\"type\":\"mjgr\"}")
                .toObject(GitHubOAuthResponseInner.class);
        Assertions.assertEquals("ikxwc", model.username());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitHubOAuthResponseInner model = new GitHubOAuthResponseInner().withUsername("ikxwc");
        model = BinaryData.fromObject(model).toObject(GitHubOAuthResponseInner.class);
        Assertions.assertEquals("ikxwc", model.username());
    }
}
