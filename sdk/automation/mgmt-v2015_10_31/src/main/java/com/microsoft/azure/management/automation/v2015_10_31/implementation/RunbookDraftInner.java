/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.ContentLink;
import org.joda.time.DateTime;
import java.util.Map;
import com.microsoft.azure.management.automation.v2015_10_31.RunbookParameter;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RunbookDraftInner model.
 */
public class RunbookDraftInner {
    /**
     * Gets or sets whether runbook is in edit mode.
     */
    @JsonProperty(value = "inEdit")
    private Boolean inEdit;

    /**
     * Gets or sets the draft runbook content link.
     */
    @JsonProperty(value = "draftContentLink")
    private ContentLink draftContentLink;

    /**
     * Gets or sets the creation time of the runbook draft.
     */
    @JsonProperty(value = "creationTime")
    private DateTime creationTime;

    /**
     * Gets or sets the last modified time of the runbook draft.
     */
    @JsonProperty(value = "lastModifiedTime")
    private DateTime lastModifiedTime;

    /**
     * Gets or sets the runbook draft parameters.
     */
    @JsonProperty(value = "parameters")
    private Map<String, RunbookParameter> parameters;

    /**
     * Gets or sets the runbook output types.
     */
    @JsonProperty(value = "outputTypes")
    private List<String> outputTypes;

    /**
     * Get gets or sets whether runbook is in edit mode.
     *
     * @return the inEdit value
     */
    public Boolean inEdit() {
        return this.inEdit;
    }

    /**
     * Set gets or sets whether runbook is in edit mode.
     *
     * @param inEdit the inEdit value to set
     * @return the RunbookDraftInner object itself.
     */
    public RunbookDraftInner withInEdit(Boolean inEdit) {
        this.inEdit = inEdit;
        return this;
    }

    /**
     * Get gets or sets the draft runbook content link.
     *
     * @return the draftContentLink value
     */
    public ContentLink draftContentLink() {
        return this.draftContentLink;
    }

    /**
     * Set gets or sets the draft runbook content link.
     *
     * @param draftContentLink the draftContentLink value to set
     * @return the RunbookDraftInner object itself.
     */
    public RunbookDraftInner withDraftContentLink(ContentLink draftContentLink) {
        this.draftContentLink = draftContentLink;
        return this;
    }

    /**
     * Get gets or sets the creation time of the runbook draft.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set gets or sets the creation time of the runbook draft.
     *
     * @param creationTime the creationTime value to set
     * @return the RunbookDraftInner object itself.
     */
    public RunbookDraftInner withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get gets or sets the last modified time of the runbook draft.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set gets or sets the last modified time of the runbook draft.
     *
     * @param lastModifiedTime the lastModifiedTime value to set
     * @return the RunbookDraftInner object itself.
     */
    public RunbookDraftInner withLastModifiedTime(DateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get gets or sets the runbook draft parameters.
     *
     * @return the parameters value
     */
    public Map<String, RunbookParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set gets or sets the runbook draft parameters.
     *
     * @param parameters the parameters value to set
     * @return the RunbookDraftInner object itself.
     */
    public RunbookDraftInner withParameters(Map<String, RunbookParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get gets or sets the runbook output types.
     *
     * @return the outputTypes value
     */
    public List<String> outputTypes() {
        return this.outputTypes;
    }

    /**
     * Set gets or sets the runbook output types.
     *
     * @param outputTypes the outputTypes value to set
     * @return the RunbookDraftInner object itself.
     */
    public RunbookDraftInner withOutputTypes(List<String> outputTypes) {
        this.outputTypes = outputTypes;
        return this;
    }

}
