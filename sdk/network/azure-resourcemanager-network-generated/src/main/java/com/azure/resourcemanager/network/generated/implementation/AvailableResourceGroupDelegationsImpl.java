// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.AvailableResourceGroupDelegationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.AvailableDelegationInner;
import com.azure.resourcemanager.network.generated.models.AvailableDelegation;
import com.azure.resourcemanager.network.generated.models.AvailableResourceGroupDelegations;

public final class AvailableResourceGroupDelegationsImpl implements AvailableResourceGroupDelegations {
    private static final ClientLogger LOGGER = new ClientLogger(AvailableResourceGroupDelegationsImpl.class);

    private final AvailableResourceGroupDelegationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public AvailableResourceGroupDelegationsImpl(AvailableResourceGroupDelegationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvailableDelegation> list(String location, String resourceGroupName) {
        PagedIterable<AvailableDelegationInner> inner = this.serviceClient().list(location, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AvailableDelegationImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailableDelegation> list(String location, String resourceGroupName, Context context) {
        PagedIterable<AvailableDelegationInner> inner = this.serviceClient().list(location, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AvailableDelegationImpl(inner1, this.manager()));
    }

    private AvailableResourceGroupDelegationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
