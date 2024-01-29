// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.CommunityGalleryImageInner;

/**
 * An instance of this class provides access to all the operations defined in CommunityGalleryImagesClient.
 */
public interface CommunityGalleryImagesClient {
    /**
     * Get a community gallery image.
     * 
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CommunityGalleryImageInner> getWithResponse(String location, String publicGalleryName,
        String galleryImageName, Context context);

    /**
     * Get a community gallery image.
     * 
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param galleryImageName The name of the community gallery image definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a community gallery image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommunityGalleryImageInner get(String location, String publicGalleryName, String galleryImageName);

    /**
     * List community gallery images inside a gallery.
     * 
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CommunityGalleryImageInner> list(String location, String publicGalleryName);

    /**
     * List community gallery images inside a gallery.
     * 
     * @param location Resource location.
     * @param publicGalleryName The public name of the community gallery.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Community Gallery Images operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CommunityGalleryImageInner> list(String location, String publicGalleryName, Context context);
}
