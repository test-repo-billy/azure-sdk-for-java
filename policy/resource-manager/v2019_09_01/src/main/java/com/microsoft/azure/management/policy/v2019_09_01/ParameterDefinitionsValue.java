/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2019_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ParameterDefinitionsValue model.
 */
public class ParameterDefinitionsValue {
    /**
     * The data type of the parameter. Possible values include: 'String',
     * 'Array', 'Object', 'Boolean', 'Integer', 'Float', 'DateTime'.
     */
    @JsonProperty(value = "type")
    private ParameterType type;

    /**
     * The allowed values for the parameter.
     */
    @JsonProperty(value = "allowedValues")
    private List<Object> allowedValues;

    /**
     * The default value for the parameter if no value is provided.
     */
    @JsonProperty(value = "defaultValue")
    private Object defaultValue;

    /**
     * General metadata for the parameter.
     */
    @JsonProperty(value = "metadata")
    private ParameterDefinitionsValueMetadata metadata;

    /**
     * Get the data type of the parameter. Possible values include: 'String', 'Array', 'Object', 'Boolean', 'Integer', 'Float', 'DateTime'.
     *
     * @return the type value
     */
    public ParameterType type() {
        return this.type;
    }

    /**
     * Set the data type of the parameter. Possible values include: 'String', 'Array', 'Object', 'Boolean', 'Integer', 'Float', 'DateTime'.
     *
     * @param type the type value to set
     * @return the ParameterDefinitionsValue object itself.
     */
    public ParameterDefinitionsValue withType(ParameterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the allowed values for the parameter.
     *
     * @return the allowedValues value
     */
    public List<Object> allowedValues() {
        return this.allowedValues;
    }

    /**
     * Set the allowed values for the parameter.
     *
     * @param allowedValues the allowedValues value to set
     * @return the ParameterDefinitionsValue object itself.
     */
    public ParameterDefinitionsValue withAllowedValues(List<Object> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * Get the default value for the parameter if no value is provided.
     *
     * @return the defaultValue value
     */
    public Object defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the default value for the parameter if no value is provided.
     *
     * @param defaultValue the defaultValue value to set
     * @return the ParameterDefinitionsValue object itself.
     */
    public ParameterDefinitionsValue withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Get general metadata for the parameter.
     *
     * @return the metadata value
     */
    public ParameterDefinitionsValueMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set general metadata for the parameter.
     *
     * @param metadata the metadata value to set
     * @return the ParameterDefinitionsValue object itself.
     */
    public ParameterDefinitionsValue withMetadata(ParameterDefinitionsValueMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

}
