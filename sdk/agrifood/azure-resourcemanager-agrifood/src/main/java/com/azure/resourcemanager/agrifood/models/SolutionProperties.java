// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * Solution resource properties.
 */
@Fluent
public final class SolutionProperties {
    /*
     * Partner Id of the Solution.
     */
    @JsonProperty(value = "partnerId", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerId;

    /*
     * SaaS subscriptionId of the installed SaaS application.
     */
    @JsonProperty(value = "saasSubscriptionId", required = true)
    private String saasSubscriptionId;

    /*
     * SaaS subscription name of the installed SaaS application.
     */
    @JsonProperty(value = "saasSubscriptionName", required = true)
    private String saasSubscriptionName;

    /*
     * SaaS application Marketplace Publisher Id.
     */
    @JsonProperty(value = "marketplacePublisherId", required = true)
    private String marketplacePublisherId;

    /*
     * SaaS application Plan Id.
     */
    @JsonProperty(value = "planId", required = true)
    private String planId;

    /*
     * Role Assignment Id.
     */
    @JsonProperty(value = "roleAssignmentId")
    private String roleAssignmentId;

    /*
     * SaaS application Offer Id.
     */
    @JsonProperty(value = "offerId", required = true)
    private String offerId;

    /*
     * SaaS application Term Id.
     */
    @JsonProperty(value = "termId", required = true)
    private String termId;

    /*
     * Solution resource properties.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of SolutionProperties class.
     */
    public SolutionProperties() {
    }

    /**
     * Get the partnerId property: Partner Id of the Solution.
     * 
     * @return the partnerId value.
     */
    public String partnerId() {
        return this.partnerId;
    }

    /**
     * Get the saasSubscriptionId property: SaaS subscriptionId of the installed SaaS application.
     * 
     * @return the saasSubscriptionId value.
     */
    public String saasSubscriptionId() {
        return this.saasSubscriptionId;
    }

    /**
     * Set the saasSubscriptionId property: SaaS subscriptionId of the installed SaaS application.
     * 
     * @param saasSubscriptionId the saasSubscriptionId value to set.
     * @return the SolutionProperties object itself.
     */
    public SolutionProperties withSaasSubscriptionId(String saasSubscriptionId) {
        this.saasSubscriptionId = saasSubscriptionId;
        return this;
    }

    /**
     * Get the saasSubscriptionName property: SaaS subscription name of the installed SaaS application.
     * 
     * @return the saasSubscriptionName value.
     */
    public String saasSubscriptionName() {
        return this.saasSubscriptionName;
    }

    /**
     * Set the saasSubscriptionName property: SaaS subscription name of the installed SaaS application.
     * 
     * @param saasSubscriptionName the saasSubscriptionName value to set.
     * @return the SolutionProperties object itself.
     */
    public SolutionProperties withSaasSubscriptionName(String saasSubscriptionName) {
        this.saasSubscriptionName = saasSubscriptionName;
        return this;
    }

    /**
     * Get the marketplacePublisherId property: SaaS application Marketplace Publisher Id.
     * 
     * @return the marketplacePublisherId value.
     */
    public String marketplacePublisherId() {
        return this.marketplacePublisherId;
    }

    /**
     * Set the marketplacePublisherId property: SaaS application Marketplace Publisher Id.
     * 
     * @param marketplacePublisherId the marketplacePublisherId value to set.
     * @return the SolutionProperties object itself.
     */
    public SolutionProperties withMarketplacePublisherId(String marketplacePublisherId) {
        this.marketplacePublisherId = marketplacePublisherId;
        return this;
    }

    /**
     * Get the planId property: SaaS application Plan Id.
     * 
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the planId property: SaaS application Plan Id.
     * 
     * @param planId the planId value to set.
     * @return the SolutionProperties object itself.
     */
    public SolutionProperties withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the roleAssignmentId property: Role Assignment Id.
     * 
     * @return the roleAssignmentId value.
     */
    public String roleAssignmentId() {
        return this.roleAssignmentId;
    }

    /**
     * Set the roleAssignmentId property: Role Assignment Id.
     * 
     * @param roleAssignmentId the roleAssignmentId value to set.
     * @return the SolutionProperties object itself.
     */
    public SolutionProperties withRoleAssignmentId(String roleAssignmentId) {
        this.roleAssignmentId = roleAssignmentId;
        return this;
    }

    /**
     * Get the offerId property: SaaS application Offer Id.
     * 
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Set the offerId property: SaaS application Offer Id.
     * 
     * @param offerId the offerId value to set.
     * @return the SolutionProperties object itself.
     */
    public SolutionProperties withOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * Get the termId property: SaaS application Term Id.
     * 
     * @return the termId value.
     */
    public String termId() {
        return this.termId;
    }

    /**
     * Set the termId property: SaaS application Term Id.
     * 
     * @param termId the termId value to set.
     * @return the SolutionProperties object itself.
     */
    public SolutionProperties withTermId(String termId) {
        this.termId = termId;
        return this;
    }

    /**
     * Get the additionalProperties property: Solution resource properties.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Solution resource properties.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the SolutionProperties object itself.
     */
    public SolutionProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (saasSubscriptionId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property saasSubscriptionId in model SolutionProperties"));
        }
        if (saasSubscriptionName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property saasSubscriptionName in model SolutionProperties"));
        }
        if (marketplacePublisherId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property marketplacePublisherId in model SolutionProperties"));
        }
        if (planId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property planId in model SolutionProperties"));
        }
        if (offerId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property offerId in model SolutionProperties"));
        }
        if (termId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property termId in model SolutionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SolutionProperties.class);
}
