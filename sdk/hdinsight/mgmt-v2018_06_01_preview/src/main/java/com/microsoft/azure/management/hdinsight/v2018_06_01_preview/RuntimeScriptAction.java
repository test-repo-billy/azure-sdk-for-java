/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a script action on a running cluster.
 */
public class RuntimeScriptAction {
    /**
     * The name of the script action.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The URI to the script.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /**
     * The parameters for the script.
     */
    @JsonProperty(value = "parameters")
    private String parameters;

    /**
     * The list of roles where script will be executed.
     */
    @JsonProperty(value = "roles", required = true)
    private List<String> roles;

    /**
     * The application name of the script action, if any.
     */
    @JsonProperty(value = "applicationName", access = JsonProperty.Access.WRITE_ONLY)
    private String applicationName;

    /**
     * Get the name of the script action.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the script action.
     *
     * @param name the name value to set
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the URI to the script.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the URI to the script.
     *
     * @param uri the uri value to set
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the parameters for the script.
     *
     * @return the parameters value
     */
    public String parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters for the script.
     *
     * @param parameters the parameters value to set
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the list of roles where script will be executed.
     *
     * @return the roles value
     */
    public List<String> roles() {
        return this.roles;
    }

    /**
     * Set the list of roles where script will be executed.
     *
     * @param roles the roles value to set
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the application name of the script action, if any.
     *
     * @return the applicationName value
     */
    public String applicationName() {
        return this.applicationName;
    }

}
