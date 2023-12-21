/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.ExportJobsOperationResultsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExportJobsOperationResults.
 */
public interface ExportJobsOperationResults extends HasInner<ExportJobsOperationResultsInner> {
    /**
     * Gets the result of the operation triggered by the ExportJob API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param operationId The ID associated with the export job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationResultInfoBaseResource> getAsync(String vaultName, String resourceGroupName, String operationId);

}
