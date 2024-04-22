// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The authentication options for Azure OpenAI On Your Data.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = OnYourDataAuthenticationOptions.class,
    visible = true)
@JsonTypeName("OnYourDataAuthenticationOptions")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "api_key", value = OnYourDataApiKeyAuthenticationOptions.class),
    @JsonSubTypes.Type(name = "connection_string", value = OnYourDataConnectionStringAuthenticationOptions.class),
    @JsonSubTypes.Type(name = "key_and_key_id", value = OnYourDataKeyAndKeyIdAuthenticationOptions.class),
    @JsonSubTypes.Type(name = "encoded_api_key", value = OnYourDataEncodedApiKeyAuthenticationOptions.class),
    @JsonSubTypes.Type(name = "access_token", value = OnYourDataAccessTokenAuthenticationOptions.class),
    @JsonSubTypes.Type(
        name = "system_assigned_managed_identity",
        value = OnYourDataSystemAssignedManagedIdentityAuthenticationOptions.class),
    @JsonSubTypes.Type(
        name = "user_assigned_managed_identity",
        value = OnYourDataUserAssignedManagedIdentityAuthenticationOptions.class) })
@Immutable
public class OnYourDataAuthenticationOptions {

    /**
     * Creates an instance of OnYourDataAuthenticationOptions class.
     */
    @Generated
    public OnYourDataAuthenticationOptions() {
        this.type = OnYourDataAuthenticationType.fromString("OnYourDataAuthenticationOptions");
    }

    /*
     * The authentication type.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "type")
    private OnYourDataAuthenticationType type;

    /**
     * Get the type property: The authentication type.
     *
     * @return the type value.
     */
    @Generated
    public OnYourDataAuthenticationType getType() {
        return this.type;
    }
}
