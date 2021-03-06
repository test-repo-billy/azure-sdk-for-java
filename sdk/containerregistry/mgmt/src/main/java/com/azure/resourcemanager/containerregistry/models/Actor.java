// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Actor model. */
@Fluent
public final class Actor {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Actor.class);

    /*
     * The subject or username associated with the request context that
     * generated the event.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: The subject or username associated with the request context that generated the event.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The subject or username associated with the request context that generated the event.
     *
     * @param name the name value to set.
     * @return the Actor object itself.
     */
    public Actor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
