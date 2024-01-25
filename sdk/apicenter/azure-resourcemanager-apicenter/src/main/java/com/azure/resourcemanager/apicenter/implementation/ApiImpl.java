// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apicenter.fluent.models.ApiInner;
import com.azure.resourcemanager.apicenter.models.Api;
import com.azure.resourcemanager.apicenter.models.ApiKind;
import com.azure.resourcemanager.apicenter.models.Contact;
import com.azure.resourcemanager.apicenter.models.ExternalDocumentation;
import com.azure.resourcemanager.apicenter.models.License;
import com.azure.resourcemanager.apicenter.models.LifecycleStage;
import com.azure.resourcemanager.apicenter.models.TermsOfService;
import java.util.Collections;
import java.util.List;

public final class ApiImpl implements Api, Api.Definition, Api.Update {
    private ApiInner innerObject;

    private final com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager;

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

    public String title() {
        return this.innerModel().title();
    }

    public ApiKind kind() {
        return this.innerModel().kind();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String summary() {
        return this.innerModel().summary();
    }

    public LifecycleStage lifecycleStage() {
        return this.innerModel().lifecycleStage();
    }

    public TermsOfService termsOfService() {
        return this.innerModel().termsOfService();
    }

    public List<ExternalDocumentation> externalDocumentation() {
        List<ExternalDocumentation> inner = this.innerModel().externalDocumentation();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Contact> contacts() {
        List<Contact> inner = this.innerModel().contacts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public License license() {
        return this.innerModel().license();
    }

    public Object customProperties() {
        return this.innerModel().customProperties();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ApiInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apicenter.ApiCenterManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String workspaceName;

    private String apiName;

    public ApiImpl withExistingWorkspace(String resourceGroupName, String serviceName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.workspaceName = workspaceName;
        return this;
    }

    public Api create() {
        this.innerObject = serviceManager.serviceClient().getApis().createOrUpdateWithResponse(resourceGroupName,
            serviceName, workspaceName, apiName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public Api create(Context context) {
        this.innerObject = serviceManager.serviceClient().getApis().createOrUpdateWithResponse(resourceGroupName,
            serviceName, workspaceName, apiName, this.innerModel(), context).getValue();
        return this;
    }

    ApiImpl(String name, com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerObject = new ApiInner();
        this.serviceManager = serviceManager;
        this.apiName = name;
    }

    public ApiImpl update() {
        return this;
    }

    public Api apply() {
        this.innerObject = serviceManager.serviceClient().getApis().createOrUpdateWithResponse(resourceGroupName,
            serviceName, workspaceName, apiName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public Api apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getApis().createOrUpdateWithResponse(resourceGroupName,
            serviceName, workspaceName, apiName, this.innerModel(), context).getValue();
        return this;
    }

    ApiImpl(ApiInner innerObject, com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "services");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.apiName = Utils.getValueFromIdByName(innerObject.id(), "apis");
    }

    public Api refresh() {
        this.innerObject = serviceManager.serviceClient().getApis()
            .getWithResponse(resourceGroupName, serviceName, workspaceName, apiName, Context.NONE).getValue();
        return this;
    }

    public Api refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getApis()
            .getWithResponse(resourceGroupName, serviceName, workspaceName, apiName, context).getValue();
        return this;
    }

    public ApiImpl withTitle(String title) {
        this.innerModel().withTitle(title);
        return this;
    }

    public ApiImpl withKind(ApiKind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public ApiImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public ApiImpl withSummary(String summary) {
        this.innerModel().withSummary(summary);
        return this;
    }

    public ApiImpl withTermsOfService(TermsOfService termsOfService) {
        this.innerModel().withTermsOfService(termsOfService);
        return this;
    }

    public ApiImpl withExternalDocumentation(List<ExternalDocumentation> externalDocumentation) {
        this.innerModel().withExternalDocumentation(externalDocumentation);
        return this;
    }

    public ApiImpl withContacts(List<Contact> contacts) {
        this.innerModel().withContacts(contacts);
        return this;
    }

    public ApiImpl withLicense(License license) {
        this.innerModel().withLicense(license);
        return this;
    }

    public ApiImpl withCustomProperties(Object customProperties) {
        this.innerModel().withCustomProperties(customProperties);
        return this;
    }
}
