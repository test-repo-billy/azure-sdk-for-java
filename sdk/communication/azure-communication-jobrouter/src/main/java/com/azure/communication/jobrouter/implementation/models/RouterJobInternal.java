// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.RouterJobAssignment;
import com.azure.communication.jobrouter.models.RouterJobNote;
import com.azure.communication.jobrouter.models.RouterJobStatus;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * A unit of work to be routed.
 */
@Fluent
public final class RouterJobInternal {

    /*
     * The entity tag for this resource.
     */
    @Generated
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Id of a job.
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Reference to an external parent context, eg. call ID.
     */
    @Generated
    @JsonProperty(value = "channelReference")
    private String channelReference;

    /*
     * The status of the job.
     */
    @Generated
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private RouterJobStatus status;

    /*
     * Timestamp a job was queued in UTC.
     */
    @Generated
    @JsonProperty(value = "enqueuedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime enqueuedAt;

    /*
     * The channel identifier. eg. voice, chat, etc.
     */
    @Generated
    @JsonProperty(value = "channelId")
    private String channelId;

    /*
     * Id of a classification policy used for classifying this job.
     */
    @Generated
    @JsonProperty(value = "classificationPolicyId")
    private String classificationPolicyId;

    /*
     * Id of a queue that this job is queued to.
     */
    @Generated
    @JsonProperty(value = "queueId")
    private String queueId;

    /*
     * Priority of this job. Value must be between -100 to 100.
     */
    @Generated
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Reason code for cancelled or closed jobs.
     */
    @Generated
    @JsonProperty(value = "dispositionCode")
    private String dispositionCode;

    /*
     * A collection of manually specified worker selectors, which a worker must satisfy in order to process this job.
     */
    @Generated
    @JsonProperty(value = "requestedWorkerSelectors")
    private List<RouterWorkerSelectorInternal> requestedWorkerSelectors;

    /*
     * A collection of worker selectors attached by a classification policy, which a worker must satisfy in order to process this job.
     */
    @Generated
    @JsonProperty(value = "attachedWorkerSelectors", access = JsonProperty.Access.WRITE_ONLY)
    private List<RouterWorkerSelectorInternal> attachedWorkerSelectors;

    /*
     * A set of key/value pairs that are identifying attributes used by the rules engines to make decisions. Values must be primitive values - number, string, boolean.
     */
    @Generated
    @JsonProperty(value = "labels")
    private Map<String, Object> labels;

    /*
     * A collection of the assignments of the job. Key is AssignmentId.
     */
    @Generated
    @JsonProperty(value = "assignments", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, RouterJobAssignment> assignments;

    /*
     * A set of non-identifying attributes attached to this job. Values must be primitive values - number, string, boolean.
     */
    @Generated
    @JsonProperty(value = "tags")
    private Map<String, Object> tags;

    /*
     * Notes attached to a job, sorted by timestamp.
     */
    @Generated
    @JsonProperty(value = "notes")
    private List<RouterJobNote> notes;

    /*
     * If set, job will be scheduled to be enqueued at a given time.
     */
    @Generated
    @JsonProperty(value = "scheduledAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime scheduledAt;

    /*
     * If provided, will determine how job matching will be carried out. Default mode: QueueAndMatchMode.
     */
    @Generated
    @JsonProperty(value = "matchingMode")
    private JobMatchingModeInternal matchingMode;

    /**
     * Creates an instance of RouterJobInternal class.
     */
    @Generated
    public RouterJobInternal() {
    }

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the id property: Id of a job.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the channelReference property: Reference to an external parent context, eg. call ID.
     *
     * @return the channelReference value.
     */
    @Generated
    public String getChannelReference() {
        return this.channelReference;
    }

    /**
     * Set the channelReference property: Reference to an external parent context, eg. call ID.
     *
     * @param channelReference the channelReference value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setChannelReference(String channelReference) {
        this.channelReference = channelReference;
        return this;
    }

    /**
     * Get the status property: The status of the job.
     *
     * @return the status value.
     */
    @Generated
    public RouterJobStatus getStatus() {
        return this.status;
    }

    /**
     * Get the enqueuedAt property: Timestamp a job was queued in UTC.
     *
     * @return the enqueuedAt value.
     */
    @Generated
    public OffsetDateTime getEnqueuedAt() {
        return this.enqueuedAt;
    }

    /**
     * Get the channelId property: The channel identifier. eg. voice, chat, etc.
     *
     * @return the channelId value.
     */
    @Generated
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Set the channelId property: The channel identifier. eg. voice, chat, etc.
     *
     * @param channelId the channelId value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Get the classificationPolicyId property: Id of a classification policy used for classifying this job.
     *
     * @return the classificationPolicyId value.
     */
    @Generated
    public String getClassificationPolicyId() {
        return this.classificationPolicyId;
    }

    /**
     * Set the classificationPolicyId property: Id of a classification policy used for classifying this job.
     *
     * @param classificationPolicyId the classificationPolicyId value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setClassificationPolicyId(String classificationPolicyId) {
        this.classificationPolicyId = classificationPolicyId;
        return this;
    }

    /**
     * Get the queueId property: Id of a queue that this job is queued to.
     *
     * @return the queueId value.
     */
    @Generated
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Set the queueId property: Id of a queue that this job is queued to.
     *
     * @param queueId the queueId value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Get the priority property: Priority of this job. Value must be between -100 to 100.
     *
     * @return the priority value.
     */
    @Generated
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of this job. Value must be between -100 to 100.
     *
     * @param priority the priority value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the dispositionCode property: Reason code for cancelled or closed jobs.
     *
     * @return the dispositionCode value.
     */
    @Generated
    public String getDispositionCode() {
        return this.dispositionCode;
    }

    /**
     * Set the dispositionCode property: Reason code for cancelled or closed jobs.
     *
     * @param dispositionCode the dispositionCode value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setDispositionCode(String dispositionCode) {
        this.dispositionCode = dispositionCode;
        return this;
    }

    /**
     * Get the requestedWorkerSelectors property: A collection of manually specified worker selectors, which a worker
     * must satisfy in order to process this job.
     *
     * @return the requestedWorkerSelectors value.
     */
    @Generated
    public List<RouterWorkerSelectorInternal> getRequestedWorkerSelectors() {
        return this.requestedWorkerSelectors;
    }

    /**
     * Set the requestedWorkerSelectors property: A collection of manually specified worker selectors, which a worker
     * must satisfy in order to process this job.
     *
     * @param requestedWorkerSelectors the requestedWorkerSelectors value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setRequestedWorkerSelectors(List<RouterWorkerSelectorInternal> requestedWorkerSelectors) {
        this.requestedWorkerSelectors = requestedWorkerSelectors;
        return this;
    }

    /**
     * Get the attachedWorkerSelectors property: A collection of worker selectors attached by a classification policy,
     * which a worker must satisfy in order to process this job.
     *
     * @return the attachedWorkerSelectors value.
     */
    @Generated
    public List<RouterWorkerSelectorInternal> getAttachedWorkerSelectors() {
        return this.attachedWorkerSelectors;
    }

    /**
     * Get the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions. Values must be primitive values - number, string, boolean.
     *
     * @return the labels value.
     */
    @Generated
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions. Values must be primitive values - number, string, boolean.
     *
     * @param labels the labels value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setLabels(Map<String, Object> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the assignments property: A collection of the assignments of the job. Key is AssignmentId.
     *
     * @return the assignments value.
     */
    @Generated
    public Map<String, RouterJobAssignment> getAssignments() {
        return this.assignments;
    }

    /**
     * Get the tags property: A set of non-identifying attributes attached to this job. Values must be primitive values
     * - number, string, boolean.
     *
     * @return the tags value.
     */
    @Generated
    public Map<String, Object> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A set of non-identifying attributes attached to this job. Values must be primitive values
     * - number, string, boolean.
     *
     * @param tags the tags value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setTags(Map<String, Object> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the notes property: Notes attached to a job, sorted by timestamp.
     *
     * @return the notes value.
     */
    @Generated
    public List<RouterJobNote> getNotes() {
        return this.notes;
    }

    /**
     * Set the notes property: Notes attached to a job, sorted by timestamp.
     *
     * @param notes the notes value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setNotes(List<RouterJobNote> notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get the scheduledAt property: If set, job will be scheduled to be enqueued at a given time.
     *
     * @return the scheduledAt value.
     */
    @Generated
    public OffsetDateTime getScheduledAt() {
        return this.scheduledAt;
    }

    /**
     * Get the matchingMode property: If provided, will determine how job matching will be carried out. Default mode:
     * QueueAndMatchMode.
     *
     * @return the matchingMode value.
     */
    @Generated
    public JobMatchingModeInternal getMatchingMode() {
        return this.matchingMode;
    }

    /**
     * Set the matchingMode property: If provided, will determine how job matching will be carried out. Default mode:
     * QueueAndMatchMode.
     *
     * @param matchingMode the matchingMode value to set.
     * @return the RouterJobInternal object itself.
     */
    @Generated
    public RouterJobInternal setMatchingMode(JobMatchingModeInternal matchingMode) {
        this.matchingMode = matchingMode;
        return this;
    }

    /**
     * Set id.
     *
     * @param id id.
     * @return this.
     */
    public RouterJobInternal setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Set etag.
     *
     * @param etag etag.
     * @return this.
     */
    public RouterJobInternal setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Set enqueuedAt.
     *
     * @param enqueuedAt enqueuedAt.
     * @return this.
     */
    public RouterJobInternal setEnqueuedAt(OffsetDateTime enqueuedAt) {
        this.enqueuedAt = enqueuedAt;
        return this;
    }

    /**
     * Set status.
     *
     * @param routerJobStatus routerJobStatus.
     * @return this.
     */
    public RouterJobInternal setStatus(RouterJobStatus routerJobStatus) {
        this.status = routerJobStatus;
        return this;
    }

    /**
     * Set assignments.
     *
     * @param assignments assignments.
     * @return this.
     */
    public RouterJobInternal setAssignments(Map<String, RouterJobAssignment> assignments) {
        this.assignments = assignments;
        return this;
    }

    /**
     * Set attachedWorkerSelectors.
     *
     * @param attachedWorkerSelectors attachedWorkerSelectors.
     * @return this.
     */
    public RouterJobInternal setAttachedWorkerSelectors(List<RouterWorkerSelectorInternal> attachedWorkerSelectors) {
        this.attachedWorkerSelectors = attachedWorkerSelectors;
        return this;
    }

    /**
     * Set scheduledAt.
     *
     * @param scheduledAt scheduledAt.
     * @return this.
     */
    public RouterJobInternal setScheduledAt(OffsetDateTime scheduledAt) {
        this.scheduledAt = scheduledAt;
        return this;
    }
}
