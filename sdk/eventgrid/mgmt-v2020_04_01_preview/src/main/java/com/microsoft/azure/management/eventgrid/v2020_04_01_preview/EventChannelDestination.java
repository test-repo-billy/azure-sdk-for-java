/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the destination of an event channel.
 */
public class EventChannelDestination {
    /**
     * Azure subscription ID of the customer creating the event channel. The
     * partner topic
     * associated with the event channel will be created under this Azure
     * subscription.
     */
    @JsonProperty(value = "azureSubscriptionId")
    private String azureSubscriptionId;

    /**
     * Azure Resource Group of the customer creating the event channel. The
     * partner topic
     * associated with the event channel will be created under this resource
     * group.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Name of the partner topic associated with the event channel.
     */
    @JsonProperty(value = "partnerTopicName")
    private String partnerTopicName;

    /**
     * Get azure subscription ID of the customer creating the event channel. The partner topic
     associated with the event channel will be created under this Azure subscription.
     *
     * @return the azureSubscriptionId value
     */
    public String azureSubscriptionId() {
        return this.azureSubscriptionId;
    }

    /**
     * Set azure subscription ID of the customer creating the event channel. The partner topic
     associated with the event channel will be created under this Azure subscription.
     *
     * @param azureSubscriptionId the azureSubscriptionId value to set
     * @return the EventChannelDestination object itself.
     */
    public EventChannelDestination withAzureSubscriptionId(String azureSubscriptionId) {
        this.azureSubscriptionId = azureSubscriptionId;
        return this;
    }

    /**
     * Get azure Resource Group of the customer creating the event channel. The partner topic
     associated with the event channel will be created under this resource group.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set azure Resource Group of the customer creating the event channel. The partner topic
     associated with the event channel will be created under this resource group.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the EventChannelDestination object itself.
     */
    public EventChannelDestination withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get name of the partner topic associated with the event channel.
     *
     * @return the partnerTopicName value
     */
    public String partnerTopicName() {
        return this.partnerTopicName;
    }

    /**
     * Set name of the partner topic associated with the event channel.
     *
     * @param partnerTopicName the partnerTopicName value to set
     * @return the EventChannelDestination object itself.
     */
    public EventChannelDestination withPartnerTopicName(String partnerTopicName) {
        this.partnerTopicName = partnerTopicName;
        return this;
    }

}
