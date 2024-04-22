// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.support.models.MessageProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Object that represents a Chat Transcript resource.
 */
@Fluent
public final class ChatTranscriptDetailsInner extends ProxyResource {
    /*
     * Properties of the resource.
     */
    @JsonProperty(value = "properties")
    private ChatTranscriptDetailsProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ChatTranscriptDetailsInner class.
     */
    public ChatTranscriptDetailsInner() {
    }

    /**
     * Get the innerProperties property: Properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private ChatTranscriptDetailsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the messages property: List of chat transcript communication resources.
     * 
     * @return the messages value.
     */
    public List<MessageProperties> messages() {
        return this.innerProperties() == null ? null : this.innerProperties().messages();
    }

    /**
     * Set the messages property: List of chat transcript communication resources.
     * 
     * @param messages the messages value to set.
     * @return the ChatTranscriptDetailsInner object itself.
     */
    public ChatTranscriptDetailsInner withMessages(List<MessageProperties> messages) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChatTranscriptDetailsProperties();
        }
        this.innerProperties().withMessages(messages);
        return this;
    }

    /**
     * Get the startTime property: Time in UTC (ISO 8601 format) when the chat began.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
