// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteFunctionOverviewArmResourceInner;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteFunctionOverviewArmResource;
import com.azure.resourcemanager.appservice.generated.models.TriggerTypes;

public final class StaticSiteFunctionOverviewArmResourceImpl implements StaticSiteFunctionOverviewArmResource {
    private StaticSiteFunctionOverviewArmResourceInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    StaticSiteFunctionOverviewArmResourceImpl(StaticSiteFunctionOverviewArmResourceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public String functionName() {
        return this.innerModel().functionName();
    }

    public TriggerTypes triggerType() {
        return this.innerModel().triggerType();
    }

    public StaticSiteFunctionOverviewArmResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
