// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Staging settings. */
@Fluent
public final class StagingSettings {
    /*
     * Staging linked service reference.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /*
     * The path to storage for storing the interim data. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "path")
    private Object path;

    /*
     * Specifies whether to use compression when copying data via an interim staging. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "enableCompression")
    private Object enableCompression;

    /*
     * Staging settings.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of StagingSettings class. */
    public StagingSettings() {}

    /**
     * Get the linkedServiceName property: Staging linked service reference.
     *
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Staging linked service reference.
     *
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the StagingSettings object itself.
     */
    public StagingSettings setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the path property: The path to storage for storing the interim data. Type: string (or Expression with
     * resultType string).
     *
     * @return the path value.
     */
    public Object getPath() {
        return this.path;
    }

    /**
     * Set the path property: The path to storage for storing the interim data. Type: string (or Expression with
     * resultType string).
     *
     * @param path the path value to set.
     * @return the StagingSettings object itself.
     */
    public StagingSettings setPath(Object path) {
        this.path = path;
        return this;
    }

    /**
     * Get the enableCompression property: Specifies whether to use compression when copying data via an interim
     * staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableCompression value.
     */
    public Object getEnableCompression() {
        return this.enableCompression;
    }

    /**
     * Set the enableCompression property: Specifies whether to use compression when copying data via an interim
     * staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableCompression the enableCompression value to set.
     * @return the StagingSettings object itself.
     */
    public StagingSettings setEnableCompression(Object enableCompression) {
        this.enableCompression = enableCompression;
        return this;
    }

    /**
     * Get the additionalProperties property: Staging settings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Staging settings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the StagingSettings object itself.
     */
    public StagingSettings setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
