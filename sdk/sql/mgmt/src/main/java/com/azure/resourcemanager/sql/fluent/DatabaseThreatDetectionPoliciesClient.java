// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.SqlManagementClient;
import com.azure.resourcemanager.sql.fluent.inner.DatabaseSecurityAlertPolicyInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DatabaseThreatDetectionPolicies. */
public final class DatabaseThreatDetectionPoliciesClient {
    private final ClientLogger logger = new ClientLogger(DatabaseThreatDetectionPoliciesClient.class);

    /** The proxy service used to perform REST calls. */
    private final DatabaseThreatDetectionPoliciesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClient client;

    /**
     * Initializes an instance of DatabaseThreatDetectionPoliciesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DatabaseThreatDetectionPoliciesClient(SqlManagementClient client) {
        this.service =
            RestProxy
                .create(
                    DatabaseThreatDetectionPoliciesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientDatabaseThreatDetectionPolicies to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientD")
    private interface DatabaseThreatDetectionPoliciesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseSecurityAlertPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("securityAlertPolicyName") String securityAlertPolicyName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseSecurityAlertPolicyInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("securityAlertPolicyName") String securityAlertPolicyName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") DatabaseSecurityAlertPolicyInner parameters,
            Context context);
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatabaseSecurityAlertPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        final String securityAlertPolicyName = "default";
        final String apiVersion = "2014-04-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            securityAlertPolicyName,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatabaseSecurityAlertPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        final String securityAlertPolicyName = "default";
        final String apiVersion = "2014-04-01";
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                databaseName,
                securityAlertPolicyName,
                apiVersion,
                context);
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseSecurityAlertPolicyInner> getAsync(
        String resourceGroupName, String serverName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMap(
                (Response<DatabaseSecurityAlertPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseSecurityAlertPolicyInner> getAsync(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, context)
            .flatMap(
                (Response<DatabaseSecurityAlertPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseSecurityAlertPolicyInner get(String resourceGroupName, String serverName, String databaseName) {
        return getAsync(resourceGroupName, serverName, databaseName).block();
    }

    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's threat detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseSecurityAlertPolicyInner get(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        return getAsync(resourceGroupName, serverName, databaseName, context).block();
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param parameters Contains information about a database Threat Detection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatabaseSecurityAlertPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, DatabaseSecurityAlertPolicyInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String securityAlertPolicyName = "default";
        final String apiVersion = "2014-04-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            securityAlertPolicyName,
                            apiVersion,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param parameters Contains information about a database Threat Detection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatabaseSecurityAlertPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DatabaseSecurityAlertPolicyInner parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String securityAlertPolicyName = "default";
        final String apiVersion = "2014-04-01";
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                databaseName,
                securityAlertPolicyName,
                apiVersion,
                parameters,
                context);
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param parameters Contains information about a database Threat Detection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseSecurityAlertPolicyInner> createOrUpdateAsync(
        String resourceGroupName, String serverName, String databaseName, DatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters)
            .flatMap(
                (Response<DatabaseSecurityAlertPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param parameters Contains information about a database Threat Detection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseSecurityAlertPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DatabaseSecurityAlertPolicyInner parameters,
        Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters, context)
            .flatMap(
                (Response<DatabaseSecurityAlertPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param parameters Contains information about a database Threat Detection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName, String serverName, String databaseName, DatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters).block();
    }

    /**
     * Creates or updates a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @param parameters Contains information about a database Threat Detection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a database Threat Detection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseSecurityAlertPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DatabaseSecurityAlertPolicyInner parameters,
        Context context) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters, context).block();
    }
}
