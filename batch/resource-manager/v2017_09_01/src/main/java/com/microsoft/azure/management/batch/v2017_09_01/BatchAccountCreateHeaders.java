/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Create operation.
 */
public class BatchAccountCreateHeaders {
    /**
     * The URL of the resource used to check the status of the asynchronous
     * operation.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Suggested delay to check the status of the asynchronous operation. The
     * value is an integer that specifies the delay in seconds.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /**
     * Get the URL of the resource used to check the status of the asynchronous operation.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the URL of the resource used to check the status of the asynchronous operation.
     *
     * @param location the location value to set
     * @return the BatchAccountCreateHeaders object itself.
     */
    public BatchAccountCreateHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get suggested delay to check the status of the asynchronous operation. The value is an integer that specifies the delay in seconds.
     *
     * @return the retryAfter value
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set suggested delay to check the status of the asynchronous operation. The value is an integer that specifies the delay in seconds.
     *
     * @param retryAfter the retryAfter value to set
     * @return the BatchAccountCreateHeaders object itself.
     */
    public BatchAccountCreateHeaders withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
