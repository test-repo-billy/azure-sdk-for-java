// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for LogRanking.
 */
public final class LogRanking extends ExpandableStringEnum<LogRanking> {
    /**
     * Static value url for LogRanking.
     */
    public static final LogRanking URL = fromString("url");

    /**
     * Static value referrer for LogRanking.
     */
    public static final LogRanking REFERRER = fromString("referrer");

    /**
     * Static value browser for LogRanking.
     */
    public static final LogRanking BROWSER = fromString("browser");

    /**
     * Static value userAgent for LogRanking.
     */
    public static final LogRanking USER_AGENT = fromString("userAgent");

    /**
     * Static value countryOrRegion for LogRanking.
     */
    public static final LogRanking COUNTRY_OR_REGION = fromString("countryOrRegion");

    /**
     * Creates a new instance of LogRanking value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LogRanking() {
    }

    /**
     * Creates or finds a LogRanking from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LogRanking.
     */
    @JsonCreator
    public static LogRanking fromString(String name) {
        return fromString(name, LogRanking.class);
    }

    /**
     * Gets known LogRanking values.
     * 
     * @return known LogRanking values.
     */
    public static Collection<LogRanking> values() {
        return values(LogRanking.class);
    }
}
