/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * HyperV replica Azure input to update replication protected item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzure")
public class HyperVReplicaAzureUpdateReplicationProtectedItemInput extends UpdateReplicationProtectedItemProviderInput {
    /**
     * The recovery Azure resource group Id for classic deployment.
     */
    @JsonProperty(value = "recoveryAzureV1ResourceGroupId")
    private String recoveryAzureV1ResourceGroupId;

    /**
     * The recovery Azure resource group Id for resource manager deployment.
     */
    @JsonProperty(value = "recoveryAzureV2ResourceGroupId")
    private String recoveryAzureV2ResourceGroupId;

    /**
     * A value indicating whether managed disks should be used during failover.
     */
    @JsonProperty(value = "useManagedDisks")
    private String useManagedDisks;

    /**
     * Get the recovery Azure resource group Id for classic deployment.
     *
     * @return the recoveryAzureV1ResourceGroupId value
     */
    public String recoveryAzureV1ResourceGroupId() {
        return this.recoveryAzureV1ResourceGroupId;
    }

    /**
     * Set the recovery Azure resource group Id for classic deployment.
     *
     * @param recoveryAzureV1ResourceGroupId the recoveryAzureV1ResourceGroupId value to set
     * @return the HyperVReplicaAzureUpdateReplicationProtectedItemInput object itself.
     */
    public HyperVReplicaAzureUpdateReplicationProtectedItemInput withRecoveryAzureV1ResourceGroupId(String recoveryAzureV1ResourceGroupId) {
        this.recoveryAzureV1ResourceGroupId = recoveryAzureV1ResourceGroupId;
        return this;
    }

    /**
     * Get the recovery Azure resource group Id for resource manager deployment.
     *
     * @return the recoveryAzureV2ResourceGroupId value
     */
    public String recoveryAzureV2ResourceGroupId() {
        return this.recoveryAzureV2ResourceGroupId;
    }

    /**
     * Set the recovery Azure resource group Id for resource manager deployment.
     *
     * @param recoveryAzureV2ResourceGroupId the recoveryAzureV2ResourceGroupId value to set
     * @return the HyperVReplicaAzureUpdateReplicationProtectedItemInput object itself.
     */
    public HyperVReplicaAzureUpdateReplicationProtectedItemInput withRecoveryAzureV2ResourceGroupId(String recoveryAzureV2ResourceGroupId) {
        this.recoveryAzureV2ResourceGroupId = recoveryAzureV2ResourceGroupId;
        return this;
    }

    /**
     * Get a value indicating whether managed disks should be used during failover.
     *
     * @return the useManagedDisks value
     */
    public String useManagedDisks() {
        return this.useManagedDisks;
    }

    /**
     * Set a value indicating whether managed disks should be used during failover.
     *
     * @param useManagedDisks the useManagedDisks value to set
     * @return the HyperVReplicaAzureUpdateReplicationProtectedItemInput object itself.
     */
    public HyperVReplicaAzureUpdateReplicationProtectedItemInput withUseManagedDisks(String useManagedDisks) {
        this.useManagedDisks = useManagedDisks;
        return this;
    }

}
