// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ManagedLedgerDigestUploadsOperationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedLedgerDigestUploadsInner;
import com.azure.resourcemanager.sql.generated.models.ManagedLedgerDigestUploads;
import com.azure.resourcemanager.sql.generated.models.ManagedLedgerDigestUploadsName;
import com.azure.resourcemanager.sql.generated.models.ManagedLedgerDigestUploadsOperations;

public final class ManagedLedgerDigestUploadsOperationsImpl implements ManagedLedgerDigestUploadsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedLedgerDigestUploadsOperationsImpl.class);

    private final ManagedLedgerDigestUploadsOperationsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ManagedLedgerDigestUploadsOperationsImpl(ManagedLedgerDigestUploadsOperationsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagedLedgerDigestUploads> listByDatabase(String resourceGroupName,
        String managedInstanceName, String databaseName) {
        PagedIterable<ManagedLedgerDigestUploadsInner> inner
            = this.serviceClient().listByDatabase(resourceGroupName, managedInstanceName, databaseName);
        return Utils.mapPage(inner, inner1 -> new ManagedLedgerDigestUploadsImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedLedgerDigestUploads> listByDatabase(String resourceGroupName,
        String managedInstanceName, String databaseName, Context context) {
        PagedIterable<ManagedLedgerDigestUploadsInner> inner
            = this.serviceClient().listByDatabase(resourceGroupName, managedInstanceName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new ManagedLedgerDigestUploadsImpl(inner1, this.manager()));
    }

    public Response<ManagedLedgerDigestUploads> getWithResponse(String resourceGroupName, String managedInstanceName,
        String databaseName, ManagedLedgerDigestUploadsName ledgerDigestUploads, Context context) {
        Response<ManagedLedgerDigestUploadsInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            managedInstanceName, databaseName, ledgerDigestUploads, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ManagedLedgerDigestUploadsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedLedgerDigestUploads get(String resourceGroupName, String managedInstanceName, String databaseName,
        ManagedLedgerDigestUploadsName ledgerDigestUploads) {
        ManagedLedgerDigestUploadsInner inner
            = this.serviceClient().get(resourceGroupName, managedInstanceName, databaseName, ledgerDigestUploads);
        if (inner != null) {
            return new ManagedLedgerDigestUploadsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagedLedgerDigestUploads disable(String resourceGroupName, String managedInstanceName, String databaseName,
        ManagedLedgerDigestUploadsName ledgerDigestUploads) {
        ManagedLedgerDigestUploadsInner inner
            = this.serviceClient().disable(resourceGroupName, managedInstanceName, databaseName, ledgerDigestUploads);
        if (inner != null) {
            return new ManagedLedgerDigestUploadsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagedLedgerDigestUploads disable(String resourceGroupName, String managedInstanceName, String databaseName,
        ManagedLedgerDigestUploadsName ledgerDigestUploads, Context context) {
        ManagedLedgerDigestUploadsInner inner = this.serviceClient().disable(resourceGroupName, managedInstanceName,
            databaseName, ledgerDigestUploads, context);
        if (inner != null) {
            return new ManagedLedgerDigestUploadsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagedLedgerDigestUploads getById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String ledgerDigestUploadsLocal = Utils.getValueFromIdByName(id, "ledgerDigestUploads");
        if (ledgerDigestUploadsLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ledgerDigestUploads'.", id)));
        }
        ManagedLedgerDigestUploadsName ledgerDigestUploads
            = ManagedLedgerDigestUploadsName.fromString(ledgerDigestUploadsLocal);
        return this
            .getWithResponse(resourceGroupName, managedInstanceName, databaseName, ledgerDigestUploads, Context.NONE)
            .getValue();
    }

    public Response<ManagedLedgerDigestUploads> getByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String ledgerDigestUploadsLocal = Utils.getValueFromIdByName(id, "ledgerDigestUploads");
        if (ledgerDigestUploadsLocal == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'ledgerDigestUploads'.", id)));
        }
        ManagedLedgerDigestUploadsName ledgerDigestUploads
            = ManagedLedgerDigestUploadsName.fromString(ledgerDigestUploadsLocal);
        return this.getWithResponse(resourceGroupName, managedInstanceName, databaseName, ledgerDigestUploads, context);
    }

    private ManagedLedgerDigestUploadsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public ManagedLedgerDigestUploadsImpl define(ManagedLedgerDigestUploadsName name) {
        return new ManagedLedgerDigestUploadsImpl(name, this.manager());
    }
}
