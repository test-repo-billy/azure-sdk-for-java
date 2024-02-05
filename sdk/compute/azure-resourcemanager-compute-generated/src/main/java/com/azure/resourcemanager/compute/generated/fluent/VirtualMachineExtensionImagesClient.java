// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionImageInner;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in VirtualMachineExtensionImagesClient.
 */
public interface VirtualMachineExtensionImagesClient {
    /**
     * Gets a virtual machine extension image.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineExtensionImageInner> getWithResponse(String location, String publisherName, String type,
        String version, Context context);

    /**
     * Gets a virtual machine extension image.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineExtensionImageInner get(String location, String publisherName, String type, String version);

    /**
     * Gets a list of virtual machine extension image types.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineExtensionImageInner>> listTypesWithResponse(String location, String publisherName,
        Context context);

    /**
     * Gets a list of virtual machine extension image types.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineExtensionImageInner> listTypes(String location, String publisherName);

    /**
     * Gets a list of virtual machine extension image versions.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param filter The filter to apply on the operation.
     * @param top The top parameter.
     * @param orderby The orderby parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<VirtualMachineExtensionImageInner>> listVersionsWithResponse(String location, String publisherName,
        String type, String filter, Integer top, String orderby, Context context);

    /**
     * Gets a list of virtual machine extension image versions.
     * 
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<VirtualMachineExtensionImageInner> listVersions(String location, String publisherName, String type);
}
