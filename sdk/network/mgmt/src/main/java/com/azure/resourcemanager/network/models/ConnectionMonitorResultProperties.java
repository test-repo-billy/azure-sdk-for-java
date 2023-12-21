// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ConnectionMonitorResultProperties model. */
@Fluent
public final class ConnectionMonitorResultProperties extends ConnectionMonitorParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorResultProperties.class);

    /*
     * The provisioning state of the connection monitor.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The date and time when the connection monitor was started.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The monitoring status of the connection monitor.
     */
    @JsonProperty(value = "monitoringStatus")
    private String monitoringStatus;

    /**
     * Get the provisioningState property: The provisioning state of the connection monitor.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the startTime property: The date and time when the connection monitor was started.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The date and time when the connection monitor was started.
     *
     * @param startTime the startTime value to set.
     * @return the ConnectionMonitorResultProperties object itself.
     */
    public ConnectionMonitorResultProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the monitoringStatus property: The monitoring status of the connection monitor.
     *
     * @return the monitoringStatus value.
     */
    public String monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Set the monitoringStatus property: The monitoring status of the connection monitor.
     *
     * @param monitoringStatus the monitoringStatus value to set.
     * @return the ConnectionMonitorResultProperties object itself.
     */
    public ConnectionMonitorResultProperties withMonitoringStatus(String monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
