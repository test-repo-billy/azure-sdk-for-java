/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for Provider specific details for policies.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("PolicyProviderSpecificDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzurePolicyDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplicaBasePolicyDetails", value = HyperVReplicaBasePolicyDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012", value = HyperVReplicaPolicyDetails.class),
    @JsonSubTypes.Type(name = "HyperVReplica2012R2", value = HyperVReplicaBluePolicyDetails.class),
    @JsonSubTypes.Type(name = "InMageBasePolicyDetails", value = InMageBasePolicyDetails.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2PolicyDetails.class),
    @JsonSubTypes.Type(name = "InMage", value = InMagePolicyDetails.class),
    @JsonSubTypes.Type(name = "A2A", value = A2APolicyDetails.class),
    @JsonSubTypes.Type(name = "RcmAzureMigration", value = RcmAzureMigrationPolicyDetails.class),
    @JsonSubTypes.Type(name = "VMwareCbt", value = VmwareCbtPolicyDetails.class)
})
public class PolicyProviderSpecificDetails {
}
