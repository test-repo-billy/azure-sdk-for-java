// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Contains information of current state for an Azure SQL Database, Server or Elastic Pool Recommended Action.
 */
@Fluent
public final class RecommendedActionStateInfo {
    /*
     * Current state the recommended action is in. Some commonly used states are: Active -> recommended action is
     * active and no action has been taken yet. Pending -> recommended action is approved for and is awaiting
     * execution. Executing -> recommended action is being applied on the user database. Verifying -> recommended
     * action was applied and is being verified of its usefulness by the system. Success -> recommended action was
     * applied and improvement found during verification. Pending Revert -> verification found little or no
     * improvement so recommended action is queued for revert or user has manually reverted. Reverting -> changes
     * made while applying recommended action are being reverted on the user database. Reverted -> successfully
     * reverted the changes made by recommended action on user database. Ignored -> user explicitly
     * ignored/discarded the recommended action.
     */
    @JsonProperty(value = "currentValue", required = true)
    private RecommendedActionCurrentState currentValue;

    /*
     * Gets who initiated the execution of this recommended action. Possible Value are: User -> When user explicity
     * notified system to apply the recommended action. System -> When auto-execute status of this advisor was set to
     * 'Enabled', in which case the system applied it.
     */
    @JsonProperty(value = "actionInitiatedBy", access = JsonProperty.Access.WRITE_ONLY)
    private RecommendedActionInitiatedBy actionInitiatedBy;

    /*
     * Gets the time when the state was last modified
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /**
     * Creates an instance of RecommendedActionStateInfo class.
     */
    public RecommendedActionStateInfo() {
    }

    /**
     * Get the currentValue property: Current state the recommended action is in. Some commonly used states are: Active
     * -&gt; recommended action is active and no action has been taken yet. Pending -&gt; recommended action is
     * approved for and is awaiting execution. Executing -&gt; recommended action is being applied on the user
     * database. Verifying -&gt; recommended action was applied and is being verified of its usefulness by the
     * system. Success -&gt; recommended action was applied and improvement found during verification. Pending
     * Revert -&gt; verification found little or no improvement so recommended action is queued for revert or user has
     * manually reverted. Reverting -&gt; changes made while applying recommended action are being reverted on the
     * user database. Reverted -&gt; successfully reverted the changes made by recommended action on user database.
     * Ignored -&gt; user explicitly ignored/discarded the recommended action.
     * 
     * @return the currentValue value.
     */
    public RecommendedActionCurrentState currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: Current state the recommended action is in. Some commonly used states are: Active
     * -&gt; recommended action is active and no action has been taken yet. Pending -&gt; recommended action is
     * approved for and is awaiting execution. Executing -&gt; recommended action is being applied on the user
     * database. Verifying -&gt; recommended action was applied and is being verified of its usefulness by the
     * system. Success -&gt; recommended action was applied and improvement found during verification. Pending
     * Revert -&gt; verification found little or no improvement so recommended action is queued for revert or user has
     * manually reverted. Reverting -&gt; changes made while applying recommended action are being reverted on the
     * user database. Reverted -&gt; successfully reverted the changes made by recommended action on user database.
     * Ignored -&gt; user explicitly ignored/discarded the recommended action.
     * 
     * @param currentValue the currentValue value to set.
     * @return the RecommendedActionStateInfo object itself.
     */
    public RecommendedActionStateInfo withCurrentValue(RecommendedActionCurrentState currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the actionInitiatedBy property: Gets who initiated the execution of this recommended action. Possible Value
     * are: User -&gt; When user explicity notified system to apply the recommended action. System -&gt; When
     * auto-execute status of this advisor was set to 'Enabled', in which case the system applied it.
     * 
     * @return the actionInitiatedBy value.
     */
    public RecommendedActionInitiatedBy actionInitiatedBy() {
        return this.actionInitiatedBy;
    }

    /**
     * Get the lastModified property: Gets the time when the state was last modified.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (currentValue() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property currentValue in model RecommendedActionStateInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecommendedActionStateInfo.class);
}
