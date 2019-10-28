/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RunQueryFilterOperator.
 */
public final class RunQueryFilterOperator extends ExpandableStringEnum<RunQueryFilterOperator> {
    /** Static value Equals for RunQueryFilterOperator. */
    public static final RunQueryFilterOperator EQUALS = fromString("Equals");

    /** Static value NotEquals for RunQueryFilterOperator. */
    public static final RunQueryFilterOperator NOT_EQUALS = fromString("NotEquals");

    /** Static value In for RunQueryFilterOperator. */
    public static final RunQueryFilterOperator IN = fromString("In");

    /** Static value NotIn for RunQueryFilterOperator. */
    public static final RunQueryFilterOperator NOT_IN = fromString("NotIn");

    /**
     * Creates or finds a RunQueryFilterOperator from its string representation.
     * @param name a name to look for
     * @return the corresponding RunQueryFilterOperator
     */
    @JsonCreator
    public static RunQueryFilterOperator fromString(String name) {
        return fromString(name, RunQueryFilterOperator.class);
    }

    /**
     * @return known RunQueryFilterOperator values
     */
    public static Collection<RunQueryFilterOperator> values() {
        return values(RunQueryFilterOperator.class);
    }
}
