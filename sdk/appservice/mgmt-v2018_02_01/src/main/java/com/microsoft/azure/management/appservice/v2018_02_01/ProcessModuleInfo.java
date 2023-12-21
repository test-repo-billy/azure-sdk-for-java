/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.ProcessModuleInfoInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;

/**
 * Type representing ProcessModuleInfo.
 */
public interface ProcessModuleInfo extends HasInner<ProcessModuleInfoInner>, Indexable, Refreshable<ProcessModuleInfo>, HasManager<AppServiceManager> {
    /**
     * @return the baseAddress value.
     */
    String baseAddress();

    /**
     * @return the fileDescription value.
     */
    String fileDescription();

    /**
     * @return the fileName value.
     */
    String fileName();

    /**
     * @return the filePath value.
     */
    String filePath();

    /**
     * @return the fileVersion value.
     */
    String fileVersion();

    /**
     * @return the href value.
     */
    String href();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isDebug value.
     */
    Boolean isDebug();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the language value.
     */
    String language();

    /**
     * @return the moduleMemorySize value.
     */
    Integer moduleMemorySize();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the product value.
     */
    String product();

    /**
     * @return the productVersion value.
     */
    String productVersion();

    /**
     * @return the type value.
     */
    String type();

}
