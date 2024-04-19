// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Measurement of the amount of tokens used in this request and response.
 */
@Immutable
public final class EmbeddingsUsage {

    /*
     * Number of tokens sent in the original request.
     */
    @Generated
    @JsonProperty(value = "prompt_tokens")
    private final int promptTokens;

    /*
     * Total number of tokens transacted in this request/response.
     */
    @Generated
    @JsonProperty(value = "total_tokens")
    private final int totalTokens;

    /**
     * Creates an instance of EmbeddingsUsage class.
     *
     * @param promptTokens the promptTokens value to set.
     * @param totalTokens the totalTokens value to set.
     */
    @Generated
    @JsonCreator
    private EmbeddingsUsage(@JsonProperty(value = "prompt_tokens") int promptTokens,
        @JsonProperty(value = "total_tokens") int totalTokens) {
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }

    /**
     * Get the promptTokens property: Number of tokens sent in the original request.
     *
     * @return the promptTokens value.
     */
    @Generated
    public int getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * Get the totalTokens property: Total number of tokens transacted in this request/response.
     *
     * @return the totalTokens value.
     */
    @Generated
    public int getTotalTokens() {
        return this.totalTokens;
    }
}
