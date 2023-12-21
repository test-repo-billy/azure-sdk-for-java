/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Set a patching window during which Windows and SQL patches will be applied.
 */
public class AutoPatchingSettings {
    /**
     * Enable or disable autopatching on SQL virtual machine.
     */
    @JsonProperty(value = "enable")
    private Boolean enable;

    /**
     * Day of week to apply the patch on. Possible values include: 'Monday',
     * 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'.
     */
    @JsonProperty(value = "dayOfWeek")
    private DayOfWeek dayOfWeek;

    /**
     * Hour of the day when patching is initiated. Local VM time.
     */
    @JsonProperty(value = "maintenanceWindowStartingHour")
    private Integer maintenanceWindowStartingHour;

    /**
     * Duration of patching.
     */
    @JsonProperty(value = "maintenanceWindowDuration")
    private Integer maintenanceWindowDuration;

    /**
     * Get enable or disable autopatching on SQL virtual machine.
     *
     * @return the enable value
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set enable or disable autopatching on SQL virtual machine.
     *
     * @param enable the enable value to set
     * @return the AutoPatchingSettings object itself.
     */
    public AutoPatchingSettings withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get day of week to apply the patch on. Possible values include: 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'.
     *
     * @return the dayOfWeek value
     */
    public DayOfWeek dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set day of week to apply the patch on. Possible values include: 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'.
     *
     * @param dayOfWeek the dayOfWeek value to set
     * @return the AutoPatchingSettings object itself.
     */
    public AutoPatchingSettings withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Get hour of the day when patching is initiated. Local VM time.
     *
     * @return the maintenanceWindowStartingHour value
     */
    public Integer maintenanceWindowStartingHour() {
        return this.maintenanceWindowStartingHour;
    }

    /**
     * Set hour of the day when patching is initiated. Local VM time.
     *
     * @param maintenanceWindowStartingHour the maintenanceWindowStartingHour value to set
     * @return the AutoPatchingSettings object itself.
     */
    public AutoPatchingSettings withMaintenanceWindowStartingHour(Integer maintenanceWindowStartingHour) {
        this.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
        return this;
    }

    /**
     * Get duration of patching.
     *
     * @return the maintenanceWindowDuration value
     */
    public Integer maintenanceWindowDuration() {
        return this.maintenanceWindowDuration;
    }

    /**
     * Set duration of patching.
     *
     * @param maintenanceWindowDuration the maintenanceWindowDuration value to set
     * @return the AutoPatchingSettings object itself.
     */
    public AutoPatchingSettings withMaintenanceWindowDuration(Integer maintenanceWindowDuration) {
        this.maintenanceWindowDuration = maintenanceWindowDuration;
        return this;
    }

}
