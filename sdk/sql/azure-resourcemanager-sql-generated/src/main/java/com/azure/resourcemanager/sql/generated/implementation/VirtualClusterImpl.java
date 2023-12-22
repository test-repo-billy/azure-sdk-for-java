// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.VirtualClusterInner;
import com.azure.resourcemanager.sql.generated.models.VirtualCluster;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualClusterImpl implements VirtualCluster {
    private VirtualClusterInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    VirtualClusterImpl(VirtualClusterInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String subnetId() {
        return this.innerModel().subnetId();
    }

    public String version() {
        return this.innerModel().version();
    }

    public List<String> childResources() {
        List<String> inner = this.innerModel().childResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualClusterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
