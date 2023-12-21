// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ServiceAssociationLink model. */
@JsonFlatten
@Fluent
public class ServiceAssociationLink extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceAssociationLink.class);

    /*
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Resource type of the linked resource.
     */
    @JsonProperty(value = "properties.linkedResourceType")
    private String linkedResourceType;

    /*
     * Link to the external resource.
     */
    @JsonProperty(value = "properties.link")
    private String link;

    /*
     * Provisioning state of the ServiceAssociationLink resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * If true, the resource can be deleted.
     */
    @JsonProperty(value = "properties.allowDelete")
    private Boolean allowDelete;

    /*
     * A list of locations.
     */
    @JsonProperty(value = "properties.locations")
    private List<String> locations;

    /**
     * Get the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the linkedResourceType property: Resource type of the linked resource.
     *
     * @return the linkedResourceType value.
     */
    public String linkedResourceType() {
        return this.linkedResourceType;
    }

    /**
     * Set the linkedResourceType property: Resource type of the linked resource.
     *
     * @param linkedResourceType the linkedResourceType value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withLinkedResourceType(String linkedResourceType) {
        this.linkedResourceType = linkedResourceType;
        return this;
    }

    /**
     * Get the link property: Link to the external resource.
     *
     * @return the link value.
     */
    public String link() {
        return this.link;
    }

    /**
     * Set the link property: Link to the external resource.
     *
     * @param link the link value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the ServiceAssociationLink resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the allowDelete property: If true, the resource can be deleted.
     *
     * @return the allowDelete value.
     */
    public Boolean allowDelete() {
        return this.allowDelete;
    }

    /**
     * Set the allowDelete property: If true, the resource can be deleted.
     *
     * @param allowDelete the allowDelete value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withAllowDelete(Boolean allowDelete) {
        this.allowDelete = allowDelete;
        return this;
    }

    /**
     * Get the locations property: A list of locations.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: A list of locations.
     *
     * @param locations the locations value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
