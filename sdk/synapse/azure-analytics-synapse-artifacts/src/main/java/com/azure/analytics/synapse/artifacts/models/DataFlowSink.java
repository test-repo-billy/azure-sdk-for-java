// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Transformation for data flow sink. */
@Fluent
public final class DataFlowSink extends Transformation {
    /*
     * Schema linked service reference.
     */
    @JsonProperty(value = "schemaLinkedService")
    private LinkedServiceReference schemaLinkedService;

    /*
     * Rejected data linked service reference.
     */
    @JsonProperty(value = "rejectedDataLinkedService")
    private LinkedServiceReference rejectedDataLinkedService;

    /** Creates an instance of DataFlowSink class. */
    public DataFlowSink() {}

    /**
     * Get the schemaLinkedService property: Schema linked service reference.
     *
     * @return the schemaLinkedService value.
     */
    public LinkedServiceReference getSchemaLinkedService() {
        return this.schemaLinkedService;
    }

    /**
     * Set the schemaLinkedService property: Schema linked service reference.
     *
     * @param schemaLinkedService the schemaLinkedService value to set.
     * @return the DataFlowSink object itself.
     */
    public DataFlowSink setSchemaLinkedService(LinkedServiceReference schemaLinkedService) {
        this.schemaLinkedService = schemaLinkedService;
        return this;
    }

    /**
     * Get the rejectedDataLinkedService property: Rejected data linked service reference.
     *
     * @return the rejectedDataLinkedService value.
     */
    public LinkedServiceReference getRejectedDataLinkedService() {
        return this.rejectedDataLinkedService;
    }

    /**
     * Set the rejectedDataLinkedService property: Rejected data linked service reference.
     *
     * @param rejectedDataLinkedService the rejectedDataLinkedService value to set.
     * @return the DataFlowSink object itself.
     */
    public DataFlowSink setRejectedDataLinkedService(LinkedServiceReference rejectedDataLinkedService) {
        this.rejectedDataLinkedService = rejectedDataLinkedService;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink setDataset(DatasetReference dataset) {
        super.setDataset(dataset);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink setLinkedService(LinkedServiceReference linkedService) {
        super.setLinkedService(linkedService);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFlowSink setFlowlet(DataFlowReference flowlet) {
        super.setFlowlet(flowlet);
        return this;
    }
}
