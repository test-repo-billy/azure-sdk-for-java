// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enable or Disable apply network policies on private link service in the subnet.
 */
public final class VirtualNetworkPrivateLinkServiceNetworkPolicies
    extends ExpandableStringEnum<VirtualNetworkPrivateLinkServiceNetworkPolicies> {
    /**
     * Static value Enabled for VirtualNetworkPrivateLinkServiceNetworkPolicies.
     */
    public static final VirtualNetworkPrivateLinkServiceNetworkPolicies ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for VirtualNetworkPrivateLinkServiceNetworkPolicies.
     */
    public static final VirtualNetworkPrivateLinkServiceNetworkPolicies DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of VirtualNetworkPrivateLinkServiceNetworkPolicies value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualNetworkPrivateLinkServiceNetworkPolicies() {
    }

    /**
     * Creates or finds a VirtualNetworkPrivateLinkServiceNetworkPolicies from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkPrivateLinkServiceNetworkPolicies.
     */
    @JsonCreator
    public static VirtualNetworkPrivateLinkServiceNetworkPolicies fromString(String name) {
        return fromString(name, VirtualNetworkPrivateLinkServiceNetworkPolicies.class);
    }

    /**
     * Gets known VirtualNetworkPrivateLinkServiceNetworkPolicies values.
     * 
     * @return known VirtualNetworkPrivateLinkServiceNetworkPolicies values.
     */
    public static Collection<VirtualNetworkPrivateLinkServiceNetworkPolicies> values() {
        return values(VirtualNetworkPrivateLinkServiceNetworkPolicies.class);
    }
}
