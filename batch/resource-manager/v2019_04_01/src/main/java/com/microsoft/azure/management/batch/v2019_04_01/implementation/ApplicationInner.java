/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2019_04_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Contains information about an application in a Batch account.
 */
@JsonFlatten
public class ApplicationInner extends ProxyResource {
    /**
     * The display name for the application.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * A value indicating whether packages within the application may be
     * overwritten using the same version string.
     */
    @JsonProperty(value = "properties.allowUpdates")
    private Boolean allowUpdates;

    /**
     * The package to use if a client requests the application but does not
     * specify a version. This property can only be set to the name of an
     * existing package.
     */
    @JsonProperty(value = "properties.defaultVersion")
    private String defaultVersion;

    /**
     * The ETag of the resource, used for concurrency statements.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the display name for the application.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name for the application.
     *
     * @param displayName the displayName value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get a value indicating whether packages within the application may be overwritten using the same version string.
     *
     * @return the allowUpdates value
     */
    public Boolean allowUpdates() {
        return this.allowUpdates;
    }

    /**
     * Set a value indicating whether packages within the application may be overwritten using the same version string.
     *
     * @param allowUpdates the allowUpdates value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withAllowUpdates(Boolean allowUpdates) {
        this.allowUpdates = allowUpdates;
        return this;
    }

    /**
     * Get the package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
     *
     * @return the defaultVersion value
     */
    public String defaultVersion() {
        return this.defaultVersion;
    }

    /**
     * Set the package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
     *
     * @param defaultVersion the defaultVersion value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }

    /**
     * Get the ETag of the resource, used for concurrency statements.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
