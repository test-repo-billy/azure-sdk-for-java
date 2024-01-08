// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.sql.generated.fluent.ElasticPoolDatabaseActivitiesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ElasticPoolDatabaseActivityInner;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolDatabaseActivityListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ElasticPoolDatabaseActivitiesClient.
 */
public final class ElasticPoolDatabaseActivitiesClientImpl implements ElasticPoolDatabaseActivitiesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ElasticPoolDatabaseActivitiesService service;

    /**
     * The service client containing this operation class.
     */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of ElasticPoolDatabaseActivitiesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ElasticPoolDatabaseActivitiesClientImpl(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ElasticPoolDatabaseActivitiesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientElasticPoolDatabaseActivities to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientE")
    public interface ElasticPoolDatabaseActivitiesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/elasticPools/{elasticPoolName}/elasticPoolDatabaseActivity")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ElasticPoolDatabaseActivityListResult>> listByElasticPool(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @PathParam("elasticPoolName") String elasticPoolName, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns activity on databases inside of an elastic pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list elastic pool database activity request along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ElasticPoolDatabaseActivityInner>>
        listByElasticPoolSinglePageAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (elasticPoolName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByElasticPool(this.client.getEndpoint(), apiVersion,
                this.client.getSubscriptionId(), resourceGroupName, serverName, elasticPoolName, accept, context))
            .<PagedResponse<ElasticPoolDatabaseActivityInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns activity on databases inside of an elastic pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list elastic pool database activity request along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ElasticPoolDatabaseActivityInner>> listByElasticPoolSinglePageAsync(
        String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (elasticPoolName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByElasticPool(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
                resourceGroupName, serverName, elasticPoolName, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), null, null));
    }

    /**
     * Returns activity on databases inside of an elastic pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list elastic pool database activity request as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ElasticPoolDatabaseActivityInner> listByElasticPoolAsync(String resourceGroupName,
        String serverName, String elasticPoolName) {
        return new PagedFlux<>(() -> listByElasticPoolSinglePageAsync(resourceGroupName, serverName, elasticPoolName));
    }

    /**
     * Returns activity on databases inside of an elastic pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list elastic pool database activity request as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ElasticPoolDatabaseActivityInner> listByElasticPoolAsync(String resourceGroupName,
        String serverName, String elasticPoolName, Context context) {
        return new PagedFlux<>(
            () -> listByElasticPoolSinglePageAsync(resourceGroupName, serverName, elasticPoolName, context));
    }

    /**
     * Returns activity on databases inside of an elastic pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list elastic pool database activity request as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ElasticPoolDatabaseActivityInner> listByElasticPool(String resourceGroupName,
        String serverName, String elasticPoolName) {
        return new PagedIterable<>(listByElasticPoolAsync(resourceGroupName, serverName, elasticPoolName));
    }

    /**
     * Returns activity on databases inside of an elastic pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list elastic pool database activity request as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ElasticPoolDatabaseActivityInner> listByElasticPool(String resourceGroupName,
        String serverName, String elasticPoolName, Context context) {
        return new PagedIterable<>(listByElasticPoolAsync(resourceGroupName, serverName, elasticPoolName, context));
    }
}
