/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Capacity of the sku.
 */
public class SkuCapacity {
    /**
     * Usable capacity in TB.
     */
    @JsonProperty(value = "usable", access = JsonProperty.Access.WRITE_ONLY)
    private String usable;

    /**
     * Maximum capacity in TB.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private String maximum;

    /**
     * Get usable capacity in TB.
     *
     * @return the usable value
     */
    public String usable() {
        return this.usable;
    }

    /**
     * Get maximum capacity in TB.
     *
     * @return the maximum value
     */
    public String maximum() {
        return this.maximum;
    }

}
