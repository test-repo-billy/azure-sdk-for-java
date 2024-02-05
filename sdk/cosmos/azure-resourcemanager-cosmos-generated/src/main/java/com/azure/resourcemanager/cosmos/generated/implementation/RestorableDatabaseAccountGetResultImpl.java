// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableDatabaseAccountGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.ApiType;
import com.azure.resourcemanager.cosmos.generated.models.RestorableDatabaseAccountGetResult;
import com.azure.resourcemanager.cosmos.generated.models.RestorableLocationResource;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class RestorableDatabaseAccountGetResultImpl implements RestorableDatabaseAccountGetResult {
    private RestorableDatabaseAccountGetResultInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    RestorableDatabaseAccountGetResultImpl(RestorableDatabaseAccountGetResultInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
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

    public String accountName() {
        return this.innerModel().accountName();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime oldestRestorableTime() {
        return this.innerModel().oldestRestorableTime();
    }

    public OffsetDateTime deletionTime() {
        return this.innerModel().deletionTime();
    }

    public ApiType apiType() {
        return this.innerModel().apiType();
    }

    public List<RestorableLocationResource> restorableLocations() {
        List<RestorableLocationResource> inner = this.innerModel().restorableLocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RestorableDatabaseAccountGetResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
