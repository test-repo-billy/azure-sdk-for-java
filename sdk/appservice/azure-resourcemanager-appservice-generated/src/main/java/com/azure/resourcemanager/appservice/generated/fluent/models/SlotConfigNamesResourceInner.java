// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Slot Config names azure resource.
 */
@Fluent
public final class SlotConfigNamesResourceInner extends ProxyOnlyResource {
    /*
     * Core resource properties
     */
    @JsonProperty(value = "properties")
    private SlotConfigNames innerProperties;

    /**
     * Creates an instance of SlotConfigNamesResourceInner class.
     */
    public SlotConfigNamesResourceInner() {
    }

    /**
     * Get the innerProperties property: Core resource properties.
     * 
     * @return the innerProperties value.
     */
    private SlotConfigNames innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlotConfigNamesResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the connectionStringNames property: List of connection string names.
     * 
     * @return the connectionStringNames value.
     */
    public List<String> connectionStringNames() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionStringNames();
    }

    /**
     * Set the connectionStringNames property: List of connection string names.
     * 
     * @param connectionStringNames the connectionStringNames value to set.
     * @return the SlotConfigNamesResourceInner object itself.
     */
    public SlotConfigNamesResourceInner withConnectionStringNames(List<String> connectionStringNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SlotConfigNames();
        }
        this.innerProperties().withConnectionStringNames(connectionStringNames);
        return this;
    }

    /**
     * Get the appSettingNames property: List of application settings names.
     * 
     * @return the appSettingNames value.
     */
    public List<String> appSettingNames() {
        return this.innerProperties() == null ? null : this.innerProperties().appSettingNames();
    }

    /**
     * Set the appSettingNames property: List of application settings names.
     * 
     * @param appSettingNames the appSettingNames value to set.
     * @return the SlotConfigNamesResourceInner object itself.
     */
    public SlotConfigNamesResourceInner withAppSettingNames(List<String> appSettingNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SlotConfigNames();
        }
        this.innerProperties().withAppSettingNames(appSettingNames);
        return this;
    }

    /**
     * Get the azureStorageConfigNames property: List of external Azure storage account identifiers.
     * 
     * @return the azureStorageConfigNames value.
     */
    public List<String> azureStorageConfigNames() {
        return this.innerProperties() == null ? null : this.innerProperties().azureStorageConfigNames();
    }

    /**
     * Set the azureStorageConfigNames property: List of external Azure storage account identifiers.
     * 
     * @param azureStorageConfigNames the azureStorageConfigNames value to set.
     * @return the SlotConfigNamesResourceInner object itself.
     */
    public SlotConfigNamesResourceInner withAzureStorageConfigNames(List<String> azureStorageConfigNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SlotConfigNames();
        }
        this.innerProperties().withAzureStorageConfigNames(azureStorageConfigNames);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
