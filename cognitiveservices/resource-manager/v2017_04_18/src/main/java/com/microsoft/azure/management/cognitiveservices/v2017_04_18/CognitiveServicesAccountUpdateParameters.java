/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters to provide for the account.
 */
public class CognitiveServicesAccountUpdateParameters {
    /**
     * Gets or sets the SKU of the resource.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used in viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key no greater than 128 characters and value no greater than
     * 256 characters.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Additional properties for Account. Only provided fields will be updated.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get gets or sets the SKU of the resource.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set gets or sets the SKU of the resource.
     *
     * @param sku the sku value to set
     * @return the CognitiveServicesAccountUpdateParameters object itself.
     */
    public CognitiveServicesAccountUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     *
     * @param tags the tags value to set
     * @return the CognitiveServicesAccountUpdateParameters object itself.
     */
    public CognitiveServicesAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get additional properties for Account. Only provided fields will be updated.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set additional properties for Account. Only provided fields will be updated.
     *
     * @param properties the properties value to set
     * @return the CognitiveServicesAccountUpdateParameters object itself.
     */
    public CognitiveServicesAccountUpdateParameters withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

}
