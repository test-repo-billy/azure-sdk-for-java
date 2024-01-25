// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.apicenter.fluent.models.DeploymentInner;

/**
 * Contains all response data for the createOrUpdate operation.
 */
public final class DeploymentsCreateOrUpdateResponse
    extends ResponseBase<DeploymentsCreateOrUpdateHeaders, DeploymentInner> {
    /**
     * Creates an instance of DeploymentsCreateOrUpdateResponse.
     * 
     * @param request the request which resulted in this DeploymentsCreateOrUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DeploymentsCreateOrUpdateResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders,
        DeploymentInner value, DeploymentsCreateOrUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     * 
     * @return the deserialized response body.
     */
    @Override
    public DeploymentInner getValue() {
        return super.getValue();
    }
}
