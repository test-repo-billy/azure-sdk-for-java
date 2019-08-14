/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkPlugin.
 */
public final class NetworkPlugin extends ExpandableStringEnum<NetworkPlugin> {
    /** Static value azure for NetworkPlugin. */
    public static final NetworkPlugin AZURE = fromString("azure");

    /** Static value kubenet for NetworkPlugin. */
    public static final NetworkPlugin KUBENET = fromString("kubenet");

    /**
     * Creates or finds a NetworkPlugin from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkPlugin
     */
    @JsonCreator
    public static NetworkPlugin fromString(String name) {
        return fromString(name, NetworkPlugin.class);
    }

    /**
     * @return known NetworkPlugin values
     */
    public static Collection<NetworkPlugin> values() {
        return values(NetworkPlugin.class);
    }
}
