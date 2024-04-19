// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The TarGZip compression read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = TarGZipReadSettings.class, visible = true)
@JsonTypeName("TarGZipReadSettings")
@Fluent
public final class TarGZipReadSettings extends CompressionReadSettings {
    /*
     * The Compression setting type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "TarGZipReadSettings";

    /*
     * Preserve the compression file name as folder path. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "preserveCompressionFileNameAsFolder")
    private Object preserveCompressionFileNameAsFolder;

    /**
     * Creates an instance of TarGZipReadSettings class.
     */
    public TarGZipReadSettings() {
    }

    /**
     * Get the type property: The Compression setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the preserveCompressionFileNameAsFolder property: Preserve the compression file name as folder path. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the preserveCompressionFileNameAsFolder value.
     */
    public Object preserveCompressionFileNameAsFolder() {
        return this.preserveCompressionFileNameAsFolder;
    }

    /**
     * Set the preserveCompressionFileNameAsFolder property: Preserve the compression file name as folder path. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param preserveCompressionFileNameAsFolder the preserveCompressionFileNameAsFolder value to set.
     * @return the TarGZipReadSettings object itself.
     */
    public TarGZipReadSettings withPreserveCompressionFileNameAsFolder(Object preserveCompressionFileNameAsFolder) {
        this.preserveCompressionFileNameAsFolder = preserveCompressionFileNameAsFolder;
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
