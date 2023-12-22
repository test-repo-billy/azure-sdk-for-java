// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.SwapResourceInner;
import com.azure.resourcemanager.network.generated.fluent.models.SwapResourceListResultInner;
import com.azure.resourcemanager.network.generated.models.SwapResource;
import com.azure.resourcemanager.network.generated.models.SwapResourceListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class SwapResourceListResultImpl implements SwapResourceListResult {
    private SwapResourceListResultInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    SwapResourceListResultImpl(SwapResourceListResultInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SwapResource> value() {
        List<SwapResourceInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new SwapResourceImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public SwapResourceListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
