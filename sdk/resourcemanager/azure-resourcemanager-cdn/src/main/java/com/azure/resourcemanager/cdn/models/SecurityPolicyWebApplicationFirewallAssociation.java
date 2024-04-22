// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * settings for security policy patterns to match.
 */
@Fluent
public final class SecurityPolicyWebApplicationFirewallAssociation {
    /*
     * List of domains.
     */
    @JsonProperty(value = "domains")
    private List<ActivatedResourceReference> domains;

    /*
     * List of paths
     */
    @JsonProperty(value = "patternsToMatch")
    private List<String> patternsToMatch;

    /**
     * Creates an instance of SecurityPolicyWebApplicationFirewallAssociation class.
     */
    public SecurityPolicyWebApplicationFirewallAssociation() {
    }

    /**
     * Get the domains property: List of domains.
     * 
     * @return the domains value.
     */
    public List<ActivatedResourceReference> domains() {
        return this.domains;
    }

    /**
     * Set the domains property: List of domains.
     * 
     * @param domains the domains value to set.
     * @return the SecurityPolicyWebApplicationFirewallAssociation object itself.
     */
    public SecurityPolicyWebApplicationFirewallAssociation withDomains(List<ActivatedResourceReference> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * Get the patternsToMatch property: List of paths.
     * 
     * @return the patternsToMatch value.
     */
    public List<String> patternsToMatch() {
        return this.patternsToMatch;
    }

    /**
     * Set the patternsToMatch property: List of paths.
     * 
     * @param patternsToMatch the patternsToMatch value to set.
     * @return the SecurityPolicyWebApplicationFirewallAssociation object itself.
     */
    public SecurityPolicyWebApplicationFirewallAssociation withPatternsToMatch(List<String> patternsToMatch) {
        this.patternsToMatch = patternsToMatch;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domains() != null) {
            domains().forEach(e -> e.validate());
        }
    }
}
