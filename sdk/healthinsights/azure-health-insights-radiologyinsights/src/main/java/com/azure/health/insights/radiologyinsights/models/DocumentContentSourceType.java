// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of the content's source.
 * In case the source type is 'inline', the content is given as a string (for instance, text).
 * In case the source type is 'reference', the content is given as a URI.
 */
public final class DocumentContentSourceType extends ExpandableStringEnum<DocumentContentSourceType> {
    /**
     * The content is given as a string (for instance, text).
     */
    @Generated
    public static final DocumentContentSourceType INLINE = fromString("inline");

    /**
     * The content is given as a URI.
     */
    @Generated
    public static final DocumentContentSourceType REFERENCE = fromString("reference");

    /**
     * Creates a new instance of DocumentContentSourceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DocumentContentSourceType() {
    }

    /**
     * Creates or finds a DocumentContentSourceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DocumentContentSourceType.
     */
    @Generated
    @JsonCreator
    public static DocumentContentSourceType fromString(String name) {
        return fromString(name, DocumentContentSourceType.class);
    }

    /**
     * Gets known DocumentContentSourceType values.
     * 
     * @return known DocumentContentSourceType values.
     */
    @Generated
    public static Collection<DocumentContentSourceType> values() {
        return values(DocumentContentSourceType.class);
    }
}
