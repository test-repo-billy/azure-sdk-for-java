// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerAzureADOnlyAuthenticationInner;
import com.azure.resourcemanager.sql.generated.models.AuthenticationName;
import com.azure.resourcemanager.sql.generated.models.ServerAzureADOnlyAuthentication;

public final class ServerAzureADOnlyAuthenticationImpl implements ServerAzureADOnlyAuthentication,
    ServerAzureADOnlyAuthentication.Definition, ServerAzureADOnlyAuthentication.Update {
    private ServerAzureADOnlyAuthenticationInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public boolean azureADOnlyAuthentication() {
        return this.innerModel().azureADOnlyAuthentication();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ServerAzureADOnlyAuthenticationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private AuthenticationName authenticationName;

    public ServerAzureADOnlyAuthenticationImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public ServerAzureADOnlyAuthentication create() {
        this.innerObject = serviceManager.serviceClient().getServerAzureADOnlyAuthentications()
            .createOrUpdate(resourceGroupName, serverName, authenticationName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerAzureADOnlyAuthentication create(Context context) {
        this.innerObject = serviceManager.serviceClient().getServerAzureADOnlyAuthentications()
            .createOrUpdate(resourceGroupName, serverName, authenticationName, this.innerModel(), context);
        return this;
    }

    ServerAzureADOnlyAuthenticationImpl(AuthenticationName name,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new ServerAzureADOnlyAuthenticationInner();
        this.serviceManager = serviceManager;
        this.authenticationName = name;
    }

    public ServerAzureADOnlyAuthenticationImpl update() {
        return this;
    }

    public ServerAzureADOnlyAuthentication apply() {
        this.innerObject = serviceManager.serviceClient().getServerAzureADOnlyAuthentications()
            .createOrUpdate(resourceGroupName, serverName, authenticationName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerAzureADOnlyAuthentication apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getServerAzureADOnlyAuthentications()
            .createOrUpdate(resourceGroupName, serverName, authenticationName, this.innerModel(), context);
        return this;
    }

    ServerAzureADOnlyAuthenticationImpl(ServerAzureADOnlyAuthenticationInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.authenticationName
            = AuthenticationName.fromString(Utils.getValueFromIdByName(innerObject.id(), "azureADOnlyAuthentications"));
    }

    public ServerAzureADOnlyAuthentication refresh() {
        this.innerObject = serviceManager.serviceClient().getServerAzureADOnlyAuthentications()
            .getWithResponse(resourceGroupName, serverName, authenticationName, Context.NONE).getValue();
        return this;
    }

    public ServerAzureADOnlyAuthentication refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getServerAzureADOnlyAuthentications()
            .getWithResponse(resourceGroupName, serverName, authenticationName, context).getValue();
        return this;
    }

    public ServerAzureADOnlyAuthenticationImpl withAzureADOnlyAuthentication(boolean azureADOnlyAuthentication) {
        this.innerModel().withAzureADOnlyAuthentication(azureADOnlyAuthentication);
        return this;
    }
}
