/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.RunCommandResultInner;
import org.joda.time.DateTime;

/**
 * Type representing RunCommandResult.
 */
public interface RunCommandResult extends HasInner<RunCommandResultInner>, HasManager<ComputeManager> {
    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the error value.
     */
    ApiError error();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the output value.
     */
    Object output();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    String status();

}
