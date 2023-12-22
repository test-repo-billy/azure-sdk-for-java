// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelUpdatePropertiesInner;

/**
 * An immutable client-side representation of SensitivityLabelUpdateProperties.
 */
public interface SensitivityLabelUpdateProperties {
    /**
     * Gets the op property: The op property.
     * 
     * @return the op value.
     */
    SensitivityLabelUpdateKind op();

    /**
     * Gets the schema property: Schema name of the column to update.
     * 
     * @return the schema value.
     */
    String schema();

    /**
     * Gets the table property: Table name of the column to update.
     * 
     * @return the table value.
     */
    String table();

    /**
     * Gets the column property: Column name to update.
     * 
     * @return the column value.
     */
    String column();

    /**
     * Gets the sensitivityLabel property: The sensitivity label information to apply on a column.
     * 
     * @return the sensitivityLabel value.
     */
    SensitivityLabel sensitivityLabel();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelUpdatePropertiesInner
     * object.
     * 
     * @return the inner object.
     */
    SensitivityLabelUpdatePropertiesInner innerModel();
}
