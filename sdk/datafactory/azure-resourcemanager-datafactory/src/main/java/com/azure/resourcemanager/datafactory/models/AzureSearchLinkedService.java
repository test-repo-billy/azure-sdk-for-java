// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSearchLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Linked service for Windows Azure Search Service.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = AzureSearchLinkedService.class,
    visible = true)
@JsonTypeName("AzureSearch")
@Fluent
public final class AzureSearchLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "AzureSearch";

    /*
     * Windows Azure Search Service linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureSearchLinkedServiceTypeProperties innerTypeProperties = new AzureSearchLinkedServiceTypeProperties();

    /**
     * Creates an instance of AzureSearchLinkedService class.
     */
    public AzureSearchLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Windows Azure Search Service linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AzureSearchLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSearchLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the url property: URL for Azure Search service. Type: string (or Expression with resultType string).
     * 
     * @return the url value.
     */
    public Object url() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().url();
    }

    /**
     * Set the url property: URL for Azure Search service. Type: string (or Expression with resultType string).
     * 
     * @param url the url value to set.
     * @return the AzureSearchLinkedService object itself.
     */
    public AzureSearchLinkedService withUrl(Object url) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSearchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUrl(url);
        return this;
    }

    /**
     * Get the key property: Admin Key for Azure Search service.
     * 
     * @return the key value.
     */
    public SecretBase key() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().key();
    }

    /**
     * Set the key property: Admin Key for Azure Search service.
     * 
     * @param key the key value to set.
     * @return the AzureSearchLinkedService object itself.
     */
    public AzureSearchLinkedService withKey(SecretBase key) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSearchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withKey(key);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureSearchLinkedService object itself.
     */
    public AzureSearchLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSearchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model AzureSearchLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureSearchLinkedService.class);
}
