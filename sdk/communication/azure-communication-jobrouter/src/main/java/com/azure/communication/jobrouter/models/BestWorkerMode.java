// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Jobs are distributed to the worker with the strongest abilities available. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("bestWorker")
@Fluent
public final class BestWorkerMode extends DistributionMode {

    /*
     * Define a scoring rule to use, when calculating a score to determine the best worker. If not set, will use a
     * default scoring formula that uses the number of job labels that the worker labels match, as well as the number
     * of label selectors the worker labels match and/or exceed using a logistic function
     * (https://en.wikipedia.org/wiki/Logistic_function).
     */
    @JsonProperty(value = "scoringRule")
    private RouterRule scoringRule;

    /*
     * Options to configure 'scoringRule'. If not set, default values are used.
     */
    @JsonProperty(value = "scoringRuleOptions")
    private ScoringRuleOptions scoringRuleOptions;

    /** Creates an instance of BestWorkerMode class. */
    public BestWorkerMode() {
        this.kind = DistributionModeKind.BEST_WORKER;
    }

    /**
     * Get the scoringRule property: Define a scoring rule to use, when calculating a score to determine the best
     * worker. If not set, will use a default scoring formula that uses the number of job labels that the worker labels
     * match, as well as the number of label selectors the worker labels match and/or exceed using a logistic function
     * (https://en.wikipedia.org/wiki/Logistic_function).
     *
     * @return the scoringRule value.
     */
    public RouterRule getScoringRule() {
        return this.scoringRule;
    }

    /**
     * Set the scoringRule property: Define a scoring rule to use, when calculating a score to determine the best
     * worker. If not set, will use a default scoring formula that uses the number of job labels that the worker labels
     * match, as well as the number of label selectors the worker labels match and/or exceed using a logistic function
     * (https://en.wikipedia.org/wiki/Logistic_function).
     *
     * @param scoringRule the scoringRule value to set.
     * @return the BestWorkerMode object itself.
     */
    public BestWorkerMode setScoringRule(RouterRule scoringRule) {
        this.scoringRule = scoringRule;
        return this;
    }

    /**
     * Get the scoringRuleOptions property: Options to configure 'scoringRule'. If not set, default values are used.
     *
     * @return the scoringRuleOptions value.
     */
    public ScoringRuleOptions getScoringRuleOptions() {
        return this.scoringRuleOptions;
    }

    /**
     * Set the scoringRuleOptions property: Options to configure 'scoringRule'. If not set, default values are used.
     *
     * @param scoringRuleOptions the scoringRuleOptions value to set.
     * @return the BestWorkerMode object itself.
     */
    public BestWorkerMode setScoringRuleOptions(ScoringRuleOptions scoringRuleOptions) {
        this.scoringRuleOptions = scoringRuleOptions;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BestWorkerMode setMinConcurrentOffers(Integer minConcurrentOffers) {
        super.setMinConcurrentOffers(minConcurrentOffers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BestWorkerMode setMaxConcurrentOffers(Integer maxConcurrentOffers) {
        super.setMaxConcurrentOffers(maxConcurrentOffers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BestWorkerMode setBypassSelectors(Boolean bypassSelectors) {
        super.setBypassSelectors(bypassSelectors);
        return this;
    }
}
