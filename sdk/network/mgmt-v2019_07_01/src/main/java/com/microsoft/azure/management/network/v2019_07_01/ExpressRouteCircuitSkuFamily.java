/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExpressRouteCircuitSkuFamily.
 */
public final class ExpressRouteCircuitSkuFamily extends ExpandableStringEnum<ExpressRouteCircuitSkuFamily> {
    /** Static value UnlimitedData for ExpressRouteCircuitSkuFamily. */
    public static final ExpressRouteCircuitSkuFamily UNLIMITED_DATA = fromString("UnlimitedData");

    /** Static value MeteredData for ExpressRouteCircuitSkuFamily. */
    public static final ExpressRouteCircuitSkuFamily METERED_DATA = fromString("MeteredData");

    /**
     * Creates or finds a ExpressRouteCircuitSkuFamily from its string representation.
     * @param name a name to look for
     * @return the corresponding ExpressRouteCircuitSkuFamily
     */
    @JsonCreator
    public static ExpressRouteCircuitSkuFamily fromString(String name) {
        return fromString(name, ExpressRouteCircuitSkuFamily.class);
    }

    /**
     * @return known ExpressRouteCircuitSkuFamily values
     */
    public static Collection<ExpressRouteCircuitSkuFamily> values() {
        return values(ExpressRouteCircuitSkuFamily.class);
    }
}
