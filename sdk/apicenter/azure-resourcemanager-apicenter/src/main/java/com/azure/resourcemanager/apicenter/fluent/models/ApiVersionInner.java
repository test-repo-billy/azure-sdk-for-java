// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.apicenter.models.LifecycleStage;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API version
 * 
 * API version entity.
 */
@Fluent
public final class ApiVersionInner extends ProxyResource {
    /*
     * API version properties
     * 
     * API version properties entity.
     */
    @JsonProperty(value = "properties")
    private ApiVersionProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ApiVersionInner class.
     */
    public ApiVersionInner() {
    }

    /**
     * Get the innerProperties property: API version properties
     * 
     * API version properties entity.
     * 
     * @return the innerProperties value.
     */
    private ApiVersionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the title property: API version title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: API version title.
     * 
     * @param title the title value to set.
     * @return the ApiVersionInner object itself.
     */
    public ApiVersionInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiVersionProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the lifecycleStage property: Current lifecycle stage of the API.
     * 
     * @return the lifecycleStage value.
     */
    public LifecycleStage lifecycleStage() {
        return this.innerProperties() == null ? null : this.innerProperties().lifecycleStage();
    }

    /**
     * Set the lifecycleStage property: Current lifecycle stage of the API.
     * 
     * @param lifecycleStage the lifecycleStage value to set.
     * @return the ApiVersionInner object itself.
     */
    public ApiVersionInner withLifecycleStage(LifecycleStage lifecycleStage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiVersionProperties();
        }
        this.innerProperties().withLifecycleStage(lifecycleStage);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
