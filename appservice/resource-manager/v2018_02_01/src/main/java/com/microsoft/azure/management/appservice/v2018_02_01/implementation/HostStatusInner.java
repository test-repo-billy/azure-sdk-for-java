/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Function host status.
 */
public class HostStatusInner {
    /**
     * The host id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The current host state.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * The Function runtime version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * The Function runtime version details.
     */
    @JsonProperty(value = "versionDetails")
    private String versionDetails;

    /**
     * Collection of initialization errors for the host.
     */
    @JsonProperty(value = "errors")
    private List<String> errors;

    /**
     * Get the host id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the host id.
     *
     * @param id the id value to set
     * @return the HostStatusInner object itself.
     */
    public HostStatusInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the current host state.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the current host state.
     *
     * @param state the state value to set
     * @return the HostStatusInner object itself.
     */
    public HostStatusInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the Function runtime version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the Function runtime version.
     *
     * @param version the version value to set
     * @return the HostStatusInner object itself.
     */
    public HostStatusInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the Function runtime version details.
     *
     * @return the versionDetails value
     */
    public String versionDetails() {
        return this.versionDetails;
    }

    /**
     * Set the Function runtime version details.
     *
     * @param versionDetails the versionDetails value to set
     * @return the HostStatusInner object itself.
     */
    public HostStatusInner withVersionDetails(String versionDetails) {
        this.versionDetails = versionDetails;
        return this;
    }

    /**
     * Get collection of initialization errors for the host.
     *
     * @return the errors value
     */
    public List<String> errors() {
        return this.errors;
    }

    /**
     * Set collection of initialization errors for the host.
     *
     * @param errors the errors value to set
     * @return the HostStatusInner object itself.
     */
    public HostStatusInner withErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

}
