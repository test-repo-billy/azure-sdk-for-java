/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Live Event input.
 */
public class LiveEventInput {
    /**
     * The streaming protocol for the Live Event.  This is specified at
     * creation time and cannot be updated. Possible values include:
     * 'FragmentedMP4', 'RTMP'.
     */
    @JsonProperty(value = "streamingProtocol", required = true)
    private LiveEventInputProtocol streamingProtocol;

    /**
     * The access control for LiveEvent Input.
     */
    @JsonProperty(value = "accessControl")
    private LiveEventInputAccessControl accessControl;

    /**
     * ISO 8601 timespan duration of the key frame interval duration.
     */
    @JsonProperty(value = "keyFrameIntervalDuration")
    private String keyFrameIntervalDuration;

    /**
     * A unique identifier for a stream.  This can be specified at creation
     * time but cannot be updated.  If omitted, the service will generate a
     * unique value.
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /**
     * The input endpoints for the Live Event.
     */
    @JsonProperty(value = "endpoints")
    private List<LiveEventEndpoint> endpoints;

    /**
     * Get the streaming protocol for the Live Event.  This is specified at creation time and cannot be updated. Possible values include: 'FragmentedMP4', 'RTMP'.
     *
     * @return the streamingProtocol value
     */
    public LiveEventInputProtocol streamingProtocol() {
        return this.streamingProtocol;
    }

    /**
     * Set the streaming protocol for the Live Event.  This is specified at creation time and cannot be updated. Possible values include: 'FragmentedMP4', 'RTMP'.
     *
     * @param streamingProtocol the streamingProtocol value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withStreamingProtocol(LiveEventInputProtocol streamingProtocol) {
        this.streamingProtocol = streamingProtocol;
        return this;
    }

    /**
     * Get the access control for LiveEvent Input.
     *
     * @return the accessControl value
     */
    public LiveEventInputAccessControl accessControl() {
        return this.accessControl;
    }

    /**
     * Set the access control for LiveEvent Input.
     *
     * @param accessControl the accessControl value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withAccessControl(LiveEventInputAccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Get iSO 8601 timespan duration of the key frame interval duration.
     *
     * @return the keyFrameIntervalDuration value
     */
    public String keyFrameIntervalDuration() {
        return this.keyFrameIntervalDuration;
    }

    /**
     * Set iSO 8601 timespan duration of the key frame interval duration.
     *
     * @param keyFrameIntervalDuration the keyFrameIntervalDuration value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withKeyFrameIntervalDuration(String keyFrameIntervalDuration) {
        this.keyFrameIntervalDuration = keyFrameIntervalDuration;
        return this;
    }

    /**
     * Get a unique identifier for a stream.  This can be specified at creation time but cannot be updated.  If omitted, the service will generate a unique value.
     *
     * @return the accessToken value
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set a unique identifier for a stream.  This can be specified at creation time but cannot be updated.  If omitted, the service will generate a unique value.
     *
     * @param accessToken the accessToken value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the input endpoints for the Live Event.
     *
     * @return the endpoints value
     */
    public List<LiveEventEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the input endpoints for the Live Event.
     *
     * @param endpoints the endpoints value to set
     * @return the LiveEventInput object itself.
     */
    public LiveEventInput withEndpoints(List<LiveEventEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

}
