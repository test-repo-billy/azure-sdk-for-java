// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Site config properties dictionary.
 */
@Immutable
public final class SiteConfigPropertiesDictionary {
    /*
     * <code>true</code> if use32BitWorkerProcess should be set to true for the stack; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "use32BitWorkerProcess", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean use32BitWorkerProcess;

    /*
     * LinuxFxVersion configuration setting.
     */
    @JsonProperty(value = "linuxFxVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String linuxFxVersion;

    /*
     * JavaVersion configuration setting.
     */
    @JsonProperty(value = "javaVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String javaVersion;

    /*
     * PowerShellVersion configuration setting.
     */
    @JsonProperty(value = "powerShellVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String powerShellVersion;

    /**
     * Creates an instance of SiteConfigPropertiesDictionary class.
     */
    public SiteConfigPropertiesDictionary() {
    }

    /**
     * Get the use32BitWorkerProcess property: &lt;code&gt;true&lt;/code&gt; if use32BitWorkerProcess should be set to
     * true for the stack; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the use32BitWorkerProcess value.
     */
    public Boolean use32BitWorkerProcess() {
        return this.use32BitWorkerProcess;
    }

    /**
     * Get the linuxFxVersion property: LinuxFxVersion configuration setting.
     * 
     * @return the linuxFxVersion value.
     */
    public String linuxFxVersion() {
        return this.linuxFxVersion;
    }

    /**
     * Get the javaVersion property: JavaVersion configuration setting.
     * 
     * @return the javaVersion value.
     */
    public String javaVersion() {
        return this.javaVersion;
    }

    /**
     * Get the powerShellVersion property: PowerShellVersion configuration setting.
     * 
     * @return the powerShellVersion value.
     */
    public String powerShellVersion() {
        return this.powerShellVersion;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
