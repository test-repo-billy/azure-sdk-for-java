// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The type of the paths for alias.
 */
@Fluent
public final class AliasPath {
    /*
     * The path of an alias.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * The API versions.
     */
    @JsonProperty(value = "apiVersions")
    private List<String> apiVersions;

    /*
     * The pattern for an alias path.
     */
    @JsonProperty(value = "pattern")
    private AliasPattern pattern;

    /*
     * The metadata of the alias path. If missing, fall back to the default metadata of the alias.
     */
    @JsonProperty(value = "metadata", access = JsonProperty.Access.WRITE_ONLY)
    private AliasPathMetadata metadata;

    /**
     * Creates an instance of AliasPath class.
     */
    public AliasPath() {
    }

    /**
     * Get the path property: The path of an alias.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path of an alias.
     * 
     * @param path the path value to set.
     * @return the AliasPath object itself.
     */
    public AliasPath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the apiVersions property: The API versions.
     * 
     * @return the apiVersions value.
     */
    public List<String> apiVersions() {
        return this.apiVersions;
    }

    /**
     * Set the apiVersions property: The API versions.
     * 
     * @param apiVersions the apiVersions value to set.
     * @return the AliasPath object itself.
     */
    public AliasPath withApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    /**
     * Get the pattern property: The pattern for an alias path.
     * 
     * @return the pattern value.
     */
    public AliasPattern pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: The pattern for an alias path.
     * 
     * @param pattern the pattern value to set.
     * @return the AliasPath object itself.
     */
    public AliasPath withPattern(AliasPattern pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the metadata property: The metadata of the alias path. If missing, fall back to the default metadata of the
     * alias.
     * 
     * @return the metadata value.
     */
    public AliasPathMetadata metadata() {
        return this.metadata;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pattern() != null) {
            pattern().validate();
        }
        if (metadata() != null) {
            metadata().validate();
        }
    }
}
