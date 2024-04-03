// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Discriminators for supported worker selector attachment types.
 */
public final class WorkerSelectorAttachmentKind extends ExpandableStringEnum<WorkerSelectorAttachmentKind> {

    /**
     * Discriminator value for ConditionalWorkerSelectorAttachment.
     */
    @Generated
    public static final WorkerSelectorAttachmentKind CONDITIONAL = fromString("conditional");

    /**
     * Discriminator value for PassThroughWorkerSelectorAttachment.
     */
    @Generated
    public static final WorkerSelectorAttachmentKind PASS_THROUGH = fromString("passThrough");

    /**
     * Discriminator value for RuleEngineWorkerSelectorAttachment.
     */
    @Generated
    public static final WorkerSelectorAttachmentKind RULE_ENGINE = fromString("ruleEngine");

    /**
     * Discriminator value for StaticWorkerSelectorAttachment.
     */
    @Generated
    public static final WorkerSelectorAttachmentKind STATIC = fromString("static");

    /**
     * Discriminator value for WeightedAllocationWorkerSelectorAttachment.
     */
    @Generated
    public static final WorkerSelectorAttachmentKind WEIGHTED_ALLOCATION = fromString("weightedAllocation");

    /**
     * Creates a new instance of WorkerSelectorAttachmentKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public WorkerSelectorAttachmentKind() {
    }

    /**
     * Creates or finds a WorkerSelectorAttachmentKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkerSelectorAttachmentKind.
     */
    @Generated
    @JsonCreator
    public static WorkerSelectorAttachmentKind fromString(String name) {
        return fromString(name, WorkerSelectorAttachmentKind.class);
    }

    /**
     * Gets known WorkerSelectorAttachmentKind values.
     *
     * @return known WorkerSelectorAttachmentKind values.
     */
    @Generated
    public static Collection<WorkerSelectorAttachmentKind> values() {
        return values(WorkerSelectorAttachmentKind.class);
    }
}
