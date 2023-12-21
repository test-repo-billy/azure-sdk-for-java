/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.ProtectionPolicyOperationResultsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProtectionPolicyOperationResults.
 */
public interface ProtectionPolicyOperationResults extends HasInner<ProtectionPolicyOperationResultsInner> {
    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BackupPolicyVaultProtectionPolicyResource> getAsync(String vaultName, String resourceGroupName, String policyName, String operationId);

}
