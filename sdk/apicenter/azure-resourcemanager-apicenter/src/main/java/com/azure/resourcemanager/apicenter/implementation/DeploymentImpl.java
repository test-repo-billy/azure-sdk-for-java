// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apicenter.fluent.models.DeploymentInner;
import com.azure.resourcemanager.apicenter.models.Deployment;
import com.azure.resourcemanager.apicenter.models.DeploymentServer;
import com.azure.resourcemanager.apicenter.models.DeploymentState;

public final class DeploymentImpl implements Deployment, Deployment.Definition, Deployment.Update {
    private DeploymentInner innerObject;

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

    public String description() {
        return this.innerModel().description();
    }

    public String environmentId() {
        return this.innerModel().environmentId();
    }

    public String definitionId() {
        return this.innerModel().definitionId();
    }

    public DeploymentState state() {
        return this.innerModel().state();
    }

    public DeploymentServer server() {
        return this.innerModel().server();
    }

    public Object customProperties() {
        return this.innerModel().customProperties();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DeploymentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apicenter.ApiCenterManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String workspaceName;

    private String apiName;

    private String deploymentName;

    public DeploymentImpl withExistingApi(String resourceGroupName, String serviceName, String workspaceName,
        String apiName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.workspaceName = workspaceName;
        this.apiName = apiName;
        return this;
    }

    public Deployment create() {
        this.innerObject = serviceManager.serviceClient().getDeployments().createOrUpdateWithResponse(resourceGroupName,
            serviceName, workspaceName, apiName, deploymentName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public Deployment create(Context context) {
        this.innerObject = serviceManager.serviceClient().getDeployments().createOrUpdateWithResponse(resourceGroupName,
            serviceName, workspaceName, apiName, deploymentName, this.innerModel(), context).getValue();
        return this;
    }

    DeploymentImpl(String name, com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerObject = new DeploymentInner();
        this.serviceManager = serviceManager;
        this.deploymentName = name;
    }

    public DeploymentImpl update() {
        return this;
    }

    public Deployment apply() {
        this.innerObject = serviceManager.serviceClient().getDeployments().createOrUpdateWithResponse(resourceGroupName,
            serviceName, workspaceName, apiName, deploymentName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public Deployment apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getDeployments().createOrUpdateWithResponse(resourceGroupName,
            serviceName, workspaceName, apiName, deploymentName, this.innerModel(), context).getValue();
        return this;
    }

    DeploymentImpl(DeploymentInner innerObject, com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "services");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.apiName = Utils.getValueFromIdByName(innerObject.id(), "apis");
        this.deploymentName = Utils.getValueFromIdByName(innerObject.id(), "deployments");
    }

    public Deployment refresh() {
        this.innerObject = serviceManager.serviceClient().getDeployments()
            .getWithResponse(resourceGroupName, serviceName, workspaceName, apiName, deploymentName, Context.NONE)
            .getValue();
        return this;
    }

    public Deployment refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getDeployments()
            .getWithResponse(resourceGroupName, serviceName, workspaceName, apiName, deploymentName, context)
            .getValue();
        return this;
    }

    public DeploymentImpl withTitle(String title) {
        this.innerModel().withTitle(title);
        return this;
    }

    public DeploymentImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public DeploymentImpl withEnvironmentId(String environmentId) {
        this.innerModel().withEnvironmentId(environmentId);
        return this;
    }

    public DeploymentImpl withDefinitionId(String definitionId) {
        this.innerModel().withDefinitionId(definitionId);
        return this;
    }

    public DeploymentImpl withState(DeploymentState state) {
        this.innerModel().withState(state);
        return this;
    }

    public DeploymentImpl withServer(DeploymentServer server) {
        this.innerModel().withServer(server);
        return this;
    }

    public DeploymentImpl withCustomProperties(Object customProperties) {
        this.innerModel().withCustomProperties(customProperties);
        return this;
    }
}
