// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the configuration parameters for automatic repairs on the virtual machine scale set.
 */
@Fluent
public final class AutomaticRepairsPolicy {
    /*
     * Specifies whether automatic repairs should be enabled on the virtual machine scale set. The default value is
     * false.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The amount of time for which automatic repairs are suspended due to a state change on VM. The grace time starts
     * after the state change has completed. This helps avoid premature or accidental repairs. The time duration should
     * be specified in ISO 8601 format. The minimum allowed grace period is 10 minutes (PT10M), which is also the
     * default value. The maximum allowed grace period is 90 minutes (PT90M).
     */
    @JsonProperty(value = "gracePeriod")
    private String gracePeriod;

    /*
     * Type of repair action (replace, restart, reimage) that will be used for repairing unhealthy virtual machines in
     * the scale set. Default value is replace.
     */
    @JsonProperty(value = "repairAction")
    private RepairAction repairAction;

    /**
     * Creates an instance of AutomaticRepairsPolicy class.
     */
    public AutomaticRepairsPolicy() {
    }

    /**
     * Get the enabled property: Specifies whether automatic repairs should be enabled on the virtual machine scale
     * set. The default value is false.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Specifies whether automatic repairs should be enabled on the virtual machine scale
     * set. The default value is false.
     * 
     * @param enabled the enabled value to set.
     * @return the AutomaticRepairsPolicy object itself.
     */
    public AutomaticRepairsPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the gracePeriod property: The amount of time for which automatic repairs are suspended due to a state change
     * on VM. The grace time starts after the state change has completed. This helps avoid premature or accidental
     * repairs. The time duration should be specified in ISO 8601 format. The minimum allowed grace period is 10
     * minutes (PT10M), which is also the default value. The maximum allowed grace period is 90 minutes (PT90M).
     * 
     * @return the gracePeriod value.
     */
    public String gracePeriod() {
        return this.gracePeriod;
    }

    /**
     * Set the gracePeriod property: The amount of time for which automatic repairs are suspended due to a state change
     * on VM. The grace time starts after the state change has completed. This helps avoid premature or accidental
     * repairs. The time duration should be specified in ISO 8601 format. The minimum allowed grace period is 10
     * minutes (PT10M), which is also the default value. The maximum allowed grace period is 90 minutes (PT90M).
     * 
     * @param gracePeriod the gracePeriod value to set.
     * @return the AutomaticRepairsPolicy object itself.
     */
    public AutomaticRepairsPolicy withGracePeriod(String gracePeriod) {
        this.gracePeriod = gracePeriod;
        return this;
    }

    /**
     * Get the repairAction property: Type of repair action (replace, restart, reimage) that will be used for repairing
     * unhealthy virtual machines in the scale set. Default value is replace.
     * 
     * @return the repairAction value.
     */
    public RepairAction repairAction() {
        return this.repairAction;
    }

    /**
     * Set the repairAction property: Type of repair action (replace, restart, reimage) that will be used for repairing
     * unhealthy virtual machines in the scale set. Default value is replace.
     * 
     * @param repairAction the repairAction value to set.
     * @return the AutomaticRepairsPolicy object itself.
     */
    public AutomaticRepairsPolicy withRepairAction(RepairAction repairAction) {
        this.repairAction = repairAction;
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
