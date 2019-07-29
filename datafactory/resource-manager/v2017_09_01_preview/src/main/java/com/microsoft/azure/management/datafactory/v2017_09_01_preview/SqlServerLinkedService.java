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
 * SQL Server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlServer")
@JsonFlatten
public class SqlServerLinkedService extends LinkedServiceInner {
    /**
     * The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private Object connectionString;

    /**
     * The on-premises Windows authentication user name. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * The on-premises Windows authentication password.
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
     * Get the connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the on-premises Windows authentication user name. Type: string (or Expression with resultType string).
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set the on-premises Windows authentication user name. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the on-premises Windows authentication password.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the on-premises Windows authentication password.
     *
     * @param password the password value to set
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withPassword(SecretBase password) {
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
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
