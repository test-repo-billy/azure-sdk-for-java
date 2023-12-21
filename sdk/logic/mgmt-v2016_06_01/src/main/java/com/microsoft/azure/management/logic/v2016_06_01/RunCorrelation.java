/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The correlation properties.
 */
public class RunCorrelation {
    /**
     * The client tracking identifier.
     */
    @JsonProperty(value = "clientTrackingId")
    private String clientTrackingId;

    /**
     * The client keywords.
     */
    @JsonProperty(value = "clientKeywords")
    private List<String> clientKeywords;

    /**
     * Get the client tracking identifier.
     *
     * @return the clientTrackingId value
     */
    public String clientTrackingId() {
        return this.clientTrackingId;
    }

    /**
     * Set the client tracking identifier.
     *
     * @param clientTrackingId the clientTrackingId value to set
     * @return the RunCorrelation object itself.
     */
    public RunCorrelation withClientTrackingId(String clientTrackingId) {
        this.clientTrackingId = clientTrackingId;
        return this;
    }

    /**
     * Get the client keywords.
     *
     * @return the clientKeywords value
     */
    public List<String> clientKeywords() {
        return this.clientKeywords;
    }

    /**
     * Set the client keywords.
     *
     * @param clientKeywords the clientKeywords value to set
     * @return the RunCorrelation object itself.
     */
    public RunCorrelation withClientKeywords(List<String> clientKeywords) {
        this.clientKeywords = clientKeywords;
        return this;
    }

}
