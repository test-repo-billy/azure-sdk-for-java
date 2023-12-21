// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.AutomaticTuningServerMode;
import com.azure.resourcemanager.sql.models.AutomaticTuningServerOptions;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ServerAutomaticTuning model. */
@JsonFlatten
@Fluent
public class ServerAutomaticTuningInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerAutomaticTuningInner.class);

    /*
     * Automatic tuning desired state.
     */
    @JsonProperty(value = "properties.desiredState")
    private AutomaticTuningServerMode desiredState;

    /*
     * Automatic tuning actual state.
     */
    @JsonProperty(value = "properties.actualState", access = JsonProperty.Access.WRITE_ONLY)
    private AutomaticTuningServerMode actualState;

    /*
     * Automatic tuning options definition.
     */
    @JsonProperty(value = "properties.options")
    private Map<String, AutomaticTuningServerOptions> options;

    /**
     * Get the desiredState property: Automatic tuning desired state.
     *
     * @return the desiredState value.
     */
    public AutomaticTuningServerMode desiredState() {
        return this.desiredState;
    }

    /**
     * Set the desiredState property: Automatic tuning desired state.
     *
     * @param desiredState the desiredState value to set.
     * @return the ServerAutomaticTuningInner object itself.
     */
    public ServerAutomaticTuningInner withDesiredState(AutomaticTuningServerMode desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    /**
     * Get the actualState property: Automatic tuning actual state.
     *
     * @return the actualState value.
     */
    public AutomaticTuningServerMode actualState() {
        return this.actualState;
    }

    /**
     * Get the options property: Automatic tuning options definition.
     *
     * @return the options value.
     */
    public Map<String, AutomaticTuningServerOptions> options() {
        return this.options;
    }

    /**
     * Set the options property: Automatic tuning options definition.
     *
     * @param options the options value to set.
     * @return the ServerAutomaticTuningInner object itself.
     */
    public ServerAutomaticTuningInner withOptions(Map<String, AutomaticTuningServerOptions> options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (options() != null) {
            options()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
