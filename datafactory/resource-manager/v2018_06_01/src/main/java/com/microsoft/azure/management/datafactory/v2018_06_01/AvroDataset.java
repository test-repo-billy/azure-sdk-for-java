/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * Avro dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Avro")
@JsonFlatten
public class AvroDataset extends DatasetInner {
    /**
     * The location of the avro storage.
     */
    @JsonProperty(value = "typeProperties.location", required = true)
    private DatasetLocation location;

    /**
     * Possible values include: 'none', 'deflate', 'snappy', 'xz', 'bzip2'.
     */
    @JsonProperty(value = "typeProperties.avroCompressionCodec")
    private AvroCompressionCodec avroCompressionCodec;

    /**
     * The avroCompressionLevel property.
     */
    @JsonProperty(value = "typeProperties.avroCompressionLevel")
    private Integer avroCompressionLevel;

    /**
     * Get the location of the avro storage.
     *
     * @return the location value
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location of the avro storage.
     *
     * @param location the location value to set
     * @return the AvroDataset object itself.
     */
    public AvroDataset withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get possible values include: 'none', 'deflate', 'snappy', 'xz', 'bzip2'.
     *
     * @return the avroCompressionCodec value
     */
    public AvroCompressionCodec avroCompressionCodec() {
        return this.avroCompressionCodec;
    }

    /**
     * Set possible values include: 'none', 'deflate', 'snappy', 'xz', 'bzip2'.
     *
     * @param avroCompressionCodec the avroCompressionCodec value to set
     * @return the AvroDataset object itself.
     */
    public AvroDataset withAvroCompressionCodec(AvroCompressionCodec avroCompressionCodec) {
        this.avroCompressionCodec = avroCompressionCodec;
        return this;
    }

    /**
     * Get the avroCompressionLevel value.
     *
     * @return the avroCompressionLevel value
     */
    public Integer avroCompressionLevel() {
        return this.avroCompressionLevel;
    }

    /**
     * Set the avroCompressionLevel value.
     *
     * @param avroCompressionLevel the avroCompressionLevel value to set
     * @return the AvroDataset object itself.
     */
    public AvroDataset withAvroCompressionLevel(Integer avroCompressionLevel) {
        this.avroCompressionLevel = avroCompressionLevel;
        return this;
    }

}
