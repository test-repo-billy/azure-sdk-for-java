/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity SAP Cloud for Customer sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapCloudForCustomerSink")
public class SapCloudForCustomerSink extends CopySink {
    /**
     * The write behavior for the operation. Default is 'Insert'.
     */
    @JsonProperty(value = "writeBehavior")
    private Object writeBehavior;

    /**
     * Get the write behavior for the operation. Default is 'Insert'.
     *
     * @return the writeBehavior value
     */
    public Object writeBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the write behavior for the operation. Default is 'Insert'.
     *
     * @param writeBehavior the writeBehavior value to set
     * @return the SapCloudForCustomerSink object itself.
     */
    public SapCloudForCustomerSink withWriteBehavior(Object writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

}
