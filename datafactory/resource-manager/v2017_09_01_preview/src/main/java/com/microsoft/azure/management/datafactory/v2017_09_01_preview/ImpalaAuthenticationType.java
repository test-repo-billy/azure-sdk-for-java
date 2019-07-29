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
 * Defines values for ImpalaAuthenticationType.
 */
public final class ImpalaAuthenticationType extends ExpandableStringEnum<ImpalaAuthenticationType> {
    /** Static value Anonymous for ImpalaAuthenticationType. */
    public static final ImpalaAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value SASLUsername for ImpalaAuthenticationType. */
    public static final ImpalaAuthenticationType SASLUSERNAME = fromString("SASLUsername");

    /** Static value UsernameAndPassword for ImpalaAuthenticationType. */
    public static final ImpalaAuthenticationType USERNAME_AND_PASSWORD = fromString("UsernameAndPassword");

    /**
     * Creates or finds a ImpalaAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding ImpalaAuthenticationType
     */
    @JsonCreator
    public static ImpalaAuthenticationType fromString(String name) {
        return fromString(name, ImpalaAuthenticationType.class);
    }

    /**
     * @return known ImpalaAuthenticationType values
     */
    public static Collection<ImpalaAuthenticationType> values() {
        return values(ImpalaAuthenticationType.class);
    }
}
