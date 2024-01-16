// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.CloudServicesUpdateDomainsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.UpdateDomainInner;
import com.azure.resourcemanager.compute.generated.models.CloudServicesUpdateDomains;
import com.azure.resourcemanager.compute.generated.models.UpdateDomain;

public final class CloudServicesUpdateDomainsImpl implements CloudServicesUpdateDomains {
    private static final ClientLogger LOGGER = new ClientLogger(CloudServicesUpdateDomainsImpl.class);

    private final CloudServicesUpdateDomainsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public CloudServicesUpdateDomainsImpl(CloudServicesUpdateDomainsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void walkUpdateDomain(String resourceGroupName, String cloudServiceName, int updateDomain) {
        this.serviceClient().walkUpdateDomain(resourceGroupName, cloudServiceName, updateDomain);
    }

    public void walkUpdateDomain(String resourceGroupName, String cloudServiceName, int updateDomain,
        UpdateDomainInner parameters, Context context) {
        this.serviceClient().walkUpdateDomain(resourceGroupName, cloudServiceName, updateDomain, parameters, context);
    }

    public Response<UpdateDomain> getUpdateDomainWithResponse(String resourceGroupName, String cloudServiceName,
        int updateDomain, Context context) {
        Response<UpdateDomainInner> inner = this.serviceClient().getUpdateDomainWithResponse(resourceGroupName,
            cloudServiceName, updateDomain, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new UpdateDomainImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UpdateDomain getUpdateDomain(String resourceGroupName, String cloudServiceName, int updateDomain) {
        UpdateDomainInner inner
            = this.serviceClient().getUpdateDomain(resourceGroupName, cloudServiceName, updateDomain);
        if (inner != null) {
            return new UpdateDomainImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<UpdateDomain> listUpdateDomains(String resourceGroupName, String cloudServiceName) {
        PagedIterable<UpdateDomainInner> inner
            = this.serviceClient().listUpdateDomains(resourceGroupName, cloudServiceName);
        return Utils.mapPage(inner, inner1 -> new UpdateDomainImpl(inner1, this.manager()));
    }

    public PagedIterable<UpdateDomain> listUpdateDomains(String resourceGroupName, String cloudServiceName,
        Context context) {
        PagedIterable<UpdateDomainInner> inner
            = this.serviceClient().listUpdateDomains(resourceGroupName, cloudServiceName, context);
        return Utils.mapPage(inner, inner1 -> new UpdateDomainImpl(inner1, this.manager()));
    }

    private CloudServicesUpdateDomainsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
