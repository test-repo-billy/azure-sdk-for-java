/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.quota.v2019_07_19.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.quota.v2019_07_19.ExceptionResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in QuotaRequestStatus.
 */
public class QuotaRequestStatusInner {
    /** The Retrofit service to perform REST calls. */
    private QuotaRequestStatusService service;
    /** The service client containing this operation class. */
    private MicrosoftCapacityImpl client;

    /**
     * Initializes an instance of QuotaRequestStatusInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public QuotaRequestStatusInner(Retrofit retrofit, MicrosoftCapacityImpl client) {
        this.service = retrofit.create(QuotaRequestStatusService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for QuotaRequestStatus to be
     * used by Retrofit to perform actually REST calls.
     */
    interface QuotaRequestStatusService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.quota.v2019_07_19.QuotaRequestStatus get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Capacity/providers/{providerId}/locations/{location}/quotaRequests/{id}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("providerId") String providerId, @Path("location") String location, @Path("id") String id, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * For the specified location, gets the Quota request status by requestId.
     * Gets the QuotaRequest details and status by the quota requestId for the resources for the resource  provider at a specific location. The requestId is returned as response to the Put requests for serviceLimits.
     *
     * @param providerId Azure resource Provider id.
     * @param location Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ExceptionResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the QuotaRequestDetailsInner object if successful.
     */
    public QuotaRequestDetailsInner get(String providerId, String location) {
        return getWithServiceResponseAsync(providerId, location).toBlocking().single().body();
    }

    /**
     * For the specified location, gets the Quota request status by requestId.
     * Gets the QuotaRequest details and status by the quota requestId for the resources for the resource  provider at a specific location. The requestId is returned as response to the Put requests for serviceLimits.
     *
     * @param providerId Azure resource Provider id.
     * @param location Azure region.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<QuotaRequestDetailsInner> getAsync(String providerId, String location, final ServiceCallback<QuotaRequestDetailsInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(providerId, location), serviceCallback);
    }

    /**
     * For the specified location, gets the Quota request status by requestId.
     * Gets the QuotaRequest details and status by the quota requestId for the resources for the resource  provider at a specific location. The requestId is returned as response to the Put requests for serviceLimits.
     *
     * @param providerId Azure resource Provider id.
     * @param location Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QuotaRequestDetailsInner object
     */
    public Observable<QuotaRequestDetailsInner> getAsync(String providerId, String location) {
        return getWithServiceResponseAsync(providerId, location).map(new Func1<ServiceResponse<QuotaRequestDetailsInner>, QuotaRequestDetailsInner>() {
            @Override
            public QuotaRequestDetailsInner call(ServiceResponse<QuotaRequestDetailsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * For the specified location, gets the Quota request status by requestId.
     * Gets the QuotaRequest details and status by the quota requestId for the resources for the resource  provider at a specific location. The requestId is returned as response to the Put requests for serviceLimits.
     *
     * @param providerId Azure resource Provider id.
     * @param location Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QuotaRequestDetailsInner object
     */
    public Observable<ServiceResponse<QuotaRequestDetailsInner>> getWithServiceResponseAsync(String providerId, String location) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (providerId == null) {
            throw new IllegalArgumentException("Parameter providerId is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.id() == null) {
            throw new IllegalArgumentException("Parameter this.client.id() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), providerId, location, this.client.id(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<QuotaRequestDetailsInner>>>() {
                @Override
                public Observable<ServiceResponse<QuotaRequestDetailsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<QuotaRequestDetailsInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<QuotaRequestDetailsInner> getDelegate(Response<ResponseBody> response) throws ExceptionResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<QuotaRequestDetailsInner, ExceptionResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<QuotaRequestDetailsInner>() { }.getType())
                .registerError(ExceptionResponseException.class)
                .build(response);
    }

}
