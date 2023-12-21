/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Properties of the file or directory.
 */
@JsonFlatten
public class FileInner {
    /**
     * Name of the file.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Indicates if the file is a directory.
     */
    @JsonProperty(value = "isDirectory", required = true)
    private boolean isDirectory;

    /**
     * Will contain an URL to download the corresponding file. The downloadUrl
     * is not returned for directories.
     */
    @JsonProperty(value = "downloadUrl")
    private String downloadUrl;

    /**
     * The time at which the file was last modified.
     * The time at which the file was last modified.
     */
    @JsonProperty(value = "properties.lastModified")
    private DateTime lastModified;

    /**
     * The file size.
     * The file size.
     */
    @JsonProperty(value = "properties.contentLength")
    private Long contentLength;

    /**
     * Get name of the file.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the file.
     *
     * @param name the name value to set
     * @return the FileInner object itself.
     */
    public FileInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get indicates if the file is a directory.
     *
     * @return the isDirectory value
     */
    public boolean isDirectory() {
        return this.isDirectory;
    }

    /**
     * Set indicates if the file is a directory.
     *
     * @param isDirectory the isDirectory value to set
     * @return the FileInner object itself.
     */
    public FileInner withIsDirectory(boolean isDirectory) {
        this.isDirectory = isDirectory;
        return this;
    }

    /**
     * Get the downloadUrl value.
     *
     * @return the downloadUrl value
     */
    public String downloadUrl() {
        return this.downloadUrl;
    }

    /**
     * Set the downloadUrl value.
     *
     * @param downloadUrl the downloadUrl value to set
     * @return the FileInner object itself.
     */
    public FileInner withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Get the time at which the file was last modified.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Set the time at which the file was last modified.
     *
     * @param lastModified the lastModified value to set
     * @return the FileInner object itself.
     */
    public FileInner withLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the file size.
     *
     * @return the contentLength value
     */
    public Long contentLength() {
        return this.contentLength;
    }

    /**
     * Set the file size.
     *
     * @param contentLength the contentLength value to set
     * @return the FileInner object itself.
     */
    public FileInner withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

}
