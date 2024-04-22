// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

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
import com.azure.resourcemanager.security.fluent.DiscoveredSecuritySolutionsClient;
import com.azure.resourcemanager.security.fluent.models.DiscoveredSecuritySolutionInner;
import com.azure.resourcemanager.security.models.DiscoveredSecuritySolutionList;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DiscoveredSecuritySolutionsClient.
 */
public final class DiscoveredSecuritySolutionsClientImpl implements DiscoveredSecuritySolutionsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DiscoveredSecuritySolutionsService service;

    /**
     * The service client containing this operation class.
     */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of DiscoveredSecuritySolutionsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DiscoveredSecuritySolutionsClientImpl(SecurityCenterImpl client) {
        this.service = RestProxy.create(DiscoveredSecuritySolutionsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterDiscoveredSecuritySolutions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterDiscov")
    public interface DiscoveredSecuritySolutionsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Security/discoveredSecuritySolutions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiscoveredSecuritySolutionList>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Security/locations/{ascLocation}/discoveredSecuritySolutions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiscoveredSecuritySolutionList>> listByHomeRegion(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("ascLocation") String ascLocation,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/locations/{ascLocation}/discoveredSecuritySolutions/{discoveredSecuritySolutionName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiscoveredSecuritySolutionInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ascLocation") String ascLocation,
            @PathParam("discoveredSecuritySolutionName") String discoveredSecuritySolutionName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiscoveredSecuritySolutionList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DiscoveredSecuritySolutionList>> listByHomeRegionNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DiscoveredSecuritySolutionInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion,
                accept, context))
            .<PagedResponse<DiscoveredSecuritySolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DiscoveredSecuritySolutionInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DiscoveredSecuritySolutionInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DiscoveredSecuritySolutionInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DiscoveredSecuritySolutionInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DiscoveredSecuritySolutionInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription and location along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DiscoveredSecuritySolutionInner>> listByHomeRegionSinglePageAsync(String ascLocation) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByHomeRegion(this.client.getEndpoint(), this.client.getSubscriptionId(),
                ascLocation, apiVersion, accept, context))
            .<PagedResponse<DiscoveredSecuritySolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription and location along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DiscoveredSecuritySolutionInner>> listByHomeRegionSinglePageAsync(String ascLocation,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByHomeRegion(this.client.getEndpoint(), this.client.getSubscriptionId(), ascLocation, apiVersion,
                accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription and location as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DiscoveredSecuritySolutionInner> listByHomeRegionAsync(String ascLocation) {
        return new PagedFlux<>(() -> listByHomeRegionSinglePageAsync(ascLocation),
            nextLink -> listByHomeRegionNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription and location as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DiscoveredSecuritySolutionInner> listByHomeRegionAsync(String ascLocation, Context context) {
        return new PagedFlux<>(() -> listByHomeRegionSinglePageAsync(ascLocation, context),
            nextLink -> listByHomeRegionNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription and location as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DiscoveredSecuritySolutionInner> listByHomeRegion(String ascLocation) {
        return new PagedIterable<>(listByHomeRegionAsync(ascLocation));
    }

    /**
     * Gets a list of discovered Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription and location as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DiscoveredSecuritySolutionInner> listByHomeRegion(String ascLocation, Context context) {
        return new PagedIterable<>(listByHomeRegionAsync(ascLocation, context));
    }

    /**
     * Gets a specific discovered Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param discoveredSecuritySolutionName Name of a discovered security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific discovered Security Solution along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiscoveredSecuritySolutionInner>> getWithResponseAsync(String resourceGroupName,
        String ascLocation, String discoveredSecuritySolutionName) {
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
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        if (discoveredSecuritySolutionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter discoveredSecuritySolutionName is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, ascLocation, discoveredSecuritySolutionName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a specific discovered Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param discoveredSecuritySolutionName Name of a discovered security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific discovered Security Solution along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DiscoveredSecuritySolutionInner>> getWithResponseAsync(String resourceGroupName,
        String ascLocation, String discoveredSecuritySolutionName, Context context) {
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
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        if (discoveredSecuritySolutionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter discoveredSecuritySolutionName is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, ascLocation,
            discoveredSecuritySolutionName, apiVersion, accept, context);
    }

    /**
     * Gets a specific discovered Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param discoveredSecuritySolutionName Name of a discovered security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific discovered Security Solution on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DiscoveredSecuritySolutionInner> getAsync(String resourceGroupName, String ascLocation,
        String discoveredSecuritySolutionName) {
        return getWithResponseAsync(resourceGroupName, ascLocation, discoveredSecuritySolutionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a specific discovered Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param discoveredSecuritySolutionName Name of a discovered security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific discovered Security Solution along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DiscoveredSecuritySolutionInner> getWithResponse(String resourceGroupName, String ascLocation,
        String discoveredSecuritySolutionName, Context context) {
        return getWithResponseAsync(resourceGroupName, ascLocation, discoveredSecuritySolutionName, context).block();
    }

    /**
     * Gets a specific discovered Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param discoveredSecuritySolutionName Name of a discovered security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific discovered Security Solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DiscoveredSecuritySolutionInner get(String resourceGroupName, String ascLocation,
        String discoveredSecuritySolutionName) {
        return getWithResponse(resourceGroupName, ascLocation, discoveredSecuritySolutionName, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DiscoveredSecuritySolutionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DiscoveredSecuritySolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DiscoveredSecuritySolutionInner>> listNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DiscoveredSecuritySolutionInner>> listByHomeRegionNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByHomeRegionNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DiscoveredSecuritySolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DiscoveredSecuritySolutionInner>> listByHomeRegionNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByHomeRegionNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
