/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DataFormat.
 */
public final class DataFormat extends ExpandableStringEnum<DataFormat> {
    /** Static value MULTIJSON for DataFormat. */
    public static final DataFormat MULTIJSON = fromString("MULTIJSON");

    /** Static value JSON for DataFormat. */
    public static final DataFormat JSON = fromString("JSON");

    /** Static value CSV for DataFormat. */
    public static final DataFormat CSV = fromString("CSV");

    /**
     * Creates or finds a DataFormat from its string representation.
     * @param name a name to look for
     * @return the corresponding DataFormat
     */
    @JsonCreator
    public static DataFormat fromString(String name) {
        return fromString(name, DataFormat.class);
    }

    /**
     * @return known DataFormat values
     */
    public static Collection<DataFormat> values() {
        return values(DataFormat.class);
    }
}
