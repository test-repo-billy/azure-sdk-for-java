// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.apicenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.apicenter.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The service entity.
 */
@Fluent
public final class ServiceInner extends Resource {
    /*
     * The properties of the service.
     */
    @JsonProperty(value = "properties")
    private ServiceProperties innerProperties;

    /*
     * Managed service identity (system assigned and/or user assigned identities)
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ServiceInner class.
     */
    public ServiceInner() {
    }

    /**
     * Get the innerProperties property: The properties of the service.
     * 
     * @return the innerProperties value.
     */
    private ServiceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @param identity the identity value to set.
     * @return the ServiceInner object itself.
     */
    public ServiceInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public ServiceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the service.
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
