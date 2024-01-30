// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.agrifood.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.agrifood.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.agrifood.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.agrifood.models.PrivateLinkResource;
import com.azure.resourcemanager.agrifood.models.PrivateLinkResourceListResult;
import com.azure.resourcemanager.agrifood.models.PrivateLinkResources;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager;

    public PrivateLinkResourcesImpl(PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.agrifood.AgriFoodManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PrivateLinkResourceListResult> listByResourceWithResponse(String resourceGroupName,
        String dataManagerForAgricultureResourceName, Context context) {
        Response<PrivateLinkResourceListResultInner> inner = this.serviceClient()
            .listByResourceWithResponse(resourceGroupName, dataManagerForAgricultureResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateLinkResourceListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResourceListResult listByResource(String resourceGroupName,
        String dataManagerForAgricultureResourceName) {
        PrivateLinkResourceListResultInner inner
            = this.serviceClient().listByResource(resourceGroupName, dataManagerForAgricultureResourceName);
        if (inner != null) {
            return new PrivateLinkResourceListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResource> getWithResponse(String resourceGroupName,
        String dataManagerForAgricultureResourceName, String subResourceName, Context context) {
        Response<PrivateLinkResourceInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            dataManagerForAgricultureResourceName, subResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResource get(String resourceGroupName, String dataManagerForAgricultureResourceName,
        String subResourceName) {
        PrivateLinkResourceInner inner
            = this.serviceClient().get(resourceGroupName, dataManagerForAgricultureResourceName, subResourceName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.agrifood.AgriFoodManager manager() {
        return this.serviceManager;
    }
}
