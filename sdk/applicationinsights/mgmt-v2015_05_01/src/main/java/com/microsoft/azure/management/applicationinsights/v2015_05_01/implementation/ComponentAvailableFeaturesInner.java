/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined
 * in ComponentAvailableFeatures.
 */
public class ComponentAvailableFeaturesInner {
    /** The Retrofit service to perform REST calls. */
    private ComponentAvailableFeaturesService service;
    /** The service client containing this operation class. */
    private ApplicationInsightsManagementClientImpl client;

    /**
     * Initializes an instance of ComponentAvailableFeaturesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ComponentAvailableFeaturesInner(Retrofit retrofit, ApplicationInsightsManagementClientImpl client) {
        this.service = retrofit.create(ComponentAvailableFeaturesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ComponentAvailableFeatures to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ComponentAvailableFeaturesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.ComponentAvailableFeatures get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/getavailablebillingfeatures")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns all available features of the application insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInsightsComponentAvailableFeaturesInner object if successful.
     */
    public ApplicationInsightsComponentAvailableFeaturesInner get(String resourceGroupName, String resourceName) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName).toBlocking().single().body();
    }

    /**
     * Returns all available features of the application insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInsightsComponentAvailableFeaturesInner> getAsync(String resourceGroupName, String resourceName, final ServiceCallback<ApplicationInsightsComponentAvailableFeaturesInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, resourceName), serviceCallback);
    }

    /**
     * Returns all available features of the application insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentAvailableFeaturesInner object
     */
    public Observable<ApplicationInsightsComponentAvailableFeaturesInner> getAsync(String resourceGroupName, String resourceName) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName).map(new Func1<ServiceResponse<ApplicationInsightsComponentAvailableFeaturesInner>, ApplicationInsightsComponentAvailableFeaturesInner>() {
            @Override
            public ApplicationInsightsComponentAvailableFeaturesInner call(ServiceResponse<ApplicationInsightsComponentAvailableFeaturesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns all available features of the application insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentAvailableFeaturesInner object
     */
    public Observable<ServiceResponse<ApplicationInsightsComponentAvailableFeaturesInner>> getWithServiceResponseAsync(String resourceGroupName, String resourceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, this.client.subscriptionId(), resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInsightsComponentAvailableFeaturesInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInsightsComponentAvailableFeaturesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInsightsComponentAvailableFeaturesInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInsightsComponentAvailableFeaturesInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInsightsComponentAvailableFeaturesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInsightsComponentAvailableFeaturesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
