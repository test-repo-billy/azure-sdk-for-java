/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateOrderActionInner;
import org.joda.time.DateTime;

/**
 * Type representing CertificateOrderAction.
 */
public interface CertificateOrderAction extends HasInner<CertificateOrderActionInner>, HasManager<AppServiceManager> {
    /**
     * @return the actionType value.
     */
    CertificateOrderActionType actionType();

    /**
     * @return the createdAt value.
     */
    DateTime createdAt();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
