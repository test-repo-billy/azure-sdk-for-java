/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_05_31.implementation;

import java.util.List;
import com.microsoft.azure.management.consumption.v2018_05_31.PriceSheetProperties;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An pricesheet resource.
 */
@JsonFlatten
public class PriceSheetResultInner extends ProxyResource {
    /**
     * Price sheet.
     */
    @JsonProperty(value = "properties.pricesheets", access = JsonProperty.Access.WRITE_ONLY)
    private List<PriceSheetProperties> pricesheets;

    /**
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "properties.nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get price sheet.
     *
     * @return the pricesheets value
     */
    public List<PriceSheetProperties> pricesheets() {
        return this.pricesheets;
    }

    /**
     * Get the link (url) to the next page of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

}
