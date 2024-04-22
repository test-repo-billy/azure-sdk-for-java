// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.MdeOnboardingDataInner;
import com.azure.resourcemanager.security.fluent.models.MdeOnboardingDataListInner;

/**
 * An instance of this class provides access to all the operations defined in MdeOnboardingsClient.
 */
public interface MdeOnboardingsClient {
    /**
     * The configuration or data needed to onboard the machine to MDE.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all MDE onboarding data resources along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MdeOnboardingDataListInner> listWithResponse(Context context);

    /**
     * The configuration or data needed to onboard the machine to MDE.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all MDE onboarding data resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MdeOnboardingDataListInner list();

    /**
     * The default configuration or data needed to onboard the machine to MDE.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource of the configuration or data needed to onboard the machine to MDE along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MdeOnboardingDataInner> getWithResponse(Context context);

    /**
     * The default configuration or data needed to onboard the machine to MDE.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource of the configuration or data needed to onboard the machine to MDE.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MdeOnboardingDataInner get();
}
