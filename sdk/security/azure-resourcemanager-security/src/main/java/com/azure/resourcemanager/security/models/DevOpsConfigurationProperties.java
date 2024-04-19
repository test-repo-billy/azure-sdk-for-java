// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * DevOps Configuration properties.
 */
@Fluent
public final class DevOpsConfigurationProperties {
    /*
     * Gets or sets resource status message.
     */
    @JsonProperty(value = "provisioningStatusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningStatusMessage;

    /*
     * Gets or sets time when resource was last checked.
     */
    @JsonProperty(value = "provisioningStatusUpdateTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningStatusUpdateTimeUtc;

    /*
     * The provisioning state of the resource.
     * 
     * Pending - Provisioning pending.
     * Failed - Provisioning failed.
     * Succeeded - Successful provisioning.
     * Canceled - Provisioning canceled.
     * PendingDeletion - Deletion pending.
     * DeletionSuccess - Deletion successful.
     * DeletionFailure - Deletion failure.
     */
    @JsonProperty(value = "provisioningState")
    private DevOpsProvisioningState provisioningState;

    /*
     * Authorization payload.
     */
    @JsonProperty(value = "authorization")
    private Authorization authorization;

    /*
     * AutoDiscovery states.
     */
    @JsonProperty(value = "autoDiscovery")
    private AutoDiscovery autoDiscovery;

    /*
     * List of top-level inventory to select when AutoDiscovery is disabled.
     * This field is ignored when AutoDiscovery is enabled.
     */
    @JsonProperty(value = "topLevelInventoryList")
    private List<String> topLevelInventoryList;

    /**
     * Creates an instance of DevOpsConfigurationProperties class.
     */
    public DevOpsConfigurationProperties() {
    }

    /**
     * Get the provisioningStatusMessage property: Gets or sets resource status message.
     * 
     * @return the provisioningStatusMessage value.
     */
    public String provisioningStatusMessage() {
        return this.provisioningStatusMessage;
    }

    /**
     * Get the provisioningStatusUpdateTimeUtc property: Gets or sets time when resource was last checked.
     * 
     * @return the provisioningStatusUpdateTimeUtc value.
     */
    public OffsetDateTime provisioningStatusUpdateTimeUtc() {
        return this.provisioningStatusUpdateTimeUtc;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * Pending - Provisioning pending.
     * Failed - Provisioning failed.
     * Succeeded - Successful provisioning.
     * Canceled - Provisioning canceled.
     * PendingDeletion - Deletion pending.
     * DeletionSuccess - Deletion successful.
     * DeletionFailure - Deletion failure.
     * 
     * @return the provisioningState value.
     */
    public DevOpsProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource.
     * 
     * Pending - Provisioning pending.
     * Failed - Provisioning failed.
     * Succeeded - Successful provisioning.
     * Canceled - Provisioning canceled.
     * PendingDeletion - Deletion pending.
     * DeletionSuccess - Deletion successful.
     * DeletionFailure - Deletion failure.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the DevOpsConfigurationProperties object itself.
     */
    public DevOpsConfigurationProperties withProvisioningState(DevOpsProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the authorization property: Authorization payload.
     * 
     * @return the authorization value.
     */
    public Authorization authorization() {
        return this.authorization;
    }

    /**
     * Set the authorization property: Authorization payload.
     * 
     * @param authorization the authorization value to set.
     * @return the DevOpsConfigurationProperties object itself.
     */
    public DevOpsConfigurationProperties withAuthorization(Authorization authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * Get the autoDiscovery property: AutoDiscovery states.
     * 
     * @return the autoDiscovery value.
     */
    public AutoDiscovery autoDiscovery() {
        return this.autoDiscovery;
    }

    /**
     * Set the autoDiscovery property: AutoDiscovery states.
     * 
     * @param autoDiscovery the autoDiscovery value to set.
     * @return the DevOpsConfigurationProperties object itself.
     */
    public DevOpsConfigurationProperties withAutoDiscovery(AutoDiscovery autoDiscovery) {
        this.autoDiscovery = autoDiscovery;
        return this;
    }

    /**
     * Get the topLevelInventoryList property: List of top-level inventory to select when AutoDiscovery is disabled.
     * This field is ignored when AutoDiscovery is enabled.
     * 
     * @return the topLevelInventoryList value.
     */
    public List<String> topLevelInventoryList() {
        return this.topLevelInventoryList;
    }

    /**
     * Set the topLevelInventoryList property: List of top-level inventory to select when AutoDiscovery is disabled.
     * This field is ignored when AutoDiscovery is enabled.
     * 
     * @param topLevelInventoryList the topLevelInventoryList value to set.
     * @return the DevOpsConfigurationProperties object itself.
     */
    public DevOpsConfigurationProperties withTopLevelInventoryList(List<String> topLevelInventoryList) {
        this.topLevelInventoryList = topLevelInventoryList;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorization() != null) {
            authorization().validate();
        }
    }
}
