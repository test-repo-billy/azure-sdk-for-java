// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apicenter.fluent.EnvironmentsClient;
import com.azure.resourcemanager.apicenter.fluent.models.EnvironmentInner;
import com.azure.resourcemanager.apicenter.models.Environment;
import com.azure.resourcemanager.apicenter.models.Environments;
import com.azure.resourcemanager.apicenter.models.EnvironmentsGetResponse;

public final class EnvironmentsImpl implements Environments {
    private static final ClientLogger LOGGER = new ClientLogger(EnvironmentsImpl.class);

    private final EnvironmentsClient innerClient;

    private final com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager;

    public EnvironmentsImpl(EnvironmentsClient innerClient,
        com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Environment> list(String resourceGroupName, String serviceName, String workspaceName) {
        PagedIterable<EnvironmentInner> inner
            = this.serviceClient().list(resourceGroupName, serviceName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new EnvironmentImpl(inner1, this.manager()));
    }

    public PagedIterable<Environment> list(String resourceGroupName, String serviceName, String workspaceName,
        String filter, Context context) {
        PagedIterable<EnvironmentInner> inner
            = this.serviceClient().list(resourceGroupName, serviceName, workspaceName, filter, context);
        return Utils.mapPage(inner, inner1 -> new EnvironmentImpl(inner1, this.manager()));
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String environmentName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, workspaceName, environmentName,
            context);
    }

    public void delete(String resourceGroupName, String serviceName, String workspaceName, String environmentName) {
        this.serviceClient().delete(resourceGroupName, serviceName, workspaceName, environmentName);
    }

    public Response<Void> headWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String environmentName, Context context) {
        return this.serviceClient().headWithResponse(resourceGroupName, serviceName, workspaceName, environmentName,
            context);
    }

    public void head(String resourceGroupName, String serviceName, String workspaceName, String environmentName) {
        this.serviceClient().head(resourceGroupName, serviceName, workspaceName, environmentName);
    }

    public Response<Environment> getWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String environmentName, Context context) {
        EnvironmentsGetResponse inner = this.serviceClient().getWithResponse(resourceGroupName, serviceName,
            workspaceName, environmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new EnvironmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Environment get(String resourceGroupName, String serviceName, String workspaceName, String environmentName) {
        EnvironmentInner inner
            = this.serviceClient().get(resourceGroupName, serviceName, workspaceName, environmentName);
        if (inner != null) {
            return new EnvironmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Environment getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String environmentName = Utils.getValueFromIdByName(id, "environments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, workspaceName, environmentName, Context.NONE)
            .getValue();
    }

    public Response<Environment> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String environmentName = Utils.getValueFromIdByName(id, "environments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, workspaceName, environmentName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String environmentName = Utils.getValueFromIdByName(id, "environments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, serviceName, workspaceName, environmentName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String environmentName = Utils.getValueFromIdByName(id, "environments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, workspaceName, environmentName, context);
    }

    private EnvironmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apicenter.ApiCenterManager manager() {
        return this.serviceManager;
    }

    public EnvironmentImpl define(String name) {
        return new EnvironmentImpl(name, this.manager());
    }
}
