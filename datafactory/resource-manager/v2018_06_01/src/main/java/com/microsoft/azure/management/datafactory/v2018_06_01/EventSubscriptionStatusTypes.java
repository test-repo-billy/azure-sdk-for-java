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
 * Defines values for EventSubscriptionStatusTypes.
 */
public final class EventSubscriptionStatusTypes extends ExpandableStringEnum<EventSubscriptionStatusTypes> {
    /** Static value Enabled for EventSubscriptionStatusTypes. */
    public static final EventSubscriptionStatusTypes ENABLED = fromString("Enabled");

    /** Static value Provisioning for EventSubscriptionStatusTypes. */
    public static final EventSubscriptionStatusTypes PROVISIONING = fromString("Provisioning");

    /** Static value Deprovisioning for EventSubscriptionStatusTypes. */
    public static final EventSubscriptionStatusTypes DEPROVISIONING = fromString("Deprovisioning");

    /** Static value Disabled for EventSubscriptionStatusTypes. */
    public static final EventSubscriptionStatusTypes DISABLED = fromString("Disabled");

    /** Static value Unknown for EventSubscriptionStatusTypes. */
    public static final EventSubscriptionStatusTypes UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a EventSubscriptionStatusTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding EventSubscriptionStatusTypes
     */
    @JsonCreator
    public static EventSubscriptionStatusTypes fromString(String name) {
        return fromString(name, EventSubscriptionStatusTypes.class);
    }

    /**
     * @return known EventSubscriptionStatusTypes values
     */
    public static Collection<EventSubscriptionStatusTypes> values() {
        return values(EventSubscriptionStatusTypes.class);
    }
}
