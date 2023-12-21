// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * File properties.
 */
@JacksonXmlRootElement(localName = "FileProperty")
@Fluent
public final class FileProperty {
    /*
     * Content length of the file. This value may not be up-to-date since an
     * SMB client may have modified the file locally. The value of
     * Content-Length may not reflect that fact until the handle is closed or
     * the op-lock is broken. To retrieve current property values, call Get
     * File Properties.
     */
    @JsonProperty(value = "Content-Length", required = true)
    private long contentLength;

    /**
     * Get the contentLength property: Content length of the file. This value
     * may not be up-to-date since an SMB client may have modified the file
     * locally. The value of Content-Length may not reflect that fact until the
     * handle is closed or the op-lock is broken. To retrieve current property
     * values, call Get File Properties.
     *
     * @return the contentLength value.
     */
    public long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: Content length of the file. This value
     * may not be up-to-date since an SMB client may have modified the file
     * locally. The value of Content-Length may not reflect that fact until the
     * handle is closed or the op-lock is broken. To retrieve current property
     * values, call Get File Properties.
     *
     * @param contentLength the contentLength value to set.
     * @return the FileProperty object itself.
     */
    public FileProperty setContentLength(long contentLength) {
        this.contentLength = contentLength;
        return this;
    }
}
