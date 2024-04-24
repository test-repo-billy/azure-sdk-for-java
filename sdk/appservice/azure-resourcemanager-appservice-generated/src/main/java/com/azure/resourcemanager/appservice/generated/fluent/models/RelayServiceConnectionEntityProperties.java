// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RelayServiceConnectionEntity resource specific properties.
 */
@Fluent
public final class RelayServiceConnectionEntityProperties {
    /*
     * The entityName property.
     */
    @JsonProperty(value = "entityName")
    private String entityName;

    /*
     * The entityConnectionString property.
     */
    @JsonProperty(value = "entityConnectionString")
    private String entityConnectionString;

    /*
     * The resourceType property.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The resourceConnectionString property.
     */
    @JsonProperty(value = "resourceConnectionString")
    private String resourceConnectionString;

    /*
     * The hostname property.
     */
    @JsonProperty(value = "hostname")
    private String hostname;

    /*
     * The port property.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The biztalkUri property.
     */
    @JsonProperty(value = "biztalkUri")
    private String biztalkUri;

    /**
     * Creates an instance of RelayServiceConnectionEntityProperties class.
     */
    public RelayServiceConnectionEntityProperties() {
    }

    /**
     * Get the entityName property: The entityName property.
     * 
     * @return the entityName value.
     */
    public String entityName() {
        return this.entityName;
    }

    /**
     * Set the entityName property: The entityName property.
     * 
     * @param entityName the entityName value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * Get the entityConnectionString property: The entityConnectionString property.
     * 
     * @return the entityConnectionString value.
     */
    public String entityConnectionString() {
        return this.entityConnectionString;
    }

    /**
     * Set the entityConnectionString property: The entityConnectionString property.
     * 
     * @param entityConnectionString the entityConnectionString value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withEntityConnectionString(String entityConnectionString) {
        this.entityConnectionString = entityConnectionString;
        return this;
    }

    /**
     * Get the resourceType property: The resourceType property.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resourceType property.
     * 
     * @param resourceType the resourceType value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceConnectionString property: The resourceConnectionString property.
     * 
     * @return the resourceConnectionString value.
     */
    public String resourceConnectionString() {
        return this.resourceConnectionString;
    }

    /**
     * Set the resourceConnectionString property: The resourceConnectionString property.
     * 
     * @param resourceConnectionString the resourceConnectionString value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withResourceConnectionString(String resourceConnectionString) {
        this.resourceConnectionString = resourceConnectionString;
        return this;
    }

    /**
     * Get the hostname property: The hostname property.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The hostname property.
     * 
     * @param hostname the hostname value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port property: The port property.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port property.
     * 
     * @param port the port value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the biztalkUri property: The biztalkUri property.
     * 
     * @return the biztalkUri value.
     */
    public String biztalkUri() {
        return this.biztalkUri;
    }

    /**
     * Set the biztalkUri property: The biztalkUri property.
     * 
     * @param biztalkUri the biztalkUri value to set.
     * @return the RelayServiceConnectionEntityProperties object itself.
     */
    public RelayServiceConnectionEntityProperties withBiztalkUri(String biztalkUri) {
        this.biztalkUri = biztalkUri;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
