/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information about the service bus topic destination for an event
 * subscription.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType", defaultImpl = ServiceBusTopicEventSubscriptionDestination.class)
@JsonTypeName("ServiceBusTopic")
@JsonFlatten
public class ServiceBusTopicEventSubscriptionDestination extends EventSubscriptionDestination {
    /**
     * The Azure Resource Id that represents the endpoint of the Service Bus
     * Topic destination of an event subscription.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * Get the Azure Resource Id that represents the endpoint of the Service Bus Topic destination of an event subscription.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the Azure Resource Id that represents the endpoint of the Service Bus Topic destination of an event subscription.
     *
     * @param resourceId the resourceId value to set
     * @return the ServiceBusTopicEventSubscriptionDestination object itself.
     */
    public ServiceBusTopicEventSubscriptionDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
