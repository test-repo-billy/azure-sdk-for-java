// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.DomainOwnershipIdentifierInner;
import com.azure.resourcemanager.appservice.generated.models.DomainOwnershipIdentifier;

public final class DomainOwnershipIdentifierImpl
    implements DomainOwnershipIdentifier, DomainOwnershipIdentifier.Definition, DomainOwnershipIdentifier.Update {
    private DomainOwnershipIdentifierInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

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

    public String ownershipId() {
        return this.innerModel().ownershipId();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DomainOwnershipIdentifierInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String domainName;

    private String name;

    public DomainOwnershipIdentifierImpl withExistingDomain(String resourceGroupName, String domainName) {
        this.resourceGroupName = resourceGroupName;
        this.domainName = domainName;
        return this;
    }

    public DomainOwnershipIdentifier create() {
        this.innerObject = serviceManager.serviceClient()
            .getDomains()
            .createOrUpdateOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, this.innerModel(),
                Context.NONE)
            .getValue();
        return this;
    }

    public DomainOwnershipIdentifier create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDomains()
            .createOrUpdateOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, this.innerModel(),
                context)
            .getValue();
        return this;
    }

    DomainOwnershipIdentifierImpl(String name,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new DomainOwnershipIdentifierInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public DomainOwnershipIdentifierImpl update() {
        return this;
    }

    public DomainOwnershipIdentifier apply() {
        this.innerObject = serviceManager.serviceClient()
            .getDomains()
            .updateOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public DomainOwnershipIdentifier apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDomains()
            .updateOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, this.innerModel(), context)
            .getValue();
        return this;
    }

    DomainOwnershipIdentifierImpl(DomainOwnershipIdentifierInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.domainName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "domains");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "domainOwnershipIdentifiers");
    }

    public DomainOwnershipIdentifier refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getDomains()
            .getOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, Context.NONE)
            .getValue();
        return this;
    }

    public DomainOwnershipIdentifier refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getDomains()
            .getOwnershipIdentifierWithResponse(resourceGroupName, domainName, name, context)
            .getValue();
        return this;
    }

    public DomainOwnershipIdentifierImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public DomainOwnershipIdentifierImpl withOwnershipId(String ownershipId) {
        this.innerModel().withOwnershipId(ownershipId);
        return this;
    }
}
