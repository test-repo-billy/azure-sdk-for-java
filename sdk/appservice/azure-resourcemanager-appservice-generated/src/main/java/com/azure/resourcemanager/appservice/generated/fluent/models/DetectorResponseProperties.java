// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.DataProviderMetadata;
import com.azure.resourcemanager.appservice.generated.models.DetectorInfo;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticData;
import com.azure.resourcemanager.appservice.generated.models.QueryUtterancesResults;
import com.azure.resourcemanager.appservice.generated.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * DetectorResponse resource specific properties.
 */
@Fluent
public final class DetectorResponseProperties {
    /*
     * metadata for the detector
     */
    @JsonProperty(value = "metadata")
    private DetectorInfo metadata;

    /*
     * Data Set
     */
    @JsonProperty(value = "dataset")
    private List<DiagnosticData> dataset;

    /*
     * Indicates status of the most severe insight.
     */
    @JsonProperty(value = "status")
    private Status status;

    /*
     * Additional configuration for different data providers to be used by the UI
     */
    @JsonProperty(value = "dataProvidersMetadata")
    private List<DataProviderMetadata> dataProvidersMetadata;

    /*
     * Suggested utterances where the detector can be applicable.
     */
    @JsonProperty(value = "suggestedUtterances")
    private QueryUtterancesResults suggestedUtterances;

    /**
     * Creates an instance of DetectorResponseProperties class.
     */
    public DetectorResponseProperties() {
    }

    /**
     * Get the metadata property: metadata for the detector.
     * 
     * @return the metadata value.
     */
    public DetectorInfo metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: metadata for the detector.
     * 
     * @param metadata the metadata value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withMetadata(DetectorInfo metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the dataset property: Data Set.
     * 
     * @return the dataset value.
     */
    public List<DiagnosticData> dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Data Set.
     * 
     * @param dataset the dataset value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withDataset(List<DiagnosticData> dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the status property: Indicates status of the most severe insight.
     * 
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates status of the most severe insight.
     * 
     * @param status the status value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the dataProvidersMetadata property: Additional configuration for different data providers to be used by the
     * UI.
     * 
     * @return the dataProvidersMetadata value.
     */
    public List<DataProviderMetadata> dataProvidersMetadata() {
        return this.dataProvidersMetadata;
    }

    /**
     * Set the dataProvidersMetadata property: Additional configuration for different data providers to be used by the
     * UI.
     * 
     * @param dataProvidersMetadata the dataProvidersMetadata value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withDataProvidersMetadata(List<DataProviderMetadata> dataProvidersMetadata) {
        this.dataProvidersMetadata = dataProvidersMetadata;
        return this;
    }

    /**
     * Get the suggestedUtterances property: Suggested utterances where the detector can be applicable.
     * 
     * @return the suggestedUtterances value.
     */
    public QueryUtterancesResults suggestedUtterances() {
        return this.suggestedUtterances;
    }

    /**
     * Set the suggestedUtterances property: Suggested utterances where the detector can be applicable.
     * 
     * @param suggestedUtterances the suggestedUtterances value to set.
     * @return the DetectorResponseProperties object itself.
     */
    public DetectorResponseProperties withSuggestedUtterances(QueryUtterancesResults suggestedUtterances) {
        this.suggestedUtterances = suggestedUtterances;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
        if (dataset() != null) {
            dataset().forEach(e -> e.validate());
        }
        if (status() != null) {
            status().validate();
        }
        if (dataProvidersMetadata() != null) {
            dataProvidersMetadata().forEach(e -> e.validate());
        }
        if (suggestedUtterances() != null) {
            suggestedUtterances().validate();
        }
    }
}
