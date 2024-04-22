// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicelinker.fluent.LinkersClient;
import com.azure.resourcemanager.servicelinker.fluent.models.LinkerResourceInner;
import com.azure.resourcemanager.servicelinker.fluent.models.SourceConfigurationResultInner;
import com.azure.resourcemanager.servicelinker.fluent.models.ValidateOperationResultInner;
import com.azure.resourcemanager.servicelinker.models.LinkerResource;
import com.azure.resourcemanager.servicelinker.models.Linkers;
import com.azure.resourcemanager.servicelinker.models.SourceConfigurationResult;
import com.azure.resourcemanager.servicelinker.models.ValidateOperationResult;

public final class LinkersImpl implements Linkers {
    private static final ClientLogger LOGGER = new ClientLogger(LinkersImpl.class);

    private final LinkersClient innerClient;

    private final com.azure.resourcemanager.servicelinker.ServiceLinkerManager serviceManager;

    public LinkersImpl(LinkersClient innerClient,
        com.azure.resourcemanager.servicelinker.ServiceLinkerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LinkerResource> list(String resourceUri) {
        PagedIterable<LinkerResourceInner> inner = this.serviceClient().list(resourceUri);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LinkerResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LinkerResource> list(String resourceUri, Context context) {
        PagedIterable<LinkerResourceInner> inner = this.serviceClient().list(resourceUri, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LinkerResourceImpl(inner1, this.manager()));
    }

    public Response<LinkerResource> getWithResponse(String resourceUri, String linkerName, Context context) {
        Response<LinkerResourceInner> inner = this.serviceClient().getWithResponse(resourceUri, linkerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LinkerResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LinkerResource get(String resourceUri, String linkerName) {
        LinkerResourceInner inner = this.serviceClient().get(resourceUri, linkerName);
        if (inner != null) {
            return new LinkerResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ValidateOperationResult validate(String resourceUri, String linkerName) {
        ValidateOperationResultInner inner = this.serviceClient().validate(resourceUri, linkerName);
        if (inner != null) {
            return new ValidateOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ValidateOperationResult validate(String resourceUri, String linkerName, Context context) {
        ValidateOperationResultInner inner = this.serviceClient().validate(resourceUri, linkerName, context);
        if (inner != null) {
            return new ValidateOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SourceConfigurationResult> listConfigurationsWithResponse(String resourceUri, String linkerName,
        Context context) {
        Response<SourceConfigurationResultInner> inner
            = this.serviceClient().listConfigurationsWithResponse(resourceUri, linkerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SourceConfigurationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SourceConfigurationResult listConfigurations(String resourceUri, String linkerName) {
        SourceConfigurationResultInner inner = this.serviceClient().listConfigurations(resourceUri, linkerName);
        if (inner != null) {
            return new SourceConfigurationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LinkerResource getById(String id) {
        String resourceUri = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.ServiceLinker/linkers/{linkerName}", "resourceUri");
        if (resourceUri == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceUri'.", id)));
        }
        String linkerName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.ServiceLinker/linkers/{linkerName}", "linkerName");
        if (linkerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'linkers'.", id)));
        }
        return this.getWithResponse(resourceUri, linkerName, Context.NONE).getValue();
    }

    public Response<LinkerResource> getByIdWithResponse(String id, Context context) {
        String resourceUri = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.ServiceLinker/linkers/{linkerName}", "resourceUri");
        if (resourceUri == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceUri'.", id)));
        }
        String linkerName = ResourceManagerUtils.getValueFromIdByParameterName(id,
            "/{resourceUri}/providers/Microsoft.ServiceLinker/linkers/{linkerName}", "linkerName");
        if (linkerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'linkers'.", id)));
        }
        return this.getWithResponse(resourceUri, linkerName, context);
    }

    private LinkersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager() {
        return this.serviceManager;
    }

    public LinkerResourceImpl define(String name) {
        return new LinkerResourceImpl(name, this.manager());
    }
}
