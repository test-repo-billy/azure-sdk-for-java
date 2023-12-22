// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.generated.models.DiffBackupIntervalInHours;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A short term retention policy.
 */
@Fluent
public final class BackupShortTermRetentionPolicyInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private BackupShortTermRetentionPolicyProperties innerProperties;

    /**
     * Creates an instance of BackupShortTermRetentionPolicyInner class.
     */
    public BackupShortTermRetentionPolicyInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private BackupShortTermRetentionPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the retentionDays property: The backup retention period in days. This is how many days Point-in-Time Restore
     * will be supported.
     * 
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionDays();
    }

    /**
     * Set the retentionDays property: The backup retention period in days. This is how many days Point-in-Time Restore
     * will be supported.
     * 
     * @param retentionDays the retentionDays value to set.
     * @return the BackupShortTermRetentionPolicyInner object itself.
     */
    public BackupShortTermRetentionPolicyInner withRetentionDays(Integer retentionDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupShortTermRetentionPolicyProperties();
        }
        this.innerProperties().withRetentionDays(retentionDays);
        return this;
    }

    /**
     * Get the diffBackupIntervalInHours property: The differential backup interval in hours. This is how many interval
     * hours between each differential backup will be supported. This is only applicable to live databases but not
     * dropped databases.
     * 
     * @return the diffBackupIntervalInHours value.
     */
    public DiffBackupIntervalInHours diffBackupIntervalInHours() {
        return this.innerProperties() == null ? null : this.innerProperties().diffBackupIntervalInHours();
    }

    /**
     * Set the diffBackupIntervalInHours property: The differential backup interval in hours. This is how many interval
     * hours between each differential backup will be supported. This is only applicable to live databases but not
     * dropped databases.
     * 
     * @param diffBackupIntervalInHours the diffBackupIntervalInHours value to set.
     * @return the BackupShortTermRetentionPolicyInner object itself.
     */
    public BackupShortTermRetentionPolicyInner
        withDiffBackupIntervalInHours(DiffBackupIntervalInHours diffBackupIntervalInHours) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupShortTermRetentionPolicyProperties();
        }
        this.innerProperties().withDiffBackupIntervalInHours(diffBackupIntervalInHours);
        return this;
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
