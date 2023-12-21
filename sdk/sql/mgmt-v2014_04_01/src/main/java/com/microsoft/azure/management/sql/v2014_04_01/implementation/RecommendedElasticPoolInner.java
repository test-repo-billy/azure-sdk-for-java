/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolEdition;
import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Represents a recommented elastic pool.
 */
@JsonFlatten
public class RecommendedElasticPoolInner extends ProxyResource {
    /**
     * The edition of the recommended elastic pool. The ElasticPoolEdition
     * enumeration contains all the valid editions. Possible values include:
     * 'Basic', 'Standard', 'Premium'.
     */
    @JsonProperty(value = "properties.databaseEdition", access = JsonProperty.Access.WRITE_ONLY)
    private ElasticPoolEdition databaseEdition;

    /**
     * The DTU for the recommended elastic pool.
     */
    @JsonProperty(value = "properties.dtu")
    private Double dtu;

    /**
     * The minimum DTU for the database.
     */
    @JsonProperty(value = "properties.databaseDtuMin")
    private Double databaseDtuMin;

    /**
     * The maximum DTU for the database.
     */
    @JsonProperty(value = "properties.databaseDtuMax")
    private Double databaseDtuMax;

    /**
     * Gets storage size in megabytes.
     */
    @JsonProperty(value = "properties.storageMB")
    private Double storageMB;

    /**
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodStart", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime observationPeriodStart;

    /**
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodEnd", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime observationPeriodEnd;

    /**
     * Gets maximum observed DTU.
     */
    @JsonProperty(value = "properties.maxObservedDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxObservedDtu;

    /**
     * Gets maximum observed storage in megabytes.
     */
    @JsonProperty(value = "properties.maxObservedStorageMB", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxObservedStorageMB;

    /**
     * The list of databases in this pool. Expanded property.
     */
    @JsonProperty(value = "properties.databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatabaseInner> databases;

    /**
     * The list of databases housed in the server. Expanded property.
     */
    @JsonProperty(value = "properties.metrics", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecommendedElasticPoolMetricInner> metrics;

    /**
     * Get the edition of the recommended elastic pool. The ElasticPoolEdition enumeration contains all the valid editions. Possible values include: 'Basic', 'Standard', 'Premium'.
     *
     * @return the databaseEdition value
     */
    public ElasticPoolEdition databaseEdition() {
        return this.databaseEdition;
    }

    /**
     * Get the DTU for the recommended elastic pool.
     *
     * @return the dtu value
     */
    public Double dtu() {
        return this.dtu;
    }

    /**
     * Set the DTU for the recommended elastic pool.
     *
     * @param dtu the dtu value to set
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withDtu(Double dtu) {
        this.dtu = dtu;
        return this;
    }

    /**
     * Get the minimum DTU for the database.
     *
     * @return the databaseDtuMin value
     */
    public Double databaseDtuMin() {
        return this.databaseDtuMin;
    }

    /**
     * Set the minimum DTU for the database.
     *
     * @param databaseDtuMin the databaseDtuMin value to set
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withDatabaseDtuMin(Double databaseDtuMin) {
        this.databaseDtuMin = databaseDtuMin;
        return this;
    }

    /**
     * Get the maximum DTU for the database.
     *
     * @return the databaseDtuMax value
     */
    public Double databaseDtuMax() {
        return this.databaseDtuMax;
    }

    /**
     * Set the maximum DTU for the database.
     *
     * @param databaseDtuMax the databaseDtuMax value to set
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withDatabaseDtuMax(Double databaseDtuMax) {
        this.databaseDtuMax = databaseDtuMax;
        return this;
    }

    /**
     * Get gets storage size in megabytes.
     *
     * @return the storageMB value
     */
    public Double storageMB() {
        return this.storageMB;
    }

    /**
     * Set gets storage size in megabytes.
     *
     * @param storageMB the storageMB value to set
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withStorageMB(Double storageMB) {
        this.storageMB = storageMB;
        return this;
    }

    /**
     * Get the observation period start (ISO8601 format).
     *
     * @return the observationPeriodStart value
     */
    public DateTime observationPeriodStart() {
        return this.observationPeriodStart;
    }

    /**
     * Get the observation period start (ISO8601 format).
     *
     * @return the observationPeriodEnd value
     */
    public DateTime observationPeriodEnd() {
        return this.observationPeriodEnd;
    }

    /**
     * Get gets maximum observed DTU.
     *
     * @return the maxObservedDtu value
     */
    public Double maxObservedDtu() {
        return this.maxObservedDtu;
    }

    /**
     * Get gets maximum observed storage in megabytes.
     *
     * @return the maxObservedStorageMB value
     */
    public Double maxObservedStorageMB() {
        return this.maxObservedStorageMB;
    }

    /**
     * Get the list of databases in this pool. Expanded property.
     *
     * @return the databases value
     */
    public List<DatabaseInner> databases() {
        return this.databases;
    }

    /**
     * Get the list of databases housed in the server. Expanded property.
     *
     * @return the metrics value
     */
    public List<RecommendedElasticPoolMetricInner> metrics() {
        return this.metrics;
    }

}
