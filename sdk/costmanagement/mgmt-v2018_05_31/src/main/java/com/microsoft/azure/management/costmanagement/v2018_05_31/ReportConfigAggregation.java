/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The aggregation expression to be used in the report.
 */
public class ReportConfigAggregation {
    /**
     * The name of the column to aggregate.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The name of the aggregation function to use.
     */
    @JsonProperty(value = "function", required = true)
    private String function;

    /**
     * Creates an instance of ReportConfigAggregation class.
     * @param name the name of the column to aggregate.
     */
    public ReportConfigAggregation() {
        function = "Sum";
    }

    /**
     * Get the name of the column to aggregate.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the column to aggregate.
     *
     * @param name the name value to set
     * @return the ReportConfigAggregation object itself.
     */
    public ReportConfigAggregation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the name of the aggregation function to use.
     *
     * @return the function value
     */
    public String function() {
        return this.function;
    }

    /**
     * Set the name of the aggregation function to use.
     *
     * @param function the function value to set
     * @return the ReportConfigAggregation object itself.
     */
    public ReportConfigAggregation withFunction(String function) {
        this.function = function;
        return this;
    }

}
