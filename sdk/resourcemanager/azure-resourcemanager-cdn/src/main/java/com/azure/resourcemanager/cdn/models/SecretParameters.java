// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The json object containing secret parameters.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = SecretParameters.class)
@JsonTypeName("SecretParameters")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "UrlSigningKey", value = UrlSigningKeyParameters.class),
    @JsonSubTypes.Type(name = "ManagedCertificate", value = ManagedCertificateParameters.class),
    @JsonSubTypes.Type(name = "CustomerCertificate", value = CustomerCertificateParameters.class),
    @JsonSubTypes.Type(
        name = "AzureFirstPartyManagedCertificate",
        value = AzureFirstPartyManagedCertificateParameters.class) })
@Immutable
public class SecretParameters {
    /**
     * Creates an instance of SecretParameters class.
     */
    public SecretParameters() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
