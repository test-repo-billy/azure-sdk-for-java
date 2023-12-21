/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ImportMode.
 */
public final class ImportMode extends ExpandableStringEnum<ImportMode> {
    /** Static value NoForce for ImportMode. */
    public static final ImportMode NO_FORCE = fromString("NoForce");

    /** Static value Force for ImportMode. */
    public static final ImportMode FORCE = fromString("Force");

    /**
     * Creates or finds a ImportMode from its string representation.
     * @param name a name to look for
     * @return the corresponding ImportMode
     */
    @JsonCreator
    public static ImportMode fromString(String name) {
        return fromString(name, ImportMode.class);
    }

    /**
     * @return known ImportMode values
     */
    public static Collection<ImportMode> values() {
        return values(ImportMode.class);
    }
}
