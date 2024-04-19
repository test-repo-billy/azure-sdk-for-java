// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input of CheckNameAvailability API.
 */
@Fluent
public final class CheckEndpointNameAvailabilityInput {
    /*
     * The resource name to validate.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of the resource whose name is to be validated.
     */
    @JsonProperty(value = "type", required = true)
    private ResourceType type;

    /*
     * Indicates the endpoint name reuse scope. The default value is TenantReuse.
     */
    @JsonProperty(value = "autoGeneratedDomainNameLabelScope")
    private AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope;

    /**
     * Creates an instance of CheckEndpointNameAvailabilityInput class.
     */
    public CheckEndpointNameAvailabilityInput() {
    }

    /**
     * Get the name property: The resource name to validate.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource name to validate.
     * 
     * @param name the name value to set.
     * @return the CheckEndpointNameAvailabilityInput object itself.
     */
    public CheckEndpointNameAvailabilityInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the resource whose name is to be validated.
     * 
     * @return the type value.
     */
    public ResourceType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the resource whose name is to be validated.
     * 
     * @param type the type value to set.
     * @return the CheckEndpointNameAvailabilityInput object itself.
     */
    public CheckEndpointNameAvailabilityInput withType(ResourceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the autoGeneratedDomainNameLabelScope property: Indicates the endpoint name reuse scope. The default value
     * is TenantReuse.
     * 
     * @return the autoGeneratedDomainNameLabelScope value.
     */
    public AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope() {
        return this.autoGeneratedDomainNameLabelScope;
    }

    /**
     * Set the autoGeneratedDomainNameLabelScope property: Indicates the endpoint name reuse scope. The default value
     * is TenantReuse.
     * 
     * @param autoGeneratedDomainNameLabelScope the autoGeneratedDomainNameLabelScope value to set.
     * @return the CheckEndpointNameAvailabilityInput object itself.
     */
    public CheckEndpointNameAvailabilityInput
        withAutoGeneratedDomainNameLabelScope(AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope) {
        this.autoGeneratedDomainNameLabelScope = autoGeneratedDomainNameLabelScope;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property name in model CheckEndpointNameAvailabilityInput"));
        }
        if (type() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property type in model CheckEndpointNameAvailabilityInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckEndpointNameAvailabilityInput.class);
}
