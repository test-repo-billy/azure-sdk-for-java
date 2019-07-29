/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Azure Databricks linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricks")
@JsonFlatten
public class AzureDatabricksLinkedService extends LinkedServiceInner {
    /**
     * &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks
     * deployment. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.domain", required = true)
    private Object domain;

    /**
     * Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.accessToken", required = true)
    private SecretBase accessToken;

    /**
     * The id of an existing cluster that will be used for all runs of this
     * job. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.existingClusterId")
    private Object existingClusterId;

    /**
     * The Spark version of new cluster. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.newClusterVersion")
    private Object newClusterVersion;

    /**
     * Number of worker nodes that new cluster should have. A string formatted
     * Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1
     * as min and 10 as max. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.newClusterNumOfWorker")
    private Object newClusterNumOfWorker;

    /**
     * The node types of new cluster. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.newClusterNodeType")
    private Object newClusterNodeType;

    /**
     * a set of optional, user-specified Spark configuration key-value pairs.
     */
    @JsonProperty(value = "typeProperties.newClusterSparkConf")
    private Map<String, Object> newClusterSparkConf;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with resultType string).
     *
     * @return the domain value
     */
    public Object domain() {
        return this.domain;
    }

    /**
     * Set &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with resultType string).
     *
     * @param domain the domain value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType string).
     *
     * @return the accessToken value
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType string).
     *
     * @param accessToken the accessToken value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the id of an existing cluster that will be used for all runs of this job. Type: string (or Expression with resultType string).
     *
     * @return the existingClusterId value
     */
    public Object existingClusterId() {
        return this.existingClusterId;
    }

    /**
     * Set the id of an existing cluster that will be used for all runs of this job. Type: string (or Expression with resultType string).
     *
     * @param existingClusterId the existingClusterId value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withExistingClusterId(Object existingClusterId) {
        this.existingClusterId = existingClusterId;
        return this;
    }

    /**
     * Get the Spark version of new cluster. Type: string (or Expression with resultType string).
     *
     * @return the newClusterVersion value
     */
    public Object newClusterVersion() {
        return this.newClusterVersion;
    }

    /**
     * Set the Spark version of new cluster. Type: string (or Expression with resultType string).
     *
     * @param newClusterVersion the newClusterVersion value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterVersion(Object newClusterVersion) {
        this.newClusterVersion = newClusterVersion;
        return this;
    }

    /**
     * Get number of worker nodes that new cluster should have. A string formatted Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 as min and 10 as max. Type: string (or Expression with resultType string).
     *
     * @return the newClusterNumOfWorker value
     */
    public Object newClusterNumOfWorker() {
        return this.newClusterNumOfWorker;
    }

    /**
     * Set number of worker nodes that new cluster should have. A string formatted Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 as min and 10 as max. Type: string (or Expression with resultType string).
     *
     * @param newClusterNumOfWorker the newClusterNumOfWorker value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterNumOfWorker(Object newClusterNumOfWorker) {
        this.newClusterNumOfWorker = newClusterNumOfWorker;
        return this;
    }

    /**
     * Get the node types of new cluster. Type: string (or Expression with resultType string).
     *
     * @return the newClusterNodeType value
     */
    public Object newClusterNodeType() {
        return this.newClusterNodeType;
    }

    /**
     * Set the node types of new cluster. Type: string (or Expression with resultType string).
     *
     * @param newClusterNodeType the newClusterNodeType value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterNodeType(Object newClusterNodeType) {
        this.newClusterNodeType = newClusterNodeType;
        return this;
    }

    /**
     * Get a set of optional, user-specified Spark configuration key-value pairs.
     *
     * @return the newClusterSparkConf value
     */
    public Map<String, Object> newClusterSparkConf() {
        return this.newClusterSparkConf;
    }

    /**
     * Set a set of optional, user-specified Spark configuration key-value pairs.
     *
     * @param newClusterSparkConf the newClusterSparkConf value to set
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterSparkConf(Map<String, Object> newClusterSparkConf) {
        this.newClusterSparkConf = newClusterSparkConf;
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
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
