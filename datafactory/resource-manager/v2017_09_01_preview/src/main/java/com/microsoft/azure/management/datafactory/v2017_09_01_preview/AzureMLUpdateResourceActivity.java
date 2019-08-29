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

/**
 * Azure ML Update Resource management activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureMLUpdateResource")
@JsonFlatten
public class AzureMLUpdateResourceActivity extends ExecutionActivity {
    /**
     * Name of the Trained Model module in the Web Service experiment to be
     * updated. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.trainedModelName", required = true)
    private Object trainedModelName;

    /**
     * Name of Azure Storage linked service holding the .ilearner file that
     * will be uploaded by the update operation.
     */
    @JsonProperty(value = "typeProperties.trainedModelLinkedServiceName", required = true)
    private LinkedServiceReference trainedModelLinkedServiceName;

    /**
     * The relative file path in trainedModelLinkedService to represent the
     * .ilearner file that will be uploaded by the update operation.  Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.trainedModelFilePath", required = true)
    private Object trainedModelFilePath;

    /**
     * Get name of the Trained Model module in the Web Service experiment to be updated. Type: string (or Expression with resultType string).
     *
     * @return the trainedModelName value
     */
    public Object trainedModelName() {
        return this.trainedModelName;
    }

    /**
     * Set name of the Trained Model module in the Web Service experiment to be updated. Type: string (or Expression with resultType string).
     *
     * @param trainedModelName the trainedModelName value to set
     * @return the AzureMLUpdateResourceActivity object itself.
     */
    public AzureMLUpdateResourceActivity withTrainedModelName(Object trainedModelName) {
        this.trainedModelName = trainedModelName;
        return this;
    }

    /**
     * Get name of Azure Storage linked service holding the .ilearner file that will be uploaded by the update operation.
     *
     * @return the trainedModelLinkedServiceName value
     */
    public LinkedServiceReference trainedModelLinkedServiceName() {
        return this.trainedModelLinkedServiceName;
    }

    /**
     * Set name of Azure Storage linked service holding the .ilearner file that will be uploaded by the update operation.
     *
     * @param trainedModelLinkedServiceName the trainedModelLinkedServiceName value to set
     * @return the AzureMLUpdateResourceActivity object itself.
     */
    public AzureMLUpdateResourceActivity withTrainedModelLinkedServiceName(LinkedServiceReference trainedModelLinkedServiceName) {
        this.trainedModelLinkedServiceName = trainedModelLinkedServiceName;
        return this;
    }

    /**
     * Get the relative file path in trainedModelLinkedService to represent the .ilearner file that will be uploaded by the update operation.  Type: string (or Expression with resultType string).
     *
     * @return the trainedModelFilePath value
     */
    public Object trainedModelFilePath() {
        return this.trainedModelFilePath;
    }

    /**
     * Set the relative file path in trainedModelLinkedService to represent the .ilearner file that will be uploaded by the update operation.  Type: string (or Expression with resultType string).
     *
     * @param trainedModelFilePath the trainedModelFilePath value to set
     * @return the AzureMLUpdateResourceActivity object itself.
     */
    public AzureMLUpdateResourceActivity withTrainedModelFilePath(Object trainedModelFilePath) {
        this.trainedModelFilePath = trainedModelFilePath;
        return this;
    }

}
