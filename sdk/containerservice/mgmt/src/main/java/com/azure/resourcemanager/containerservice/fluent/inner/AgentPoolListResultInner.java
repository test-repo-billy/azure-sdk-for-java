// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AgentPoolListResult model. */
@Fluent
public final class AgentPoolListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AgentPoolListResultInner.class);

    /*
     * The list of agent pools.
     */
    @JsonProperty(value = "value")
    private List<AgentPoolInner> value;

    /*
     * The URL to get the next set of agent pool results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of agent pools.
     *
     * @return the value value.
     */
    public List<AgentPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of agent pools.
     *
     * @param value the value value to set.
     * @return the AgentPoolListResultInner object itself.
     */
    public AgentPoolListResultInner withValue(List<AgentPoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of agent pool results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
