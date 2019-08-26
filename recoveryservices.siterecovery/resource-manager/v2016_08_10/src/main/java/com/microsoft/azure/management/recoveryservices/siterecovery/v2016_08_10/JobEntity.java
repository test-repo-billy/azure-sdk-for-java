/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class contains the minimal job details required to navigate to the
 * desired drill down.
 */
public class JobEntity {
    /**
     * The job id.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /**
     * The job display name.
     */
    @JsonProperty(value = "jobFriendlyName")
    private String jobFriendlyName;

    /**
     * The object id.
     */
    @JsonProperty(value = "targetObjectId")
    private String targetObjectId;

    /**
     * The object name.
     */
    @JsonProperty(value = "targetObjectName")
    private String targetObjectName;

    /**
     * The workflow affected object type.
     */
    @JsonProperty(value = "targetInstanceType")
    private String targetInstanceType;

    /**
     * The job name. Enum type ScenarioName.
     */
    @JsonProperty(value = "jobScenarioName")
    private String jobScenarioName;

    /**
     * Get the job id.
     *
     * @return the jobId value
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set the job id.
     *
     * @param jobId the jobId value to set
     * @return the JobEntity object itself.
     */
    public JobEntity withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the job display name.
     *
     * @return the jobFriendlyName value
     */
    public String jobFriendlyName() {
        return this.jobFriendlyName;
    }

    /**
     * Set the job display name.
     *
     * @param jobFriendlyName the jobFriendlyName value to set
     * @return the JobEntity object itself.
     */
    public JobEntity withJobFriendlyName(String jobFriendlyName) {
        this.jobFriendlyName = jobFriendlyName;
        return this;
    }

    /**
     * Get the object id.
     *
     * @return the targetObjectId value
     */
    public String targetObjectId() {
        return this.targetObjectId;
    }

    /**
     * Set the object id.
     *
     * @param targetObjectId the targetObjectId value to set
     * @return the JobEntity object itself.
     */
    public JobEntity withTargetObjectId(String targetObjectId) {
        this.targetObjectId = targetObjectId;
        return this;
    }

    /**
     * Get the object name.
     *
     * @return the targetObjectName value
     */
    public String targetObjectName() {
        return this.targetObjectName;
    }

    /**
     * Set the object name.
     *
     * @param targetObjectName the targetObjectName value to set
     * @return the JobEntity object itself.
     */
    public JobEntity withTargetObjectName(String targetObjectName) {
        this.targetObjectName = targetObjectName;
        return this;
    }

    /**
     * Get the workflow affected object type.
     *
     * @return the targetInstanceType value
     */
    public String targetInstanceType() {
        return this.targetInstanceType;
    }

    /**
     * Set the workflow affected object type.
     *
     * @param targetInstanceType the targetInstanceType value to set
     * @return the JobEntity object itself.
     */
    public JobEntity withTargetInstanceType(String targetInstanceType) {
        this.targetInstanceType = targetInstanceType;
        return this;
    }

    /**
     * Get the job name. Enum type ScenarioName.
     *
     * @return the jobScenarioName value
     */
    public String jobScenarioName() {
        return this.jobScenarioName;
    }

    /**
     * Set the job name. Enum type ScenarioName.
     *
     * @param jobScenarioName the jobScenarioName value to set
     * @return the JobEntity object itself.
     */
    public JobEntity withJobScenarioName(String jobScenarioName) {
        this.jobScenarioName = jobScenarioName;
        return this;
    }

}
