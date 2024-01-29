// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.AvailabilitySetsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.AvailabilitySetInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineSizeInner;
import com.azure.resourcemanager.compute.generated.models.AvailabilitySet;
import com.azure.resourcemanager.compute.generated.models.AvailabilitySets;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSize;

public final class AvailabilitySetsImpl implements AvailabilitySets {
    private static final ClientLogger LOGGER = new ClientLogger(AvailabilitySetsImpl.class);

    private final AvailabilitySetsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public AvailabilitySetsImpl(AvailabilitySetsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String availabilitySetName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, availabilitySetName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String availabilitySetName) {
        this.serviceClient().delete(resourceGroupName, availabilitySetName);
    }

    public Response<AvailabilitySet> getByResourceGroupWithResponse(String resourceGroupName,
        String availabilitySetName, Context context) {
        Response<AvailabilitySetInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, availabilitySetName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AvailabilitySetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AvailabilitySet getByResourceGroup(String resourceGroupName, String availabilitySetName) {
        AvailabilitySetInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, availabilitySetName);
        if (inner != null) {
            return new AvailabilitySetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<AvailabilitySet> list() {
        PagedIterable<AvailabilitySetInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AvailabilitySetImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailabilitySet> list(String expand, Context context) {
        PagedIterable<AvailabilitySetInner> inner = this.serviceClient().list(expand, context);
        return Utils.mapPage(inner, inner1 -> new AvailabilitySetImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailabilitySet> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AvailabilitySetInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AvailabilitySetImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailabilitySet> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AvailabilitySetInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AvailabilitySetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineSize> listAvailableSizes(String resourceGroupName, String availabilitySetName) {
        PagedIterable<VirtualMachineSizeInner> inner
            = this.serviceClient().listAvailableSizes(resourceGroupName, availabilitySetName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineSizeImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineSize> listAvailableSizes(String resourceGroupName, String availabilitySetName,
        Context context) {
        PagedIterable<VirtualMachineSizeInner> inner
            = this.serviceClient().listAvailableSizes(resourceGroupName, availabilitySetName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineSizeImpl(inner1, this.manager()));
    }

    public AvailabilitySet getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String availabilitySetName = Utils.getValueFromIdByName(id, "availabilitySets");
        if (availabilitySetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'availabilitySets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, availabilitySetName, Context.NONE).getValue();
    }

    public Response<AvailabilitySet> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String availabilitySetName = Utils.getValueFromIdByName(id, "availabilitySets");
        if (availabilitySetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'availabilitySets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, availabilitySetName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String availabilitySetName = Utils.getValueFromIdByName(id, "availabilitySets");
        if (availabilitySetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'availabilitySets'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, availabilitySetName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String availabilitySetName = Utils.getValueFromIdByName(id, "availabilitySets");
        if (availabilitySetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'availabilitySets'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, availabilitySetName, context);
    }

    private AvailabilitySetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public AvailabilitySetImpl define(String name) {
        return new AvailabilitySetImpl(name, this.manager());
    }
}
