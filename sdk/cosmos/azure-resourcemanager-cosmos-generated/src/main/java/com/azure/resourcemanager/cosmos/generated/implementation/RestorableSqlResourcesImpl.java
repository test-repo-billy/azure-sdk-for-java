// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableSqlResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableSqlResourcesGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlResources;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlResourcesGetResult;

public final class RestorableSqlResourcesImpl implements RestorableSqlResources {
    private static final ClientLogger LOGGER = new ClientLogger(RestorableSqlResourcesImpl.class);

    private final RestorableSqlResourcesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public RestorableSqlResourcesImpl(RestorableSqlResourcesClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorableSqlResourcesGetResult> list(String location, String instanceId) {
        PagedIterable<RestorableSqlResourcesGetResultInner> inner = this.serviceClient().list(location, instanceId);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new RestorableSqlResourcesGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableSqlResourcesGetResult> list(String location, String instanceId,
        String restoreLocation, String restoreTimestampInUtc, Context context) {
        PagedIterable<RestorableSqlResourcesGetResultInner> inner
            = this.serviceClient().list(location, instanceId, restoreLocation, restoreTimestampInUtc, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new RestorableSqlResourcesGetResultImpl(inner1, this.manager()));
    }

    private RestorableSqlResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
