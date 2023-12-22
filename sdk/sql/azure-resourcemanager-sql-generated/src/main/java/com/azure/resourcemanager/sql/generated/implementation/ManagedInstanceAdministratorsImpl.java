// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ManagedInstanceAdministratorsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceAdministratorInner;
import com.azure.resourcemanager.sql.generated.models.AdministratorName;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceAdministrator;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceAdministrators;

public final class ManagedInstanceAdministratorsImpl implements ManagedInstanceAdministrators {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedInstanceAdministratorsImpl.class);

    private final ManagedInstanceAdministratorsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ManagedInstanceAdministratorsImpl(ManagedInstanceAdministratorsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagedInstanceAdministrator> listByInstance(String resourceGroupName,
        String managedInstanceName) {
        PagedIterable<ManagedInstanceAdministratorInner> inner
            = this.serviceClient().listByInstance(resourceGroupName, managedInstanceName);
        return Utils.mapPage(inner, inner1 -> new ManagedInstanceAdministratorImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedInstanceAdministrator> listByInstance(String resourceGroupName,
        String managedInstanceName, Context context) {
        PagedIterable<ManagedInstanceAdministratorInner> inner
            = this.serviceClient().listByInstance(resourceGroupName, managedInstanceName, context);
        return Utils.mapPage(inner, inner1 -> new ManagedInstanceAdministratorImpl(inner1, this.manager()));
    }

    public Response<ManagedInstanceAdministrator> getWithResponse(String resourceGroupName, String managedInstanceName,
        AdministratorName administratorName, Context context) {
        Response<ManagedInstanceAdministratorInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, managedInstanceName, administratorName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ManagedInstanceAdministratorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedInstanceAdministrator get(String resourceGroupName, String managedInstanceName,
        AdministratorName administratorName) {
        ManagedInstanceAdministratorInner inner
            = this.serviceClient().get(resourceGroupName, managedInstanceName, administratorName);
        if (inner != null) {
            return new ManagedInstanceAdministratorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String managedInstanceName, AdministratorName administratorName) {
        this.serviceClient().delete(resourceGroupName, managedInstanceName, administratorName);
    }

    public void delete(String resourceGroupName, String managedInstanceName, AdministratorName administratorName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, managedInstanceName, administratorName, context);
    }

    public ManagedInstanceAdministrator getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        String administratorNameLocal = Utils.getValueFromIdByName(id, "administrators");
        if (administratorNameLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'administrators'.", id)));
        }
        AdministratorName administratorName = AdministratorName.fromString(administratorNameLocal);
        return this.getWithResponse(resourceGroupName, managedInstanceName, administratorName, Context.NONE).getValue();
    }

    public Response<ManagedInstanceAdministrator> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        String administratorNameLocal = Utils.getValueFromIdByName(id, "administrators");
        if (administratorNameLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'administrators'.", id)));
        }
        AdministratorName administratorName = AdministratorName.fromString(administratorNameLocal);
        return this.getWithResponse(resourceGroupName, managedInstanceName, administratorName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        String administratorNameLocal = Utils.getValueFromIdByName(id, "administrators");
        if (administratorNameLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'administrators'.", id)));
        }
        AdministratorName administratorName = AdministratorName.fromString(administratorNameLocal);
        this.delete(resourceGroupName, managedInstanceName, administratorName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
        }
        String administratorNameLocal = Utils.getValueFromIdByName(id, "administrators");
        if (administratorNameLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'administrators'.", id)));
        }
        AdministratorName administratorName = AdministratorName.fromString(administratorNameLocal);
        this.delete(resourceGroupName, managedInstanceName, administratorName, context);
    }

    private ManagedInstanceAdministratorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public ManagedInstanceAdministratorImpl define(AdministratorName name) {
        return new ManagedInstanceAdministratorImpl(name, this.manager());
    }
}
