// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AutoHealCustomAction model. */
@Fluent
public final class AutoHealCustomAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoHealCustomAction.class);

    /*
     * Executable to be run.
     */
    @JsonProperty(value = "exe")
    private String exe;

    /*
     * Parameters for the executable.
     */
    @JsonProperty(value = "parameters")
    private String parameters;

    /**
     * Get the exe property: Executable to be run.
     *
     * @return the exe value.
     */
    public String exe() {
        return this.exe;
    }

    /**
     * Set the exe property: Executable to be run.
     *
     * @param exe the exe value to set.
     * @return the AutoHealCustomAction object itself.
     */
    public AutoHealCustomAction withExe(String exe) {
        this.exe = exe;
        return this;
    }

    /**
     * Get the parameters property: Parameters for the executable.
     *
     * @return the parameters value.
     */
    public String parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters for the executable.
     *
     * @param parameters the parameters value to set.
     * @return the AutoHealCustomAction object itself.
     */
    public AutoHealCustomAction withParameters(String parameters) {
        this.parameters = parameters;
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
