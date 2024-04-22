// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Caching behavior for the requests.
 */
public final class QueryStringBehavior extends ExpandableStringEnum<QueryStringBehavior> {
    /**
     * Static value Include for QueryStringBehavior.
     */
    public static final QueryStringBehavior INCLUDE = fromString("Include");

    /**
     * Static value IncludeAll for QueryStringBehavior.
     */
    public static final QueryStringBehavior INCLUDE_ALL = fromString("IncludeAll");

    /**
     * Static value Exclude for QueryStringBehavior.
     */
    public static final QueryStringBehavior EXCLUDE = fromString("Exclude");

    /**
     * Static value ExcludeAll for QueryStringBehavior.
     */
    public static final QueryStringBehavior EXCLUDE_ALL = fromString("ExcludeAll");

    /**
     * Creates a new instance of QueryStringBehavior value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public QueryStringBehavior() {
    }

    /**
     * Creates or finds a QueryStringBehavior from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding QueryStringBehavior.
     */
    @JsonCreator
    public static QueryStringBehavior fromString(String name) {
        return fromString(name, QueryStringBehavior.class);
    }

    /**
     * Gets known QueryStringBehavior values.
     * 
     * @return known QueryStringBehavior values.
     */
    public static Collection<QueryStringBehavior> values() {
        return values(QueryStringBehavior.class);
    }
}
