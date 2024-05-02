// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.implementation;

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
import com.azure.resourcemanager.agrifood.fluent.SolutionsDiscoverabilitiesClient;
import com.azure.resourcemanager.agrifood.fluent.models.DataManagerForAgricultureSolutionInner;
import com.azure.resourcemanager.agrifood.models.DataManagerForAgricultureSolutionListResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in SolutionsDiscoverabilitiesClient.
 */
public final class SolutionsDiscoverabilitiesClientImpl implements SolutionsDiscoverabilitiesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SolutionsDiscoverabilitiesService service;

    /**
     * The service client containing this operation class.
     */
    private final AgriFoodManagementClientImpl client;

    /**
     * Initializes an instance of SolutionsDiscoverabilitiesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SolutionsDiscoverabilitiesClientImpl(AgriFoodManagementClientImpl client) {
        this.service = RestProxy.create(SolutionsDiscoverabilitiesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AgriFoodManagementClientSolutionsDiscoverabilities to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AgriFoodManagementCl")
    public interface SolutionsDiscoverabilitiesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.AgFoodPlatform/farmBeatsSolutionDefinitions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataManagerForAgricultureSolutionListResponse>> list(@HostParam("$host") String endpoint,
            @QueryParam(value = "farmBeatsSolutionIds", multipleQueryParams = true) List<String> farmBeatsSolutionIds,
            @QueryParam(
                value = "farmBeatsSolutionNames",
                multipleQueryParams = true) List<String> farmBeatsSolutionNames,
            @QueryParam("$maxPageSize") Integer maxPageSize, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/providers/Microsoft.AgFoodPlatform/farmBeatsSolutionDefinitions/{dataManagerForAgricultureSolutionId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataManagerForAgricultureSolutionInner>> get(@HostParam("$host") String endpoint,
            @PathParam("dataManagerForAgricultureSolutionId") String dataManagerForAgricultureSolutionId,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataManagerForAgricultureSolutionListResponse>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get list of Data Manager For Agriculture solutions.
     * 
     * @param farmBeatsSolutionIds Ids of Data Manager For Agriculture Solutions which the customer requests to fetch.
     * @param farmBeatsSolutionNames Names of Data Manager For Agriculture Solutions which the customer requests to
     * fetch.
     * @param maxPageSize Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Data Manager For Agriculture solutions along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataManagerForAgricultureSolutionInner>> listSinglePageAsync(
        List<String> farmBeatsSolutionIds, List<String> farmBeatsSolutionNames, Integer maxPageSize) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        List<String> farmBeatsSolutionIdsConverted = (farmBeatsSolutionIds == null)
            ? new ArrayList<>()
            : farmBeatsSolutionIds.stream().map(item -> Objects.toString(item, "")).collect(Collectors.toList());
        List<String> farmBeatsSolutionNamesConverted = (farmBeatsSolutionNames == null)
            ? new ArrayList<>()
            : farmBeatsSolutionNames.stream().map(item -> Objects.toString(item, "")).collect(Collectors.toList());
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), farmBeatsSolutionIdsConverted,
                farmBeatsSolutionNamesConverted, maxPageSize, this.client.getApiVersion(), accept, context))
            .<PagedResponse<DataManagerForAgricultureSolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get list of Data Manager For Agriculture solutions.
     * 
     * @param farmBeatsSolutionIds Ids of Data Manager For Agriculture Solutions which the customer requests to fetch.
     * @param farmBeatsSolutionNames Names of Data Manager For Agriculture Solutions which the customer requests to
     * fetch.
     * @param maxPageSize Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Data Manager For Agriculture solutions along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataManagerForAgricultureSolutionInner>> listSinglePageAsync(
        List<String> farmBeatsSolutionIds, List<String> farmBeatsSolutionNames, Integer maxPageSize, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        List<String> farmBeatsSolutionIdsConverted = (farmBeatsSolutionIds == null)
            ? new ArrayList<>()
            : farmBeatsSolutionIds.stream().map(item -> Objects.toString(item, "")).collect(Collectors.toList());
        List<String> farmBeatsSolutionNamesConverted = (farmBeatsSolutionNames == null)
            ? new ArrayList<>()
            : farmBeatsSolutionNames.stream().map(item -> Objects.toString(item, "")).collect(Collectors.toList());
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), farmBeatsSolutionIdsConverted, farmBeatsSolutionNamesConverted,
                maxPageSize, this.client.getApiVersion(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Get list of Data Manager For Agriculture solutions.
     * 
     * @param farmBeatsSolutionIds Ids of Data Manager For Agriculture Solutions which the customer requests to fetch.
     * @param farmBeatsSolutionNames Names of Data Manager For Agriculture Solutions which the customer requests to
     * fetch.
     * @param maxPageSize Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Data Manager For Agriculture solutions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataManagerForAgricultureSolutionInner> listAsync(List<String> farmBeatsSolutionIds,
        List<String> farmBeatsSolutionNames, Integer maxPageSize) {
        return new PagedFlux<>(() -> listSinglePageAsync(farmBeatsSolutionIds, farmBeatsSolutionNames, maxPageSize),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get list of Data Manager For Agriculture solutions.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Data Manager For Agriculture solutions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataManagerForAgricultureSolutionInner> listAsync() {
        final List<String> farmBeatsSolutionIds = null;
        final List<String> farmBeatsSolutionNames = null;
        final Integer maxPageSize = null;
        return new PagedFlux<>(() -> listSinglePageAsync(farmBeatsSolutionIds, farmBeatsSolutionNames, maxPageSize),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get list of Data Manager For Agriculture solutions.
     * 
     * @param farmBeatsSolutionIds Ids of Data Manager For Agriculture Solutions which the customer requests to fetch.
     * @param farmBeatsSolutionNames Names of Data Manager For Agriculture Solutions which the customer requests to
     * fetch.
     * @param maxPageSize Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Data Manager For Agriculture solutions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataManagerForAgricultureSolutionInner> listAsync(List<String> farmBeatsSolutionIds,
        List<String> farmBeatsSolutionNames, Integer maxPageSize, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(farmBeatsSolutionIds, farmBeatsSolutionNames, maxPageSize, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get list of Data Manager For Agriculture solutions.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Data Manager For Agriculture solutions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataManagerForAgricultureSolutionInner> list() {
        final List<String> farmBeatsSolutionIds = null;
        final List<String> farmBeatsSolutionNames = null;
        final Integer maxPageSize = null;
        return new PagedIterable<>(listAsync(farmBeatsSolutionIds, farmBeatsSolutionNames, maxPageSize));
    }

    /**
     * Get list of Data Manager For Agriculture solutions.
     * 
     * @param farmBeatsSolutionIds Ids of Data Manager For Agriculture Solutions which the customer requests to fetch.
     * @param farmBeatsSolutionNames Names of Data Manager For Agriculture Solutions which the customer requests to
     * fetch.
     * @param maxPageSize Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Data Manager For Agriculture solutions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataManagerForAgricultureSolutionInner> list(List<String> farmBeatsSolutionIds,
        List<String> farmBeatsSolutionNames, Integer maxPageSize, Context context) {
        return new PagedIterable<>(listAsync(farmBeatsSolutionIds, farmBeatsSolutionNames, maxPageSize, context));
    }

    /**
     * Get Data Manager For Agriculture solution by id.
     * 
     * @param dataManagerForAgricultureSolutionId dataManagerForAgricultureSolutionId to be queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Manager For Agriculture solution by id along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataManagerForAgricultureSolutionInner>>
        getWithResponseAsync(String dataManagerForAgricultureSolutionId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (dataManagerForAgricultureSolutionId == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter dataManagerForAgricultureSolutionId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), dataManagerForAgricultureSolutionId,
                this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get Data Manager For Agriculture solution by id.
     * 
     * @param dataManagerForAgricultureSolutionId dataManagerForAgricultureSolutionId to be queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Manager For Agriculture solution by id along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataManagerForAgricultureSolutionInner>>
        getWithResponseAsync(String dataManagerForAgricultureSolutionId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (dataManagerForAgricultureSolutionId == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter dataManagerForAgricultureSolutionId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), dataManagerForAgricultureSolutionId, this.client.getApiVersion(),
            accept, context);
    }

    /**
     * Get Data Manager For Agriculture solution by id.
     * 
     * @param dataManagerForAgricultureSolutionId dataManagerForAgricultureSolutionId to be queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Manager For Agriculture solution by id on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DataManagerForAgricultureSolutionInner> getAsync(String dataManagerForAgricultureSolutionId) {
        return getWithResponseAsync(dataManagerForAgricultureSolutionId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Data Manager For Agriculture solution by id.
     * 
     * @param dataManagerForAgricultureSolutionId dataManagerForAgricultureSolutionId to be queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Manager For Agriculture solution by id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataManagerForAgricultureSolutionInner> getWithResponse(String dataManagerForAgricultureSolutionId,
        Context context) {
        return getWithResponseAsync(dataManagerForAgricultureSolutionId, context).block();
    }

    /**
     * Get Data Manager For Agriculture solution by id.
     * 
     * @param dataManagerForAgricultureSolutionId dataManagerForAgricultureSolutionId to be queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Manager For Agriculture solution by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataManagerForAgricultureSolutionInner get(String dataManagerForAgricultureSolutionId) {
        return getWithResponse(dataManagerForAgricultureSolutionId, Context.NONE).getValue();
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
     * @return paged response contains list of requested objects and a URL link to get the next set of results along
     * with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataManagerForAgricultureSolutionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DataManagerForAgricultureSolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
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
     * @return paged response contains list of requested objects and a URL link to get the next set of results along
     * with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataManagerForAgricultureSolutionInner>> listNextSinglePageAsync(String nextLink,
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
}
