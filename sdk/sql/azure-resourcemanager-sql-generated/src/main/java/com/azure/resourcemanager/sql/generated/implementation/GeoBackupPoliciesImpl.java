// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.GeoBackupPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.GeoBackupPolicyInner;
import com.azure.resourcemanager.sql.generated.models.GeoBackupPolicies;
import com.azure.resourcemanager.sql.generated.models.GeoBackupPolicy;
import com.azure.resourcemanager.sql.generated.models.GeoBackupPolicyName;

public final class GeoBackupPoliciesImpl implements GeoBackupPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(GeoBackupPoliciesImpl.class);

    private final GeoBackupPoliciesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public GeoBackupPoliciesImpl(GeoBackupPoliciesClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<GeoBackupPolicy> getWithResponse(String resourceGroupName, String serverName, String databaseName,
        GeoBackupPolicyName geoBackupPolicyName, Context context) {
        Response<GeoBackupPolicyInner> inner = this.serviceClient().getWithResponse(resourceGroupName, serverName,
            databaseName, geoBackupPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new GeoBackupPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GeoBackupPolicy get(String resourceGroupName, String serverName, String databaseName,
        GeoBackupPolicyName geoBackupPolicyName) {
        GeoBackupPolicyInner inner
            = this.serviceClient().get(resourceGroupName, serverName, databaseName, geoBackupPolicyName);
        if (inner != null) {
            return new GeoBackupPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<GeoBackupPolicy> listByDatabase(String resourceGroupName, String serverName,
        String databaseName) {
        PagedIterable<GeoBackupPolicyInner> inner
            = this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        return Utils.mapPage(inner, inner1 -> new GeoBackupPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<GeoBackupPolicy> listByDatabase(String resourceGroupName, String serverName,
        String databaseName, Context context) {
        PagedIterable<GeoBackupPolicyInner> inner
            = this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new GeoBackupPolicyImpl(inner1, this.manager()));
    }

    public GeoBackupPolicy getById(String id) {
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
        String geoBackupPolicyNameLocal = Utils.getValueFromIdByName(id, "geoBackupPolicies");
        if (geoBackupPolicyNameLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'geoBackupPolicies'.", id)));
        }
        GeoBackupPolicyName geoBackupPolicyName = GeoBackupPolicyName.fromString(geoBackupPolicyNameLocal);
        return this.getWithResponse(resourceGroupName, serverName, databaseName, geoBackupPolicyName, Context.NONE)
            .getValue();
    }

    public Response<GeoBackupPolicy> getByIdWithResponse(String id, Context context) {
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
        String geoBackupPolicyNameLocal = Utils.getValueFromIdByName(id, "geoBackupPolicies");
        if (geoBackupPolicyNameLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'geoBackupPolicies'.", id)));
        }
        GeoBackupPolicyName geoBackupPolicyName = GeoBackupPolicyName.fromString(geoBackupPolicyNameLocal);
        return this.getWithResponse(resourceGroupName, serverName, databaseName, geoBackupPolicyName, context);
    }

    private GeoBackupPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public GeoBackupPolicyImpl define(GeoBackupPolicyName name) {
        return new GeoBackupPolicyImpl(name, this.manager());
    }
}
