// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.apicenter.models.MetadataAssignment;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Metadata schema
 * 
 * Metadata schema entity. Used to define metadata for the entities in API catalog.
 */
@Fluent
public final class MetadataSchemaInner extends ProxyResource {
    /*
     * Metadata schema properties
     * 
     * Metadata schema properties.
     */
    @JsonProperty(value = "properties")
    private MetadataSchemaProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of MetadataSchemaInner class.
     */
    public MetadataSchemaInner() {
    }

    /**
     * Get the innerProperties property: Metadata schema properties
     * 
     * Metadata schema properties.
     * 
     * @return the innerProperties value.
     */
    private MetadataSchemaProperties innerProperties() {
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
     * Get the schema property: The schema defining the type.
     * 
     * @return the schema value.
     */
    public String schema() {
        return this.innerProperties() == null ? null : this.innerProperties().schema();
    }

    /**
     * Set the schema property: The schema defining the type.
     * 
     * @param schema the schema value to set.
     * @return the MetadataSchemaInner object itself.
     */
    public MetadataSchemaInner withSchema(String schema) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataSchemaProperties();
        }
        this.innerProperties().withSchema(schema);
        return this;
    }

    /**
     * Get the assignedTo property: The assignedTo property.
     * 
     * @return the assignedTo value.
     */
    public List<MetadataAssignment> assignedTo() {
        return this.innerProperties() == null ? null : this.innerProperties().assignedTo();
    }

    /**
     * Set the assignedTo property: The assignedTo property.
     * 
     * @param assignedTo the assignedTo value to set.
     * @return the MetadataSchemaInner object itself.
     */
    public MetadataSchemaInner withAssignedTo(List<MetadataAssignment> assignedTo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataSchemaProperties();
        }
        this.innerProperties().withAssignedTo(assignedTo);
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
