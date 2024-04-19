// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties for cryptographic key summary.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "summaryType")
@JsonTypeName("CryptoKey")
@Fluent
public final class CryptoKeySummaryResource extends SummaryResourceProperties {
    /*
     * Total number of cryptographic keys found.
     */
    @JsonProperty(value = "totalKeys")
    private Long totalKeys;

    /*
     * Total number of (non-certificate) public keys found.
     */
    @JsonProperty(value = "publicKeys")
    private Long publicKeys;

    /*
     * Total number of private keys found.
     */
    @JsonProperty(value = "privateKeys")
    private Long privateKeys;

    /*
     * Total number of keys found that have a matching paired key or certificate.
     */
    @JsonProperty(value = "pairedKeys")
    private Long pairedKeys;

    /*
     * Total number of keys found that have an insecure key size for the algorithm.
     */
    @JsonProperty(value = "shortKeySize")
    private Long shortKeySize;

    /**
     * Creates an instance of CryptoKeySummaryResource class.
     */
    public CryptoKeySummaryResource() {
    }

    /**
     * Get the totalKeys property: Total number of cryptographic keys found.
     * 
     * @return the totalKeys value.
     */
    public Long totalKeys() {
        return this.totalKeys;
    }

    /**
     * Set the totalKeys property: Total number of cryptographic keys found.
     * 
     * @param totalKeys the totalKeys value to set.
     * @return the CryptoKeySummaryResource object itself.
     */
    public CryptoKeySummaryResource withTotalKeys(Long totalKeys) {
        this.totalKeys = totalKeys;
        return this;
    }

    /**
     * Get the publicKeys property: Total number of (non-certificate) public keys found.
     * 
     * @return the publicKeys value.
     */
    public Long publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the publicKeys property: Total number of (non-certificate) public keys found.
     * 
     * @param publicKeys the publicKeys value to set.
     * @return the CryptoKeySummaryResource object itself.
     */
    public CryptoKeySummaryResource withPublicKeys(Long publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    /**
     * Get the privateKeys property: Total number of private keys found.
     * 
     * @return the privateKeys value.
     */
    public Long privateKeys() {
        return this.privateKeys;
    }

    /**
     * Set the privateKeys property: Total number of private keys found.
     * 
     * @param privateKeys the privateKeys value to set.
     * @return the CryptoKeySummaryResource object itself.
     */
    public CryptoKeySummaryResource withPrivateKeys(Long privateKeys) {
        this.privateKeys = privateKeys;
        return this;
    }

    /**
     * Get the pairedKeys property: Total number of keys found that have a matching paired key or certificate.
     * 
     * @return the pairedKeys value.
     */
    public Long pairedKeys() {
        return this.pairedKeys;
    }

    /**
     * Set the pairedKeys property: Total number of keys found that have a matching paired key or certificate.
     * 
     * @param pairedKeys the pairedKeys value to set.
     * @return the CryptoKeySummaryResource object itself.
     */
    public CryptoKeySummaryResource withPairedKeys(Long pairedKeys) {
        this.pairedKeys = pairedKeys;
        return this;
    }

    /**
     * Get the shortKeySize property: Total number of keys found that have an insecure key size for the algorithm.
     * 
     * @return the shortKeySize value.
     */
    public Long shortKeySize() {
        return this.shortKeySize;
    }

    /**
     * Set the shortKeySize property: Total number of keys found that have an insecure key size for the algorithm.
     * 
     * @param shortKeySize the shortKeySize value to set.
     * @return the CryptoKeySummaryResource object itself.
     */
    public CryptoKeySummaryResource withShortKeySize(Long shortKeySize) {
        this.shortKeySize = shortKeySize;
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
