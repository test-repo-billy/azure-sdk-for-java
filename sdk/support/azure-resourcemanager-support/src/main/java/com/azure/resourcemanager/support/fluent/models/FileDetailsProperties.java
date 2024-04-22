// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Describes the properties of a file.
 */
@Fluent
public final class FileDetailsProperties {
    /*
     * Time in UTC (ISO 8601 format) when file workspace was created.
     */
    @JsonProperty(value = "createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Size of each chunk
     */
    @JsonProperty(value = "chunkSize")
    private Integer chunkSize;

    /*
     * Size of the file to be uploaded
     */
    @JsonProperty(value = "fileSize")
    private Integer fileSize;

    /*
     * Number of chunks to be uploaded
     */
    @JsonProperty(value = "numberOfChunks")
    private Integer numberOfChunks;

    /**
     * Creates an instance of FileDetailsProperties class.
     */
    public FileDetailsProperties() {
    }

    /**
     * Get the createdOn property: Time in UTC (ISO 8601 format) when file workspace was created.
     * 
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the chunkSize property: Size of each chunk.
     * 
     * @return the chunkSize value.
     */
    public Integer chunkSize() {
        return this.chunkSize;
    }

    /**
     * Set the chunkSize property: Size of each chunk.
     * 
     * @param chunkSize the chunkSize value to set.
     * @return the FileDetailsProperties object itself.
     */
    public FileDetailsProperties withChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }

    /**
     * Get the fileSize property: Size of the file to be uploaded.
     * 
     * @return the fileSize value.
     */
    public Integer fileSize() {
        return this.fileSize;
    }

    /**
     * Set the fileSize property: Size of the file to be uploaded.
     * 
     * @param fileSize the fileSize value to set.
     * @return the FileDetailsProperties object itself.
     */
    public FileDetailsProperties withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * Get the numberOfChunks property: Number of chunks to be uploaded.
     * 
     * @return the numberOfChunks value.
     */
    public Integer numberOfChunks() {
        return this.numberOfChunks;
    }

    /**
     * Set the numberOfChunks property: Number of chunks to be uploaded.
     * 
     * @param numberOfChunks the numberOfChunks value to set.
     * @return the FileDetailsProperties object itself.
     */
    public FileDetailsProperties withNumberOfChunks(Integer numberOfChunks) {
        this.numberOfChunks = numberOfChunks;
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
