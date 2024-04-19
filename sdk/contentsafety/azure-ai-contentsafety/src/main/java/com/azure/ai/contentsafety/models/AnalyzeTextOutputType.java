// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of text analysis output.
 */
public final class AnalyzeTextOutputType extends ExpandableStringEnum<AnalyzeTextOutputType> {

    /**
     * Output severities in four levels, the value could be 0,2,4,6.
     */
    @Generated
    public static final AnalyzeTextOutputType FOUR_SEVERITY_LEVELS = fromString("FourSeverityLevels");

    /**
     * Output severities in eight levels, the value could be 0,1,2,3,4,5,6,7.
     */
    @Generated
    public static final AnalyzeTextOutputType EIGHT_SEVERITY_LEVELS = fromString("EightSeverityLevels");

    /**
     * Creates a new instance of AnalyzeTextOutputType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AnalyzeTextOutputType() {
    }

    /**
     * Creates or finds a AnalyzeTextOutputType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnalyzeTextOutputType.
     */
    @Generated
    public static AnalyzeTextOutputType fromString(String name) {
        return fromString(name, AnalyzeTextOutputType.class);
    }

    /**
     * Gets known AnalyzeTextOutputType values.
     *
     * @return known AnalyzeTextOutputType values.
     */
    @Generated
    public static Collection<AnalyzeTextOutputType> values() {
        return values(AnalyzeTextOutputType.class);
    }
}
