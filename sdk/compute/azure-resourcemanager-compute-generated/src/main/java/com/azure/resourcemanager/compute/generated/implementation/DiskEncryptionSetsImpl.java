// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.DiskEncryptionSetsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskEncryptionSetInner;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSet;
import com.azure.resourcemanager.compute.generated.models.DiskEncryptionSets;

public final class DiskEncryptionSetsImpl implements DiskEncryptionSets {
    private static final ClientLogger LOGGER = new ClientLogger(DiskEncryptionSetsImpl.class);

    private final DiskEncryptionSetsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public DiskEncryptionSetsImpl(DiskEncryptionSetsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DiskEncryptionSet> getByResourceGroupWithResponse(String resourceGroupName,
        String diskEncryptionSetName, Context context) {
        Response<DiskEncryptionSetInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, diskEncryptionSetName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiskEncryptionSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiskEncryptionSet getByResourceGroup(String resourceGroupName, String diskEncryptionSetName) {
        DiskEncryptionSetInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, diskEncryptionSetName);
        if (inner != null) {
            return new DiskEncryptionSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String diskEncryptionSetName) {
        this.serviceClient().delete(resourceGroupName, diskEncryptionSetName);
    }

    public void delete(String resourceGroupName, String diskEncryptionSetName, Context context) {
        this.serviceClient().delete(resourceGroupName, diskEncryptionSetName, context);
    }

    public PagedIterable<DiskEncryptionSet> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DiskEncryptionSetInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DiskEncryptionSetImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskEncryptionSet> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DiskEncryptionSetInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DiskEncryptionSetImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskEncryptionSet> list() {
        PagedIterable<DiskEncryptionSetInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DiskEncryptionSetImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskEncryptionSet> list(Context context) {
        PagedIterable<DiskEncryptionSetInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DiskEncryptionSetImpl(inner1, this.manager()));
    }

    public PagedIterable<String> listAssociatedResources(String resourceGroupName, String diskEncryptionSetName) {
        return this.serviceClient().listAssociatedResources(resourceGroupName, diskEncryptionSetName);
    }

    public PagedIterable<String> listAssociatedResources(String resourceGroupName, String diskEncryptionSetName,
        Context context) {
        return this.serviceClient().listAssociatedResources(resourceGroupName, diskEncryptionSetName, context);
    }

    public DiskEncryptionSet getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String diskEncryptionSetName = ResourceManagerUtils.getValueFromIdByName(id, "diskEncryptionSets");
        if (diskEncryptionSetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'diskEncryptionSets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, diskEncryptionSetName, Context.NONE).getValue();
    }

    public Response<DiskEncryptionSet> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String diskEncryptionSetName = ResourceManagerUtils.getValueFromIdByName(id, "diskEncryptionSets");
        if (diskEncryptionSetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'diskEncryptionSets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, diskEncryptionSetName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String diskEncryptionSetName = ResourceManagerUtils.getValueFromIdByName(id, "diskEncryptionSets");
        if (diskEncryptionSetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'diskEncryptionSets'.", id)));
        }
        this.delete(resourceGroupName, diskEncryptionSetName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String diskEncryptionSetName = ResourceManagerUtils.getValueFromIdByName(id, "diskEncryptionSets");
        if (diskEncryptionSetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'diskEncryptionSets'.", id)));
        }
        this.delete(resourceGroupName, diskEncryptionSetName, context);
    }

    private DiskEncryptionSetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public DiskEncryptionSetImpl define(String name) {
        return new DiskEncryptionSetImpl(name, this.manager());
    }
}
