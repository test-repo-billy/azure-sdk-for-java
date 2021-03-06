// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Output field mapping for a skill.
 */
@Fluent
public final class OutputFieldMappingEntry {
    /*
     * The name of the output defined by the skill.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The target name of the output. It is optional and default to name.
     */
    @JsonProperty(value = "targetName")
    private String targetName;

    /**
     * Get the name property: The name of the output defined by the skill.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the output defined by the skill.
     *
     * @param name the name value to set.
     * @return the OutputFieldMappingEntry object itself.
     */
    public OutputFieldMappingEntry setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the targetName property: The target name of the output. It is
     * optional and default to name.
     *
     * @return the targetName value.
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * Set the targetName property: The target name of the output. It is
     * optional and default to name.
     *
     * @param targetName the targetName value to set.
     * @return the OutputFieldMappingEntry object itself.
     */
    public OutputFieldMappingEntry setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
}
