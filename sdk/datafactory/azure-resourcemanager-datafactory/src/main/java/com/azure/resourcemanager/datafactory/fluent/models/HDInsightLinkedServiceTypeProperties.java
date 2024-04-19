// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HDInsight linked service properties.
 */
@Fluent
public final class HDInsightLinkedServiceTypeProperties {
    /*
     * HDInsight cluster URI. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "clusterUri", required = true)
    private Object clusterUri;

    /*
     * HDInsight cluster user name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userName")
    private Object username;

    /*
     * HDInsight cluster password.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The Azure Storage linked service reference.
     */
    @JsonProperty(value = "linkedServiceName")
    private LinkedServiceReference linkedServiceName;

    /*
     * A reference to the Azure SQL linked service that points to the HCatalog database.
     */
    @JsonProperty(value = "hcatalogLinkedServiceName")
    private LinkedServiceReference hcatalogLinkedServiceName;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /*
     * Specify if the HDInsight is created with ESP (Enterprise Security Package). Type: Boolean.
     */
    @JsonProperty(value = "isEspEnabled")
    private Object isEspEnabled;

    /*
     * Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "fileSystem")
    private Object fileSystem;

    /**
     * Creates an instance of HDInsightLinkedServiceTypeProperties class.
     */
    public HDInsightLinkedServiceTypeProperties() {
    }

    /**
     * Get the clusterUri property: HDInsight cluster URI. Type: string (or Expression with resultType string).
     * 
     * @return the clusterUri value.
     */
    public Object clusterUri() {
        return this.clusterUri;
    }

    /**
     * Set the clusterUri property: HDInsight cluster URI. Type: string (or Expression with resultType string).
     * 
     * @param clusterUri the clusterUri value to set.
     * @return the HDInsightLinkedServiceTypeProperties object itself.
     */
    public HDInsightLinkedServiceTypeProperties withClusterUri(Object clusterUri) {
        this.clusterUri = clusterUri;
        return this;
    }

    /**
     * Get the username property: HDInsight cluster user name. Type: string (or Expression with resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: HDInsight cluster user name. Type: string (or Expression with resultType string).
     * 
     * @param username the username value to set.
     * @return the HDInsightLinkedServiceTypeProperties object itself.
     */
    public HDInsightLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: HDInsight cluster password.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: HDInsight cluster password.
     * 
     * @param password the password value to set.
     * @return the HDInsightLinkedServiceTypeProperties object itself.
     */
    public HDInsightLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the linkedServiceName property: The Azure Storage linked service reference.
     * 
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: The Azure Storage linked service reference.
     * 
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the HDInsightLinkedServiceTypeProperties object itself.
     */
    public HDInsightLinkedServiceTypeProperties withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the hcatalogLinkedServiceName property: A reference to the Azure SQL linked service that points to the
     * HCatalog database.
     * 
     * @return the hcatalogLinkedServiceName value.
     */
    public LinkedServiceReference hcatalogLinkedServiceName() {
        return this.hcatalogLinkedServiceName;
    }

    /**
     * Set the hcatalogLinkedServiceName property: A reference to the Azure SQL linked service that points to the
     * HCatalog database.
     * 
     * @param hcatalogLinkedServiceName the hcatalogLinkedServiceName value to set.
     * @return the HDInsightLinkedServiceTypeProperties object itself.
     */
    public HDInsightLinkedServiceTypeProperties
        withHcatalogLinkedServiceName(LinkedServiceReference hcatalogLinkedServiceName) {
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
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
     * @return the HDInsightLinkedServiceTypeProperties object itself.
     */
    public HDInsightLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the isEspEnabled property: Specify if the HDInsight is created with ESP (Enterprise Security Package). Type:
     * Boolean.
     * 
     * @return the isEspEnabled value.
     */
    public Object isEspEnabled() {
        return this.isEspEnabled;
    }

    /**
     * Set the isEspEnabled property: Specify if the HDInsight is created with ESP (Enterprise Security Package). Type:
     * Boolean.
     * 
     * @param isEspEnabled the isEspEnabled value to set.
     * @return the HDInsightLinkedServiceTypeProperties object itself.
     */
    public HDInsightLinkedServiceTypeProperties withIsEspEnabled(Object isEspEnabled) {
        this.isEspEnabled = isEspEnabled;
        return this;
    }

    /**
     * Get the fileSystem property: Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type:
     * string (or Expression with resultType string).
     * 
     * @return the fileSystem value.
     */
    public Object fileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the fileSystem property: Specify the FileSystem if the main storage for the HDInsight is ADLS Gen2. Type:
     * string (or Expression with resultType string).
     * 
     * @param fileSystem the fileSystem value to set.
     * @return the HDInsightLinkedServiceTypeProperties object itself.
     */
    public HDInsightLinkedServiceTypeProperties withFileSystem(Object fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterUri() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property clusterUri in model HDInsightLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (linkedServiceName() != null) {
            linkedServiceName().validate();
        }
        if (hcatalogLinkedServiceName() != null) {
            hcatalogLinkedServiceName().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HDInsightLinkedServiceTypeProperties.class);
}
