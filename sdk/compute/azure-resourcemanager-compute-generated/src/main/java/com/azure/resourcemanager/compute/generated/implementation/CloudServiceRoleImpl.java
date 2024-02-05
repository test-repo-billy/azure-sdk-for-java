// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceRoleInner;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRole;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRoleProperties;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRoleSku;

public final class CloudServiceRoleImpl implements CloudServiceRole {
    private CloudServiceRoleInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    CloudServiceRoleImpl(CloudServiceRoleInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
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

    public CloudServiceRoleSku sku() {
        return this.innerModel().sku();
    }

    public CloudServiceRoleProperties properties() {
        return this.innerModel().properties();
    }

    public CloudServiceRoleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
