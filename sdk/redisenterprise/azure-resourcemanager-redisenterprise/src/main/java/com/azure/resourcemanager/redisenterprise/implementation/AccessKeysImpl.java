// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.implementation;

import com.azure.resourcemanager.redisenterprise.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.redisenterprise.models.AccessKeys;

public final class AccessKeysImpl implements AccessKeys {
    private AccessKeysInner innerObject;

    private final com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager;

    AccessKeysImpl(AccessKeysInner innerObject,
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public String secondaryKey() {
        return this.innerModel().secondaryKey();
    }

    public AccessKeysInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager() {
        return this.serviceManager;
    }
}
