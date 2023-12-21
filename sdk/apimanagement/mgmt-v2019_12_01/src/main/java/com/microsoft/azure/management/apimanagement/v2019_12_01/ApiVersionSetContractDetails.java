/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An API Version Set contains the common configuration for a set of API
 * Versions relating.
 */
public class ApiVersionSetContractDetails {
    /**
     * Identifier for existing API Version Set. Omit this value to create a new
     * Version Set.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The display Name of the API Version Set.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Description of API Version Set.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * An value that determines where the API Version identifer will be located
     * in a HTTP request. Possible values include: 'Segment', 'Query',
     * 'Header'.
     */
    @JsonProperty(value = "versioningScheme")
    private String versioningScheme;

    /**
     * Name of query parameter that indicates the API Version if
     * versioningScheme is set to `query`.
     */
    @JsonProperty(value = "versionQueryName")
    private String versionQueryName;

    /**
     * Name of HTTP header parameter that indicates the API Version if
     * versioningScheme is set to `header`.
     */
    @JsonProperty(value = "versionHeaderName")
    private String versionHeaderName;

    /**
     * Get identifier for existing API Version Set. Omit this value to create a new Version Set.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set identifier for existing API Version Set. Omit this value to create a new Version Set.
     *
     * @param id the id value to set
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the display Name of the API Version Set.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the display Name of the API Version Set.
     *
     * @param name the name value to set
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get description of API Version Set.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of API Version Set.
     *
     * @param description the description value to set
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get an value that determines where the API Version identifer will be located in a HTTP request. Possible values include: 'Segment', 'Query', 'Header'.
     *
     * @return the versioningScheme value
     */
    public String versioningScheme() {
        return this.versioningScheme;
    }

    /**
     * Set an value that determines where the API Version identifer will be located in a HTTP request. Possible values include: 'Segment', 'Query', 'Header'.
     *
     * @param versioningScheme the versioningScheme value to set
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withVersioningScheme(String versioningScheme) {
        this.versioningScheme = versioningScheme;
        return this;
    }

    /**
     * Get name of query parameter that indicates the API Version if versioningScheme is set to `query`.
     *
     * @return the versionQueryName value
     */
    public String versionQueryName() {
        return this.versionQueryName;
    }

    /**
     * Set name of query parameter that indicates the API Version if versioningScheme is set to `query`.
     *
     * @param versionQueryName the versionQueryName value to set
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withVersionQueryName(String versionQueryName) {
        this.versionQueryName = versionQueryName;
        return this;
    }

    /**
     * Get name of HTTP header parameter that indicates the API Version if versioningScheme is set to `header`.
     *
     * @return the versionHeaderName value
     */
    public String versionHeaderName() {
        return this.versionHeaderName;
    }

    /**
     * Set name of HTTP header parameter that indicates the API Version if versioningScheme is set to `header`.
     *
     * @param versionHeaderName the versionHeaderName value to set
     * @return the ApiVersionSetContractDetails object itself.
     */
    public ApiVersionSetContractDetails withVersionHeaderName(String versionHeaderName) {
        this.versionHeaderName = versionHeaderName;
        return this;
    }

}
