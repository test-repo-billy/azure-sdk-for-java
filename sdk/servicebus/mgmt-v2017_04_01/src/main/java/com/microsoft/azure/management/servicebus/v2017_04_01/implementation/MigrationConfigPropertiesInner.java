/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Single item in List or Get Migration Config operation.
 */
@JsonFlatten
public class MigrationConfigPropertiesInner extends ProxyResource {
    /**
     * Provisioning state of Migration Configuration.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Number of entities pending to be replicated.
     */
    @JsonProperty(value = "properties.pendingReplicationOperationsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long pendingReplicationOperationsCount;

    /**
     * Existing premium Namespace ARM Id name which has no entities, will be
     * used for migration.
     */
    @JsonProperty(value = "properties.targetNamespace", required = true)
    private String targetNamespace;

    /**
     * Name to access Standard Namespace after migration.
     */
    @JsonProperty(value = "properties.postMigrationName", required = true)
    private String postMigrationName;

    /**
     * State in which Standard to Premium Migration is, possible values :
     * Unknown, Reverting, Completing, Initiating, Syncing, Active.
     */
    @JsonProperty(value = "properties.migrationState", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationState;

    /**
     * Get provisioning state of Migration Configuration.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get number of entities pending to be replicated.
     *
     * @return the pendingReplicationOperationsCount value
     */
    public Long pendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }

    /**
     * Get existing premium Namespace ARM Id name which has no entities, will be used for migration.
     *
     * @return the targetNamespace value
     */
    public String targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * Set existing premium Namespace ARM Id name which has no entities, will be used for migration.
     *
     * @param targetNamespace the targetNamespace value to set
     * @return the MigrationConfigPropertiesInner object itself.
     */
    public MigrationConfigPropertiesInner withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

    /**
     * Get name to access Standard Namespace after migration.
     *
     * @return the postMigrationName value
     */
    public String postMigrationName() {
        return this.postMigrationName;
    }

    /**
     * Set name to access Standard Namespace after migration.
     *
     * @param postMigrationName the postMigrationName value to set
     * @return the MigrationConfigPropertiesInner object itself.
     */
    public MigrationConfigPropertiesInner withPostMigrationName(String postMigrationName) {
        this.postMigrationName = postMigrationName;
        return this;
    }

    /**
     * Get state in which Standard to Premium Migration is, possible values : Unknown, Reverting, Completing, Initiating, Syncing, Active.
     *
     * @return the migrationState value
     */
    public String migrationState() {
        return this.migrationState;
    }

}
