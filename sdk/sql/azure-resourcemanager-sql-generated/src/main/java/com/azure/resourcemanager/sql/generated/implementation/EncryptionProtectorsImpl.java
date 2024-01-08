// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.EncryptionProtectorsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.EncryptionProtectorInner;
import com.azure.resourcemanager.sql.generated.models.EncryptionProtector;
import com.azure.resourcemanager.sql.generated.models.EncryptionProtectorName;
import com.azure.resourcemanager.sql.generated.models.EncryptionProtectors;

public final class EncryptionProtectorsImpl implements EncryptionProtectors {
    private static final ClientLogger LOGGER = new ClientLogger(EncryptionProtectorsImpl.class);

    private final EncryptionProtectorsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public EncryptionProtectorsImpl(EncryptionProtectorsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EncryptionProtector> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<EncryptionProtectorInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new EncryptionProtectorImpl(inner1, this.manager()));
    }

    public PagedIterable<EncryptionProtector> listByServer(String resourceGroupName, String serverName,
        Context context) {
        PagedIterable<EncryptionProtectorInner> inner
            = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new EncryptionProtectorImpl(inner1, this.manager()));
    }

    public Response<EncryptionProtector> getWithResponse(String resourceGroupName, String serverName,
        EncryptionProtectorName encryptionProtectorName, Context context) {
        Response<EncryptionProtectorInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, serverName, encryptionProtectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new EncryptionProtectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EncryptionProtector get(String resourceGroupName, String serverName,
        EncryptionProtectorName encryptionProtectorName) {
        EncryptionProtectorInner inner
            = this.serviceClient().get(resourceGroupName, serverName, encryptionProtectorName);
        if (inner != null) {
            return new EncryptionProtectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void revalidate(String resourceGroupName, String serverName,
        EncryptionProtectorName encryptionProtectorName) {
        this.serviceClient().revalidate(resourceGroupName, serverName, encryptionProtectorName);
    }

    public void revalidate(String resourceGroupName, String serverName, EncryptionProtectorName encryptionProtectorName,
        Context context) {
        this.serviceClient().revalidate(resourceGroupName, serverName, encryptionProtectorName, context);
    }

    public EncryptionProtector getById(String id) {
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
        String encryptionProtectorNameLocal = Utils.getValueFromIdByName(id, "encryptionProtector");
        if (encryptionProtectorNameLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'encryptionProtector'.", id)));
        }
        EncryptionProtectorName encryptionProtectorName
            = EncryptionProtectorName.fromString(encryptionProtectorNameLocal);
        return this.getWithResponse(resourceGroupName, serverName, encryptionProtectorName, Context.NONE).getValue();
    }

    public Response<EncryptionProtector> getByIdWithResponse(String id, Context context) {
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
        String encryptionProtectorNameLocal = Utils.getValueFromIdByName(id, "encryptionProtector");
        if (encryptionProtectorNameLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'encryptionProtector'.", id)));
        }
        EncryptionProtectorName encryptionProtectorName
            = EncryptionProtectorName.fromString(encryptionProtectorNameLocal);
        return this.getWithResponse(resourceGroupName, serverName, encryptionProtectorName, context);
    }

    private EncryptionProtectorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public EncryptionProtectorImpl define(EncryptionProtectorName name) {
        return new EncryptionProtectorImpl(name, this.manager());
    }
}
