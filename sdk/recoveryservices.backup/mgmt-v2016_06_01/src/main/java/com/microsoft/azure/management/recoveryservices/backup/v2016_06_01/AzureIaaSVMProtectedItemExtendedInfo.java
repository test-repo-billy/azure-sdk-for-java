/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information for the Azure VM (also known as IaaS VM)-specific
 * backup item.
 */
public class AzureIaaSVMProtectedItemExtendedInfo {
    /**
     * The oldest backup copy available for this backup item.
     */
    @JsonProperty(value = "oldestRecoveryPoint")
    private DateTime oldestRecoveryPoint;

    /**
     * The number of backup copies available for this backup item.
     */
    @JsonProperty(value = "recoveryPointCount")
    private Integer recoveryPointCount;

    /**
     * Specifies if the backup policy associated with the backup item is
     * inconsistent.
     */
    @JsonProperty(value = "policyInconsistent")
    private Boolean policyInconsistent;

    /**
     * Get the oldest backup copy available for this backup item.
     *
     * @return the oldestRecoveryPoint value
     */
    public DateTime oldestRecoveryPoint() {
        return this.oldestRecoveryPoint;
    }

    /**
     * Set the oldest backup copy available for this backup item.
     *
     * @param oldestRecoveryPoint the oldestRecoveryPoint value to set
     * @return the AzureIaaSVMProtectedItemExtendedInfo object itself.
     */
    public AzureIaaSVMProtectedItemExtendedInfo withOldestRecoveryPoint(DateTime oldestRecoveryPoint) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        return this;
    }

    /**
     * Get the number of backup copies available for this backup item.
     *
     * @return the recoveryPointCount value
     */
    public Integer recoveryPointCount() {
        return this.recoveryPointCount;
    }

    /**
     * Set the number of backup copies available for this backup item.
     *
     * @param recoveryPointCount the recoveryPointCount value to set
     * @return the AzureIaaSVMProtectedItemExtendedInfo object itself.
     */
    public AzureIaaSVMProtectedItemExtendedInfo withRecoveryPointCount(Integer recoveryPointCount) {
        this.recoveryPointCount = recoveryPointCount;
        return this;
    }

    /**
     * Get specifies if the backup policy associated with the backup item is inconsistent.
     *
     * @return the policyInconsistent value
     */
    public Boolean policyInconsistent() {
        return this.policyInconsistent;
    }

    /**
     * Set specifies if the backup policy associated with the backup item is inconsistent.
     *
     * @param policyInconsistent the policyInconsistent value to set
     * @return the AzureIaaSVMProtectedItemExtendedInfo object itself.
     */
    public AzureIaaSVMProtectedItemExtendedInfo withPolicyInconsistent(Boolean policyInconsistent) {
        this.policyInconsistent = policyInconsistent;
        return this;
    }

}
