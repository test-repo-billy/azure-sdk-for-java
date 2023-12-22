// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.SecurityAdminConfigurationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityAdminConfigurationInner;
import com.azure.resourcemanager.network.generated.models.SecurityAdminConfiguration;
import com.azure.resourcemanager.network.generated.models.SecurityAdminConfigurations;

public final class SecurityAdminConfigurationsImpl implements SecurityAdminConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(SecurityAdminConfigurationsImpl.class);

    private final SecurityAdminConfigurationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public SecurityAdminConfigurationsImpl(SecurityAdminConfigurationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityAdminConfiguration> list(String resourceGroupName, String networkManagerName) {
        PagedIterable<SecurityAdminConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, networkManagerName);
        return Utils.mapPage(inner, inner1 -> new SecurityAdminConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityAdminConfiguration> list(String resourceGroupName, String networkManagerName,
        Integer top, String skipToken, Context context) {
        PagedIterable<SecurityAdminConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, networkManagerName, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new SecurityAdminConfigurationImpl(inner1, this.manager()));
    }

    public Response<SecurityAdminConfiguration> getWithResponse(String resourceGroupName, String networkManagerName,
        String configurationName, Context context) {
        Response<SecurityAdminConfigurationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, networkManagerName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SecurityAdminConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityAdminConfiguration get(String resourceGroupName, String networkManagerName,
        String configurationName) {
        SecurityAdminConfigurationInner inner
            = this.serviceClient().get(resourceGroupName, networkManagerName, configurationName);
        if (inner != null) {
            return new SecurityAdminConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String networkManagerName, String configurationName) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, configurationName);
    }

    public void delete(String resourceGroupName, String networkManagerName, String configurationName, Boolean force,
        Context context) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, configurationName, force, context);
    }

    public SecurityAdminConfiguration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityAdminConfigurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'securityAdminConfigurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkManagerName, configurationName, Context.NONE).getValue();
    }

    public Response<SecurityAdminConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityAdminConfigurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'securityAdminConfigurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkManagerName, configurationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityAdminConfigurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'securityAdminConfigurations'.", id)));
        }
        Boolean localForce = null;
        this.delete(resourceGroupName, networkManagerName, configurationName, localForce, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean force, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "securityAdminConfigurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'securityAdminConfigurations'.", id)));
        }
        this.delete(resourceGroupName, networkManagerName, configurationName, force, context);
    }

    private SecurityAdminConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public SecurityAdminConfigurationImpl define(String name) {
        return new SecurityAdminConfigurationImpl(name, this.manager());
    }
}
