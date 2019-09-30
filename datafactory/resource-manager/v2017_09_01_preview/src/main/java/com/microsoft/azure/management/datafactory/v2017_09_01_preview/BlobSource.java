/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Azure Blob source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BlobSource")
public class BlobSource extends CopySource {
    /**
     * Treat empty as null. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "treatEmptyAsNull")
    private Object treatEmptyAsNull;

    /**
     * Number of header lines to skip from each blob. Type: integer (or
     * Expression with resultType integer).
     */
    @JsonProperty(value = "skipHeaderLineCount")
    private Object skipHeaderLineCount;

    /**
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /**
     * Get treat empty as null. Type: boolean (or Expression with resultType boolean).
     *
     * @return the treatEmptyAsNull value
     */
    public Object treatEmptyAsNull() {
        return this.treatEmptyAsNull;
    }

    /**
     * Set treat empty as null. Type: boolean (or Expression with resultType boolean).
     *
     * @param treatEmptyAsNull the treatEmptyAsNull value to set
     * @return the BlobSource object itself.
     */
    public BlobSource withTreatEmptyAsNull(Object treatEmptyAsNull) {
        this.treatEmptyAsNull = treatEmptyAsNull;
        return this;
    }

    /**
     * Get number of header lines to skip from each blob. Type: integer (or Expression with resultType integer).
     *
     * @return the skipHeaderLineCount value
     */
    public Object skipHeaderLineCount() {
        return this.skipHeaderLineCount;
    }

    /**
     * Set number of header lines to skip from each blob. Type: integer (or Expression with resultType integer).
     *
     * @param skipHeaderLineCount the skipHeaderLineCount value to set
     * @return the BlobSource object itself.
     */
    public BlobSource withSkipHeaderLineCount(Object skipHeaderLineCount) {
        this.skipHeaderLineCount = skipHeaderLineCount;
        return this;
    }

    /**
     * Get if true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the recursive value
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set if true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set
     * @return the BlobSource object itself.
     */
    public BlobSource withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

}
