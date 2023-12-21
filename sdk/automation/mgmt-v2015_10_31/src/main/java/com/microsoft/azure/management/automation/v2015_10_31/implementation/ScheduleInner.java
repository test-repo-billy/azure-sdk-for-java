/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.automation.v2015_10_31.ScheduleFrequency;
import com.microsoft.azure.management.automation.v2015_10_31.AdvancedSchedule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Definition of the schedule.
 */
@JsonFlatten
public class ScheduleInner extends ProxyResource {
    /**
     * Gets or sets the start time of the schedule.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * Gets the start time's offset in minutes.
     */
    @JsonProperty(value = "properties.startTimeOffsetMinutes", access = JsonProperty.Access.WRITE_ONLY)
    private double startTimeOffsetMinutes;

    /**
     * Gets or sets the end time of the schedule.
     */
    @JsonProperty(value = "properties.expiryTime")
    private DateTime expiryTime;

    /**
     * Gets or sets the expiry time's offset in minutes.
     */
    @JsonProperty(value = "properties.expiryTimeOffsetMinutes")
    private double expiryTimeOffsetMinutes;

    /**
     * Gets or sets a value indicating whether this schedule is enabled.
     */
    @JsonProperty(value = "properties.isEnabled")
    private Boolean isEnabled;

    /**
     * Gets or sets the next run time of the schedule.
     */
    @JsonProperty(value = "properties.nextRun")
    private DateTime nextRun;

    /**
     * Gets or sets the next run time's offset in minutes.
     */
    @JsonProperty(value = "properties.nextRunOffsetMinutes")
    private double nextRunOffsetMinutes;

    /**
     * Gets or sets the interval of the schedule.
     */
    @JsonProperty(value = "properties.interval")
    private Object interval;

    /**
     * Gets or sets the frequency of the schedule. Possible values include:
     * 'OneTime', 'Day', 'Hour', 'Week', 'Month'.
     */
    @JsonProperty(value = "properties.frequency")
    private ScheduleFrequency frequency;

    /**
     * Gets or sets the time zone of the schedule.
     */
    @JsonProperty(value = "properties.timeZone")
    private String timeZone;

    /**
     * Gets or sets the advanced schedule.
     */
    @JsonProperty(value = "properties.advancedSchedule")
    private AdvancedSchedule advancedSchedule;

    /**
     * Gets or sets the creation time.
     */
    @JsonProperty(value = "properties.creationTime")
    private DateTime creationTime;

    /**
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime")
    private DateTime lastModifiedTime;

    /**
     * Gets or sets the description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get gets or sets the start time of the schedule.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set gets or sets the start time of the schedule.
     *
     * @param startTime the startTime value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get gets the start time's offset in minutes.
     *
     * @return the startTimeOffsetMinutes value
     */
    public double startTimeOffsetMinutes() {
        return this.startTimeOffsetMinutes;
    }

    /**
     * Get gets or sets the end time of the schedule.
     *
     * @return the expiryTime value
     */
    public DateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set gets or sets the end time of the schedule.
     *
     * @param expiryTime the expiryTime value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withExpiryTime(DateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get gets or sets the expiry time's offset in minutes.
     *
     * @return the expiryTimeOffsetMinutes value
     */
    public double expiryTimeOffsetMinutes() {
        return this.expiryTimeOffsetMinutes;
    }

    /**
     * Set gets or sets the expiry time's offset in minutes.
     *
     * @param expiryTimeOffsetMinutes the expiryTimeOffsetMinutes value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withExpiryTimeOffsetMinutes(double expiryTimeOffsetMinutes) {
        this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
        return this;
    }

    /**
     * Get gets or sets a value indicating whether this schedule is enabled.
     *
     * @return the isEnabled value
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set gets or sets a value indicating whether this schedule is enabled.
     *
     * @param isEnabled the isEnabled value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get gets or sets the next run time of the schedule.
     *
     * @return the nextRun value
     */
    public DateTime nextRun() {
        return this.nextRun;
    }

    /**
     * Set gets or sets the next run time of the schedule.
     *
     * @param nextRun the nextRun value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withNextRun(DateTime nextRun) {
        this.nextRun = nextRun;
        return this;
    }

    /**
     * Get gets or sets the next run time's offset in minutes.
     *
     * @return the nextRunOffsetMinutes value
     */
    public double nextRunOffsetMinutes() {
        return this.nextRunOffsetMinutes;
    }

    /**
     * Set gets or sets the next run time's offset in minutes.
     *
     * @param nextRunOffsetMinutes the nextRunOffsetMinutes value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withNextRunOffsetMinutes(double nextRunOffsetMinutes) {
        this.nextRunOffsetMinutes = nextRunOffsetMinutes;
        return this;
    }

    /**
     * Get gets or sets the interval of the schedule.
     *
     * @return the interval value
     */
    public Object interval() {
        return this.interval;
    }

    /**
     * Set gets or sets the interval of the schedule.
     *
     * @param interval the interval value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withInterval(Object interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get gets or sets the frequency of the schedule. Possible values include: 'OneTime', 'Day', 'Hour', 'Week', 'Month'.
     *
     * @return the frequency value
     */
    public ScheduleFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set gets or sets the frequency of the schedule. Possible values include: 'OneTime', 'Day', 'Hour', 'Week', 'Month'.
     *
     * @param frequency the frequency value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withFrequency(ScheduleFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get gets or sets the time zone of the schedule.
     *
     * @return the timeZone value
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set gets or sets the time zone of the schedule.
     *
     * @param timeZone the timeZone value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get gets or sets the advanced schedule.
     *
     * @return the advancedSchedule value
     */
    public AdvancedSchedule advancedSchedule() {
        return this.advancedSchedule;
    }

    /**
     * Set gets or sets the advanced schedule.
     *
     * @param advancedSchedule the advancedSchedule value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withAdvancedSchedule(AdvancedSchedule advancedSchedule) {
        this.advancedSchedule = advancedSchedule;
        return this;
    }

    /**
     * Get gets or sets the creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get gets or sets the last modified time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withLastModifiedTime(DateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get gets or sets the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description.
     *
     * @param description the description value to set
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withDescription(String description) {
        this.description = description;
        return this;
    }

}
