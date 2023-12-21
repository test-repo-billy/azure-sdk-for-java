/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TrustedExternalTenant model.
 */
public class TrustedExternalTenant {
    /**
     * GUID representing an external tenant.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get gUID representing an external tenant.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set gUID representing an external tenant.
     *
     * @param value the value value to set
     * @return the TrustedExternalTenant object itself.
     */
    public TrustedExternalTenant withValue(String value) {
        this.value = value;
        return this;
    }

}
