// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.WorkflowRunInner;
import com.azure.resourcemanager.appservice.generated.models.Correlation;
import com.azure.resourcemanager.appservice.generated.models.ResourceReference;
import com.azure.resourcemanager.appservice.generated.models.WorkflowOutputParameter;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRun;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRunTrigger;
import com.azure.resourcemanager.appservice.generated.models.WorkflowStatus;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class WorkflowRunImpl implements WorkflowRun {
    private WorkflowRunInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    WorkflowRunImpl(WorkflowRunInner innerObject,
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

    public OffsetDateTime waitEndTime() {
        return this.innerModel().waitEndTime();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public WorkflowStatus status() {
        return this.innerModel().status();
    }

    public String code() {
        return this.innerModel().code();
    }

    public Object error() {
        return this.innerModel().error();
    }

    public String correlationId() {
        return this.innerModel().correlationId();
    }

    public Correlation correlation() {
        return this.innerModel().correlation();
    }

    public ResourceReference workflow() {
        return this.innerModel().workflow();
    }

    public WorkflowRunTrigger trigger() {
        return this.innerModel().trigger();
    }

    public Map<String, WorkflowOutputParameter> outputs() {
        Map<String, WorkflowOutputParameter> inner = this.innerModel().outputs();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public WorkflowRunTrigger response() {
        return this.innerModel().response();
    }

    public WorkflowRunInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
