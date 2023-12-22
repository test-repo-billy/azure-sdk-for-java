// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.ContainerNetworkInterfaceConfigurationPropertiesFormat;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationProfileInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Container network interface configuration child resource.
 */
@Fluent
public final class ContainerNetworkInterfaceConfiguration extends SubResource {
    /*
     * Container network interface configuration properties.
     */
    @JsonProperty(value = "properties")
    private ContainerNetworkInterfaceConfigurationPropertiesFormat innerProperties;

    /*
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of ContainerNetworkInterfaceConfiguration class.
     */
    public ContainerNetworkInterfaceConfiguration() {
    }

    /**
     * Get the innerProperties property: Container network interface configuration properties.
     * 
     * @return the innerProperties value.
     */
    private ContainerNetworkInterfaceConfigurationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Sub Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
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
     * {@inheritDoc}
     */
    @Override
    public ContainerNetworkInterfaceConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the ipConfigurations property: A list of ip configurations of the container network interface configuration.
     * 
     * @return the ipConfigurations value.
     */
    public List<IpConfigurationProfileInner> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: A list of ip configurations of the container network interface configuration.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration
        withIpConfigurations(List<IpConfigurationProfileInner> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerNetworkInterfaceConfigurationPropertiesFormat();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the containerNetworkInterfaces property: A list of container network interfaces created from this container
     * network interface configuration.
     * 
     * @return the containerNetworkInterfaces value.
     */
    public List<SubResource> containerNetworkInterfaces() {
        return this.innerProperties() == null ? null : this.innerProperties().containerNetworkInterfaces();
    }

    /**
     * Set the containerNetworkInterfaces property: A list of container network interfaces created from this container
     * network interface configuration.
     * 
     * @param containerNetworkInterfaces the containerNetworkInterfaces value to set.
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration
        withContainerNetworkInterfaces(List<SubResource> containerNetworkInterfaces) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerNetworkInterfaceConfigurationPropertiesFormat();
        }
        this.innerProperties().withContainerNetworkInterfaces(containerNetworkInterfaces);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the container network interface configuration
     * resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
