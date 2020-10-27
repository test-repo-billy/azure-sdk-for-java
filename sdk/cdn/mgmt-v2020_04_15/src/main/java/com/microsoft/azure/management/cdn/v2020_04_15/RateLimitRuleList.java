/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines contents of rate limit rules.
 */
public class RateLimitRuleList {
    /**
     * List of rules.
     */
    @JsonProperty(value = "rules")
    private List<RateLimitRule> rules;

    /**
     * Get list of rules.
     *
     * @return the rules value
     */
    public List<RateLimitRule> rules() {
        return this.rules;
    }

    /**
     * Set list of rules.
     *
     * @param rules the rules value to set
     * @return the RateLimitRuleList object itself.
     */
    public RateLimitRuleList withRules(List<RateLimitRule> rules) {
        this.rules = rules;
        return this;
    }

}
