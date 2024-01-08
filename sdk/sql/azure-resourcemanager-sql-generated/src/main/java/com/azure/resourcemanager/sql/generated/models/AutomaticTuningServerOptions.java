// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Automatic tuning properties for individual advisors.
 */
@Fluent
public final class AutomaticTuningServerOptions {
    /*
     * Automatic tuning option desired state.
     */
    @JsonProperty(value = "desiredState")
    private AutomaticTuningOptionModeDesired desiredState;

    /*
     * Automatic tuning option actual state.
     */
    @JsonProperty(value = "actualState", access = JsonProperty.Access.WRITE_ONLY)
    private AutomaticTuningOptionModeActual actualState;

    /*
     * Reason code if desired and actual state are different.
     */
    @JsonProperty(value = "reasonCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer reasonCode;

    /*
     * Reason description if desired and actual state are different.
     */
    @JsonProperty(value = "reasonDesc", access = JsonProperty.Access.WRITE_ONLY)
    private AutomaticTuningServerReason reasonDesc;

    /**
     * Creates an instance of AutomaticTuningServerOptions class.
     */
    public AutomaticTuningServerOptions() {
    }

    /**
     * Get the desiredState property: Automatic tuning option desired state.
     * 
     * @return the desiredState value.
     */
    public AutomaticTuningOptionModeDesired desiredState() {
        return this.desiredState;
    }

    /**
     * Set the desiredState property: Automatic tuning option desired state.
     * 
     * @param desiredState the desiredState value to set.
     * @return the AutomaticTuningServerOptions object itself.
     */
    public AutomaticTuningServerOptions withDesiredState(AutomaticTuningOptionModeDesired desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    /**
     * Get the actualState property: Automatic tuning option actual state.
     * 
     * @return the actualState value.
     */
    public AutomaticTuningOptionModeActual actualState() {
        return this.actualState;
    }

    /**
     * Get the reasonCode property: Reason code if desired and actual state are different.
     * 
     * @return the reasonCode value.
     */
    public Integer reasonCode() {
        return this.reasonCode;
    }

    /**
     * Get the reasonDesc property: Reason description if desired and actual state are different.
     * 
     * @return the reasonDesc value.
     */
    public AutomaticTuningServerReason reasonDesc() {
        return this.reasonDesc;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
