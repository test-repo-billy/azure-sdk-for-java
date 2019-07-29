/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SsisPackageLocationType.
 */
public final class SsisPackageLocationType extends ExpandableStringEnum<SsisPackageLocationType> {
    /** Static value SSISDB for SsisPackageLocationType. */
    public static final SsisPackageLocationType SSISDB = fromString("SSISDB");

    /** Static value File for SsisPackageLocationType. */
    public static final SsisPackageLocationType FILE = fromString("File");

    /**
     * Creates or finds a SsisPackageLocationType from its string representation.
     * @param name a name to look for
     * @return the corresponding SsisPackageLocationType
     */
    @JsonCreator
    public static SsisPackageLocationType fromString(String name) {
        return fromString(name, SsisPackageLocationType.class);
    }

    /**
     * @return known SsisPackageLocationType values
     */
    public static Collection<SsisPackageLocationType> values() {
        return values(SsisPackageLocationType.class);
    }
}
