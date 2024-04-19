// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A rule of one of the following types: StaticRule: A rule providing static rules that always return the same result,
 * regardless of input. DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule
 * providing inline expression rules. FunctionRule: A rule providing a binding to an HTTP Triggered Azure Function.
 * WebhookRule: A rule providing a binding to a webserver following OAuth2.0 authentication protocol.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = RouterRule.class)
@JsonTypeName("RouterRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "directMap", value = DirectMapRouterRule.class),
    @JsonSubTypes.Type(name = "expression", value = ExpressionRouterRule.class),
    @JsonSubTypes.Type(name = "function", value = FunctionRouterRule.class),
    @JsonSubTypes.Type(name = "static", value = StaticRouterRule.class),
    @JsonSubTypes.Type(name = "webhook", value = WebhookRouterRule.class)
})
public abstract class RouterRule {

    /**
     * kind discriminator.
     */
    @JsonProperty(value = "kind")
    protected RouterRuleKind kind;

    /** Creates an instance of RouterRule class. */
    public RouterRule() {}

    /**
     * Returns kind discriminator.
     * @return kind.
     */
    public RouterRuleKind getKind() {
        return this.kind;
    }
}
