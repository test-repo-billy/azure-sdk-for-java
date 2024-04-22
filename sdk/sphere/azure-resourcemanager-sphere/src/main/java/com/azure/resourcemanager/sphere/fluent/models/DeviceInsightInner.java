// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Device insight report.
 */
@Fluent
public final class DeviceInsightInner {
    /*
     * Device ID
     */
    @JsonProperty(value = "deviceId", required = true)
    private String deviceId;

    /*
     * Event description
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /*
     * Event start timestamp
     */
    @JsonProperty(value = "startTimestampUtc", required = true)
    private OffsetDateTime startTimestampUtc;

    /*
     * Event end timestamp
     */
    @JsonProperty(value = "endTimestampUtc", required = true)
    private OffsetDateTime endTimestampUtc;

    /*
     * Event category
     */
    @JsonProperty(value = "eventCategory", required = true)
    private String eventCategory;

    /*
     * Event class
     */
    @JsonProperty(value = "eventClass", required = true)
    private String eventClass;

    /*
     * Event type
     */
    @JsonProperty(value = "eventType", required = true)
    private String eventType;

    /*
     * Event count
     */
    @JsonProperty(value = "eventCount", required = true)
    private int eventCount;

    /**
     * Creates an instance of DeviceInsightInner class.
     */
    public DeviceInsightInner() {
    }

    /**
     * Get the deviceId property: Device ID.
     * 
     * @return the deviceId value.
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: Device ID.
     * 
     * @param deviceId the deviceId value to set.
     * @return the DeviceInsightInner object itself.
     */
    public DeviceInsightInner withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the description property: Event description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Event description.
     * 
     * @param description the description value to set.
     * @return the DeviceInsightInner object itself.
     */
    public DeviceInsightInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the startTimestampUtc property: Event start timestamp.
     * 
     * @return the startTimestampUtc value.
     */
    public OffsetDateTime startTimestampUtc() {
        return this.startTimestampUtc;
    }

    /**
     * Set the startTimestampUtc property: Event start timestamp.
     * 
     * @param startTimestampUtc the startTimestampUtc value to set.
     * @return the DeviceInsightInner object itself.
     */
    public DeviceInsightInner withStartTimestampUtc(OffsetDateTime startTimestampUtc) {
        this.startTimestampUtc = startTimestampUtc;
        return this;
    }

    /**
     * Get the endTimestampUtc property: Event end timestamp.
     * 
     * @return the endTimestampUtc value.
     */
    public OffsetDateTime endTimestampUtc() {
        return this.endTimestampUtc;
    }

    /**
     * Set the endTimestampUtc property: Event end timestamp.
     * 
     * @param endTimestampUtc the endTimestampUtc value to set.
     * @return the DeviceInsightInner object itself.
     */
    public DeviceInsightInner withEndTimestampUtc(OffsetDateTime endTimestampUtc) {
        this.endTimestampUtc = endTimestampUtc;
        return this;
    }

    /**
     * Get the eventCategory property: Event category.
     * 
     * @return the eventCategory value.
     */
    public String eventCategory() {
        return this.eventCategory;
    }

    /**
     * Set the eventCategory property: Event category.
     * 
     * @param eventCategory the eventCategory value to set.
     * @return the DeviceInsightInner object itself.
     */
    public DeviceInsightInner withEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
        return this;
    }

    /**
     * Get the eventClass property: Event class.
     * 
     * @return the eventClass value.
     */
    public String eventClass() {
        return this.eventClass;
    }

    /**
     * Set the eventClass property: Event class.
     * 
     * @param eventClass the eventClass value to set.
     * @return the DeviceInsightInner object itself.
     */
    public DeviceInsightInner withEventClass(String eventClass) {
        this.eventClass = eventClass;
        return this;
    }

    /**
     * Get the eventType property: Event type.
     * 
     * @return the eventType value.
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Set the eventType property: Event type.
     * 
     * @param eventType the eventType value to set.
     * @return the DeviceInsightInner object itself.
     */
    public DeviceInsightInner withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the eventCount property: Event count.
     * 
     * @return the eventCount value.
     */
    public int eventCount() {
        return this.eventCount;
    }

    /**
     * Set the eventCount property: Event count.
     * 
     * @param eventCount the eventCount value to set.
     * @return the DeviceInsightInner object itself.
     */
    public DeviceInsightInner withEventCount(int eventCount) {
        this.eventCount = eventCount;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deviceId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property deviceId in model DeviceInsightInner"));
        }
        if (description() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property description in model DeviceInsightInner"));
        }
        if (startTimestampUtc() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property startTimestampUtc in model DeviceInsightInner"));
        }
        if (endTimestampUtc() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property endTimestampUtc in model DeviceInsightInner"));
        }
        if (eventCategory() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property eventCategory in model DeviceInsightInner"));
        }
        if (eventClass() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property eventClass in model DeviceInsightInner"));
        }
        if (eventType() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property eventType in model DeviceInsightInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeviceInsightInner.class);
}
