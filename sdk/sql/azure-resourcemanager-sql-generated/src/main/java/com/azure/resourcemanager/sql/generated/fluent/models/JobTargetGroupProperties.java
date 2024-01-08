// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.JobTarget;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of job target group.
 */
@Fluent
public final class JobTargetGroupProperties {
    /*
     * Members of the target group.
     */
    @JsonProperty(value = "members", required = true)
    private List<JobTarget> members;

    /**
     * Creates an instance of JobTargetGroupProperties class.
     */
    public JobTargetGroupProperties() {
    }

    /**
     * Get the members property: Members of the target group.
     * 
     * @return the members value.
     */
    public List<JobTarget> members() {
        return this.members;
    }

    /**
     * Set the members property: Members of the target group.
     * 
     * @param members the members value to set.
     * @return the JobTargetGroupProperties object itself.
     */
    public JobTargetGroupProperties withMembers(List<JobTarget> members) {
        this.members = members;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (members() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property members in model JobTargetGroupProperties"));
        } else {
            members().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobTargetGroupProperties.class);
}
