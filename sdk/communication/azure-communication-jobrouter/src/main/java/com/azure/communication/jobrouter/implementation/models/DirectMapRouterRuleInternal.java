// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.RouterRuleKind;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A rule that return the same labels as the input labels.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = DirectMapRouterRuleInternal.class,
    visible = true)
@JsonTypeName("directMap")
@Immutable
public final class DirectMapRouterRuleInternal extends RouterRuleInternal {

    /**
     * Creates an instance of DirectMapRouterRuleInternal class.
     */
    @Generated
    public DirectMapRouterRuleInternal() {
    }

    /*
     * The type discriminator describing a sub-type of RouterRule
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private RouterRuleKind kind = RouterRuleKind.DIRECT_MAP;

    /**
     * Get the kind property: The type discriminator describing a sub-type of RouterRule.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public RouterRuleKind getKind() {
        return this.kind;
    }
}
