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
 * Recovery plan HVR Azure failback input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzureFailback")
public class RecoveryPlanHyperVReplicaAzureFailbackInput extends RecoveryPlanProviderSpecificFailoverInput {
    /**
     * The data sync option. Possible values include: 'ForDownTime',
     * 'ForSynchronization'.
     */
    @JsonProperty(value = "dataSyncOption", required = true)
    private DataSyncStatus dataSyncOption;

    /**
     * The ALR option. Possible values include: 'CreateVmIfNotFound',
     * 'NoAction'.
     */
    @JsonProperty(value = "recoveryVmCreationOption", required = true)
    private AlternateLocationRecoveryOption recoveryVmCreationOption;

    /**
     * Get the data sync option. Possible values include: 'ForDownTime', 'ForSynchronization'.
     *
     * @return the dataSyncOption value
     */
    public DataSyncStatus dataSyncOption() {
        return this.dataSyncOption;
    }

    /**
     * Set the data sync option. Possible values include: 'ForDownTime', 'ForSynchronization'.
     *
     * @param dataSyncOption the dataSyncOption value to set
     * @return the RecoveryPlanHyperVReplicaAzureFailbackInput object itself.
     */
    public RecoveryPlanHyperVReplicaAzureFailbackInput withDataSyncOption(DataSyncStatus dataSyncOption) {
        this.dataSyncOption = dataSyncOption;
        return this;
    }

    /**
     * Get the ALR option. Possible values include: 'CreateVmIfNotFound', 'NoAction'.
     *
     * @return the recoveryVmCreationOption value
     */
    public AlternateLocationRecoveryOption recoveryVmCreationOption() {
        return this.recoveryVmCreationOption;
    }

    /**
     * Set the ALR option. Possible values include: 'CreateVmIfNotFound', 'NoAction'.
     *
     * @param recoveryVmCreationOption the recoveryVmCreationOption value to set
     * @return the RecoveryPlanHyperVReplicaAzureFailbackInput object itself.
     */
    public RecoveryPlanHyperVReplicaAzureFailbackInput withRecoveryVmCreationOption(AlternateLocationRecoveryOption recoveryVmCreationOption) {
        this.recoveryVmCreationOption = recoveryVmCreationOption;
        return this;
    }

}
