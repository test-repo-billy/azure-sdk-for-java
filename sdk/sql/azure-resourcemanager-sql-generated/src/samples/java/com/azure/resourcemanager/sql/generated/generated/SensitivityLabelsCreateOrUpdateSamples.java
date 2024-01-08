// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.sql.generated.models.SensitivityLabelRank;

/**
 * Samples for SensitivityLabels CreateOrUpdate.
 */
public final class SensitivityLabelsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/
     * ColumnSensitivityLabelCreateMax.json
     */
    /**
     * Sample code: Updates the sensitivity label of a given column with all parameters.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void updatesTheSensitivityLabelOfAGivenColumnWithAllParameters(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.sensitivityLabels().createOrUpdateWithResponse("myRG", "myServer", "myDatabase", "dbo", "myTable",
            "myColumn",
            new SensitivityLabelInner().withLabelName("PII").withLabelId("bf91e08c-f4f0-478a-b016-25164b2a65ff")
                .withInformationType("PhoneNumber").withInformationTypeId("d22fa6e9-5ee4-3bde-4c2b-a409604c4646")
                .withRank(SensitivityLabelRank.LOW),
            com.azure.core.util.Context.NONE);
    }
}
