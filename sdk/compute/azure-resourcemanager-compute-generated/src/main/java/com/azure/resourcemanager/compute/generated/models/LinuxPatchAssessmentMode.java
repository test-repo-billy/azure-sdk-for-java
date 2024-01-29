// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the mode of VM Guest Patch Assessment for the IaaS virtual machine.&lt;br /&gt;&lt;br /&gt; Possible values
 * are:&lt;br /&gt;&lt;br /&gt; **ImageDefault** - You control the timing of patch assessments on a virtual machine.
 * &lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - The platform will trigger periodic patch assessments. The property
 * provisionVMAgent must be true.
 */
public final class LinuxPatchAssessmentMode extends ExpandableStringEnum<LinuxPatchAssessmentMode> {
    /**
     * Static value ImageDefault for LinuxPatchAssessmentMode.
     */
    public static final LinuxPatchAssessmentMode IMAGE_DEFAULT = fromString("ImageDefault");

    /**
     * Static value AutomaticByPlatform for LinuxPatchAssessmentMode.
     */
    public static final LinuxPatchAssessmentMode AUTOMATIC_BY_PLATFORM = fromString("AutomaticByPlatform");

    /**
     * Creates a new instance of LinuxPatchAssessmentMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LinuxPatchAssessmentMode() {
    }

    /**
     * Creates or finds a LinuxPatchAssessmentMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LinuxPatchAssessmentMode.
     */
    @JsonCreator
    public static LinuxPatchAssessmentMode fromString(String name) {
        return fromString(name, LinuxPatchAssessmentMode.class);
    }

    /**
     * Gets known LinuxPatchAssessmentMode values.
     * 
     * @return known LinuxPatchAssessmentMode values.
     */
    public static Collection<LinuxPatchAssessmentMode> values() {
        return values(LinuxPatchAssessmentMode.class);
    }
}
