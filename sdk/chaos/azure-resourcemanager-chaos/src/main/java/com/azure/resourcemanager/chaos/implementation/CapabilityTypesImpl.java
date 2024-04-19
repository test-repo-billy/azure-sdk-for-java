// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.chaos.fluent.CapabilityTypesClient;
import com.azure.resourcemanager.chaos.fluent.models.CapabilityTypeInner;
import com.azure.resourcemanager.chaos.models.CapabilityType;
import com.azure.resourcemanager.chaos.models.CapabilityTypes;

public final class CapabilityTypesImpl implements CapabilityTypes {
    private static final ClientLogger LOGGER = new ClientLogger(CapabilityTypesImpl.class);

    private final CapabilityTypesClient innerClient;

    private final com.azure.resourcemanager.chaos.ChaosManager serviceManager;

    public CapabilityTypesImpl(CapabilityTypesClient innerClient,
        com.azure.resourcemanager.chaos.ChaosManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CapabilityType> list(String locationName, String targetTypeName) {
        PagedIterable<CapabilityTypeInner> inner = this.serviceClient().list(locationName, targetTypeName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CapabilityTypeImpl(inner1, this.manager()));
    }

    public PagedIterable<CapabilityType> list(String locationName, String targetTypeName, String continuationToken,
        Context context) {
        PagedIterable<CapabilityTypeInner> inner
            = this.serviceClient().list(locationName, targetTypeName, continuationToken, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CapabilityTypeImpl(inner1, this.manager()));
    }

    public Response<CapabilityType> getWithResponse(String locationName, String targetTypeName,
        String capabilityTypeName, Context context) {
        Response<CapabilityTypeInner> inner
            = this.serviceClient().getWithResponse(locationName, targetTypeName, capabilityTypeName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CapabilityTypeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CapabilityType get(String locationName, String targetTypeName, String capabilityTypeName) {
        CapabilityTypeInner inner = this.serviceClient().get(locationName, targetTypeName, capabilityTypeName);
        if (inner != null) {
            return new CapabilityTypeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private CapabilityTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.chaos.ChaosManager manager() {
        return this.serviceManager;
    }
}
