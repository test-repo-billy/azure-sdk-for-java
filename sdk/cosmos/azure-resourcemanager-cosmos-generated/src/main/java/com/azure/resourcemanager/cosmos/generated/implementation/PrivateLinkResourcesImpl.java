// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.cosmos.generated.models.PrivateLinkResource;
import com.azure.resourcemanager.cosmos.generated.models.PrivateLinkResources;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public PrivateLinkResourcesImpl(PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkResource> listByDatabaseAccount(String resourceGroupName, String accountName) {
        PagedIterable<PrivateLinkResourceInner> inner
            = this.serviceClient().listByDatabaseAccount(resourceGroupName, accountName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> listByDatabaseAccount(String resourceGroupName, String accountName,
        Context context) {
        PagedIterable<PrivateLinkResourceInner> inner
            = this.serviceClient().listByDatabaseAccount(resourceGroupName, accountName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public Response<PrivateLinkResource> getWithResponse(String resourceGroupName, String accountName, String groupName,
        Context context) {
        Response<PrivateLinkResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, accountName, groupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResource get(String resourceGroupName, String accountName, String groupName) {
        PrivateLinkResourceInner inner = this.serviceClient().get(resourceGroupName, accountName, groupName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
