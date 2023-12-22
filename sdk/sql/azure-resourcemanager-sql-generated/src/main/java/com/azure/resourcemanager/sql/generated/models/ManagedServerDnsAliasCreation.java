// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A managed server dns alias creation request.
 */
@Fluent
public final class ManagedServerDnsAliasCreation {
    /*
     * Whether or not DNS record should be created for this alias.
     */
    @JsonProperty(value = "createDnsRecord")
    private Boolean createDnsRecord;

    /**
     * Creates an instance of ManagedServerDnsAliasCreation class.
     */
    public ManagedServerDnsAliasCreation() {
    }

    /**
     * Get the createDnsRecord property: Whether or not DNS record should be created for this alias.
     * 
     * @return the createDnsRecord value.
     */
    public Boolean createDnsRecord() {
        return this.createDnsRecord;
    }

    /**
     * Set the createDnsRecord property: Whether or not DNS record should be created for this alias.
     * 
     * @param createDnsRecord the createDnsRecord value to set.
     * @return the ManagedServerDnsAliasCreation object itself.
     */
    public ManagedServerDnsAliasCreation withCreateDnsRecord(Boolean createDnsRecord) {
        this.createDnsRecord = createDnsRecord;
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
