// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Azure data lake store write settings.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = AzureDataLakeStoreWriteSettings.class,
    visible = true)
@JsonTypeName("AzureDataLakeStoreWriteSettings")
@Fluent
public final class AzureDataLakeStoreWriteSettings extends StoreWriteSettings {
    /*
     * The write setting type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "AzureDataLakeStoreWriteSettings";

    /*
     * Specifies the expiry time of the written files. The time is applied to the UTC time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "expiryDateTime")
    private Object expiryDateTime;

    /**
     * Creates an instance of AzureDataLakeStoreWriteSettings class.
     */
    public AzureDataLakeStoreWriteSettings() {
    }

    /**
     * Get the type property: The write setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the expiryDateTime property: Specifies the expiry time of the written files. The time is applied to the UTC
     * time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: string (or Expression with
     * resultType string).
     * 
     * @return the expiryDateTime value.
     */
    public Object expiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * Set the expiryDateTime property: Specifies the expiry time of the written files. The time is applied to the UTC
     * time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: string (or Expression with
     * resultType string).
     * 
     * @param expiryDateTime the expiryDateTime value to set.
     * @return the AzureDataLakeStoreWriteSettings object itself.
     */
    public AzureDataLakeStoreWriteSettings withExpiryDateTime(Object expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreWriteSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreWriteSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreWriteSettings withCopyBehavior(Object copyBehavior) {
        super.withCopyBehavior(copyBehavior);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreWriteSettings withMetadata(List<MetadataItem> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
