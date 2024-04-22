// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.PasswordHashResourceInner;
import com.azure.resourcemanager.iotfirmwaredefense.models.PasswordHashResource;

public final class PasswordHashResourceImpl implements PasswordHashResource {
    private PasswordHashResourceInner innerObject;

    private final com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager serviceManager;

    PasswordHashResourceImpl(PasswordHashResourceInner innerObject,
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String passwordHashId() {
        return this.innerModel().passwordHashId();
    }

    public String filePath() {
        return this.innerModel().filePath();
    }

    public String salt() {
        return this.innerModel().salt();
    }

    public String hash() {
        return this.innerModel().hash();
    }

    public String context() {
        return this.innerModel().context();
    }

    public String username() {
        return this.innerModel().username();
    }

    public String algorithm() {
        return this.innerModel().algorithm();
    }

    public PasswordHashResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager() {
        return this.serviceManager;
    }
}
