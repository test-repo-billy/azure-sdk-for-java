// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** The PasswordCredential model. */
@Fluent
public final class PasswordCredentialInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PasswordCredentialInner.class);

    /*
     * Start date.
     */
    @JsonProperty(value = "startDate")
    private OffsetDateTime startDate;

    /*
     * End date.
     */
    @JsonProperty(value = "endDate")
    private OffsetDateTime endDate;

    /*
     * Key ID.
     */
    @JsonProperty(value = "keyId")
    private String keyId;

    /*
     * Key value.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Custom Key Identifier
     */
    @JsonProperty(value = "customKeyIdentifier")
    private byte[] customKeyIdentifier;

    /*
     * Active Directory Password Credential information.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the startDate property: Start date.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: Start date.
     *
     * @param startDate the startDate value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: End date.
     *
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: End date.
     *
     * @param endDate the endDate value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the keyId property: Key ID.
     *
     * @return the keyId value.
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: Key ID.
     *
     * @param keyId the keyId value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the value property: Key value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Key value.
     *
     * @param value the value value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the customKeyIdentifier property: Custom Key Identifier.
     *
     * @return the customKeyIdentifier value.
     */
    public byte[] customKeyIdentifier() {
        return CoreUtils.clone(this.customKeyIdentifier);
    }

    /**
     * Set the customKeyIdentifier property: Custom Key Identifier.
     *
     * @param customKeyIdentifier the customKeyIdentifier value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withCustomKeyIdentifier(byte[] customKeyIdentifier) {
        this.customKeyIdentifier = CoreUtils.clone(customKeyIdentifier);
        return this;
    }

    /**
     * Get the additionalProperties property: Active Directory Password Credential information.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Active Directory Password Credential information.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
