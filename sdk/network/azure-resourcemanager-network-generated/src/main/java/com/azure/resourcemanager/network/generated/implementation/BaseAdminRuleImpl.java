// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.network.generated.fluent.models.BaseAdminRuleInner;
import com.azure.resourcemanager.network.generated.models.BaseAdminRule;

public final class BaseAdminRuleImpl implements BaseAdminRule {
    private BaseAdminRuleInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    BaseAdminRuleImpl(BaseAdminRuleInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public BaseAdminRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
