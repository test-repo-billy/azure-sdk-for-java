// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Tier of an application gateway.
 */
public final class ApplicationGatewayTier extends ExpandableStringEnum<ApplicationGatewayTier> {
    /**
     * Static value Standard for ApplicationGatewayTier.
     */
    public static final ApplicationGatewayTier STANDARD = fromString("Standard");

    /**
     * Static value WAF for ApplicationGatewayTier.
     */
    public static final ApplicationGatewayTier WAF = fromString("WAF");

    /**
     * Static value Standard_v2 for ApplicationGatewayTier.
     */
    public static final ApplicationGatewayTier STANDARD_V2 = fromString("Standard_v2");

    /**
     * Static value WAF_v2 for ApplicationGatewayTier.
     */
    public static final ApplicationGatewayTier WAF_V2 = fromString("WAF_v2");

    /**
     * Static value Basic for ApplicationGatewayTier.
     */
    public static final ApplicationGatewayTier BASIC = fromString("Basic");

    /**
     * Creates a new instance of ApplicationGatewayTier value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewayTier() {
    }

    /**
     * Creates or finds a ApplicationGatewayTier from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayTier.
     */
    @JsonCreator
    public static ApplicationGatewayTier fromString(String name) {
        return fromString(name, ApplicationGatewayTier.class);
    }

    /**
     * Gets known ApplicationGatewayTier values.
     * 
     * @return known ApplicationGatewayTier values.
     */
    public static Collection<ApplicationGatewayTier> values() {
        return values(ApplicationGatewayTier.class);
    }
}
