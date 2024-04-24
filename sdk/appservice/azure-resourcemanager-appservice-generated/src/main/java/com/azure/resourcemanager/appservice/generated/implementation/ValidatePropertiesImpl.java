// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceEnvironmentInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.ValidatePropertiesInner;
import com.azure.resourcemanager.appservice.generated.models.AppServiceEnvironment;
import com.azure.resourcemanager.appservice.generated.models.ValidateProperties;

public final class ValidatePropertiesImpl implements ValidateProperties {
    private ValidatePropertiesInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    ValidatePropertiesImpl(ValidatePropertiesInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String serverFarmId() {
        return this.innerModel().serverFarmId();
    }

    public String skuName() {
        return this.innerModel().skuName();
    }

    public Boolean needLinuxWorkers() {
        return this.innerModel().needLinuxWorkers();
    }

    public Boolean isSpot() {
        return this.innerModel().isSpot();
    }

    public Integer capacity() {
        return this.innerModel().capacity();
    }

    public String hostingEnvironment() {
        return this.innerModel().hostingEnvironment();
    }

    public Boolean isXenon() {
        return this.innerModel().isXenon();
    }

    public String containerRegistryBaseUrl() {
        return this.innerModel().containerRegistryBaseUrl();
    }

    public String containerRegistryUsername() {
        return this.innerModel().containerRegistryUsername();
    }

    public String containerRegistryPassword() {
        return this.innerModel().containerRegistryPassword();
    }

    public String containerImageRepository() {
        return this.innerModel().containerImageRepository();
    }

    public String containerImageTag() {
        return this.innerModel().containerImageTag();
    }

    public String containerImagePlatform() {
        return this.innerModel().containerImagePlatform();
    }

    public AppServiceEnvironment appServiceEnvironment() {
        AppServiceEnvironmentInner inner = this.innerModel().appServiceEnvironment();
        if (inner != null) {
            return new AppServiceEnvironmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ValidatePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
