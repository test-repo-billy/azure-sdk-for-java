// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** This activity suspends pipeline execution for the specified interval. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Wait")
@JsonFlatten
@Fluent
public class WaitActivity extends ControlActivity {
    /*
     * Duration in seconds.
     */
    @JsonProperty(value = "typeProperties.waitTimeInSeconds", required = true)
    private Object waitTimeInSeconds;

    /** Creates an instance of WaitActivity class. */
    public WaitActivity() {}

    /**
     * Get the waitTimeInSeconds property: Duration in seconds.
     *
     * @return the waitTimeInSeconds value.
     */
    public Object getWaitTimeInSeconds() {
        return this.waitTimeInSeconds;
    }

    /**
     * Set the waitTimeInSeconds property: Duration in seconds.
     *
     * @param waitTimeInSeconds the waitTimeInSeconds value to set.
     * @return the WaitActivity object itself.
     */
    public WaitActivity setWaitTimeInSeconds(Object waitTimeInSeconds) {
        this.waitTimeInSeconds = waitTimeInSeconds;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WaitActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WaitActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WaitActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WaitActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WaitActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WaitActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }
}
