/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ReadWriteEndpointFailoverPolicy.
 */
public final class ReadWriteEndpointFailoverPolicy extends ExpandableStringEnum<ReadWriteEndpointFailoverPolicy> {
    /** Static value Manual for ReadWriteEndpointFailoverPolicy. */
    public static final ReadWriteEndpointFailoverPolicy MANUAL = fromString("Manual");

    /** Static value Automatic for ReadWriteEndpointFailoverPolicy. */
    public static final ReadWriteEndpointFailoverPolicy AUTOMATIC = fromString("Automatic");

    /**
     * Creates or finds a ReadWriteEndpointFailoverPolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding ReadWriteEndpointFailoverPolicy
     */
    @JsonCreator
    public static ReadWriteEndpointFailoverPolicy fromString(String name) {
        return fromString(name, ReadWriteEndpointFailoverPolicy.class);
    }

    /**
     * @return known ReadWriteEndpointFailoverPolicy values
     */
    public static Collection<ReadWriteEndpointFailoverPolicy> values() {
        return values(ReadWriteEndpointFailoverPolicy.class);
    }
}
