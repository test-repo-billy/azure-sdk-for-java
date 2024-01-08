// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Address prefix item.
 */
@Fluent
public final class AddressPrefixItem {
    /*
     * Address prefix.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /*
     * Address prefix type.
     */
    @JsonProperty(value = "addressPrefixType")
    private AddressPrefixType addressPrefixType;

    /**
     * Creates an instance of AddressPrefixItem class.
     */
    public AddressPrefixItem() {
    }

    /**
     * Get the addressPrefix property: Address prefix.
     * 
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Address prefix.
     * 
     * @param addressPrefix the addressPrefix value to set.
     * @return the AddressPrefixItem object itself.
     */
    public AddressPrefixItem withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the addressPrefixType property: Address prefix type.
     * 
     * @return the addressPrefixType value.
     */
    public AddressPrefixType addressPrefixType() {
        return this.addressPrefixType;
    }

    /**
     * Set the addressPrefixType property: Address prefix type.
     * 
     * @param addressPrefixType the addressPrefixType value to set.
     * @return the AddressPrefixItem object itself.
     */
    public AddressPrefixItem withAddressPrefixType(AddressPrefixType addressPrefixType) {
        this.addressPrefixType = addressPrefixType;
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
