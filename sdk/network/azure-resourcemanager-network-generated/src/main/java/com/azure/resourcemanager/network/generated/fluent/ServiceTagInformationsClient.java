// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceTagInformationInner;

/**
 * An instance of this class provides access to all the operations defined in ServiceTagInformationsClient.
 */
public interface ServiceTagInformationsClient {
    /**
     * Gets a list of service tag information resources with pagination.
     * 
     * @param location The location that will be used as a reference for cloud (not as a filter based on location, you
     * will get the list of service tags with prefix details across all regions but limited to the cloud that your
     * subscription belongs to).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service tag information resources with pagination as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceTagInformationInner> list(String location);

    /**
     * Gets a list of service tag information resources with pagination.
     * 
     * @param location The location that will be used as a reference for cloud (not as a filter based on location, you
     * will get the list of service tags with prefix details across all regions but limited to the cloud that your
     * subscription belongs to).
     * @param noAddressPrefixes Do not return address prefixes for the tag(s).
     * @param tagName Return tag information for a particular tag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of service tag information resources with pagination as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceTagInformationInner> list(String location, Boolean noAddressPrefixes, String tagName,
        Context context);
}
