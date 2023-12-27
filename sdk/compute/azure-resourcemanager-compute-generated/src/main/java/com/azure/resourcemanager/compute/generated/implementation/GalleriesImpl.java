// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.GalleriesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryInner;
import com.azure.resourcemanager.compute.generated.models.Galleries;
import com.azure.resourcemanager.compute.generated.models.Gallery;
import com.azure.resourcemanager.compute.generated.models.GalleryExpandParams;
import com.azure.resourcemanager.compute.generated.models.SelectPermissions;

public final class GalleriesImpl implements Galleries {
    private static final ClientLogger LOGGER = new ClientLogger(GalleriesImpl.class);

    private final GalleriesClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public GalleriesImpl(GalleriesClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Gallery> getByResourceGroupWithResponse(String resourceGroupName, String galleryName,
        SelectPermissions select, GalleryExpandParams expand, Context context) {
        Response<GalleryInner> inner = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName,
            galleryName, select, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new GalleryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Gallery getByResourceGroup(String resourceGroupName, String galleryName) {
        GalleryInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, galleryName);
        if (inner != null) {
            return new GalleryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String galleryName) {
        this.serviceClient().delete(resourceGroupName, galleryName);
    }

    public void delete(String resourceGroupName, String galleryName, Context context) {
        this.serviceClient().delete(resourceGroupName, galleryName, context);
    }

    public PagedIterable<Gallery> listByResourceGroup(String resourceGroupName) {
        PagedIterable<GalleryInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new GalleryImpl(inner1, this.manager()));
    }

    public PagedIterable<Gallery> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<GalleryInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new GalleryImpl(inner1, this.manager()));
    }

    public PagedIterable<Gallery> list() {
        PagedIterable<GalleryInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new GalleryImpl(inner1, this.manager()));
    }

    public PagedIterable<Gallery> list(Context context) {
        PagedIterable<GalleryInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new GalleryImpl(inner1, this.manager()));
    }

    public Gallery getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        SelectPermissions localSelect = null;
        GalleryExpandParams localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, galleryName, localSelect, localExpand, Context.NONE)
            .getValue();
    }

    public Response<Gallery> getByIdWithResponse(String id, SelectPermissions select, GalleryExpandParams expand,
        Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, galleryName, select, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        this.delete(resourceGroupName, galleryName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String galleryName = Utils.getValueFromIdByName(id, "galleries");
        if (galleryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'galleries'.", id)));
        }
        this.delete(resourceGroupName, galleryName, context);
    }

    private GalleriesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public GalleryImpl define(String name) {
        return new GalleryImpl(name, this.manager());
    }
}
