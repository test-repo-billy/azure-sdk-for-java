/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Scenario.
 */
public final class Scenario extends ExpandableStringEnum<Scenario> {
    /** Static value Alerts for Scenario. */
    public static final Scenario ALERTS = fromString("Alerts");

    /**
     * Creates or finds a Scenario from its string representation.
     * @param name a name to look for
     * @return the corresponding Scenario
     */
    @JsonCreator
    public static Scenario fromString(String name) {
        return fromString(name, Scenario.class);
    }

    /**
     * @return known Scenario values
     */
    public static Collection<Scenario> values() {
        return values(Scenario.class);
    }
}
