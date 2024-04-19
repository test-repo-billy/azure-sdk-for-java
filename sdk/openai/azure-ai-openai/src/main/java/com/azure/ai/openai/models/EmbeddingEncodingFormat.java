// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Represents the available formats for embeddings data on responses.
 */
class EmbeddingEncodingFormat extends ExpandableStringEnum<EmbeddingEncodingFormat> {

    /**
     * Specifies that responses should provide arrays of floats for each embedding.
     */
    @Generated
    public static final EmbeddingEncodingFormat FLOAT = fromString("float");

    /**
     * Specifies that responses should provide a base64-encoded string for each embedding.
     */
    @Generated
    public static final EmbeddingEncodingFormat BASE64 = fromString("base64");

    /**
     * Creates a new instance of EmbeddingEncodingFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    EmbeddingEncodingFormat() {
    }

    /**
     * Creates or finds a EmbeddingEncodingFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EmbeddingEncodingFormat.
     */
    @Generated
    @JsonCreator
    public static EmbeddingEncodingFormat fromString(String name) {
        return fromString(name, EmbeddingEncodingFormat.class);
    }

    /**
     * Gets known EmbeddingEncodingFormat values.
     *
     * @return known EmbeddingEncodingFormat values.
     */
    @Generated
    public static Collection<EmbeddingEncodingFormat> values() {
        return values(EmbeddingEncodingFormat.class);
    }
}
