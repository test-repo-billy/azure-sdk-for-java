// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/**
 * Resource collection API of SolutionsDiscoverabilities.
 */
public interface SolutionsDiscoverabilities {
    /**
     * Get list of Data Manager For Agriculture solutions.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Data Manager For Agriculture solutions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataManagerForAgricultureSolution> list();

    /**
     * Get list of Data Manager For Agriculture solutions.
     * 
     * @param farmBeatsSolutionIds Ids of Data Manager For Agriculture Solutions which the customer requests to fetch.
     * @param farmBeatsSolutionNames Names of Data Manager For Agriculture Solutions which the customer requests to
     * fetch.
     * @param maxPageSize Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Data Manager For Agriculture solutions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataManagerForAgricultureSolution> list(List<String> farmBeatsSolutionIds,
        List<String> farmBeatsSolutionNames, Integer maxPageSize, Context context);

    /**
     * Get Data Manager For Agriculture solution by id.
     * 
     * @param dataManagerForAgricultureSolutionId dataManagerForAgricultureSolutionId to be queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Manager For Agriculture solution by id along with {@link Response}.
     */
    Response<DataManagerForAgricultureSolution> getWithResponse(String dataManagerForAgricultureSolutionId,
        Context context);

    /**
     * Get Data Manager For Agriculture solution by id.
     * 
     * @param dataManagerForAgricultureSolutionId dataManagerForAgricultureSolutionId to be queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Manager For Agriculture solution by id.
     */
    DataManagerForAgricultureSolution get(String dataManagerForAgricultureSolutionId);
}
