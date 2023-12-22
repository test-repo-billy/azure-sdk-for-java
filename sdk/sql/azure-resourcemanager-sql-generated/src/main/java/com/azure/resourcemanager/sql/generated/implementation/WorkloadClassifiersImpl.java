// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.WorkloadClassifiersClient;
import com.azure.resourcemanager.sql.generated.fluent.models.WorkloadClassifierInner;
import com.azure.resourcemanager.sql.generated.models.WorkloadClassifier;
import com.azure.resourcemanager.sql.generated.models.WorkloadClassifiers;

public final class WorkloadClassifiersImpl implements WorkloadClassifiers {
    private static final ClientLogger LOGGER = new ClientLogger(WorkloadClassifiersImpl.class);

    private final WorkloadClassifiersClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public WorkloadClassifiersImpl(WorkloadClassifiersClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<WorkloadClassifier> getWithResponse(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName, String workloadClassifierName, Context context) {
        Response<WorkloadClassifierInner> inner = this.serviceClient().getWithResponse(resourceGroupName, serverName,
            databaseName, workloadGroupName, workloadClassifierName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new WorkloadClassifierImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkloadClassifier get(String resourceGroupName, String serverName, String databaseName,
        String workloadGroupName, String workloadClassifierName) {
        WorkloadClassifierInner inner = this.serviceClient().get(resourceGroupName, serverName, databaseName,
            workloadGroupName, workloadClassifierName);
        if (inner != null) {
            return new WorkloadClassifierImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String databaseName, String workloadGroupName,
        String workloadClassifierName) {
        this.serviceClient().delete(resourceGroupName, serverName, databaseName, workloadGroupName,
            workloadClassifierName);
    }

    public void delete(String resourceGroupName, String serverName, String databaseName, String workloadGroupName,
        String workloadClassifierName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, databaseName, workloadGroupName,
            workloadClassifierName, context);
    }

    public PagedIterable<WorkloadClassifier> listByWorkloadGroup(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName) {
        PagedIterable<WorkloadClassifierInner> inner
            = this.serviceClient().listByWorkloadGroup(resourceGroupName, serverName, databaseName, workloadGroupName);
        return Utils.mapPage(inner, inner1 -> new WorkloadClassifierImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkloadClassifier> listByWorkloadGroup(String resourceGroupName, String serverName,
        String databaseName, String workloadGroupName, Context context) {
        PagedIterable<WorkloadClassifierInner> inner = this.serviceClient().listByWorkloadGroup(resourceGroupName,
            serverName, databaseName, workloadGroupName, context);
        return Utils.mapPage(inner, inner1 -> new WorkloadClassifierImpl(inner1, this.manager()));
    }

    public WorkloadClassifier getById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        String workloadClassifierName = Utils.getValueFromIdByName(id, "workloadClassifiers");
        if (workloadClassifierName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workloadClassifiers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, databaseName, workloadGroupName,
            workloadClassifierName, Context.NONE).getValue();
    }

    public Response<WorkloadClassifier> getByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        String workloadClassifierName = Utils.getValueFromIdByName(id, "workloadClassifiers");
        if (workloadClassifierName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workloadClassifiers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, databaseName, workloadGroupName,
            workloadClassifierName, context);
    }

    public void deleteById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        String workloadClassifierName = Utils.getValueFromIdByName(id, "workloadClassifiers");
        if (workloadClassifierName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workloadClassifiers'.", id)));
        }
        this.delete(resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName,
            Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        String workloadClassifierName = Utils.getValueFromIdByName(id, "workloadClassifiers");
        if (workloadClassifierName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workloadClassifiers'.", id)));
        }
        this.delete(resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName, context);
    }

    private WorkloadClassifiersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public WorkloadClassifierImpl define(String name) {
        return new WorkloadClassifierImpl(name, this.manager());
    }
}
