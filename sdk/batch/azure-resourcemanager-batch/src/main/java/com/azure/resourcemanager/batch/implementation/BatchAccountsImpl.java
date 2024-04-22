// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batch.fluent.BatchAccountsClient;
import com.azure.resourcemanager.batch.fluent.models.BatchAccountInner;
import com.azure.resourcemanager.batch.fluent.models.BatchAccountKeysInner;
import com.azure.resourcemanager.batch.fluent.models.DetectorResponseInner;
import com.azure.resourcemanager.batch.fluent.models.OutboundEnvironmentEndpointInner;
import com.azure.resourcemanager.batch.models.BatchAccount;
import com.azure.resourcemanager.batch.models.BatchAccountKeys;
import com.azure.resourcemanager.batch.models.BatchAccountRegenerateKeyParameters;
import com.azure.resourcemanager.batch.models.BatchAccounts;
import com.azure.resourcemanager.batch.models.DetectorResponse;
import com.azure.resourcemanager.batch.models.OutboundEnvironmentEndpoint;

public final class BatchAccountsImpl implements BatchAccounts {
    private static final ClientLogger LOGGER = new ClientLogger(BatchAccountsImpl.class);

    private final BatchAccountsClient innerClient;

    private final com.azure.resourcemanager.batch.BatchManager serviceManager;

    public BatchAccountsImpl(BatchAccountsClient innerClient,
        com.azure.resourcemanager.batch.BatchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String accountName) {
        this.serviceClient().delete(resourceGroupName, accountName);
    }

    public void delete(String resourceGroupName, String accountName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, context);
    }

    public Response<BatchAccount> getByResourceGroupWithResponse(String resourceGroupName, String accountName,
        Context context) {
        Response<BatchAccountInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BatchAccountImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BatchAccount getByResourceGroup(String resourceGroupName, String accountName) {
        BatchAccountInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, accountName);
        if (inner != null) {
            return new BatchAccountImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<BatchAccount> list() {
        PagedIterable<BatchAccountInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BatchAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<BatchAccount> list(Context context) {
        PagedIterable<BatchAccountInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BatchAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<BatchAccount> listByResourceGroup(String resourceGroupName) {
        PagedIterable<BatchAccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BatchAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<BatchAccount> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<BatchAccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new BatchAccountImpl(inner1, this.manager()));
    }

    public Response<Void> synchronizeAutoStorageKeysWithResponse(String resourceGroupName, String accountName,
        Context context) {
        return this.serviceClient().synchronizeAutoStorageKeysWithResponse(resourceGroupName, accountName, context);
    }

    public void synchronizeAutoStorageKeys(String resourceGroupName, String accountName) {
        this.serviceClient().synchronizeAutoStorageKeys(resourceGroupName, accountName);
    }

    public Response<BatchAccountKeys> regenerateKeyWithResponse(String resourceGroupName, String accountName,
        BatchAccountRegenerateKeyParameters parameters, Context context) {
        Response<BatchAccountKeysInner> inner
            = this.serviceClient().regenerateKeyWithResponse(resourceGroupName, accountName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BatchAccountKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BatchAccountKeys regenerateKey(String resourceGroupName, String accountName,
        BatchAccountRegenerateKeyParameters parameters) {
        BatchAccountKeysInner inner = this.serviceClient().regenerateKey(resourceGroupName, accountName, parameters);
        if (inner != null) {
            return new BatchAccountKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BatchAccountKeys> getKeysWithResponse(String resourceGroupName, String accountName,
        Context context) {
        Response<BatchAccountKeysInner> inner
            = this.serviceClient().getKeysWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BatchAccountKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BatchAccountKeys getKeys(String resourceGroupName, String accountName) {
        BatchAccountKeysInner inner = this.serviceClient().getKeys(resourceGroupName, accountName);
        if (inner != null) {
            return new BatchAccountKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<DetectorResponse> listDetectors(String resourceGroupName, String accountName) {
        PagedIterable<DetectorResponseInner> inner = this.serviceClient().listDetectors(resourceGroupName, accountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<DetectorResponse> listDetectors(String resourceGroupName, String accountName,
        Context context) {
        PagedIterable<DetectorResponseInner> inner
            = this.serviceClient().listDetectors(resourceGroupName, accountName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DetectorResponseImpl(inner1, this.manager()));
    }

    public Response<DetectorResponse> getDetectorWithResponse(String resourceGroupName, String accountName,
        String detectorId, Context context) {
        Response<DetectorResponseInner> inner
            = this.serviceClient().getDetectorWithResponse(resourceGroupName, accountName, detectorId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DetectorResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DetectorResponse getDetector(String resourceGroupName, String accountName, String detectorId) {
        DetectorResponseInner inner = this.serviceClient().getDetector(resourceGroupName, accountName, detectorId);
        if (inner != null) {
            return new DetectorResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<OutboundEnvironmentEndpoint> listOutboundNetworkDependenciesEndpoints(String resourceGroupName,
        String accountName) {
        PagedIterable<OutboundEnvironmentEndpointInner> inner
            = this.serviceClient().listOutboundNetworkDependenciesEndpoints(resourceGroupName, accountName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new OutboundEnvironmentEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<OutboundEnvironmentEndpoint> listOutboundNetworkDependenciesEndpoints(String resourceGroupName,
        String accountName, Context context) {
        PagedIterable<OutboundEnvironmentEndpointInner> inner
            = this.serviceClient().listOutboundNetworkDependenciesEndpoints(resourceGroupName, accountName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new OutboundEnvironmentEndpointImpl(inner1, this.manager()));
    }

    public BatchAccount getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<BatchAccount> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        this.delete(resourceGroupName, accountName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        this.delete(resourceGroupName, accountName, context);
    }

    private BatchAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.batch.BatchManager manager() {
        return this.serviceManager;
    }

    public BatchAccountImpl define(String name) {
        return new BatchAccountImpl(name, this.manager());
    }
}
