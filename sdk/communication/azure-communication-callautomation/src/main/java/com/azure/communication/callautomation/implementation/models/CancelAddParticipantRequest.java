// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request payload for cancelling add participant request. */
@Fluent
public final class CancelAddParticipantRequest {
    /*
     * Invitation ID used to add a participant.
     */
    @JsonProperty(value = "invitationId", required = true)
    private String invitationId;

    /*
     * Used by customers when calling mid-call actions to correlate the request
     * to the response event.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation.
     * This setup is per-action. If this is not set, the default callback URI
     * set by CreateCall/AnswerCall will be used.
     */
    @JsonProperty(value = "operationCallbackUri")
    private String operationCallbackUri;

    /**
     * Get the invitationId property: Invitation ID used to add a participant.
     *
     * @return the invitationId value.
     */
    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * Set the invitationId property: Invitation ID used to add a participant.
     *
     * @param invitationId the invitationId value to set.
     * @return the CancelAddParticipantRequest object itself.
     */
    public CancelAddParticipantRequest setInvitationId(String invitationId) {
        this.invitationId = invitationId;
        return this;
    }

    /**
     * Get the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     *
     * @param operationContext the operationContext value to set.
     * @return the CancelAddParticipantRequest object itself.
     */
    public CancelAddParticipantRequest setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the operationCallbackUri property: Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation. This setup is per-action. If this is not set, the default callback URI
     * set by CreateCall/AnswerCall will be used.
     *
     * @return the operationCallbackUri value.
     */
    public String getOperationCallbackUri() {
        return this.operationCallbackUri;
    }

    /**
     * Set the operationCallbackUri property: Set a callback URI that overrides the default callback URI set by
     * CreateCall/AnswerCall for this operation. This setup is per-action. If this is not set, the default callback URI
     * set by CreateCall/AnswerCall will be used.
     *
     * @param operationCallbackUri the operationCallbackUri value to set.
     * @return the CancelAddParticipantRequest object itself.
     */
    public CancelAddParticipantRequest setOperationCallbackUri(String operationCallbackUri) {
        this.operationCallbackUri = operationCallbackUri;
        return this;
    }
}
