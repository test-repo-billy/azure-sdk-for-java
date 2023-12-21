/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Base class for restore request. Workload-specific restore requests are
 * derived from this class.
 */
@SkipParentValidation
public class RestoreRequestResource extends Resource {
    /**
     * RestoreRequestResource properties.
     */
    @JsonProperty(value = "properties")
    private RestoreRequest properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get restoreRequestResource properties.
     *
     * @return the properties value
     */
    public RestoreRequest properties() {
        return this.properties;
    }

    /**
     * Set restoreRequestResource properties.
     *
     * @param properties the properties value to set
     * @return the RestoreRequestResource object itself.
     */
    public RestoreRequestResource withProperties(RestoreRequest properties) {
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
     * @return the RestoreRequestResource object itself.
     */
    public RestoreRequestResource withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
