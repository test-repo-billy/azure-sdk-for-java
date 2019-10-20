/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.databoxedge.implementation.TriggerInner;

/**
 * Trigger details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("PeriodicTimerEvent")
@JsonFlatten
public class PeriodicTimerEventTrigger extends TriggerInner {
    /**
     * Periodic timer details.
     */
    @JsonProperty(value = "properties.sourceInfo", required = true)
    private PeriodicTimerSourceInfo sourceInfo;

    /**
     * Role Sink information.
     */
    @JsonProperty(value = "properties.sinkInfo", required = true)
    private RoleSinkInfo sinkInfo;

    /**
     * A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain
     * specific IoT modules in the device, the tag can be the name or the image
     * URL of the module.
     */
    @JsonProperty(value = "properties.customContextTag")
    private String customContextTag;

    /**
     * Get periodic timer details.
     *
     * @return the sourceInfo value
     */
    public PeriodicTimerSourceInfo sourceInfo() {
        return this.sourceInfo;
    }

    /**
     * Set periodic timer details.
     *
     * @param sourceInfo the sourceInfo value to set
     * @return the PeriodicTimerEventTrigger object itself.
     */
    public PeriodicTimerEventTrigger withSourceInfo(PeriodicTimerSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * Get role Sink information.
     *
     * @return the sinkInfo value
     */
    public RoleSinkInfo sinkInfo() {
        return this.sinkInfo;
    }

    /**
     * Set role Sink information.
     *
     * @param sinkInfo the sinkInfo value to set
     * @return the PeriodicTimerEventTrigger object itself.
     */
    public PeriodicTimerEventTrigger withSinkInfo(RoleSinkInfo sinkInfo) {
        this.sinkInfo = sinkInfo;
        return this;
    }

    /**
     * Get a custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of the module.
     *
     * @return the customContextTag value
     */
    public String customContextTag() {
        return this.customContextTag;
    }

    /**
     * Set a custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of the module.
     *
     * @param customContextTag the customContextTag value to set
     * @return the PeriodicTimerEventTrigger object itself.
     */
    public PeriodicTimerEventTrigger withCustomContextTag(String customContextTag) {
        this.customContextTag = customContextTag;
        return this;
    }

}
