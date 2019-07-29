/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Execute pipeline activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ExecutePipeline")
@JsonFlatten
public class ExecutePipelineActivity extends ControlActivity {
    /**
     * Pipeline reference.
     */
    @JsonProperty(value = "typeProperties.pipeline", required = true)
    private PipelineReference pipeline;

    /**
     * Pipeline parameters.
     */
    @JsonProperty(value = "typeProperties.parameters")
    private Map<String, Object> parameters;

    /**
     * Defines whether activity execution will wait for the dependent pipeline
     * execution to finish. Default is false.
     */
    @JsonProperty(value = "typeProperties.waitOnCompletion")
    private Boolean waitOnCompletion;

    /**
     * Get pipeline reference.
     *
     * @return the pipeline value
     */
    public PipelineReference pipeline() {
        return this.pipeline;
    }

    /**
     * Set pipeline reference.
     *
     * @param pipeline the pipeline value to set
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withPipeline(PipelineReference pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Get pipeline parameters.
     *
     * @return the parameters value
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set pipeline parameters.
     *
     * @param parameters the parameters value to set
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     *
     * @return the waitOnCompletion value
     */
    public Boolean waitOnCompletion() {
        return this.waitOnCompletion;
    }

    /**
     * Set defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     *
     * @param waitOnCompletion the waitOnCompletion value to set
     * @return the ExecutePipelineActivity object itself.
     */
    public ExecutePipelineActivity withWaitOnCompletion(Boolean waitOnCompletion) {
        this.waitOnCompletion = waitOnCompletion;
        return this;
    }

}
