/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The request parameters for scheduling a run.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = RunRequest.class)
@JsonTypeName("RunRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DockerBuildRequest", value = DockerBuildRequest.class),
    @JsonSubTypes.Type(name = "FileTaskRunRequest", value = FileTaskRunRequest.class),
    @JsonSubTypes.Type(name = "TaskRunRequest", value = TaskRunRequest.class),
    @JsonSubTypes.Type(name = "EncodedTaskRunRequest", value = EncodedTaskRunRequest.class)
})
public class RunRequest {
    /**
     * The value that indicates whether archiving is enabled for the run or
     * not.
     */
    @JsonProperty(value = "isArchiveEnabled")
    private Boolean isArchiveEnabled;

    /**
     * Get the value that indicates whether archiving is enabled for the run or not.
     *
     * @return the isArchiveEnabled value
     */
    public Boolean isArchiveEnabled() {
        return this.isArchiveEnabled;
    }

    /**
     * Set the value that indicates whether archiving is enabled for the run or not.
     *
     * @param isArchiveEnabled the isArchiveEnabled value to set
     * @return the RunRequest object itself.
     */
    public RunRequest withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.isArchiveEnabled = isArchiveEnabled;
        return this;
    }

}
