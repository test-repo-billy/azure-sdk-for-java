// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.DatabaseRecommendedActionsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.RecommendedActionInner;
import com.azure.resourcemanager.sql.generated.models.DatabaseRecommendedActions;
import com.azure.resourcemanager.sql.generated.models.RecommendedAction;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class DatabaseRecommendedActionsImpl implements DatabaseRecommendedActions {
    private static final ClientLogger LOGGER = new ClientLogger(DatabaseRecommendedActionsImpl.class);

    private final DatabaseRecommendedActionsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public DatabaseRecommendedActionsImpl(DatabaseRecommendedActionsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<List<RecommendedAction>> listByDatabaseAdvisorWithResponse(String resourceGroupName,
        String serverName, String databaseName, String advisorName, Context context) {
        Response<List<RecommendedActionInner>> inner = this.serviceClient()
            .listByDatabaseAdvisorWithResponse(resourceGroupName, serverName, databaseName, advisorName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                inner.getValue().stream().map(inner1 -> new RecommendedActionImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<RecommendedAction> listByDatabaseAdvisor(String resourceGroupName, String serverName,
        String databaseName, String advisorName) {
        List<RecommendedActionInner> inner
            = this.serviceClient().listByDatabaseAdvisor(resourceGroupName, serverName, databaseName, advisorName);
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new RecommendedActionImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<RecommendedAction> getWithResponse(String resourceGroupName, String serverName, String databaseName,
        String advisorName, String recommendedActionName, Context context) {
        Response<RecommendedActionInner> inner = this.serviceClient().getWithResponse(resourceGroupName, serverName,
            databaseName, advisorName, recommendedActionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RecommendedActionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RecommendedAction get(String resourceGroupName, String serverName, String databaseName, String advisorName,
        String recommendedActionName) {
        RecommendedActionInner inner
            = this.serviceClient().get(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName);
        if (inner != null) {
            return new RecommendedActionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecommendedAction> updateWithResponse(String resourceGroupName, String serverName,
        String databaseName, String advisorName, String recommendedActionName, RecommendedActionInner parameters,
        Context context) {
        Response<RecommendedActionInner> inner = this.serviceClient().updateWithResponse(resourceGroupName, serverName,
            databaseName, advisorName, recommendedActionName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RecommendedActionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RecommendedAction update(String resourceGroupName, String serverName, String databaseName,
        String advisorName, String recommendedActionName, RecommendedActionInner parameters) {
        RecommendedActionInner inner = this.serviceClient().update(resourceGroupName, serverName, databaseName,
            advisorName, recommendedActionName, parameters);
        if (inner != null) {
            return new RecommendedActionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private DatabaseRecommendedActionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
