/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource tags.
 */
public class ResourceTags {
    /**
     * Gets or sets the tags, a dictionary of descriptors arm object.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get gets or sets the tags, a dictionary of descriptors arm object.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set gets or sets the tags, a dictionary of descriptors arm object.
     *
     * @param tags the tags value to set
     * @return the ResourceTags object itself.
     */
    public ResourceTags withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
