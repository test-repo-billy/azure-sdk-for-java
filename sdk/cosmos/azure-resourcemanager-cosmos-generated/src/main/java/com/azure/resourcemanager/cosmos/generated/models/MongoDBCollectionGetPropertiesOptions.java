// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;

/**
 * The MongoDBCollectionGetPropertiesOptions model.
 */
@Fluent
public final class MongoDBCollectionGetPropertiesOptions extends OptionsResource {
    /**
     * Creates an instance of MongoDBCollectionGetPropertiesOptions class.
     */
    public MongoDBCollectionGetPropertiesOptions() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBCollectionGetPropertiesOptions withThroughput(Integer throughput) {
        super.withThroughput(throughput);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBCollectionGetPropertiesOptions withAutoscaleSettings(AutoscaleSettings autoscaleSettings) {
        super.withAutoscaleSettings(autoscaleSettings);
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
