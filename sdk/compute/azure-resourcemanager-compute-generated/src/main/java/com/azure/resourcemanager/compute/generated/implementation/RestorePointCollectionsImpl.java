// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.RestorePointCollectionsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.RestorePointCollectionInner;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollection;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollectionExpandOptions;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollections;

public final class RestorePointCollectionsImpl implements RestorePointCollections {
    private static final ClientLogger LOGGER = new ClientLogger(RestorePointCollectionsImpl.class);

    private final RestorePointCollectionsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public RestorePointCollectionsImpl(RestorePointCollectionsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String restorePointCollectionName) {
        this.serviceClient().delete(resourceGroupName, restorePointCollectionName);
    }

    public void delete(String resourceGroupName, String restorePointCollectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, restorePointCollectionName, context);
    }

    public Response<RestorePointCollection> getByResourceGroupWithResponse(String resourceGroupName,
        String restorePointCollectionName, RestorePointCollectionExpandOptions expand, Context context) {
        Response<RestorePointCollectionInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, restorePointCollectionName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RestorePointCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RestorePointCollection getByResourceGroup(String resourceGroupName, String restorePointCollectionName) {
        RestorePointCollectionInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, restorePointCollectionName);
        if (inner != null) {
            return new RestorePointCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<RestorePointCollection> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RestorePointCollectionInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new RestorePointCollectionImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorePointCollection> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<RestorePointCollectionInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new RestorePointCollectionImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorePointCollection> list() {
        PagedIterable<RestorePointCollectionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new RestorePointCollectionImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorePointCollection> list(Context context) {
        PagedIterable<RestorePointCollectionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new RestorePointCollectionImpl(inner1, this.manager()));
    }

    public RestorePointCollection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String restorePointCollectionName = Utils.getValueFromIdByName(id, "restorePointCollections");
        if (restorePointCollectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'restorePointCollections'.", id)));
        }
        RestorePointCollectionExpandOptions localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, restorePointCollectionName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<RestorePointCollection> getByIdWithResponse(String id, RestorePointCollectionExpandOptions expand,
        Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String restorePointCollectionName = Utils.getValueFromIdByName(id, "restorePointCollections");
        if (restorePointCollectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'restorePointCollections'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, restorePointCollectionName, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String restorePointCollectionName = Utils.getValueFromIdByName(id, "restorePointCollections");
        if (restorePointCollectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'restorePointCollections'.", id)));
        }
        this.delete(resourceGroupName, restorePointCollectionName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String restorePointCollectionName = Utils.getValueFromIdByName(id, "restorePointCollections");
        if (restorePointCollectionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'restorePointCollections'.", id)));
        }
        this.delete(resourceGroupName, restorePointCollectionName, context);
    }

    private RestorePointCollectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public RestorePointCollectionImpl define(String name) {
        return new RestorePointCollectionImpl(name, this.manager());
    }
}
