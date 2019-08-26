/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Fabric specific details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("FabricSpecificDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Azure", value = AzureFabricSpecificDetails.class),
    @JsonSubTypes.Type(name = "VMM", value = VmmDetails.class),
    @JsonSubTypes.Type(name = "HyperVSite", value = HyperVSiteDetails.class),
    @JsonSubTypes.Type(name = "VMware", value = VMwareDetails.class),
    @JsonSubTypes.Type(name = "VMwareV2", value = VMwareV2FabricSpecificDetails.class)
})
public class FabricSpecificDetails {
}
