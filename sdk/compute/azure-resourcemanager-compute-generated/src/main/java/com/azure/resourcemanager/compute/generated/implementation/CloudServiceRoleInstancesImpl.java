// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.CloudServiceRoleInstancesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.RoleInstanceInner;
import com.azure.resourcemanager.compute.generated.fluent.models.RoleInstanceViewInner;
import com.azure.resourcemanager.compute.generated.models.CloudServiceRoleInstances;
import com.azure.resourcemanager.compute.generated.models.InstanceViewTypes;
import com.azure.resourcemanager.compute.generated.models.RoleInstance;
import com.azure.resourcemanager.compute.generated.models.RoleInstanceView;

public final class CloudServiceRoleInstancesImpl implements CloudServiceRoleInstances {
    private static final ClientLogger LOGGER = new ClientLogger(CloudServiceRoleInstancesImpl.class);

    private final CloudServiceRoleInstancesClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public CloudServiceRoleInstancesImpl(CloudServiceRoleInstancesClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String roleInstanceName, String resourceGroupName, String cloudServiceName) {
        this.serviceClient().delete(roleInstanceName, resourceGroupName, cloudServiceName);
    }

    public void delete(String roleInstanceName, String resourceGroupName, String cloudServiceName, Context context) {
        this.serviceClient().delete(roleInstanceName, resourceGroupName, cloudServiceName, context);
    }

    public Response<RoleInstance> getWithResponse(String roleInstanceName, String resourceGroupName,
        String cloudServiceName, InstanceViewTypes expand, Context context) {
        Response<RoleInstanceInner> inner = this.serviceClient().getWithResponse(roleInstanceName, resourceGroupName,
            cloudServiceName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RoleInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleInstance get(String roleInstanceName, String resourceGroupName, String cloudServiceName) {
        RoleInstanceInner inner = this.serviceClient().get(roleInstanceName, resourceGroupName, cloudServiceName);
        if (inner != null) {
            return new RoleInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleInstanceView> getInstanceViewWithResponse(String roleInstanceName, String resourceGroupName,
        String cloudServiceName, Context context) {
        Response<RoleInstanceViewInner> inner = this.serviceClient().getInstanceViewWithResponse(roleInstanceName,
            resourceGroupName, cloudServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RoleInstanceViewImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RoleInstanceView getInstanceView(String roleInstanceName, String resourceGroupName,
        String cloudServiceName) {
        RoleInstanceViewInner inner
            = this.serviceClient().getInstanceView(roleInstanceName, resourceGroupName, cloudServiceName);
        if (inner != null) {
            return new RoleInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<RoleInstance> list(String resourceGroupName, String cloudServiceName) {
        PagedIterable<RoleInstanceInner> inner = this.serviceClient().list(resourceGroupName, cloudServiceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RoleInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleInstance> list(String resourceGroupName, String cloudServiceName, InstanceViewTypes expand,
        Context context) {
        PagedIterable<RoleInstanceInner> inner
            = this.serviceClient().list(resourceGroupName, cloudServiceName, expand, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new RoleInstanceImpl(inner1, this.manager()));
    }

    public void restart(String roleInstanceName, String resourceGroupName, String cloudServiceName) {
        this.serviceClient().restart(roleInstanceName, resourceGroupName, cloudServiceName);
    }

    public void restart(String roleInstanceName, String resourceGroupName, String cloudServiceName, Context context) {
        this.serviceClient().restart(roleInstanceName, resourceGroupName, cloudServiceName, context);
    }

    public void reimage(String roleInstanceName, String resourceGroupName, String cloudServiceName) {
        this.serviceClient().reimage(roleInstanceName, resourceGroupName, cloudServiceName);
    }

    public void reimage(String roleInstanceName, String resourceGroupName, String cloudServiceName, Context context) {
        this.serviceClient().reimage(roleInstanceName, resourceGroupName, cloudServiceName, context);
    }

    public void rebuild(String roleInstanceName, String resourceGroupName, String cloudServiceName) {
        this.serviceClient().rebuild(roleInstanceName, resourceGroupName, cloudServiceName);
    }

    public void rebuild(String roleInstanceName, String resourceGroupName, String cloudServiceName, Context context) {
        this.serviceClient().rebuild(roleInstanceName, resourceGroupName, cloudServiceName, context);
    }

    public Response<BinaryData> getRemoteDesktopFileWithResponse(String roleInstanceName, String resourceGroupName,
        String cloudServiceName, Context context) {
        return this.serviceClient().getRemoteDesktopFileWithResponse(roleInstanceName, resourceGroupName,
            cloudServiceName, context);
    }

    public BinaryData getRemoteDesktopFile(String roleInstanceName, String resourceGroupName, String cloudServiceName) {
        return this.serviceClient().getRemoteDesktopFile(roleInstanceName, resourceGroupName, cloudServiceName);
    }

    private CloudServiceRoleInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
