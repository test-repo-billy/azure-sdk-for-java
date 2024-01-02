// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.DiskRestorePointsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.AccessUriInner;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskRestorePointInner;
import com.azure.resourcemanager.compute.generated.models.AccessUri;
import com.azure.resourcemanager.compute.generated.models.DiskRestorePoint;
import com.azure.resourcemanager.compute.generated.models.DiskRestorePoints;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;

public final class DiskRestorePointsImpl implements DiskRestorePoints {
    private static final ClientLogger LOGGER = new ClientLogger(DiskRestorePointsImpl.class);

    private final DiskRestorePointsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public DiskRestorePointsImpl(DiskRestorePointsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DiskRestorePoint> getWithResponse(String resourceGroupName, String restorePointCollectionName,
        String vmRestorePointName, String diskRestorePointName, Context context) {
        Response<DiskRestorePointInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            restorePointCollectionName, vmRestorePointName, diskRestorePointName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiskRestorePointImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiskRestorePoint get(String resourceGroupName, String restorePointCollectionName, String vmRestorePointName,
        String diskRestorePointName) {
        DiskRestorePointInner inner = this.serviceClient().get(resourceGroupName, restorePointCollectionName,
            vmRestorePointName, diskRestorePointName);
        if (inner != null) {
            return new DiskRestorePointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<DiskRestorePoint> listByRestorePoint(String resourceGroupName,
        String restorePointCollectionName, String vmRestorePointName) {
        PagedIterable<DiskRestorePointInner> inner = this.serviceClient().listByRestorePoint(resourceGroupName,
            restorePointCollectionName, vmRestorePointName);
        return Utils.mapPage(inner, inner1 -> new DiskRestorePointImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskRestorePoint> listByRestorePoint(String resourceGroupName,
        String restorePointCollectionName, String vmRestorePointName, Context context) {
        PagedIterable<DiskRestorePointInner> inner = this.serviceClient().listByRestorePoint(resourceGroupName,
            restorePointCollectionName, vmRestorePointName, context);
        return Utils.mapPage(inner, inner1 -> new DiskRestorePointImpl(inner1, this.manager()));
    }

    public AccessUri grantAccess(String resourceGroupName, String restorePointCollectionName, String vmRestorePointName,
        String diskRestorePointName, GrantAccessData grantAccessData) {
        AccessUriInner inner = this.serviceClient().grantAccess(resourceGroupName, restorePointCollectionName,
            vmRestorePointName, diskRestorePointName, grantAccessData);
        if (inner != null) {
            return new AccessUriImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AccessUri grantAccess(String resourceGroupName, String restorePointCollectionName, String vmRestorePointName,
        String diskRestorePointName, GrantAccessData grantAccessData, Context context) {
        AccessUriInner inner = this.serviceClient().grantAccess(resourceGroupName, restorePointCollectionName,
            vmRestorePointName, diskRestorePointName, grantAccessData, context);
        if (inner != null) {
            return new AccessUriImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void revokeAccess(String resourceGroupName, String restorePointCollectionName, String vmRestorePointName,
        String diskRestorePointName) {
        this.serviceClient().revokeAccess(resourceGroupName, restorePointCollectionName, vmRestorePointName,
            diskRestorePointName);
    }

    public void revokeAccess(String resourceGroupName, String restorePointCollectionName, String vmRestorePointName,
        String diskRestorePointName, Context context) {
        this.serviceClient().revokeAccess(resourceGroupName, restorePointCollectionName, vmRestorePointName,
            diskRestorePointName, context);
    }

    private DiskRestorePointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
