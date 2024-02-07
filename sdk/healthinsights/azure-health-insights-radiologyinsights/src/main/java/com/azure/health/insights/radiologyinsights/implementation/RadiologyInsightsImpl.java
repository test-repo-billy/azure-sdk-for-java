// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.insights.radiologyinsights.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in RadiologyInsights.
 */
public final class RadiologyInsightsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final RadiologyInsightsService service;

    /**
     * The service client containing this operation class.
     */
    private final AzureHealthInsightsClientImpl client;

    /**
     * Initializes an instance of RadiologyInsightsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    RadiologyInsightsImpl(AzureHealthInsightsClientImpl client) {
        this.service
            = RestProxy.create(RadiologyInsightsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureHealthInsightsClientRadiologyInsights to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{endpoint}/healthinsights")
    @ServiceInterface(name = "AzureHealthInsightsC")
    public interface RadiologyInsightsService {
        @Get("/radiology-insights/jobs/{id}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> getJob(@HostParam("endpoint") String endpoint, @PathParam("id") String id,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/radiology-insights/jobs/{id}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> getJobSync(@HostParam("endpoint") String endpoint, @PathParam("id") String id,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);
    }

    /**
     * Get Radiology Insights job details
     * 
     * Gets the status and details of the Radiology Insights job.
     * 
     * @param id A sequence of textual characters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the status and details of the Radiology Insights job along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getJobWithResponseAsync(String id, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getJob(this.client.getEndpoint(), id, accept, requestOptions, context));
    }

    /**
     * Get Radiology Insights job details
     * 
     * Gets the status and details of the Radiology Insights job.
     * 
     * @param id A sequence of textual characters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the status and details of the Radiology Insights job along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getJobWithResponse(String id, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getJobSync(this.client.getEndpoint(), id, accept, requestOptions, Context.NONE);
    }
}
