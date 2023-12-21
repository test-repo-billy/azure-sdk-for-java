/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VMware Cbt policy creation input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareCbt")
public class VMwareCbtPolicyCreationInput extends PolicyProviderSpecificInput {
    /**
     * The duration in minutes until which the recovery points need to be
     * stored.
     */
    @JsonProperty(value = "recoveryPointHistoryInMinutes")
    private Integer recoveryPointHistoryInMinutes;

    /**
     * The crash consistent snapshot frequency (in minutes).
     */
    @JsonProperty(value = "crashConsistentFrequencyInMinutes")
    private Integer crashConsistentFrequencyInMinutes;

    /**
     * The app consistent snapshot frequency (in minutes).
     */
    @JsonProperty(value = "appConsistentFrequencyInMinutes")
    private Integer appConsistentFrequencyInMinutes;

    /**
     * Get the duration in minutes until which the recovery points need to be stored.
     *
     * @return the recoveryPointHistoryInMinutes value
     */
    public Integer recoveryPointHistoryInMinutes() {
        return this.recoveryPointHistoryInMinutes;
    }

    /**
     * Set the duration in minutes until which the recovery points need to be stored.
     *
     * @param recoveryPointHistoryInMinutes the recoveryPointHistoryInMinutes value to set
     * @return the VMwareCbtPolicyCreationInput object itself.
     */
    public VMwareCbtPolicyCreationInput withRecoveryPointHistoryInMinutes(Integer recoveryPointHistoryInMinutes) {
        this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
        return this;
    }

    /**
     * Get the crash consistent snapshot frequency (in minutes).
     *
     * @return the crashConsistentFrequencyInMinutes value
     */
    public Integer crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crash consistent snapshot frequency (in minutes).
     *
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set
     * @return the VMwareCbtPolicyCreationInput object itself.
     */
    public VMwareCbtPolicyCreationInput withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the app consistent snapshot frequency (in minutes).
     *
     * @return the appConsistentFrequencyInMinutes value
     */
    public Integer appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the app consistent snapshot frequency (in minutes).
     *
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set
     * @return the VMwareCbtPolicyCreationInput object itself.
     */
    public VMwareCbtPolicyCreationInput withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

}
