// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.AddressResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of AddressResponse.
 */
public interface AddressResponse {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the serviceIpAddress property: Main public virtual IP.
     * 
     * @return the serviceIpAddress value.
     */
    String serviceIpAddress();

    /**
     * Gets the internalIpAddress property: Virtual Network internal IP address of the App Service Environment if it is
     * in internal load-balancing mode.
     * 
     * @return the internalIpAddress value.
     */
    String internalIpAddress();

    /**
     * Gets the outboundIpAddresses property: IP addresses appearing on outbound connections.
     * 
     * @return the outboundIpAddresses value.
     */
    List<String> outboundIpAddresses();

    /**
     * Gets the vipMappings property: Additional virtual IPs.
     * 
     * @return the vipMappings value.
     */
    List<VirtualIpMapping> vipMappings();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.AddressResponseInner object.
     * 
     * @return the inner object.
     */
    AddressResponseInner innerModel();
}
