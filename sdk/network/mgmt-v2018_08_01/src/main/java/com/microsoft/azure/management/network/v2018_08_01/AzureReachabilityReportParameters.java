/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Geographic and time constraints for Azure reachability report.
 */
public class AzureReachabilityReportParameters {
    /**
     * The providerLocation property.
     */
    @JsonProperty(value = "providerLocation", required = true)
    private AzureReachabilityReportLocation providerLocation;

    /**
     * List of Internet service providers.
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /**
     * Optional Azure regions to scope the query to.
     */
    @JsonProperty(value = "azureLocations")
    private List<String> azureLocations;

    /**
     * The start time for the Azure reachability report.
     */
    @JsonProperty(value = "startTime", required = true)
    private DateTime startTime;

    /**
     * The end time for the Azure reachability report.
     */
    @JsonProperty(value = "endTime", required = true)
    private DateTime endTime;

    /**
     * Get the providerLocation value.
     *
     * @return the providerLocation value
     */
    public AzureReachabilityReportLocation providerLocation() {
        return this.providerLocation;
    }

    /**
     * Set the providerLocation value.
     *
     * @param providerLocation the providerLocation value to set
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withProviderLocation(AzureReachabilityReportLocation providerLocation) {
        this.providerLocation = providerLocation;
        return this;
    }

    /**
     * Get list of Internet service providers.
     *
     * @return the providers value
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set list of Internet service providers.
     *
     * @param providers the providers value to set
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get optional Azure regions to scope the query to.
     *
     * @return the azureLocations value
     */
    public List<String> azureLocations() {
        return this.azureLocations;
    }

    /**
     * Set optional Azure regions to scope the query to.
     *
     * @param azureLocations the azureLocations value to set
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withAzureLocations(List<String> azureLocations) {
        this.azureLocations = azureLocations;
        return this;
    }

    /**
     * Get the start time for the Azure reachability report.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time for the Azure reachability report.
     *
     * @param startTime the startTime value to set
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the end time for the Azure reachability report.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the end time for the Azure reachability report.
     *
     * @param endTime the endTime value to set
     * @return the AzureReachabilityReportParameters object itself.
     */
    public AzureReachabilityReportParameters withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

}
