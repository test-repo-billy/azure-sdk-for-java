// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableGremlinDatabasesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableGremlinDatabaseGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableGremlinDatabaseGetResult;
import com.azure.resourcemanager.cosmos.generated.models.RestorableGremlinDatabases;

public final class RestorableGremlinDatabasesImpl implements RestorableGremlinDatabases {
    private static final ClientLogger LOGGER = new ClientLogger(RestorableGremlinDatabasesImpl.class);

    private final RestorableGremlinDatabasesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public RestorableGremlinDatabasesImpl(RestorableGremlinDatabasesClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorableGremlinDatabaseGetResult> list(String location, String instanceId) {
        PagedIterable<RestorableGremlinDatabaseGetResultInner> inner = this.serviceClient().list(location, instanceId);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new RestorableGremlinDatabaseGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableGremlinDatabaseGetResult> list(String location, String instanceId, Context context) {
        PagedIterable<RestorableGremlinDatabaseGetResultInner> inner
            = this.serviceClient().list(location, instanceId, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new RestorableGremlinDatabaseGetResultImpl(inner1, this.manager()));
    }

    private RestorableGremlinDatabasesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
