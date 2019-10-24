/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Open Data Protocol (OData) linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ODataLinkedService.class)
@JsonTypeName("OData")
@JsonFlatten
public class ODataLinkedService extends LinkedServiceInner {
    /**
     * The URL of the OData service endpoint. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * Type of authentication used to connect to the OData service. Possible
     * values include: 'Basic', 'Anonymous'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private ODataAuthenticationType authenticationType;

    /**
     * User name of the OData service. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * Password of the OData service.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the URL of the OData service endpoint. Type: string (or Expression with resultType string).
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the URL of the OData service endpoint. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get type of authentication used to connect to the OData service. Possible values include: 'Basic', 'Anonymous'.
     *
     * @return the authenticationType value
     */
    public ODataAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set type of authentication used to connect to the OData service. Possible values include: 'Basic', 'Anonymous'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withAuthenticationType(ODataAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get user name of the OData service. Type: string (or Expression with resultType string).
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set user name of the OData service. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password of the OData service.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password of the OData service.
     *
     * @param password the password value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withPassword(SecretBase password) {
        this.password = password;
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
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
