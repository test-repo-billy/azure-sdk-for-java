/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing data source used by the detectors.
 */
public class DataSource {
    /**
     * Instructions if any for the data source.
     */
    @JsonProperty(value = "instructions")
    private List<String> instructions;

    /**
     * Datasource Uri Links.
     */
    @JsonProperty(value = "dataSourceUri")
    private List<NameValuePair> dataSourceUri;

    /**
     * Get instructions if any for the data source.
     *
     * @return the instructions value
     */
    public List<String> instructions() {
        return this.instructions;
    }

    /**
     * Set instructions if any for the data source.
     *
     * @param instructions the instructions value to set
     * @return the DataSource object itself.
     */
    public DataSource withInstructions(List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get datasource Uri Links.
     *
     * @return the dataSourceUri value
     */
    public List<NameValuePair> dataSourceUri() {
        return this.dataSourceUri;
    }

    /**
     * Set datasource Uri Links.
     *
     * @param dataSourceUri the dataSourceUri value to set
     * @return the DataSource object itself.
     */
    public DataSource withDataSourceUri(List<NameValuePair> dataSourceUri) {
        this.dataSourceUri = dataSourceUri;
        return this;
    }

}
