/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties required to create any resource tracked by Azure Resource
 * Manager.
 */
public class CreateOrUpdateTrackedResourceProperties {
    /**
     * The location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Key-value pairs of additional properties for the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the resource.
     *
     * @param location the location value to set
     * @return the CreateOrUpdateTrackedResourceProperties object itself.
     */
    public CreateOrUpdateTrackedResourceProperties withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get key-value pairs of additional properties for the resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set key-value pairs of additional properties for the resource.
     *
     * @param tags the tags value to set
     * @return the CreateOrUpdateTrackedResourceProperties object itself.
     */
    public CreateOrUpdateTrackedResourceProperties withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
