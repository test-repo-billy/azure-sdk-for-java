/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AvailableEndpointServices.
 */
public class AvailableEndpointServicesInner {
    /** The Retrofit service to perform REST calls. */
    private AvailableEndpointServicesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of AvailableEndpointServicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AvailableEndpointServicesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(AvailableEndpointServicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AvailableEndpointServices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AvailableEndpointServicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_08_01.AvailableEndpointServices list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/locations/{location}/virtualNetworkAvailableEndpointServices")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_08_01.AvailableEndpointServices listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EndpointServiceResultInner&gt; object if successful.
     */
    public PagedList<EndpointServiceResultInner> list(final String location) {
        ServiceResponse<Page<EndpointServiceResultInner>> response = listSinglePageAsync(location).toBlocking().single();
        return new PagedList<EndpointServiceResultInner>(response.body()) {
            @Override
            public Page<EndpointServiceResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EndpointServiceResultInner>> listAsync(final String location, final ListOperationCallback<EndpointServiceResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(location),
            new Func1<String, Observable<ServiceResponse<Page<EndpointServiceResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EndpointServiceResultInner&gt; object
     */
    public Observable<Page<EndpointServiceResultInner>> listAsync(final String location) {
        return listWithServiceResponseAsync(location)
            .map(new Func1<ServiceResponse<Page<EndpointServiceResultInner>>, Page<EndpointServiceResultInner>>() {
                @Override
                public Page<EndpointServiceResultInner> call(ServiceResponse<Page<EndpointServiceResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EndpointServiceResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> listWithServiceResponseAsync(final String location) {
        return listSinglePageAsync(location)
            .concatMap(new Func1<ServiceResponse<Page<EndpointServiceResultInner>>, Observable<ServiceResponse<Page<EndpointServiceResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> call(ServiceResponse<Page<EndpointServiceResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List what values of endpoint services are available for use.
     *
    ServiceResponse<PageImpl<EndpointServiceResultInner>> * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EndpointServiceResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> listSinglePageAsync(final String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-08-01";
        return service.list(location, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EndpointServiceResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<EndpointServiceResultInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EndpointServiceResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<EndpointServiceResultInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<EndpointServiceResultInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<EndpointServiceResultInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EndpointServiceResultInner&gt; object if successful.
     */
    public PagedList<EndpointServiceResultInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<EndpointServiceResultInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<EndpointServiceResultInner>(response.body()) {
            @Override
            public Page<EndpointServiceResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EndpointServiceResultInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<EndpointServiceResultInner>> serviceFuture, final ListOperationCallback<EndpointServiceResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<EndpointServiceResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EndpointServiceResultInner&gt; object
     */
    public Observable<Page<EndpointServiceResultInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<EndpointServiceResultInner>>, Page<EndpointServiceResultInner>>() {
                @Override
                public Page<EndpointServiceResultInner> call(ServiceResponse<Page<EndpointServiceResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EndpointServiceResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<EndpointServiceResultInner>>, Observable<ServiceResponse<Page<EndpointServiceResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> call(ServiceResponse<Page<EndpointServiceResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List what values of endpoint services are available for use.
     *
    ServiceResponse<PageImpl<EndpointServiceResultInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EndpointServiceResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EndpointServiceResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EndpointServiceResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<EndpointServiceResultInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EndpointServiceResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<EndpointServiceResultInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<EndpointServiceResultInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<EndpointServiceResultInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
