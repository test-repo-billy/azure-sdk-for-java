// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.RevisionInner;
import com.azure.resourcemanager.appservice.generated.models.Revision;
import com.azure.resourcemanager.appservice.generated.models.RevisionHealthState;
import com.azure.resourcemanager.appservice.generated.models.RevisionProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.Template;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class RevisionImpl implements Revision {
    private RevisionInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    RevisionImpl(RevisionInner innerObject,
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

    public String kind() {
        return this.innerModel().kind();
    }

    public OffsetDateTime createdTime() {
        return this.innerModel().createdTime();
    }

    public String fqdn() {
        return this.innerModel().fqdn();
    }

    public Template template() {
        return this.innerModel().template();
    }

    public Boolean active() {
        return this.innerModel().active();
    }

    public Integer replicas() {
        return this.innerModel().replicas();
    }

    public Integer trafficWeight() {
        return this.innerModel().trafficWeight();
    }

    public String provisioningError() {
        return this.innerModel().provisioningError();
    }

    public RevisionHealthState healthState() {
        return this.innerModel().healthState();
    }

    public RevisionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public RevisionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
