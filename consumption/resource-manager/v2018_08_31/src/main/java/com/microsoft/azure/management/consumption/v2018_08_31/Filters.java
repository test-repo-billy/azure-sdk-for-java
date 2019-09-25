/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_08_31;

import java.util.List;
import java.util.UUID;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * May be used to filter budgets by resource group, resource, or meter.
 */
public class Filters {
    /**
     * The list of filters on resource groups, allowed at subscription level
     * only.
     */
    @JsonProperty(value = "resourceGroups")
    private List<String> resourceGroups;

    /**
     * The list of filters on resources.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /**
     * The list of filters on meters (GUID), mandatory for budgets of usage
     * category.
     */
    @JsonProperty(value = "meters")
    private List<UUID> meters;

    /**
     * The dictionary of filters on tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, List<String>> tags;

    /**
     * Get the list of filters on resource groups, allowed at subscription level only.
     *
     * @return the resourceGroups value
     */
    public List<String> resourceGroups() {
        return this.resourceGroups;
    }

    /**
     * Set the list of filters on resource groups, allowed at subscription level only.
     *
     * @param resourceGroups the resourceGroups value to set
     * @return the Filters object itself.
     */
    public Filters withResourceGroups(List<String> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }

    /**
     * Get the list of filters on resources.
     *
     * @return the resources value
     */
    public List<String> resources() {
        return this.resources;
    }

    /**
     * Set the list of filters on resources.
     *
     * @param resources the resources value to set
     * @return the Filters object itself.
     */
    public Filters withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the list of filters on meters (GUID), mandatory for budgets of usage category.
     *
     * @return the meters value
     */
    public List<UUID> meters() {
        return this.meters;
    }

    /**
     * Set the list of filters on meters (GUID), mandatory for budgets of usage category.
     *
     * @param meters the meters value to set
     * @return the Filters object itself.
     */
    public Filters withMeters(List<UUID> meters) {
        this.meters = meters;
        return this;
    }

    /**
     * Get the dictionary of filters on tags.
     *
     * @return the tags value
     */
    public Map<String, List<String>> tags() {
        return this.tags;
    }

    /**
     * Set the dictionary of filters on tags.
     *
     * @param tags the tags value to set
     * @return the Filters object itself.
     */
    public Filters withTags(Map<String, List<String>> tags) {
        this.tags = tags;
        return this;
    }

}
