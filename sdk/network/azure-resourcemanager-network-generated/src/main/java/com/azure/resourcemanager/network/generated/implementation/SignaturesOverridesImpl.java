// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.SignaturesOverridesInner;
import com.azure.resourcemanager.network.generated.models.SignaturesOverrides;
import com.azure.resourcemanager.network.generated.models.SignaturesOverridesProperties;

public final class SignaturesOverridesImpl implements SignaturesOverrides {
    private SignaturesOverridesInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    SignaturesOverridesImpl(SignaturesOverridesInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SignaturesOverridesProperties properties() {
        return this.innerModel().properties();
    }

    public SignaturesOverridesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
