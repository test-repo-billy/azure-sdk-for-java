/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The billing meters.
 */
public class BillingMeters {
    /**
     * The virtual machine sizes.
     */
    @JsonProperty(value = "meterParameter")
    private String meterParameter;

    /**
     * The HDInsight meter guid.
     */
    @JsonProperty(value = "meter")
    private String meter;

    /**
     * The unit of meter, VMHours or CoreHours.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Get the virtual machine sizes.
     *
     * @return the meterParameter value
     */
    public String meterParameter() {
        return this.meterParameter;
    }

    /**
     * Set the virtual machine sizes.
     *
     * @param meterParameter the meterParameter value to set
     * @return the BillingMeters object itself.
     */
    public BillingMeters withMeterParameter(String meterParameter) {
        this.meterParameter = meterParameter;
        return this;
    }

    /**
     * Get the HDInsight meter guid.
     *
     * @return the meter value
     */
    public String meter() {
        return this.meter;
    }

    /**
     * Set the HDInsight meter guid.
     *
     * @param meter the meter value to set
     * @return the BillingMeters object itself.
     */
    public BillingMeters withMeter(String meter) {
        this.meter = meter;
        return this;
    }

    /**
     * Get the unit of meter, VMHours or CoreHours.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit of meter, VMHours or CoreHours.
     *
     * @param unit the unit value to set
     * @return the BillingMeters object itself.
     */
    public BillingMeters withUnit(String unit) {
        this.unit = unit;
        return this;
    }

}
