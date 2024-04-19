// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for RequestMethodMatchConditionParametersMatchValuesItem.
 */
public final class RequestMethodMatchConditionParametersMatchValuesItem
    extends ExpandableStringEnum<RequestMethodMatchConditionParametersMatchValuesItem> {
    /**
     * Static value GET for RequestMethodMatchConditionParametersMatchValuesItem.
     */
    public static final RequestMethodMatchConditionParametersMatchValuesItem GET = fromString("GET");

    /**
     * Static value HEAD for RequestMethodMatchConditionParametersMatchValuesItem.
     */
    public static final RequestMethodMatchConditionParametersMatchValuesItem HEAD = fromString("HEAD");

    /**
     * Static value POST for RequestMethodMatchConditionParametersMatchValuesItem.
     */
    public static final RequestMethodMatchConditionParametersMatchValuesItem POST = fromString("POST");

    /**
     * Static value PUT for RequestMethodMatchConditionParametersMatchValuesItem.
     */
    public static final RequestMethodMatchConditionParametersMatchValuesItem PUT = fromString("PUT");

    /**
     * Static value DELETE for RequestMethodMatchConditionParametersMatchValuesItem.
     */
    public static final RequestMethodMatchConditionParametersMatchValuesItem DELETE = fromString("DELETE");

    /**
     * Static value OPTIONS for RequestMethodMatchConditionParametersMatchValuesItem.
     */
    public static final RequestMethodMatchConditionParametersMatchValuesItem OPTIONS = fromString("OPTIONS");

    /**
     * Static value TRACE for RequestMethodMatchConditionParametersMatchValuesItem.
     */
    public static final RequestMethodMatchConditionParametersMatchValuesItem TRACE = fromString("TRACE");

    /**
     * Creates a new instance of RequestMethodMatchConditionParametersMatchValuesItem value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RequestMethodMatchConditionParametersMatchValuesItem() {
    }

    /**
     * Creates or finds a RequestMethodMatchConditionParametersMatchValuesItem from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RequestMethodMatchConditionParametersMatchValuesItem.
     */
    @JsonCreator
    public static RequestMethodMatchConditionParametersMatchValuesItem fromString(String name) {
        return fromString(name, RequestMethodMatchConditionParametersMatchValuesItem.class);
    }

    /**
     * Gets known RequestMethodMatchConditionParametersMatchValuesItem values.
     * 
     * @return known RequestMethodMatchConditionParametersMatchValuesItem values.
     */
    public static Collection<RequestMethodMatchConditionParametersMatchValuesItem> values() {
        return values(RequestMethodMatchConditionParametersMatchValuesItem.class);
    }
}
