/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.HostingEnvironmentDiagnosticsInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;

/**
 * Type representing HostingEnvironmentDiagnostics.
 */
public interface HostingEnvironmentDiagnostics extends HasInner<HostingEnvironmentDiagnosticsInner>, HasManager<AppServiceManager> {
    /**
     * @return the diagnosicsOutput value.
     */
    String diagnosicsOutput();

    /**
     * @return the name value.
     */
    String name();

}
