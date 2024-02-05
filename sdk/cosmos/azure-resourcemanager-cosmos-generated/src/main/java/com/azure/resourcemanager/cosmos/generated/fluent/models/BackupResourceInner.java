// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.generated.models.BackupState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * A restorable backup of a Cassandra cluster.
 */
@Fluent
public final class BackupResourceInner {
    /*
     * The unique identifier of backup.
     */
    @JsonProperty(value = "backupId")
    private String backupId;

    /*
     * The current state of the backup.
     */
    @JsonProperty(value = "backupState")
    private BackupState backupState;

    /*
     * The time at which the backup process begins.
     */
    @JsonProperty(value = "backupStartTimestamp")
    private OffsetDateTime backupStartTimestamp;

    /*
     * The time at which the backup process ends.
     */
    @JsonProperty(value = "backupStopTimestamp")
    private OffsetDateTime backupStopTimestamp;

    /*
     * The time at which the backup will expire.
     */
    @JsonProperty(value = "backupExpiryTimestamp")
    private OffsetDateTime backupExpiryTimestamp;

    /**
     * Creates an instance of BackupResourceInner class.
     */
    public BackupResourceInner() {
    }

    /**
     * Get the backupId property: The unique identifier of backup.
     * 
     * @return the backupId value.
     */
    public String backupId() {
        return this.backupId;
    }

    /**
     * Set the backupId property: The unique identifier of backup.
     * 
     * @param backupId the backupId value to set.
     * @return the BackupResourceInner object itself.
     */
    public BackupResourceInner withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * Get the backupState property: The current state of the backup.
     * 
     * @return the backupState value.
     */
    public BackupState backupState() {
        return this.backupState;
    }

    /**
     * Set the backupState property: The current state of the backup.
     * 
     * @param backupState the backupState value to set.
     * @return the BackupResourceInner object itself.
     */
    public BackupResourceInner withBackupState(BackupState backupState) {
        this.backupState = backupState;
        return this;
    }

    /**
     * Get the backupStartTimestamp property: The time at which the backup process begins.
     * 
     * @return the backupStartTimestamp value.
     */
    public OffsetDateTime backupStartTimestamp() {
        return this.backupStartTimestamp;
    }

    /**
     * Set the backupStartTimestamp property: The time at which the backup process begins.
     * 
     * @param backupStartTimestamp the backupStartTimestamp value to set.
     * @return the BackupResourceInner object itself.
     */
    public BackupResourceInner withBackupStartTimestamp(OffsetDateTime backupStartTimestamp) {
        this.backupStartTimestamp = backupStartTimestamp;
        return this;
    }

    /**
     * Get the backupStopTimestamp property: The time at which the backup process ends.
     * 
     * @return the backupStopTimestamp value.
     */
    public OffsetDateTime backupStopTimestamp() {
        return this.backupStopTimestamp;
    }

    /**
     * Set the backupStopTimestamp property: The time at which the backup process ends.
     * 
     * @param backupStopTimestamp the backupStopTimestamp value to set.
     * @return the BackupResourceInner object itself.
     */
    public BackupResourceInner withBackupStopTimestamp(OffsetDateTime backupStopTimestamp) {
        this.backupStopTimestamp = backupStopTimestamp;
        return this;
    }

    /**
     * Get the backupExpiryTimestamp property: The time at which the backup will expire.
     * 
     * @return the backupExpiryTimestamp value.
     */
    public OffsetDateTime backupExpiryTimestamp() {
        return this.backupExpiryTimestamp;
    }

    /**
     * Set the backupExpiryTimestamp property: The time at which the backup will expire.
     * 
     * @param backupExpiryTimestamp the backupExpiryTimestamp value to set.
     * @return the BackupResourceInner object itself.
     */
    public BackupResourceInner withBackupExpiryTimestamp(OffsetDateTime backupExpiryTimestamp) {
        this.backupExpiryTimestamp = backupExpiryTimestamp;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
