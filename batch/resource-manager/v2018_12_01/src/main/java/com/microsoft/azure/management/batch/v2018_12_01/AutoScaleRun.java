/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2018_12_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The results and errors from an execution of a pool autoscale formula.
 */
public class AutoScaleRun {
    /**
     * The time at which the autoscale formula was last evaluated.
     */
    @JsonProperty(value = "evaluationTime", required = true)
    private DateTime evaluationTime;

    /**
     * The final values of all variables used in the evaluation of the
     * autoscale formula.
     * Each variable value is returned in the form $variable=value, and
     * variables are separated by semicolons.
     */
    @JsonProperty(value = "results")
    private String results;

    /**
     * Details of the error encountered evaluating the autoscale formula on the
     * pool, if the evaluation was unsuccessful.
     */
    @JsonProperty(value = "error")
    private AutoScaleRunError error;

    /**
     * Get the evaluationTime value.
     *
     * @return the evaluationTime value
     */
    public DateTime evaluationTime() {
        return this.evaluationTime;
    }

    /**
     * Set the evaluationTime value.
     *
     * @param evaluationTime the evaluationTime value to set
     * @return the AutoScaleRun object itself.
     */
    public AutoScaleRun withEvaluationTime(DateTime evaluationTime) {
        this.evaluationTime = evaluationTime;
        return this;
    }

    /**
     * Get each variable value is returned in the form $variable=value, and variables are separated by semicolons.
     *
     * @return the results value
     */
    public String results() {
        return this.results;
    }

    /**
     * Set each variable value is returned in the form $variable=value, and variables are separated by semicolons.
     *
     * @param results the results value to set
     * @return the AutoScaleRun object itself.
     */
    public AutoScaleRun withResults(String results) {
        this.results = results;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public AutoScaleRunError error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the AutoScaleRun object itself.
     */
    public AutoScaleRun withError(AutoScaleRunError error) {
        this.error = error;
        return this;
    }

}
