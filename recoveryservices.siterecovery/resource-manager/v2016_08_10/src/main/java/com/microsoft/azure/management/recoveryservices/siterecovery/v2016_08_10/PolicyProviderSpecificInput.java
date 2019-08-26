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
 * Base class for provider specific input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("PolicyProviderSpecificInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzurePolicyInput.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012", value = HyperVReplicaPolicyInput.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012R2", value = HyperVReplicaBluePolicyInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2PolicyInput.class),
    @JsonSubTypes.Type(name = "InMage", value = InMagePolicyInput.class),
    @JsonSubTypes.Type(name = "A2A", value = A2APolicyCreationInput.class),
    @JsonSubTypes.Type(name = "VMwareCbt", value = VMwareCbtPolicyCreationInput.class)
})
public class PolicyProviderSpecificInput {
}
