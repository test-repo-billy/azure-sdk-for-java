// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.HostKeysInner;
import com.azure.resourcemanager.appservice.generated.models.HostKeys;
import java.util.Collections;
import java.util.Map;

public final class HostKeysImpl implements HostKeys {
    private HostKeysInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    HostKeysImpl(HostKeysInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String masterKey() {
        return this.innerModel().masterKey();
    }

    public Map<String, String> functionKeys() {
        Map<String, String> inner = this.innerModel().functionKeys();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, String> systemKeys() {
        Map<String, String> inner = this.innerModel().systemKeys();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public HostKeysInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
