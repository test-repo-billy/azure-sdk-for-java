// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.resourcemanager.resources.generated.fluent.models.ProviderResourceTypeListResultInner;
import com.azure.resourcemanager.resources.generated.models.ProviderResourceType;
import com.azure.resourcemanager.resources.generated.models.ProviderResourceTypeListResult;
import java.util.Collections;
import java.util.List;

public final class ProviderResourceTypeListResultImpl implements ProviderResourceTypeListResult {
    private ProviderResourceTypeListResultInner innerObject;

    private final com.azure.resourcemanager.resources.generated.ResourceManager serviceManager;

    ProviderResourceTypeListResultImpl(ProviderResourceTypeListResultInner innerObject,
        com.azure.resourcemanager.resources.generated.ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ProviderResourceType> value() {
        List<ProviderResourceType> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ProviderResourceTypeListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.resources.generated.ResourceManager manager() {
        return this.serviceManager;
    }
}
