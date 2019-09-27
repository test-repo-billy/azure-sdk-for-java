/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * This activity evaluates a boolean expression and executes either the
 * activities under the ifTrueActivities property or the ifFalseActivities
 * property depending on the result of the expression.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("IfCondition")
@JsonFlatten
public class IfConditionActivity extends ControlActivity {
    /**
     * An expression that would evaluate to Boolean. This is used to determine
     * the block of activities (ifTrueActivities or ifFalseActivities) that
     * will be executed.
     */
    @JsonProperty(value = "typeProperties.expression", required = true)
    private Expression expression;

    /**
     * List of activities to execute if expression is evaluated to true. This
     * is an optional property and if not provided, the activity will exit
     * without any action.
     */
    @JsonProperty(value = "typeProperties.ifTrueActivities")
    private List<Activity> ifTrueActivities;

    /**
     * List of activities to execute if expression is evaluated to false. This
     * is an optional property and if not provided, the activity will exit
     * without any action.
     */
    @JsonProperty(value = "typeProperties.ifFalseActivities")
    private List<Activity> ifFalseActivities;

    /**
     * Get an expression that would evaluate to Boolean. This is used to determine the block of activities (ifTrueActivities or ifFalseActivities) that will be executed.
     *
     * @return the expression value
     */
    public Expression expression() {
        return this.expression;
    }

    /**
     * Set an expression that would evaluate to Boolean. This is used to determine the block of activities (ifTrueActivities or ifFalseActivities) that will be executed.
     *
     * @param expression the expression value to set
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity withExpression(Expression expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Get list of activities to execute if expression is evaluated to true. This is an optional property and if not provided, the activity will exit without any action.
     *
     * @return the ifTrueActivities value
     */
    public List<Activity> ifTrueActivities() {
        return this.ifTrueActivities;
    }

    /**
     * Set list of activities to execute if expression is evaluated to true. This is an optional property and if not provided, the activity will exit without any action.
     *
     * @param ifTrueActivities the ifTrueActivities value to set
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity withIfTrueActivities(List<Activity> ifTrueActivities) {
        this.ifTrueActivities = ifTrueActivities;
        return this;
    }

    /**
     * Get list of activities to execute if expression is evaluated to false. This is an optional property and if not provided, the activity will exit without any action.
     *
     * @return the ifFalseActivities value
     */
    public List<Activity> ifFalseActivities() {
        return this.ifFalseActivities;
    }

    /**
     * Set list of activities to execute if expression is evaluated to false. This is an optional property and if not provided, the activity will exit without any action.
     *
     * @param ifFalseActivities the ifFalseActivities value to set
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity withIfFalseActivities(List<Activity> ifFalseActivities) {
        this.ifFalseActivities = ifFalseActivities;
        return this;
    }

}
