/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.management.applicationinsights.v2015_05_01.ItemScope;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ItemType;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentAnalyticsItemProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties that define an Analytics item that is associated to an
 * Application Insights component.
 */
public class ApplicationInsightsComponentAnalyticsItemInner {
    /**
     * Internally assigned unique id of the item definition.
     */
    @JsonProperty(value = "Id")
    private String id;

    /**
     * The user-defined name of the item.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The content of this item.
     */
    @JsonProperty(value = "Content")
    private String content;

    /**
     * This instance's version of the data model. This can change as new
     * features are added.
     */
    @JsonProperty(value = "Version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Enum indicating if this item definition is owned by a specific user or
     * is shared between all users with access to the Application Insights
     * component. Possible values include: 'shared', 'user'.
     */
    @JsonProperty(value = "Scope")
    private ItemScope scope;

    /**
     * Enum indicating the type of the Analytics item. Possible values include:
     * 'query', 'function', 'folder', 'recent'.
     */
    @JsonProperty(value = "Type")
    private ItemType type;

    /**
     * Date and time in UTC when this item was created.
     */
    @JsonProperty(value = "TimeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private String timeCreated;

    /**
     * Date and time in UTC of the last modification that was made to this
     * item.
     */
    @JsonProperty(value = "TimeModified", access = JsonProperty.Access.WRITE_ONLY)
    private String timeModified;

    /**
     * The properties property.
     */
    @JsonProperty(value = "Properties")
    private ApplicationInsightsComponentAnalyticsItemProperties properties;

    /**
     * Get internally assigned unique id of the item definition.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set internally assigned unique id of the item definition.
     *
     * @param id the id value to set
     * @return the ApplicationInsightsComponentAnalyticsItemInner object itself.
     */
    public ApplicationInsightsComponentAnalyticsItemInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the user-defined name of the item.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the user-defined name of the item.
     *
     * @param name the name value to set
     * @return the ApplicationInsightsComponentAnalyticsItemInner object itself.
     */
    public ApplicationInsightsComponentAnalyticsItemInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the content of this item.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content of this item.
     *
     * @param content the content value to set
     * @return the ApplicationInsightsComponentAnalyticsItemInner object itself.
     */
    public ApplicationInsightsComponentAnalyticsItemInner withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get this instance's version of the data model. This can change as new features are added.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Get enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component. Possible values include: 'shared', 'user'.
     *
     * @return the scope value
     */
    public ItemScope scope() {
        return this.scope;
    }

    /**
     * Set enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component. Possible values include: 'shared', 'user'.
     *
     * @param scope the scope value to set
     * @return the ApplicationInsightsComponentAnalyticsItemInner object itself.
     */
    public ApplicationInsightsComponentAnalyticsItemInner withScope(ItemScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get enum indicating the type of the Analytics item. Possible values include: 'query', 'function', 'folder', 'recent'.
     *
     * @return the type value
     */
    public ItemType type() {
        return this.type;
    }

    /**
     * Set enum indicating the type of the Analytics item. Possible values include: 'query', 'function', 'folder', 'recent'.
     *
     * @param type the type value to set
     * @return the ApplicationInsightsComponentAnalyticsItemInner object itself.
     */
    public ApplicationInsightsComponentAnalyticsItemInner withType(ItemType type) {
        this.type = type;
        return this;
    }

    /**
     * Get date and time in UTC when this item was created.
     *
     * @return the timeCreated value
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get date and time in UTC of the last modification that was made to this item.
     *
     * @return the timeModified value
     */
    public String timeModified() {
        return this.timeModified;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public ApplicationInsightsComponentAnalyticsItemProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the ApplicationInsightsComponentAnalyticsItemInner object itself.
     */
    public ApplicationInsightsComponentAnalyticsItemInner withProperties(ApplicationInsightsComponentAnalyticsItemProperties properties) {
        this.properties = properties;
        return this;
    }

}
