// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Tier of a public IP prefix SKU.
 */
public final class PublicIpPrefixSkuTier extends ExpandableStringEnum<PublicIpPrefixSkuTier> {
    /**
     * Static value Regional for PublicIpPrefixSkuTier.
     */
    public static final PublicIpPrefixSkuTier REGIONAL = fromString("Regional");

    /**
     * Static value Global for PublicIpPrefixSkuTier.
     */
    public static final PublicIpPrefixSkuTier GLOBAL = fromString("Global");

    /**
     * Creates a new instance of PublicIpPrefixSkuTier value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublicIpPrefixSkuTier() {
    }

    /**
     * Creates or finds a PublicIpPrefixSkuTier from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PublicIpPrefixSkuTier.
     */
    @JsonCreator
    public static PublicIpPrefixSkuTier fromString(String name) {
        return fromString(name, PublicIpPrefixSkuTier.class);
    }

    /**
     * Gets known PublicIpPrefixSkuTier values.
     * 
     * @return known PublicIpPrefixSkuTier values.
     */
    public static Collection<PublicIpPrefixSkuTier> values() {
        return values(PublicIpPrefixSkuTier.class);
    }
}
