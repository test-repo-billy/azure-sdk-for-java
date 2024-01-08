// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The tier of the SKU.
 */
public final class ExpressRouteCircuitSkuTier extends ExpandableStringEnum<ExpressRouteCircuitSkuTier> {
    /**
     * Static value Standard for ExpressRouteCircuitSkuTier.
     */
    public static final ExpressRouteCircuitSkuTier STANDARD = fromString("Standard");

    /**
     * Static value Premium for ExpressRouteCircuitSkuTier.
     */
    public static final ExpressRouteCircuitSkuTier PREMIUM = fromString("Premium");

    /**
     * Static value Basic for ExpressRouteCircuitSkuTier.
     */
    public static final ExpressRouteCircuitSkuTier BASIC = fromString("Basic");

    /**
     * Static value Local for ExpressRouteCircuitSkuTier.
     */
    public static final ExpressRouteCircuitSkuTier LOCAL = fromString("Local");

    /**
     * Creates a new instance of ExpressRouteCircuitSkuTier value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExpressRouteCircuitSkuTier() {
    }

    /**
     * Creates or finds a ExpressRouteCircuitSkuTier from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExpressRouteCircuitSkuTier.
     */
    @JsonCreator
    public static ExpressRouteCircuitSkuTier fromString(String name) {
        return fromString(name, ExpressRouteCircuitSkuTier.class);
    }

    /**
     * Gets known ExpressRouteCircuitSkuTier values.
     * 
     * @return known ExpressRouteCircuitSkuTier values.
     */
    public static Collection<ExpressRouteCircuitSkuTier> values() {
        return values(ExpressRouteCircuitSkuTier.class);
    }
}
