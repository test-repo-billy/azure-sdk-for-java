/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupEngineBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The base backup engine class. All workload specific backup engines derive
 * from this class.
 */
@SkipParentValidation
public class BackupEngineBaseResourceInner extends Resource {
    /**
     * BackupEngineBaseResource properties.
     */
    @JsonProperty(value = "properties")
    private BackupEngineBase properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get backupEngineBaseResource properties.
     *
     * @return the properties value
     */
    public BackupEngineBase properties() {
        return this.properties;
    }

    /**
     * Set backupEngineBaseResource properties.
     *
     * @param properties the properties value to set
     * @return the BackupEngineBaseResourceInner object itself.
     */
    public BackupEngineBaseResourceInner withProperties(BackupEngineBase properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get optional ETag.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set optional ETag.
     *
     * @param eTag the eTag value to set
     * @return the BackupEngineBaseResourceInner object itself.
     */
    public BackupEngineBaseResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
