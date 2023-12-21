/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_03_01.implementation.DetectorResponseInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_03_01.implementation.AppServiceManager;
import java.util.List;

/**
 * Type representing DetectorResponse.
 */
public interface DetectorResponse extends HasInner<DetectorResponseInner>, Indexable, Refreshable<DetectorResponse>, HasManager<AppServiceManager> {
    /**
     * @return the dataset value.
     */
    List<DiagnosticData> dataset();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the metadata value.
     */
    DetectorInfo metadata();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
