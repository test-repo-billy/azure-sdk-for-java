// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.openai;

import com.azure.ai.openai.implementation.CompletionsUtils;
import com.azure.ai.openai.implementation.OpenAIClientImpl;
import com.azure.ai.openai.implementation.OpenAIServerSentEvents;
import com.azure.ai.openai.models.ChatCompletions;
import com.azure.ai.openai.models.ChatCompletionsOptions;
import com.azure.ai.openai.models.Completions;
import com.azure.ai.openai.models.CompletionsOptions;
import com.azure.ai.openai.models.Embeddings;
import com.azure.ai.openai.models.EmbeddingsOptions;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous OpenAIClient type. */
@ServiceClient(builder = OpenAIClientBuilder.class, isAsync = true)
public final class OpenAIAsyncClient {

    @Generated private final OpenAIClientImpl serviceClient;

    /**
     * Initializes an instance of OpenAIAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    OpenAIAsyncClient(OpenAIClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Return the embeddings for a given prompt.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     user: String (Optional)
     *     model: String (Optional)
     *     input (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     data (Required): [
     *          (Required){
     *             embedding (Required): [
     *                 double (Required)
     *             ]
     *             index: int (Required)
     *         }
     *     ]
     *     usage (Required): {
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param embeddingsOptions The configuration information for an embeddings request. Embeddings measure the
     *     relatedness of text strings and are commonly used for search, clustering, recommendations, and other similar
     *     scenarios.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return representation of the response data from an embeddings request. Embeddings measure the relatedness of
     *     text strings and are commonly used for search, clustering, recommendations, and other similar scenarios along
     *     with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getEmbeddingsWithResponse(
            String deploymentId, BinaryData embeddingsOptions, RequestOptions requestOptions) {
        return this.serviceClient.getEmbeddingsWithResponseAsync(deploymentId, embeddingsOptions, requestOptions);
    }

    /**
     * Gets completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     * that continues from or "completes" provided prompt data.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     prompt (Required): [
     *         String (Required)
     *     ]
     *     max_tokens: Integer (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     logit_bias (Optional): {
     *         String: int (Optional)
     *     }
     *     user: String (Optional)
     *     n: Integer (Optional)
     *     logprobs: Integer (Optional)
     *     echo: Boolean (Optional)
     *     stop (Optional): [
     *         String (Optional)
     *     ]
     *     presence_penalty: Double (Optional)
     *     frequency_penalty: Double (Optional)
     *     best_of: Integer (Optional)
     *     stream: Boolean (Optional)
     *     model: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     created: int (Required)
     *     choices (Required): [
     *          (Required){
     *             text: String (Required)
     *             index: int (Required)
     *             logprobs (Required): {
     *                 tokens (Required): [
     *                     String (Required)
     *                 ]
     *                 token_logprobs (Required): [
     *                     double (Required)
     *                 ]
     *                 top_logprobs (Required): [
     *                      (Required){
     *                         String: double (Required)
     *                     }
     *                 ]
     *                 text_offset (Required): [
     *                     int (Required)
     *                 ]
     *             }
     *             finish_reason: String(stopped/tokenLimitReached/contentFiltered) (Required)
     *         }
     *     ]
     *     usage (Required): {
     *         completion_tokens: int (Required)
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param completionsOptions The configuration information for a completions request. Completions support a wide
     *     variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     *     that continues from or "completes" provided prompt data along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getCompletionsWithResponse(
            String deploymentId, BinaryData completionsOptions, RequestOptions requestOptions) {
        return this.serviceClient.getCompletionsWithResponseAsync(deploymentId, completionsOptions, requestOptions);
    }

    /**
     * Gets chat completions for the provided chat messages. Completions support a wide variety of tasks and generate
     * text that continues from or "completes" provided prompt data.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     messages (Required): [
     *          (Required){
     *             role: String(system/assistant/user) (Required)
     *             content: String (Optional)
     *         }
     *     ]
     *     max_tokens: Integer (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     logit_bias (Optional): {
     *         String: int (Optional)
     *     }
     *     user: String (Optional)
     *     n: Integer (Optional)
     *     stop (Optional): [
     *         String (Optional)
     *     ]
     *     presence_penalty: Double (Optional)
     *     frequency_penalty: Double (Optional)
     *     stream: Boolean (Optional)
     *     model: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     created: int (Required)
     *     choices (Required): [
     *          (Required){
     *             message (Optional): {
     *                 role: String(system/assistant/user) (Required)
     *                 content: String (Optional)
     *             }
     *             index: int (Required)
     *             finish_reason: String(stopped/tokenLimitReached/contentFiltered) (Required)
     *             delta (Optional): {
     *                 role: String(system/assistant/user) (Optional)
     *                 content: String (Optional)
     *             }
     *         }
     *     ]
     *     usage (Required): {
     *         completion_tokens: int (Required)
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param chatCompletionsOptions The configuration information for a chat completions request. Completions support a
     *     wide variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return chat completions for the provided chat messages. Completions support a wide variety of tasks and generate
     *     text that continues from or "completes" provided prompt data along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getChatCompletionsWithResponse(
            String deploymentId, BinaryData chatCompletionsOptions, RequestOptions requestOptions) {
        return this.serviceClient.getChatCompletionsWithResponseAsync(
                deploymentId, chatCompletionsOptions, requestOptions);
    }

    /**
     * Return the embeddings for a given prompt.
     *
     * @param deploymentId deployment id of the deployed model.
     * @param embeddingsOptions The configuration information for an embeddings request. Embeddings measure the
     *     relatedness of text strings and are commonly used for search, clustering, recommendations, and other similar
     *     scenarios.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return representation of the response data from an embeddings request. Embeddings measure the relatedness of
     *     text strings and are commonly used for search, clustering, recommendations, and other similar scenarios on
     *     successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Embeddings> getEmbeddings(String deploymentId, EmbeddingsOptions embeddingsOptions) {
        // Generated convenience method for getEmbeddingsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getEmbeddingsWithResponse(deploymentId, BinaryData.fromObject(embeddingsOptions), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(Embeddings.class));
    }

    /**
     * Gets completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     * that continues from or "completes" provided prompt data.
     *
     * @param deploymentId deployment id of the deployed model.
     * @param completionsOptions The configuration information for a completions request. Completions support a wide
     *     variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     *     that continues from or "completes" provided prompt data on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Completions> getCompletions(String deploymentId, CompletionsOptions completionsOptions) {
        // Generated convenience method for getCompletionsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getCompletionsWithResponse(deploymentId, BinaryData.fromObject(completionsOptions), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(Completions.class));
    }

    /**
     * Gets completions for the provided input prompt. Completions support a wide variety of tasks and generate text
     * that continues from or "completes" provided prompt data.
     *
     * @param deploymentId deployment id of the deployed model.
     * @param prompt The prompt to generate completion text from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     *     that continues from or "completes" provided prompt data on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Completions> getCompletions(String deploymentId, String prompt) {
        return getCompletions(deploymentId, CompletionsUtils.defaultCompletionsOptions(prompt));
    }

    /**
     * Gets completions as a stream for the provided input prompts. Completions support a wide variety of tasks and
     * generate text that continues from or "completes" provided prompt data.
     *
     * @param deploymentId deployment id of the deployed model.
     * @param completionsOptions The configuration information for a completions request. Completions support a wide
     *     variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a {@link Flux} of completions for the provided input prompts. Completions support a wide variety of tasks
     *     and generate text that continues from or "completes" provided prompt data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Flux<Completions> getCompletionsStream(String deploymentId, CompletionsOptions completionsOptions) {
        completionsOptions.setStream(true);
        RequestOptions requestOptions = new RequestOptions();
        BinaryData requestBody = BinaryData.fromObject(completionsOptions);
        Flux<ByteBuffer> responseStream =
                getCompletionsWithResponse(deploymentId, requestBody, requestOptions)
                        .flatMapMany(response -> response.getValue().toFluxByteBuffer());
        OpenAIServerSentEvents<Completions> completionsStream =
                new OpenAIServerSentEvents<>(responseStream, Completions.class);
        return completionsStream.getEvents();
    }

    /**
     * Gets chat completions for the provided chat messages. Completions support a wide variety of tasks and generate
     * text that continues from or "completes" provided prompt data.
     *
     * @param deploymentId deployment id of the deployed model.
     * @param chatCompletionsOptions The configuration information for a chat completions request. Completions support a
     *     wide variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return chat completions for the provided chat messages. Completions support a wide variety of tasks and generate
     *     text that continues from or "completes" provided prompt data on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ChatCompletions> getChatCompletions(
            String deploymentId, ChatCompletionsOptions chatCompletionsOptions) {
        // Generated convenience method for getChatCompletionsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getChatCompletionsWithResponse(
                        deploymentId, BinaryData.fromObject(chatCompletionsOptions), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(ChatCompletions.class));
    }

    /**
     * Gets chat completions for the provided chat messages. Chat completions support a wide variety of tasks and
     * generate text that continues from or "completes" provided prompt data.
     *
     * @param deploymentId deployment id of the deployed model.
     * @param chatCompletionsOptions The configuration information for a chat completions request. Completions support a
     *     wide variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return chat completions stream for the provided chat messages. Completions support a wide variety of tasks and
     *     generate text that continues from or "completes" provided prompt data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Flux<ChatCompletions> getChatCompletionsStream(
            String deploymentId, ChatCompletionsOptions chatCompletionsOptions) {
        chatCompletionsOptions.setStream(true);
        RequestOptions requestOptions = new RequestOptions();
        Flux<ByteBuffer> responseStream =
                getChatCompletionsWithResponse(
                                deploymentId, BinaryData.fromObject(chatCompletionsOptions), requestOptions)
                        .flatMapMany(response -> response.getValue().toFluxByteBuffer());
        OpenAIServerSentEvents<ChatCompletions> chatCompletionsStream =
                new OpenAIServerSentEvents<>(responseStream, ChatCompletions.class);
        return chatCompletionsStream.getEvents();
    }
}
