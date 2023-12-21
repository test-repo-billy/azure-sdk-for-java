// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The RuleAction model. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "odata\\.type",
    defaultImpl = RuleAction.class)
@JsonTypeName("RuleAction")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "Microsoft.Azure.Management.Insights.Models.RuleEmailAction",
        value = RuleEmailAction.class),
    @JsonSubTypes.Type(
        name = "Microsoft.Azure.Management.Insights.Models.RuleWebhookAction",
        value = RuleWebhookAction.class)
})
@JsonFlatten
@Immutable
public class RuleAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleAction.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
