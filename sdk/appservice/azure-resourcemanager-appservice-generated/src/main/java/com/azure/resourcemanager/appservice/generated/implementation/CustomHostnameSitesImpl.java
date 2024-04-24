// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.CustomHostnameSitesInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.IdentifierInner;
import com.azure.resourcemanager.appservice.generated.models.CustomHostnameSites;
import com.azure.resourcemanager.appservice.generated.models.Identifier;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class CustomHostnameSitesImpl implements CustomHostnameSites {
    private CustomHostnameSitesInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    CustomHostnameSitesImpl(CustomHostnameSitesInner innerObject,
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

    public String customHostname() {
        return this.innerModel().customHostname();
    }

    public String region() {
        return this.innerModel().region();
    }

    public List<Identifier> siteResourceIds() {
        List<IdentifierInner> inner = this.innerModel().siteResourceIds();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new IdentifierImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public CustomHostnameSitesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
