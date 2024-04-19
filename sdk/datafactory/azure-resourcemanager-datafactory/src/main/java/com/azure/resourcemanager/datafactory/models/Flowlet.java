// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.FlowletTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Data flow flowlet.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = Flowlet.class, visible = true)
@JsonTypeName("Flowlet")
@Fluent
public final class Flowlet extends DataFlow {
    /*
     * Type of data flow.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "Flowlet";

    /*
     * Flowlet type properties.
     */
    @JsonProperty(value = "typeProperties")
    private FlowletTypeProperties innerTypeProperties;

    /**
     * Creates an instance of Flowlet class.
     */
    public Flowlet() {
    }

    /**
     * Get the type property: Type of data flow.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Flowlet type properties.
     * 
     * @return the innerTypeProperties value.
     */
    private FlowletTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flowlet withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flowlet withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flowlet withFolder(DataFlowFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the sources property: List of sources in Flowlet.
     * 
     * @return the sources value.
     */
    public List<DataFlowSource> sources() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sources();
    }

    /**
     * Set the sources property: List of sources in Flowlet.
     * 
     * @param sources the sources value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet withSources(List<DataFlowSource> sources) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FlowletTypeProperties();
        }
        this.innerTypeProperties().withSources(sources);
        return this;
    }

    /**
     * Get the sinks property: List of sinks in Flowlet.
     * 
     * @return the sinks value.
     */
    public List<DataFlowSink> sinks() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sinks();
    }

    /**
     * Set the sinks property: List of sinks in Flowlet.
     * 
     * @param sinks the sinks value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet withSinks(List<DataFlowSink> sinks) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FlowletTypeProperties();
        }
        this.innerTypeProperties().withSinks(sinks);
        return this;
    }

    /**
     * Get the transformations property: List of transformations in Flowlet.
     * 
     * @return the transformations value.
     */
    public List<Transformation> transformations() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().transformations();
    }

    /**
     * Set the transformations property: List of transformations in Flowlet.
     * 
     * @param transformations the transformations value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet withTransformations(List<Transformation> transformations) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FlowletTypeProperties();
        }
        this.innerTypeProperties().withTransformations(transformations);
        return this;
    }

    /**
     * Get the script property: Flowlet script.
     * 
     * @return the script value.
     */
    public String script() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().script();
    }

    /**
     * Set the script property: Flowlet script.
     * 
     * @param script the script value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet withScript(String script) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FlowletTypeProperties();
        }
        this.innerTypeProperties().withScript(script);
        return this;
    }

    /**
     * Get the scriptLines property: Flowlet script lines.
     * 
     * @return the scriptLines value.
     */
    public List<String> scriptLines() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scriptLines();
    }

    /**
     * Set the scriptLines property: Flowlet script lines.
     * 
     * @param scriptLines the scriptLines value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet withScriptLines(List<String> scriptLines) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FlowletTypeProperties();
        }
        this.innerTypeProperties().withScriptLines(scriptLines);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
