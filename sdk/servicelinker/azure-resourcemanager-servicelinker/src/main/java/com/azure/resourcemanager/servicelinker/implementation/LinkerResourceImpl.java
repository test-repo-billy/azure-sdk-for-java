// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicelinker.fluent.models.LinkerResourceInner;
import com.azure.resourcemanager.servicelinker.models.AuthInfoBase;
import com.azure.resourcemanager.servicelinker.models.ClientType;
import com.azure.resourcemanager.servicelinker.models.ConfigurationInfo;
import com.azure.resourcemanager.servicelinker.models.ConfigurationResult;
import com.azure.resourcemanager.servicelinker.models.LinkerPatch;
import com.azure.resourcemanager.servicelinker.models.LinkerResource;
import com.azure.resourcemanager.servicelinker.models.PublicNetworkSolution;
import com.azure.resourcemanager.servicelinker.models.SecretStore;
import com.azure.resourcemanager.servicelinker.models.TargetServiceBase;
import com.azure.resourcemanager.servicelinker.models.VNetSolution;
import com.azure.resourcemanager.servicelinker.models.ValidateOperationResult;

public final class LinkerResourceImpl implements LinkerResource, LinkerResource.Definition, LinkerResource.Update {
    private LinkerResourceInner innerObject;

    private final com.azure.resourcemanager.servicelinker.ServiceLinkerManager serviceManager;

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

    public TargetServiceBase targetService() {
        return this.innerModel().targetService();
    }

    public AuthInfoBase authInfo() {
        return this.innerModel().authInfo();
    }

    public ClientType clientType() {
        return this.innerModel().clientType();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VNetSolution vNetSolution() {
        return this.innerModel().vNetSolution();
    }

    public SecretStore secretStore() {
        return this.innerModel().secretStore();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public PublicNetworkSolution publicNetworkSolution() {
        return this.innerModel().publicNetworkSolution();
    }

    public ConfigurationInfo configurationInfo() {
        return this.innerModel().configurationInfo();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public LinkerResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager() {
        return this.serviceManager;
    }

    private String subscriptionId;

    private String resourceGroupName;

    private String location;

    private String connectorName;

    private LinkerPatch updateParameters;

    public LinkerResourceImpl withExistingLocation(String subscriptionId, String resourceGroupName, String location) {
        this.subscriptionId = subscriptionId;
        this.resourceGroupName = resourceGroupName;
        this.location = location;
        return this;
    }

    public LinkerResource create() {
        this.innerObject = serviceManager.serviceClient().getConnectors().createOrUpdate(subscriptionId,
            resourceGroupName, location, connectorName, this.innerModel(), Context.NONE);
        return this;
    }

    public LinkerResource create(Context context) {
        this.innerObject = serviceManager.serviceClient().getConnectors().createOrUpdate(subscriptionId,
            resourceGroupName, location, connectorName, this.innerModel(), context);
        return this;
    }

    LinkerResourceImpl(String name, com.azure.resourcemanager.servicelinker.ServiceLinkerManager serviceManager) {
        this.innerObject = new LinkerResourceInner();
        this.serviceManager = serviceManager;
        this.connectorName = name;
    }

    public LinkerResourceImpl update() {
        this.updateParameters = new LinkerPatch();
        return this;
    }

    public LinkerResource apply() {
        this.innerObject = serviceManager.serviceClient().getConnectors().update(subscriptionId, resourceGroupName,
            location, connectorName, updateParameters, Context.NONE);
        return this;
    }

    public LinkerResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getConnectors().update(subscriptionId, resourceGroupName,
            location, connectorName, updateParameters, context);
        return this;
    }

    LinkerResourceImpl(LinkerResourceInner innerObject,
        com.azure.resourcemanager.servicelinker.ServiceLinkerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.subscriptionId = Utils.getValueFromIdByName(innerObject.id(), "subscriptions");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.location = Utils.getValueFromIdByName(innerObject.id(), "locations");
        this.connectorName = Utils.getValueFromIdByName(innerObject.id(), "connectors");
    }

    public LinkerResource refresh() {
        this.innerObject = serviceManager.serviceClient().getConnectors()
            .getWithResponse(subscriptionId, resourceGroupName, location, connectorName, Context.NONE).getValue();
        return this;
    }

    public LinkerResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getConnectors()
            .getWithResponse(subscriptionId, resourceGroupName, location, connectorName, context).getValue();
        return this;
    }

    public ValidateOperationResult validate() {
        return serviceManager.connectors().validate(subscriptionId, resourceGroupName, location, connectorName);
    }

    public ValidateOperationResult validate(Context context) {
        return serviceManager.connectors().validate(subscriptionId, resourceGroupName, location, connectorName,
            context);
    }

    public Response<ConfigurationResult> generateConfigurationsWithResponse(ConfigurationInfo parameters,
        Context context) {
        return serviceManager.connectors().generateConfigurationsWithResponse(subscriptionId, resourceGroupName,
            location, connectorName, parameters, context);
    }

    public ConfigurationResult generateConfigurations() {
        return serviceManager.connectors().generateConfigurations(subscriptionId, resourceGroupName, location,
            connectorName);
    }

    public LinkerResourceImpl withTargetService(TargetServiceBase targetService) {
        if (isInCreateMode()) {
            this.innerModel().withTargetService(targetService);
            return this;
        } else {
            this.updateParameters.withTargetService(targetService);
            return this;
        }
    }

    public LinkerResourceImpl withAuthInfo(AuthInfoBase authInfo) {
        if (isInCreateMode()) {
            this.innerModel().withAuthInfo(authInfo);
            return this;
        } else {
            this.updateParameters.withAuthInfo(authInfo);
            return this;
        }
    }

    public LinkerResourceImpl withClientType(ClientType clientType) {
        if (isInCreateMode()) {
            this.innerModel().withClientType(clientType);
            return this;
        } else {
            this.updateParameters.withClientType(clientType);
            return this;
        }
    }

    public LinkerResourceImpl withVNetSolution(VNetSolution vNetSolution) {
        if (isInCreateMode()) {
            this.innerModel().withVNetSolution(vNetSolution);
            return this;
        } else {
            this.updateParameters.withVNetSolution(vNetSolution);
            return this;
        }
    }

    public LinkerResourceImpl withSecretStore(SecretStore secretStore) {
        if (isInCreateMode()) {
            this.innerModel().withSecretStore(secretStore);
            return this;
        } else {
            this.updateParameters.withSecretStore(secretStore);
            return this;
        }
    }

    public LinkerResourceImpl withScope(String scope) {
        if (isInCreateMode()) {
            this.innerModel().withScope(scope);
            return this;
        } else {
            this.updateParameters.withScope(scope);
            return this;
        }
    }

    public LinkerResourceImpl withPublicNetworkSolution(PublicNetworkSolution publicNetworkSolution) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkSolution(publicNetworkSolution);
            return this;
        } else {
            this.updateParameters.withPublicNetworkSolution(publicNetworkSolution);
            return this;
        }
    }

    public LinkerResourceImpl withConfigurationInfo(ConfigurationInfo configurationInfo) {
        if (isInCreateMode()) {
            this.innerModel().withConfigurationInfo(configurationInfo);
            return this;
        } else {
            this.updateParameters.withConfigurationInfo(configurationInfo);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
