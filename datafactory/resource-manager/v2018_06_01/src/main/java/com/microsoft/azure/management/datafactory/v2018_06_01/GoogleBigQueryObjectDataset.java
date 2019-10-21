/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * Google BigQuery service dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GoogleBigQueryObject")
@JsonFlatten
public class GoogleBigQueryObjectDataset extends DatasetInner {
    /**
     * This property will be retired. Please consider using database + table
     * properties instead.
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /**
     * The table name of the Google BigQuery. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /**
     * The database name of the Google BigQuery. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.dataset")
    private Object dataset;

    /**
     * Get this property will be retired. Please consider using database + table properties instead.
     *
     * @return the tableName value
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set this property will be retired. Please consider using database + table properties instead.
     *
     * @param tableName the tableName value to set
     * @return the GoogleBigQueryObjectDataset object itself.
     */
    public GoogleBigQueryObjectDataset withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the table name of the Google BigQuery. Type: string (or Expression with resultType string).
     *
     * @return the table value
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table name of the Google BigQuery. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set
     * @return the GoogleBigQueryObjectDataset object itself.
     */
    public GoogleBigQueryObjectDataset withTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the database name of the Google BigQuery. Type: string (or Expression with resultType string).
     *
     * @return the dataset value
     */
    public Object dataset() {
        return this.dataset;
    }

    /**
     * Set the database name of the Google BigQuery. Type: string (or Expression with resultType string).
     *
     * @param dataset the dataset value to set
     * @return the GoogleBigQueryObjectDataset object itself.
     */
    public GoogleBigQueryObjectDataset withDataset(Object dataset) {
        this.dataset = dataset;
        return this;
    }

}
