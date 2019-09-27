/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request body to get the availability for scheduling disk orders.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "skuName")
@JsonTypeName("DataBoxDisk")
public class DiskScheduleAvailabilityRequest extends ScheduleAvailabilityRequest {
    /**
     * The expected size of the data, which needs to be transfered in this job,
     * in tera bytes.
     */
    @JsonProperty(value = "expectedDataSizeInTeraBytes", required = true)
    private int expectedDataSizeInTeraBytes;

    /**
     * Get the expected size of the data, which needs to be transfered in this job, in tera bytes.
     *
     * @return the expectedDataSizeInTeraBytes value
     */
    public int expectedDataSizeInTeraBytes() {
        return this.expectedDataSizeInTeraBytes;
    }

    /**
     * Set the expected size of the data, which needs to be transfered in this job, in tera bytes.
     *
     * @param expectedDataSizeInTeraBytes the expectedDataSizeInTeraBytes value to set
     * @return the DiskScheduleAvailabilityRequest object itself.
     */
    public DiskScheduleAvailabilityRequest withExpectedDataSizeInTeraBytes(int expectedDataSizeInTeraBytes) {
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        return this;
    }

}
