/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import java.util.UUID;
import com.microsoft.azure.management.appservice.v2019_08_01.NotificationLevel;
import com.microsoft.azure.management.appservice.v2019_08_01.Channels;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2019_08_01.ProxyOnlyResource;

/**
 * Represents a recommendation rule that the recommendation engine can perform.
 */
@JsonFlatten
public class RecommendationRuleInner extends ProxyOnlyResource {
    /**
     * Unique name of the rule.
     */
    @JsonProperty(value = "properties.recommendationName")
    private String recommendationName;

    /**
     * UI friendly name of the rule.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Localized name of the rule (Good for UI).
     */
    @JsonProperty(value = "properties.message")
    private String message;

    /**
     * Recommendation ID of an associated recommendation object tied to the
     * rule, if exists.
     * If such an object doesn't exist, it is set to null.
     */
    @JsonProperty(value = "properties.recommendationId")
    private UUID recommendationId;

    /**
     * Localized detailed description of the rule.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Name of action that is recommended by this rule in string.
     */
    @JsonProperty(value = "properties.actionName")
    private String actionName;

    /**
     * Level of impact indicating how critical this rule is. Possible values
     * include: 'Critical', 'Warning', 'Information', 'NonUrgentSuggestion'.
     */
    @JsonProperty(value = "properties.level")
    private NotificationLevel level;

    /**
     * List of available channels that this rule applies. Possible values
     * include: 'Notification', 'Api', 'Email', 'Webhook', 'All'.
     */
    @JsonProperty(value = "properties.channels")
    private Channels channels;

    /**
     * The list of category tags that this recommendation rule belongs to.
     */
    @JsonProperty(value = "properties.categoryTags", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> categoryTags;

    /**
     * True if this is associated with a dynamically added rule.
     */
    @JsonProperty(value = "properties.isDynamic")
    private Boolean isDynamic;

    /**
     * Extension name of the portal if exists. Applicable to dynamic rule only.
     */
    @JsonProperty(value = "properties.extensionName")
    private String extensionName;

    /**
     * Deep link to a blade on the portal. Applicable to dynamic rule only.
     */
    @JsonProperty(value = "properties.bladeName")
    private String bladeName;

    /**
     * Forward link to an external document associated with the rule.
     * Applicable to dynamic rule only.
     */
    @JsonProperty(value = "properties.forwardLink")
    private String forwardLink;

    /**
     * Get unique name of the rule.
     *
     * @return the recommendationName value
     */
    public String recommendationName() {
        return this.recommendationName;
    }

    /**
     * Set unique name of the rule.
     *
     * @param recommendationName the recommendationName value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withRecommendationName(String recommendationName) {
        this.recommendationName = recommendationName;
        return this;
    }

    /**
     * Get uI friendly name of the rule.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set uI friendly name of the rule.
     *
     * @param displayName the displayName value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get localized name of the rule (Good for UI).
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set localized name of the rule (Good for UI).
     *
     * @param message the message value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get recommendation ID of an associated recommendation object tied to the rule, if exists.
     If such an object doesn't exist, it is set to null.
     *
     * @return the recommendationId value
     */
    public UUID recommendationId() {
        return this.recommendationId;
    }

    /**
     * Set recommendation ID of an associated recommendation object tied to the rule, if exists.
     If such an object doesn't exist, it is set to null.
     *
     * @param recommendationId the recommendationId value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withRecommendationId(UUID recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * Get localized detailed description of the rule.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set localized detailed description of the rule.
     *
     * @param description the description value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get name of action that is recommended by this rule in string.
     *
     * @return the actionName value
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set name of action that is recommended by this rule in string.
     *
     * @param actionName the actionName value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get level of impact indicating how critical this rule is. Possible values include: 'Critical', 'Warning', 'Information', 'NonUrgentSuggestion'.
     *
     * @return the level value
     */
    public NotificationLevel level() {
        return this.level;
    }

    /**
     * Set level of impact indicating how critical this rule is. Possible values include: 'Critical', 'Warning', 'Information', 'NonUrgentSuggestion'.
     *
     * @param level the level value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withLevel(NotificationLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get list of available channels that this rule applies. Possible values include: 'Notification', 'Api', 'Email', 'Webhook', 'All'.
     *
     * @return the channels value
     */
    public Channels channels() {
        return this.channels;
    }

    /**
     * Set list of available channels that this rule applies. Possible values include: 'Notification', 'Api', 'Email', 'Webhook', 'All'.
     *
     * @param channels the channels value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withChannels(Channels channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the list of category tags that this recommendation rule belongs to.
     *
     * @return the categoryTags value
     */
    public List<String> categoryTags() {
        return this.categoryTags;
    }

    /**
     * Get true if this is associated with a dynamically added rule.
     *
     * @return the isDynamic value
     */
    public Boolean isDynamic() {
        return this.isDynamic;
    }

    /**
     * Set true if this is associated with a dynamically added rule.
     *
     * @param isDynamic the isDynamic value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /**
     * Get extension name of the portal if exists. Applicable to dynamic rule only.
     *
     * @return the extensionName value
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * Set extension name of the portal if exists. Applicable to dynamic rule only.
     *
     * @param extensionName the extensionName value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * Get deep link to a blade on the portal. Applicable to dynamic rule only.
     *
     * @return the bladeName value
     */
    public String bladeName() {
        return this.bladeName;
    }

    /**
     * Set deep link to a blade on the portal. Applicable to dynamic rule only.
     *
     * @param bladeName the bladeName value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withBladeName(String bladeName) {
        this.bladeName = bladeName;
        return this;
    }

    /**
     * Get forward link to an external document associated with the rule. Applicable to dynamic rule only.
     *
     * @return the forwardLink value
     */
    public String forwardLink() {
        return this.forwardLink;
    }

    /**
     * Set forward link to an external document associated with the rule. Applicable to dynamic rule only.
     *
     * @param forwardLink the forwardLink value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withForwardLink(String forwardLink) {
        this.forwardLink = forwardLink;
        return this;
    }

}
