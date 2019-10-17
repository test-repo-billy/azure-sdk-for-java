/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about a reseller.
 */
public class Reseller {
    /**
     * The reseller id.
     */
    @JsonProperty(value = "resellerId", access = JsonProperty.Access.WRITE_ONLY)
    private String resellerId;

    /**
     * A description of the reseller.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the reseller id.
     *
     * @return the resellerId value
     */
    public String resellerId() {
        return this.resellerId;
    }

    /**
     * Get a description of the reseller.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}
