// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.contentsafety.implementation;

import com.azure.ai.contentsafety.ContentSafetyServiceVersion;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the ContentSafetyClient type.
 */
public final class ContentSafetyClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ContentSafetyClientService service;

    /**
     * Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     */
    private final String endpoint;

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final ContentSafetyServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public ContentSafetyServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of ContentSafetyClient client.
     * 
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     * @param serviceVersion Service version.
     */
    public ContentSafetyClientImpl(String endpoint, ContentSafetyServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of ContentSafetyClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     * @param serviceVersion Service version.
     */
    public ContentSafetyClientImpl(HttpPipeline httpPipeline, String endpoint,
        ContentSafetyServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of ContentSafetyClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://&lt;resource-name&gt;.cognitiveservices.azure.com).
     * @param serviceVersion Service version.
     */
    public ContentSafetyClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        ContentSafetyServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service
            = RestProxy.create(ContentSafetyClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for ContentSafetyClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}/contentsafety")
    @ServiceInterface(name = "ContentSafetyClient")
    public interface ContentSafetyClientService {
        @Post("/text:analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> analyzeText(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData options, RequestOptions requestOptions, Context context);

        @Post("/text:analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> analyzeTextSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData options, RequestOptions requestOptions, Context context);

        @Post("/image:analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> analyzeImage(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData options, RequestOptions requestOptions, Context context);

        @Post("/image:analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> analyzeImageSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData options, RequestOptions requestOptions, Context context);
    }

    /**
     * Analyze Text
     * 
     * A synchronous API for the analysis of potentially harmful text content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     text: String (Required)
     *     categories (Optional): [
     *         String(Hate/SelfHarm/Sexual/Violence) (Optional)
     *     ]
     *     blocklistNames (Optional): [
     *         String (Optional)
     *     ]
     *     haltOnBlocklistHit: Boolean (Optional)
     *     outputType: String(FourSeverityLevels/EightSeverityLevels) (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     blocklistsMatch (Optional): [
     *          (Optional){
     *             blocklistName: String (Required)
     *             blocklistItemId: String (Required)
     *             blocklistItemText: String (Required)
     *         }
     *     ]
     *     categoriesAnalysis (Required): [
     *          (Required){
     *             category: String(Hate/SelfHarm/Sexual/Violence) (Required)
     *             severity: Integer (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param options The text analysis request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the text analysis response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> analyzeTextWithResponseAsync(BinaryData options, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.analyzeText(this.getEndpoint(),
            this.getServiceVersion().getVersion(), accept, options, requestOptions, context));
    }

    /**
     * Analyze Text
     * 
     * A synchronous API for the analysis of potentially harmful text content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     text: String (Required)
     *     categories (Optional): [
     *         String(Hate/SelfHarm/Sexual/Violence) (Optional)
     *     ]
     *     blocklistNames (Optional): [
     *         String (Optional)
     *     ]
     *     haltOnBlocklistHit: Boolean (Optional)
     *     outputType: String(FourSeverityLevels/EightSeverityLevels) (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     blocklistsMatch (Optional): [
     *          (Optional){
     *             blocklistName: String (Required)
     *             blocklistItemId: String (Required)
     *             blocklistItemText: String (Required)
     *         }
     *     ]
     *     categoriesAnalysis (Required): [
     *          (Required){
     *             category: String(Hate/SelfHarm/Sexual/Violence) (Required)
     *             severity: Integer (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param options The text analysis request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the text analysis response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> analyzeTextWithResponse(BinaryData options, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.analyzeTextSync(this.getEndpoint(), this.getServiceVersion().getVersion(), accept, options,
            requestOptions, Context.NONE);
    }

    /**
     * Analyze Image
     * 
     * A synchronous API for the analysis of potentially harmful image content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     image (Required): {
     *         content: byte[] (Optional)
     *         blobUrl: String (Optional)
     *     }
     *     categories (Optional): [
     *         String(Hate/SelfHarm/Sexual/Violence) (Optional)
     *     ]
     *     outputType: String(FourSeverityLevels) (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     categoriesAnalysis (Required): [
     *          (Required){
     *             category: String(Hate/SelfHarm/Sexual/Violence) (Required)
     *             severity: Integer (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param options The image analysis request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the image analysis response along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> analyzeImageWithResponseAsync(BinaryData options, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.analyzeImage(this.getEndpoint(),
            this.getServiceVersion().getVersion(), accept, options, requestOptions, context));
    }

    /**
     * Analyze Image
     * 
     * A synchronous API for the analysis of potentially harmful image content. Currently, it supports four categories:
     * Hate, SelfHarm, Sexual, and Violence.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     image (Required): {
     *         content: byte[] (Optional)
     *         blobUrl: String (Optional)
     *     }
     *     categories (Optional): [
     *         String(Hate/SelfHarm/Sexual/Violence) (Optional)
     *     ]
     *     outputType: String(FourSeverityLevels) (Optional)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     categoriesAnalysis (Required): [
     *          (Required){
     *             category: String(Hate/SelfHarm/Sexual/Violence) (Required)
     *             severity: Integer (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param options The image analysis request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the image analysis response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> analyzeImageWithResponse(BinaryData options, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.analyzeImageSync(this.getEndpoint(), this.getServiceVersion().getVersion(), accept, options,
            requestOptions, Context.NONE);
    }
}
