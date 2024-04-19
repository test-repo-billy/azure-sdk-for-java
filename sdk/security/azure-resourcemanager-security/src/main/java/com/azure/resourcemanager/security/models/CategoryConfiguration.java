// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Severity level per category configuration for PR Annotations.
 */
@Fluent
public final class CategoryConfiguration {
    /*
     * Gets or sets minimum severity level for a given category.
     */
    @JsonProperty(value = "minimumSeverityLevel")
    private String minimumSeverityLevel;

    /*
     * Rule categories.
     * Code - code scanning results.
     * Artifact scanning results.
     * Dependencies scanning results.
     * IaC results.
     * Secrets scanning results.
     * Container scanning results.
     */
    @JsonProperty(value = "category")
    private RuleCategory category;

    /**
     * Creates an instance of CategoryConfiguration class.
     */
    public CategoryConfiguration() {
    }

    /**
     * Get the minimumSeverityLevel property: Gets or sets minimum severity level for a given category.
     * 
     * @return the minimumSeverityLevel value.
     */
    public String minimumSeverityLevel() {
        return this.minimumSeverityLevel;
    }

    /**
     * Set the minimumSeverityLevel property: Gets or sets minimum severity level for a given category.
     * 
     * @param minimumSeverityLevel the minimumSeverityLevel value to set.
     * @return the CategoryConfiguration object itself.
     */
    public CategoryConfiguration withMinimumSeverityLevel(String minimumSeverityLevel) {
        this.minimumSeverityLevel = minimumSeverityLevel;
        return this;
    }

    /**
     * Get the category property: Rule categories.
     * Code - code scanning results.
     * Artifact scanning results.
     * Dependencies scanning results.
     * IaC results.
     * Secrets scanning results.
     * Container scanning results.
     * 
     * @return the category value.
     */
    public RuleCategory category() {
        return this.category;
    }

    /**
     * Set the category property: Rule categories.
     * Code - code scanning results.
     * Artifact scanning results.
     * Dependencies scanning results.
     * IaC results.
     * Secrets scanning results.
     * Container scanning results.
     * 
     * @param category the category value to set.
     * @return the CategoryConfiguration object itself.
     */
    public CategoryConfiguration withCategory(RuleCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
