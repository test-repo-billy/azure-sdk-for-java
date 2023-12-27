// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The access key directly from target resource properties, which target service is Azure Resource, such as
 * Microsoft.Storage.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authType")
@JsonTypeName("accessKey")
@Fluent
public final class AccessKeyInfoBase extends AuthInfoBase {
    /*
     * Permissions of the accessKey. `Read` and `Write` are for Azure Cosmos DB and Azure App Configuration, `Listen`,
     * `Send` and `Manage` are for Azure Event Hub and Azure Service Bus.
     */
    @JsonProperty(value = "permissions")
    private List<AccessKeyPermissions> permissions;

    /**
     * Creates an instance of AccessKeyInfoBase class.
     */
    public AccessKeyInfoBase() {
    }

    /**
     * Get the permissions property: Permissions of the accessKey. `Read` and `Write` are for Azure Cosmos DB and Azure
     * App Configuration, `Listen`, `Send` and `Manage` are for Azure Event Hub and Azure Service Bus.
     * 
     * @return the permissions value.
     */
    public List<AccessKeyPermissions> permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: Permissions of the accessKey. `Read` and `Write` are for Azure Cosmos DB and Azure
     * App Configuration, `Listen`, `Send` and `Manage` are for Azure Event Hub and Azure Service Bus.
     * 
     * @param permissions the permissions value to set.
     * @return the AccessKeyInfoBase object itself.
     */
    public AccessKeyInfoBase withPermissions(List<AccessKeyPermissions> permissions) {
        this.permissions = permissions;
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
    }
}
