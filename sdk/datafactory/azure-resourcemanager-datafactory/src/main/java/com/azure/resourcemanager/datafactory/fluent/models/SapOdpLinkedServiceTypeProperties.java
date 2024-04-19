// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties specific to this linked service type.
 */
@Fluent
public final class SapOdpLinkedServiceTypeProperties {
    /*
     * Host name of the SAP instance where the table is located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "server")
    private Object server;

    /*
     * System number of the SAP system where the table is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "systemNumber")
    private Object systemNumber;

    /*
     * Client ID of the client on the SAP system where the table is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "clientId")
    private Object clientId;

    /*
     * Language of the SAP system where the table is located. The default value is EN. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "language")
    private Object language;

    /*
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "systemId")
    private Object systemId;

    /*
     * Username to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userName")
    private Object username;

    /*
     * Password to access the SAP server where the table is located.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "messageServer")
    private Object messageServer;

    /*
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "messageServerService")
    private Object messageServerService;

    /*
     * SNC activation indicator to access the SAP server where the table is located. Must be either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sncMode")
    private Object sncMode;

    /*
     * Initiator's SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sncMyName")
    private Object sncMyName;

    /*
     * Communication partner's SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sncPartnerName")
    private Object sncPartnerName;

    /*
     * External security product's library to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sncLibraryPath")
    private Object sncLibraryPath;

    /*
     * SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sncQop")
    private Object sncQop;

    /*
     * SNC X509 certificate file path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "x509CertificatePath")
    private Object x509CertificatePath;

    /*
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "logonGroup")
    private Object logonGroup;

    /*
     * The subscriber name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "subscriberName")
    private Object subscriberName;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of SapOdpLinkedServiceTypeProperties class.
     */
    public SapOdpLinkedServiceTypeProperties() {
    }

    /**
     * Get the server property: Host name of the SAP instance where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: Host name of the SAP instance where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @param server the server value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the systemNumber property: System number of the SAP system where the table is located. (Usually a two-digit
     * decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     * @return the systemNumber value.
     */
    public Object systemNumber() {
        return this.systemNumber;
    }

    /**
     * Set the systemNumber property: System number of the SAP system where the table is located. (Usually a two-digit
     * decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     * @param systemNumber the systemNumber value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withSystemNumber(Object systemNumber) {
        this.systemNumber = systemNumber;
        return this;
    }

    /**
     * Get the clientId property: Client ID of the client on the SAP system where the table is located. (Usually a
     * three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client ID of the client on the SAP system where the table is located. (Usually a
     * three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     * @param clientId the clientId value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the language property: Language of the SAP system where the table is located. The default value is EN. Type:
     * string (or Expression with resultType string).
     * 
     * @return the language value.
     */
    public Object language() {
        return this.language;
    }

    /**
     * Set the language property: Language of the SAP system where the table is located. The default value is EN. Type:
     * string (or Expression with resultType string).
     * 
     * @param language the language value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withLanguage(Object language) {
        this.language = language;
        return this;
    }

    /**
     * Get the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @return the systemId value.
     */
    public Object systemId() {
        return this.systemId;
    }

    /**
     * Set the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @param systemId the systemId value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withSystemId(Object systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * Get the username property: Username to access the SAP server where the table is located. Type: string (or
     * Expression with resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username to access the SAP server where the table is located. Type: string (or
     * Expression with resultType string).
     * 
     * @param username the username value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to access the SAP server where the table is located.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the SAP server where the table is located.
     * 
     * @param password the password value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     * 
     * @return the messageServer value.
     */
    public Object messageServer() {
        return this.messageServer;
    }

    /**
     * Set the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     * 
     * @param messageServer the messageServer value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withMessageServer(Object messageServer) {
        this.messageServer = messageServer;
        return this;
    }

    /**
     * Get the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     * 
     * @return the messageServerService value.
     */
    public Object messageServerService() {
        return this.messageServerService;
    }

    /**
     * Set the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     * 
     * @param messageServerService the messageServerService value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withMessageServerService(Object messageServerService) {
        this.messageServerService = messageServerService;
        return this;
    }

    /**
     * Get the sncMode property: SNC activation indicator to access the SAP server where the table is located. Must be
     * either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     * 
     * @return the sncMode value.
     */
    public Object sncMode() {
        return this.sncMode;
    }

    /**
     * Set the sncMode property: SNC activation indicator to access the SAP server where the table is located. Must be
     * either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     * 
     * @param sncMode the sncMode value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withSncMode(Object sncMode) {
        this.sncMode = sncMode;
        return this;
    }

    /**
     * Get the sncMyName property: Initiator's SNC name to access the SAP server where the table is located. Type:
     * string (or Expression with resultType string).
     * 
     * @return the sncMyName value.
     */
    public Object sncMyName() {
        return this.sncMyName;
    }

    /**
     * Set the sncMyName property: Initiator's SNC name to access the SAP server where the table is located. Type:
     * string (or Expression with resultType string).
     * 
     * @param sncMyName the sncMyName value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withSncMyName(Object sncMyName) {
        this.sncMyName = sncMyName;
        return this;
    }

    /**
     * Get the sncPartnerName property: Communication partner's SNC name to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     * 
     * @return the sncPartnerName value.
     */
    public Object sncPartnerName() {
        return this.sncPartnerName;
    }

    /**
     * Set the sncPartnerName property: Communication partner's SNC name to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     * 
     * @param sncPartnerName the sncPartnerName value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withSncPartnerName(Object sncPartnerName) {
        this.sncPartnerName = sncPartnerName;
        return this;
    }

    /**
     * Get the sncLibraryPath property: External security product's library to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     * 
     * @return the sncLibraryPath value.
     */
    public Object sncLibraryPath() {
        return this.sncLibraryPath;
    }

    /**
     * Set the sncLibraryPath property: External security product's library to access the SAP server where the table is
     * located. Type: string (or Expression with resultType string).
     * 
     * @param sncLibraryPath the sncLibraryPath value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withSncLibraryPath(Object sncLibraryPath) {
        this.sncLibraryPath = sncLibraryPath;
        return this;
    }

    /**
     * Get the sncQop property: SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or
     * Expression with resultType string).
     * 
     * @return the sncQop value.
     */
    public Object sncQop() {
        return this.sncQop;
    }

    /**
     * Set the sncQop property: SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or
     * Expression with resultType string).
     * 
     * @param sncQop the sncQop value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withSncQop(Object sncQop) {
        this.sncQop = sncQop;
        return this;
    }

    /**
     * Get the x509CertificatePath property: SNC X509 certificate file path. Type: string (or Expression with resultType
     * string).
     * 
     * @return the x509CertificatePath value.
     */
    public Object x509CertificatePath() {
        return this.x509CertificatePath;
    }

    /**
     * Set the x509CertificatePath property: SNC X509 certificate file path. Type: string (or Expression with resultType
     * string).
     * 
     * @param x509CertificatePath the x509CertificatePath value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withX509CertificatePath(Object x509CertificatePath) {
        this.x509CertificatePath = x509CertificatePath;
        return this;
    }

    /**
     * Get the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     * 
     * @return the logonGroup value.
     */
    public Object logonGroup() {
        return this.logonGroup;
    }

    /**
     * Set the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     * 
     * @param logonGroup the logonGroup value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withLogonGroup(Object logonGroup) {
        this.logonGroup = logonGroup;
        return this;
    }

    /**
     * Get the subscriberName property: The subscriber name. Type: string (or Expression with resultType string).
     * 
     * @return the subscriberName value.
     */
    public Object subscriberName() {
        return this.subscriberName;
    }

    /**
     * Set the subscriberName property: The subscriber name. Type: string (or Expression with resultType string).
     * 
     * @param subscriberName the subscriberName value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withSubscriberName(Object subscriberName) {
        this.subscriberName = subscriberName;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SapOdpLinkedServiceTypeProperties object itself.
     */
    public SapOdpLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() != null) {
            password().validate();
        }
    }
}
