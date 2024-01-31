// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Application Insights component linked storage accounts.
 */
@Fluent
public final class ComponentLinkedStorageAccountsInner extends ProxyResource {
    /*
     * The properties of the linked storage accounts.
     */
    @JsonProperty(value = "properties")
    private LinkedStorageAccountsProperties innerProperties;

    /**
     * Creates an instance of ComponentLinkedStorageAccountsInner class.
     */
    public ComponentLinkedStorageAccountsInner() {
    }

    /**
     * Get the innerProperties property: The properties of the linked storage accounts.
     * 
     * @return the innerProperties value.
     */
    private LinkedStorageAccountsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the linkedStorageAccount property: Linked storage account resource ID.
     * 
     * @return the linkedStorageAccount value.
     */
    public String linkedStorageAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedStorageAccount();
    }

    /**
     * Set the linkedStorageAccount property: Linked storage account resource ID.
     * 
     * @param linkedStorageAccount the linkedStorageAccount value to set.
     * @return the ComponentLinkedStorageAccountsInner object itself.
     */
    public ComponentLinkedStorageAccountsInner withLinkedStorageAccount(String linkedStorageAccount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LinkedStorageAccountsProperties();
        }
        this.innerProperties().withLinkedStorageAccount(linkedStorageAccount);
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
