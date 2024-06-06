// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KqlScriptContent model. */
@Fluent
public final class KqlScriptContent {
    /*
     * The query property.
     */
    @JsonProperty(value = "query")
    private String query;

    /*
     * The metadata property.
     */
    @JsonProperty(value = "metadata")
    private KqlScriptContentMetadata metadata;

    /*
     * The currentConnection property.
     */
    @JsonProperty(value = "currentConnection")
    private KqlScriptContentCurrentConnection currentConnection;

    /** Creates an instance of KqlScriptContent class. */
    public KqlScriptContent() {}

    /**
     * Get the query property: The query property.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The query property.
     *
     * @param query the query value to set.
     * @return the KqlScriptContent object itself.
     */
    public KqlScriptContent setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public KqlScriptContentMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the KqlScriptContent object itself.
     */
    public KqlScriptContent setMetadata(KqlScriptContentMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the currentConnection property: The currentConnection property.
     *
     * @return the currentConnection value.
     */
    public KqlScriptContentCurrentConnection getCurrentConnection() {
        return this.currentConnection;
    }

    /**
     * Set the currentConnection property: The currentConnection property.
     *
     * @param currentConnection the currentConnection value to set.
     * @return the KqlScriptContent object itself.
     */
    public KqlScriptContent setCurrentConnection(KqlScriptContentCurrentConnection currentConnection) {
        this.currentConnection = currentConnection;
        return this;
    }
}
