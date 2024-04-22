// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The AdaptiveNetworkHardeningEnforceRequest model.
 */
@Fluent
public final class AdaptiveNetworkHardeningEnforceRequest {
    /*
     * The rules to enforce
     */
    @JsonProperty(value = "rules", required = true)
    private List<Rule> rules;

    /*
     * The Azure resource IDs of the effective network security groups that will be updated with the created security
     * rules from the Adaptive Network Hardening rules
     */
    @JsonProperty(value = "networkSecurityGroups", required = true)
    private List<String> networkSecurityGroups;

    /**
     * Creates an instance of AdaptiveNetworkHardeningEnforceRequest class.
     */
    public AdaptiveNetworkHardeningEnforceRequest() {
    }

    /**
     * Get the rules property: The rules to enforce.
     * 
     * @return the rules value.
     */
    public List<Rule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The rules to enforce.
     * 
     * @param rules the rules value to set.
     * @return the AdaptiveNetworkHardeningEnforceRequest object itself.
     */
    public AdaptiveNetworkHardeningEnforceRequest withRules(List<Rule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the networkSecurityGroups property: The Azure resource IDs of the effective network security groups that
     * will be updated with the created security rules from the Adaptive Network Hardening rules.
     * 
     * @return the networkSecurityGroups value.
     */
    public List<String> networkSecurityGroups() {
        return this.networkSecurityGroups;
    }

    /**
     * Set the networkSecurityGroups property: The Azure resource IDs of the effective network security groups that
     * will be updated with the created security rules from the Adaptive Network Hardening rules.
     * 
     * @param networkSecurityGroups the networkSecurityGroups value to set.
     * @return the AdaptiveNetworkHardeningEnforceRequest object itself.
     */
    public AdaptiveNetworkHardeningEnforceRequest withNetworkSecurityGroups(List<String> networkSecurityGroups) {
        this.networkSecurityGroups = networkSecurityGroups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property rules in model AdaptiveNetworkHardeningEnforceRequest"));
        } else {
            rules().forEach(e -> e.validate());
        }
        if (networkSecurityGroups() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property networkSecurityGroups in model AdaptiveNetworkHardeningEnforceRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AdaptiveNetworkHardeningEnforceRequest.class);
}
