// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PreAuthorizedApplicationExtension model. */
@Fluent
public final class PreAuthorizedApplicationExtension {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PreAuthorizedApplicationExtension.class);

    /*
     * The extension's conditions.
     */
    @JsonProperty(value = "conditions")
    private List<String> conditions;

    /**
     * Get the conditions property: The extension's conditions.
     *
     * @return the conditions value.
     */
    public List<String> conditions() {
        return this.conditions;
    }

    /**
     * Set the conditions property: The extension's conditions.
     *
     * @param conditions the conditions value to set.
     * @return the PreAuthorizedApplicationExtension object itself.
     */
    public PreAuthorizedApplicationExtension withConditions(List<String> conditions) {
        this.conditions = conditions;
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
