// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.network.generated.models.Operation;
import com.azure.resourcemanager.network.generated.models.OperationDisplay;
import com.azure.resourcemanager.network.generated.models.OperationPropertiesFormatServiceSpecification;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    OperationImpl(OperationInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationPropertiesFormatServiceSpecification serviceSpecification() {
        return this.innerModel().serviceSpecification();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
