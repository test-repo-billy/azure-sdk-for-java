/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for WhatIfAtManagementGroupScope operation.
 */
public class DeploymentsWhatIfAtManagementGroupScopeHeaders {
    /**
     * URL to get status of this long-running operation.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Number of seconds to wait before polling for status.
     */
    @JsonProperty(value = "Retry-After")
    private String retryAfter;

    /**
     * Get uRL to get status of this long-running operation.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set uRL to get status of this long-running operation.
     *
     * @param location the location value to set
     * @return the DeploymentsWhatIfAtManagementGroupScopeHeaders object itself.
     */
    public DeploymentsWhatIfAtManagementGroupScopeHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get number of seconds to wait before polling for status.
     *
     * @return the retryAfter value
     */
    public String retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set number of seconds to wait before polling for status.
     *
     * @param retryAfter the retryAfter value to set
     * @return the DeploymentsWhatIfAtManagementGroupScopeHeaders object itself.
     */
    public DeploymentsWhatIfAtManagementGroupScopeHeaders withRetryAfter(String retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
