/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationGatewaySslPolicyType.
 */
public final class ApplicationGatewaySslPolicyType extends ExpandableStringEnum<ApplicationGatewaySslPolicyType> {
    /** Static value Predefined for ApplicationGatewaySslPolicyType. */
    public static final ApplicationGatewaySslPolicyType PREDEFINED = fromString("Predefined");

    /** Static value Custom for ApplicationGatewaySslPolicyType. */
    public static final ApplicationGatewaySslPolicyType CUSTOM = fromString("Custom");

    /**
     * Creates or finds a ApplicationGatewaySslPolicyType from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewaySslPolicyType
     */
    @JsonCreator
    public static ApplicationGatewaySslPolicyType fromString(String name) {
        return fromString(name, ApplicationGatewaySslPolicyType.class);
    }

    /**
     * @return known ApplicationGatewaySslPolicyType values
     */
    public static Collection<ApplicationGatewaySslPolicyType> values() {
        return values(ApplicationGatewaySslPolicyType.class);
    }
}
