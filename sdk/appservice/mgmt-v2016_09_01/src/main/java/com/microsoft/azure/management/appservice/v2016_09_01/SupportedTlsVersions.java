/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SupportedTlsVersions.
 */
public final class SupportedTlsVersions extends ExpandableStringEnum<SupportedTlsVersions> {
    /** Static value 1.0 for SupportedTlsVersions. */
    public static final SupportedTlsVersions ONE_FULL_STOP_ZERO = fromString("1.0");

    /** Static value 1.1 for SupportedTlsVersions. */
    public static final SupportedTlsVersions ONE_FULL_STOP_ONE = fromString("1.1");

    /** Static value 1.2 for SupportedTlsVersions. */
    public static final SupportedTlsVersions ONE_FULL_STOP_TWO = fromString("1.2");

    /**
     * Creates or finds a SupportedTlsVersions from its string representation.
     * @param name a name to look for
     * @return the corresponding SupportedTlsVersions
     */
    @JsonCreator
    public static SupportedTlsVersions fromString(String name) {
        return fromString(name, SupportedTlsVersions.class);
    }

    /**
     * @return known SupportedTlsVersions values
     */
    public static Collection<SupportedTlsVersions> values() {
        return values(SupportedTlsVersions.class);
    }
}
