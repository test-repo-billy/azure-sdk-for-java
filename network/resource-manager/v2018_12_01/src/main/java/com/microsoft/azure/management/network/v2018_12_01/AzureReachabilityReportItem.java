/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure reachability report details for a given provider location.
 */
public class AzureReachabilityReportItem {
    /**
     * The Internet service provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The Azure region.
     */
    @JsonProperty(value = "azureLocation")
    private String azureLocation;

    /**
     * List of latency details for each of the time series.
     */
    @JsonProperty(value = "latencies")
    private List<AzureReachabilityReportLatencyInfo> latencies;

    /**
     * Get the Internet service provider.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the Internet service provider.
     *
     * @param provider the provider value to set
     * @return the AzureReachabilityReportItem object itself.
     */
    public AzureReachabilityReportItem withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the Azure region.
     *
     * @return the azureLocation value
     */
    public String azureLocation() {
        return this.azureLocation;
    }

    /**
     * Set the Azure region.
     *
     * @param azureLocation the azureLocation value to set
     * @return the AzureReachabilityReportItem object itself.
     */
    public AzureReachabilityReportItem withAzureLocation(String azureLocation) {
        this.azureLocation = azureLocation;
        return this;
    }

    /**
     * Get list of latency details for each of the time series.
     *
     * @return the latencies value
     */
    public List<AzureReachabilityReportLatencyInfo> latencies() {
        return this.latencies;
    }

    /**
     * Set list of latency details for each of the time series.
     *
     * @param latencies the latencies value to set
     * @return the AzureReachabilityReportItem object itself.
     */
    public AzureReachabilityReportItem withLatencies(List<AzureReachabilityReportLatencyInfo> latencies) {
        this.latencies = latencies;
        return this;
    }

}
