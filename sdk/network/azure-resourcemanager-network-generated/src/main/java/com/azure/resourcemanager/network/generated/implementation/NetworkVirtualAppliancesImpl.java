// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.NetworkVirtualAppliancesClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceInner;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualAppliance;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualAppliances;

public final class NetworkVirtualAppliancesImpl implements NetworkVirtualAppliances {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkVirtualAppliancesImpl.class);

    private final NetworkVirtualAppliancesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public NetworkVirtualAppliancesImpl(NetworkVirtualAppliancesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkVirtualApplianceName) {
        this.serviceClient().delete(resourceGroupName, networkVirtualApplianceName);
    }

    public void delete(String resourceGroupName, String networkVirtualApplianceName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkVirtualApplianceName, context);
    }

    public Response<NetworkVirtualAppliance> getByResourceGroupWithResponse(String resourceGroupName,
        String networkVirtualApplianceName, String expand, Context context) {
        Response<NetworkVirtualApplianceInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, networkVirtualApplianceName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkVirtualApplianceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkVirtualAppliance getByResourceGroup(String resourceGroupName, String networkVirtualApplianceName) {
        NetworkVirtualApplianceInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, networkVirtualApplianceName);
        if (inner != null) {
            return new NetworkVirtualApplianceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkVirtualAppliance> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkVirtualApplianceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkVirtualApplianceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkVirtualAppliance> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkVirtualApplianceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkVirtualApplianceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkVirtualAppliance> list() {
        PagedIterable<NetworkVirtualApplianceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkVirtualApplianceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkVirtualAppliance> list(Context context) {
        PagedIterable<NetworkVirtualApplianceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetworkVirtualApplianceImpl(inner1, this.manager()));
    }

    public NetworkVirtualAppliance getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkVirtualApplianceName = Utils.getValueFromIdByName(id, "networkVirtualAppliances");
        if (networkVirtualApplianceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'networkVirtualAppliances'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, networkVirtualApplianceName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<NetworkVirtualAppliance> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkVirtualApplianceName = Utils.getValueFromIdByName(id, "networkVirtualAppliances");
        if (networkVirtualApplianceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'networkVirtualAppliances'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkVirtualApplianceName, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkVirtualApplianceName = Utils.getValueFromIdByName(id, "networkVirtualAppliances");
        if (networkVirtualApplianceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'networkVirtualAppliances'.", id)));
        }
        this.delete(resourceGroupName, networkVirtualApplianceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkVirtualApplianceName = Utils.getValueFromIdByName(id, "networkVirtualAppliances");
        if (networkVirtualApplianceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'networkVirtualAppliances'.", id)));
        }
        this.delete(resourceGroupName, networkVirtualApplianceName, context);
    }

    private NetworkVirtualAppliancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkVirtualApplianceImpl define(String name) {
        return new NetworkVirtualApplianceImpl(name, this.manager());
    }
}
