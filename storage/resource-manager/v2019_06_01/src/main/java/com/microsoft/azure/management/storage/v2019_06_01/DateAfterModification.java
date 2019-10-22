/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object to define the number of days after last modification.
 */
public class DateAfterModification {
    /**
     * Value indicating the age in days after last modification.
     */
    @JsonProperty(value = "daysAfterModificationGreaterThan", required = true)
    private double daysAfterModificationGreaterThan;

    /**
     * Get value indicating the age in days after last modification.
     *
     * @return the daysAfterModificationGreaterThan value
     */
    public double daysAfterModificationGreaterThan() {
        return this.daysAfterModificationGreaterThan;
    }

    /**
     * Set value indicating the age in days after last modification.
     *
     * @param daysAfterModificationGreaterThan the daysAfterModificationGreaterThan value to set
     * @return the DateAfterModification object itself.
     */
    public DateAfterModification withDaysAfterModificationGreaterThan(double daysAfterModificationGreaterThan) {
        this.daysAfterModificationGreaterThan = daysAfterModificationGreaterThan;
        return this;
    }

}
