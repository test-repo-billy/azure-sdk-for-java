/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_05_15;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Class representing an update to a Kusto database.
 */
@JsonFlatten
public class DatabaseUpdate extends ProxyResource {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The provisioned state of the resource. Possible values include:
     * 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Moving'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The time the data should be kept before it stops being accessible to
     * queries in TimeSpan.
     */
    @JsonProperty(value = "properties.softDeletePeriod")
    private Period softDeletePeriod;

    /**
     * The time the data should be kept in cache for fast queries in TimeSpan.
     */
    @JsonProperty(value = "properties.hotCachePeriod")
    private Period hotCachePeriod;

    /**
     * The statistics of the database.
     */
    @JsonProperty(value = "properties.statistics")
    private DatabaseStatistics statistics;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the provisioned state of the resource. Possible values include: 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed', 'Moving'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the time the data should be kept before it stops being accessible to queries in TimeSpan.
     *
     * @return the softDeletePeriod value
     */
    public Period softDeletePeriod() {
        return this.softDeletePeriod;
    }

    /**
     * Set the time the data should be kept before it stops being accessible to queries in TimeSpan.
     *
     * @param softDeletePeriod the softDeletePeriod value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSoftDeletePeriod(Period softDeletePeriod) {
        this.softDeletePeriod = softDeletePeriod;
        return this;
    }

    /**
     * Get the time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @return the hotCachePeriod value
     */
    public Period hotCachePeriod() {
        return this.hotCachePeriod;
    }

    /**
     * Set the time the data should be kept in cache for fast queries in TimeSpan.
     *
     * @param hotCachePeriod the hotCachePeriod value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withHotCachePeriod(Period hotCachePeriod) {
        this.hotCachePeriod = hotCachePeriod;
        return this;
    }

    /**
     * Get the statistics of the database.
     *
     * @return the statistics value
     */
    public DatabaseStatistics statistics() {
        return this.statistics;
    }

    /**
     * Set the statistics of the database.
     *
     * @param statistics the statistics value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withStatistics(DatabaseStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

}
