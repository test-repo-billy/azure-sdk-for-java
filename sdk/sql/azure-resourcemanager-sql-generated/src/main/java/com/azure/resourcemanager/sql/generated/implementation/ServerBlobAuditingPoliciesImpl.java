// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ServerBlobAuditingPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerBlobAuditingPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ServerBlobAuditingPolicies;
import com.azure.resourcemanager.sql.generated.models.ServerBlobAuditingPolicy;

public final class ServerBlobAuditingPoliciesImpl implements ServerBlobAuditingPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(ServerBlobAuditingPoliciesImpl.class);

    private final ServerBlobAuditingPoliciesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ServerBlobAuditingPoliciesImpl(ServerBlobAuditingPoliciesClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ServerBlobAuditingPolicy> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerBlobAuditingPolicyInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerBlobAuditingPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerBlobAuditingPolicy> listByServer(String resourceGroupName, String serverName,
        Context context) {
        PagedIterable<ServerBlobAuditingPolicyInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerBlobAuditingPolicyImpl(inner1, this.manager()));
    }

    public Response<ServerBlobAuditingPolicy> getWithResponse(String resourceGroupName, String serverName,
        Context context) {
        Response<ServerBlobAuditingPolicyInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, serverName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ServerBlobAuditingPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServerBlobAuditingPolicy get(String resourceGroupName, String serverName) {
        ServerBlobAuditingPolicyInner inner = this.serviceClient().get(resourceGroupName, serverName);
        if (inner != null) {
            return new ServerBlobAuditingPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServerBlobAuditingPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, Context.NONE).getValue();
    }

    public Response<ServerBlobAuditingPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, context);
    }

    private ServerBlobAuditingPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public ServerBlobAuditingPolicyImpl define() {
        return new ServerBlobAuditingPolicyImpl(this.manager());
    }
}
