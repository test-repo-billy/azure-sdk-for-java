// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apicenter.fluent.MetadataSchemasClient;
import com.azure.resourcemanager.apicenter.fluent.models.MetadataSchemaInner;
import com.azure.resourcemanager.apicenter.models.MetadataSchema;
import com.azure.resourcemanager.apicenter.models.MetadataSchemas;
import com.azure.resourcemanager.apicenter.models.MetadataSchemasGetResponse;

public final class MetadataSchemasImpl implements MetadataSchemas {
    private static final ClientLogger LOGGER = new ClientLogger(MetadataSchemasImpl.class);

    private final MetadataSchemasClient innerClient;

    private final com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager;

    public MetadataSchemasImpl(MetadataSchemasClient innerClient,
        com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MetadataSchema> list(String resourceGroupName, String serviceName) {
        PagedIterable<MetadataSchemaInner> inner = this.serviceClient().list(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new MetadataSchemaImpl(inner1, this.manager()));
    }

    public PagedIterable<MetadataSchema> list(String resourceGroupName, String serviceName, String filter,
        Context context) {
        PagedIterable<MetadataSchemaInner> inner
            = this.serviceClient().list(resourceGroupName, serviceName, filter, context);
        return Utils.mapPage(inner, inner1 -> new MetadataSchemaImpl(inner1, this.manager()));
    }

    public Response<MetadataSchema> getWithResponse(String resourceGroupName, String serviceName,
        String metadataSchemaName, Context context) {
        MetadataSchemasGetResponse inner
            = this.serviceClient().getWithResponse(resourceGroupName, serviceName, metadataSchemaName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new MetadataSchemaImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MetadataSchema get(String resourceGroupName, String serviceName, String metadataSchemaName) {
        MetadataSchemaInner inner = this.serviceClient().get(resourceGroupName, serviceName, metadataSchemaName);
        if (inner != null) {
            return new MetadataSchemaImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String metadataSchemaName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, metadataSchemaName, context);
    }

    public void delete(String resourceGroupName, String serviceName, String metadataSchemaName) {
        this.serviceClient().delete(resourceGroupName, serviceName, metadataSchemaName);
    }

    public Response<Void> headWithResponse(String resourceGroupName, String serviceName, String metadataSchemaName,
        Context context) {
        return this.serviceClient().headWithResponse(resourceGroupName, serviceName, metadataSchemaName, context);
    }

    public void head(String resourceGroupName, String serviceName, String metadataSchemaName) {
        this.serviceClient().head(resourceGroupName, serviceName, metadataSchemaName);
    }

    public MetadataSchema getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String metadataSchemaName = Utils.getValueFromIdByName(id, "metadataSchemas");
        if (metadataSchemaName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'metadataSchemas'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, metadataSchemaName, Context.NONE).getValue();
    }

    public Response<MetadataSchema> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String metadataSchemaName = Utils.getValueFromIdByName(id, "metadataSchemas");
        if (metadataSchemaName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'metadataSchemas'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, metadataSchemaName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String metadataSchemaName = Utils.getValueFromIdByName(id, "metadataSchemas");
        if (metadataSchemaName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'metadataSchemas'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, serviceName, metadataSchemaName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String metadataSchemaName = Utils.getValueFromIdByName(id, "metadataSchemas");
        if (metadataSchemaName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'metadataSchemas'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, metadataSchemaName, context);
    }

    private MetadataSchemasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apicenter.ApiCenterManager manager() {
        return this.serviceManager;
    }

    public MetadataSchemaImpl define(String name) {
        return new MetadataSchemaImpl(name, this.manager());
    }
}
