// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.generated.models.ProviderAuthorizationConsentState;
import com.azure.resourcemanager.resources.generated.models.ProviderResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Resource provider information.
 */
@Fluent
public final class ProviderInner {
    /*
     * The provider ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The namespace of the resource provider.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /*
     * The registration state of the resource provider.
     */
    @JsonProperty(value = "registrationState", access = JsonProperty.Access.WRITE_ONLY)
    private String registrationState;

    /*
     * The registration policy of the resource provider.
     */
    @JsonProperty(value = "registrationPolicy", access = JsonProperty.Access.WRITE_ONLY)
    private String registrationPolicy;

    /*
     * The collection of provider resource types.
     */
    @JsonProperty(value = "resourceTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<ProviderResourceType> resourceTypes;

    /*
     * The provider authorization consent state.
     */
    @JsonProperty(value = "providerAuthorizationConsentState")
    private ProviderAuthorizationConsentState providerAuthorizationConsentState;

    /**
     * Creates an instance of ProviderInner class.
     */
    public ProviderInner() {
    }

    /**
     * Get the id property: The provider ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the namespace property: The namespace of the resource provider.
     * 
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: The namespace of the resource provider.
     * 
     * @param namespace the namespace value to set.
     * @return the ProviderInner object itself.
     */
    public ProviderInner withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the registrationState property: The registration state of the resource provider.
     * 
     * @return the registrationState value.
     */
    public String registrationState() {
        return this.registrationState;
    }

    /**
     * Get the registrationPolicy property: The registration policy of the resource provider.
     * 
     * @return the registrationPolicy value.
     */
    public String registrationPolicy() {
        return this.registrationPolicy;
    }

    /**
     * Get the resourceTypes property: The collection of provider resource types.
     * 
     * @return the resourceTypes value.
     */
    public List<ProviderResourceType> resourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Get the providerAuthorizationConsentState property: The provider authorization consent state.
     * 
     * @return the providerAuthorizationConsentState value.
     */
    public ProviderAuthorizationConsentState providerAuthorizationConsentState() {
        return this.providerAuthorizationConsentState;
    }

    /**
     * Set the providerAuthorizationConsentState property: The provider authorization consent state.
     * 
     * @param providerAuthorizationConsentState the providerAuthorizationConsentState value to set.
     * @return the ProviderInner object itself.
     */
    public ProviderInner
        withProviderAuthorizationConsentState(ProviderAuthorizationConsentState providerAuthorizationConsentState) {
        this.providerAuthorizationConsentState = providerAuthorizationConsentState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceTypes() != null) {
            resourceTypes().forEach(e -> e.validate());
        }
    }
}
