// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Translator profanity markers.
 */
public final class ProfanityMarker extends ExpandableStringEnum<ProfanityMarker> {

    /**
     * Static value Asterisk for ProfanityMarker.
     */
    @Generated
    public static final ProfanityMarker ASTERISK = fromString("Asterisk");

    /**
     * Static value Tag for ProfanityMarker.
     */
    @Generated
    public static final ProfanityMarker TAG = fromString("Tag");

    /**
     * Creates a new instance of ProfanityMarker value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ProfanityMarker() {
    }

    /**
     * Creates or finds a ProfanityMarker from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProfanityMarker.
     */
    @Generated
    @JsonCreator
    public static ProfanityMarker fromString(String name) {
        return fromString(name, ProfanityMarker.class);
    }

    /**
     * Gets known ProfanityMarker values.
     *
     * @return known ProfanityMarker values.
     */
    @Generated
    public static Collection<ProfanityMarker> values() {
        return values(ProfanityMarker.class);
    }
}
