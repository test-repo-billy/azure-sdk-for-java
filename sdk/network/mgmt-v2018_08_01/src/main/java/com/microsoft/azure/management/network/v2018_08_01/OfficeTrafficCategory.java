/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OfficeTrafficCategory.
 */
public final class OfficeTrafficCategory extends ExpandableStringEnum<OfficeTrafficCategory> {
    /** Static value Optimize for OfficeTrafficCategory. */
    public static final OfficeTrafficCategory OPTIMIZE = fromString("Optimize");

    /** Static value OptimizeAndAllow for OfficeTrafficCategory. */
    public static final OfficeTrafficCategory OPTIMIZE_AND_ALLOW = fromString("OptimizeAndAllow");

    /** Static value All for OfficeTrafficCategory. */
    public static final OfficeTrafficCategory ALL = fromString("All");

    /** Static value None for OfficeTrafficCategory. */
    public static final OfficeTrafficCategory NONE = fromString("None");

    /**
     * Creates or finds a OfficeTrafficCategory from its string representation.
     * @param name a name to look for
     * @return the corresponding OfficeTrafficCategory
     */
    @JsonCreator
    public static OfficeTrafficCategory fromString(String name) {
        return fromString(name, OfficeTrafficCategory.class);
    }

    /**
     * @return known OfficeTrafficCategory values
     */
    public static Collection<OfficeTrafficCategory> values() {
        return values(OfficeTrafficCategory.class);
    }
}
