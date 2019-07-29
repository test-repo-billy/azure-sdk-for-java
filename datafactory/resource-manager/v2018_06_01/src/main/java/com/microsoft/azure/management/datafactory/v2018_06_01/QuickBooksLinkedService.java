/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * QuickBooks server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("QuickBooks")
@JsonFlatten
public class QuickBooksLinkedService extends LinkedServiceInner {
    /**
     * The endpoint of the QuickBooks server. (i.e. quickbooks.api.intuit.com).
     */
    @JsonProperty(value = "typeProperties.endpoint", required = true)
    private Object endpoint;

    /**
     * The company ID of the QuickBooks company to authorize.
     */
    @JsonProperty(value = "typeProperties.companyId", required = true)
    private Object companyId;

    /**
     * The consumer key for OAuth 1.0 authentication.
     */
    @JsonProperty(value = "typeProperties.consumerKey", required = true)
    private Object consumerKey;

    /**
     * The consumer secret for OAuth 1.0 authentication.
     */
    @JsonProperty(value = "typeProperties.consumerSecret", required = true)
    private SecretBase consumerSecret;

    /**
     * The access token for OAuth 1.0 authentication.
     */
    @JsonProperty(value = "typeProperties.accessToken", required = true)
    private SecretBase accessToken;

    /**
     * The access token secret for OAuth 1.0 authentication.
     */
    @JsonProperty(value = "typeProperties.accessTokenSecret", required = true)
    private SecretBase accessTokenSecret;

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     */
    @JsonProperty(value = "typeProperties.useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the endpoint of the QuickBooks server. (i.e. quickbooks.api.intuit.com).
     *
     * @return the endpoint value
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint of the QuickBooks server. (i.e. quickbooks.api.intuit.com).
     *
     * @param endpoint the endpoint value to set
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the company ID of the QuickBooks company to authorize.
     *
     * @return the companyId value
     */
    public Object companyId() {
        return this.companyId;
    }

    /**
     * Set the company ID of the QuickBooks company to authorize.
     *
     * @param companyId the companyId value to set
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withCompanyId(Object companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get the consumer key for OAuth 1.0 authentication.
     *
     * @return the consumerKey value
     */
    public Object consumerKey() {
        return this.consumerKey;
    }

    /**
     * Set the consumer key for OAuth 1.0 authentication.
     *
     * @param consumerKey the consumerKey value to set
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withConsumerKey(Object consumerKey) {
        this.consumerKey = consumerKey;
        return this;
    }

    /**
     * Get the consumer secret for OAuth 1.0 authentication.
     *
     * @return the consumerSecret value
     */
    public SecretBase consumerSecret() {
        return this.consumerSecret;
    }

    /**
     * Set the consumer secret for OAuth 1.0 authentication.
     *
     * @param consumerSecret the consumerSecret value to set
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withConsumerSecret(SecretBase consumerSecret) {
        this.consumerSecret = consumerSecret;
        return this;
    }

    /**
     * Get the access token for OAuth 1.0 authentication.
     *
     * @return the accessToken value
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set the access token for OAuth 1.0 authentication.
     *
     * @param accessToken the accessToken value to set
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the access token secret for OAuth 1.0 authentication.
     *
     * @return the accessTokenSecret value
     */
    public SecretBase accessTokenSecret() {
        return this.accessTokenSecret;
    }

    /**
     * Set the access token secret for OAuth 1.0 authentication.
     *
     * @param accessTokenSecret the accessTokenSecret value to set
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withAccessTokenSecret(SecretBase accessTokenSecret) {
        this.accessTokenSecret = accessTokenSecret;
        return this;
    }

    /**
     * Get specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @return the useEncryptedEndpoints value
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
