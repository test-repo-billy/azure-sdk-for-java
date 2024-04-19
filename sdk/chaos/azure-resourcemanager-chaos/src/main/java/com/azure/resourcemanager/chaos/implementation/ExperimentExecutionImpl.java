// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.implementation;

import com.azure.resourcemanager.chaos.fluent.models.ExperimentExecutionInner;
import com.azure.resourcemanager.chaos.models.ExperimentExecution;
import java.time.OffsetDateTime;

public final class ExperimentExecutionImpl implements ExperimentExecution {
    private ExperimentExecutionInner innerObject;

    private final com.azure.resourcemanager.chaos.ChaosManager serviceManager;

    ExperimentExecutionImpl(ExperimentExecutionInner innerObject,
        com.azure.resourcemanager.chaos.ChaosManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String type() {
        return this.innerModel().type();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String status() {
        return this.innerModel().status();
    }

    public OffsetDateTime startedAt() {
        return this.innerModel().startedAt();
    }

    public OffsetDateTime stoppedAt() {
        return this.innerModel().stoppedAt();
    }

    public ExperimentExecutionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.chaos.ChaosManager manager() {
        return this.serviceManager;
    }
}
