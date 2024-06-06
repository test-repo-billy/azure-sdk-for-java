// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Parquet dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Parquet")
@JsonFlatten
@Fluent
public class ParquetDataset extends Dataset {
    /*
     * The location of the parquet storage.
     */
    @JsonProperty(value = "typeProperties.location")
    private DatasetLocation location;

    /*
     * A string from ParquetCompressionCodecEnum or an expression
     */
    @JsonProperty(value = "typeProperties.compressionCodec")
    private Object compressionCodec;

    /** Creates an instance of ParquetDataset class. */
    public ParquetDataset() {}

    /**
     * Get the location property: The location of the parquet storage.
     *
     * @return the location value.
     */
    public DatasetLocation getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location of the parquet storage.
     *
     * @param location the location value to set.
     * @return the ParquetDataset object itself.
     */
    public ParquetDataset setLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the compressionCodec property: A string from ParquetCompressionCodecEnum or an expression.
     *
     * @return the compressionCodec value.
     */
    public Object getCompressionCodec() {
        return this.compressionCodec;
    }

    /**
     * Set the compressionCodec property: A string from ParquetCompressionCodecEnum or an expression.
     *
     * @param compressionCodec the compressionCodec value to set.
     * @return the ParquetDataset object itself.
     */
    public ParquetDataset setCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
