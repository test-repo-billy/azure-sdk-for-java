/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional information on Azure Sql specific protected item.
 */
public class AzureSqlProtectedItemExtendedInfo {
    /**
     * The oldest backup copy available for this item in the service.
     */
    @JsonProperty(value = "oldestRecoveryPoint")
    private DateTime oldestRecoveryPoint;

    /**
     * Number of available backup copies associated with this backup item.
     */
    @JsonProperty(value = "recoveryPointCount")
    private Integer recoveryPointCount;

    /**
     * State of the backup policy associated with this backup item.
     */
    @JsonProperty(value = "policyState")
    private String policyState;

    /**
     * Get the oldest backup copy available for this item in the service.
     *
     * @return the oldestRecoveryPoint value
     */
    public DateTime oldestRecoveryPoint() {
        return this.oldestRecoveryPoint;
    }

    /**
     * Set the oldest backup copy available for this item in the service.
     *
     * @param oldestRecoveryPoint the oldestRecoveryPoint value to set
     * @return the AzureSqlProtectedItemExtendedInfo object itself.
     */
    public AzureSqlProtectedItemExtendedInfo withOldestRecoveryPoint(DateTime oldestRecoveryPoint) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        return this;
    }

    /**
     * Get number of available backup copies associated with this backup item.
     *
     * @return the recoveryPointCount value
     */
    public Integer recoveryPointCount() {
        return this.recoveryPointCount;
    }

    /**
     * Set number of available backup copies associated with this backup item.
     *
     * @param recoveryPointCount the recoveryPointCount value to set
     * @return the AzureSqlProtectedItemExtendedInfo object itself.
     */
    public AzureSqlProtectedItemExtendedInfo withRecoveryPointCount(Integer recoveryPointCount) {
        this.recoveryPointCount = recoveryPointCount;
        return this;
    }

    /**
     * Get state of the backup policy associated with this backup item.
     *
     * @return the policyState value
     */
    public String policyState() {
        return this.policyState;
    }

    /**
     * Set state of the backup policy associated with this backup item.
     *
     * @param policyState the policyState value to set
     * @return the AzureSqlProtectedItemExtendedInfo object itself.
     */
    public AzureSqlProtectedItemExtendedInfo withPolicyState(String policyState) {
        this.policyState = policyState;
        return this;
    }

}
