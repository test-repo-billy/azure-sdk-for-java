/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.DatasetInner;

/**
 * The dataset points to a HTML table in the web page.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("WebTable")
@JsonFlatten
public class WebTableDataset extends DatasetInner {
    /**
     * The zero-based index of the table in the web page. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.index", required = true)
    private Object index;

    /**
     * The relative URL to the web page from the linked service URL. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.path")
    private Object path;

    /**
     * Get the zero-based index of the table in the web page. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the index value
     */
    public Object index() {
        return this.index;
    }

    /**
     * Set the zero-based index of the table in the web page. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param index the index value to set
     * @return the WebTableDataset object itself.
     */
    public WebTableDataset withIndex(Object index) {
        this.index = index;
        return this;
    }

    /**
     * Get the relative URL to the web page from the linked service URL. Type: string (or Expression with resultType string).
     *
     * @return the path value
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the relative URL to the web page from the linked service URL. Type: string (or Expression with resultType string).
     *
     * @param path the path value to set
     * @return the WebTableDataset object itself.
     */
    public WebTableDataset withPath(Object path) {
        this.path = path;
        return this;
    }

}
