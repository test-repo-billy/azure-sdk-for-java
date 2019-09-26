/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.peering.v2019_08_01_preview.ErrorResponseException;
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
 * in PeeringServiceProviders.
 */
public class PeeringServiceProvidersInner {
    /** The Retrofit service to perform REST calls. */
    private PeeringServiceProvidersService service;
    /** The service client containing this operation class. */
    private PeeringManagementClientImpl client;

    /**
     * Initializes an instance of PeeringServiceProvidersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PeeringServiceProvidersInner(Retrofit retrofit, PeeringManagementClientImpl client) {
        this.service = retrofit.create(PeeringServiceProvidersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PeeringServiceProviders to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PeeringServiceProvidersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.peering.v2019_08_01_preview.PeeringServiceProviders list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Peering/peeringServiceProviders")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.peering.v2019_08_01_preview.PeeringServiceProviders listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PeeringServiceProviderInner&gt; object if successful.
     */
    public PagedList<PeeringServiceProviderInner> list() {
        ServiceResponse<Page<PeeringServiceProviderInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<PeeringServiceProviderInner>(response.body()) {
            @Override
            public Page<PeeringServiceProviderInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PeeringServiceProviderInner>> listAsync(final ListOperationCallback<PeeringServiceProviderInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<PeeringServiceProviderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeeringServiceProviderInner&gt; object
     */
    public Observable<Page<PeeringServiceProviderInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<PeeringServiceProviderInner>>, Page<PeeringServiceProviderInner>>() {
                @Override
                public Page<PeeringServiceProviderInner> call(ServiceResponse<Page<PeeringServiceProviderInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeeringServiceProviderInner&gt; object
     */
    public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<PeeringServiceProviderInner>>, Observable<ServiceResponse<Page<PeeringServiceProviderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> call(ServiceResponse<Page<PeeringServiceProviderInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PeeringServiceProviderInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PeeringServiceProviderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PeeringServiceProviderInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PeeringServiceProviderInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PeeringServiceProviderInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PeeringServiceProviderInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PeeringServiceProviderInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PeeringServiceProviderInner&gt; object if successful.
     */
    public PagedList<PeeringServiceProviderInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<PeeringServiceProviderInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<PeeringServiceProviderInner>(response.body()) {
            @Override
            public Page<PeeringServiceProviderInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PeeringServiceProviderInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<PeeringServiceProviderInner>> serviceFuture, final ListOperationCallback<PeeringServiceProviderInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<PeeringServiceProviderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeeringServiceProviderInner&gt; object
     */
    public Observable<Page<PeeringServiceProviderInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<PeeringServiceProviderInner>>, Page<PeeringServiceProviderInner>>() {
                @Override
                public Page<PeeringServiceProviderInner> call(ServiceResponse<Page<PeeringServiceProviderInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeeringServiceProviderInner&gt; object
     */
    public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<PeeringServiceProviderInner>>, Observable<ServiceResponse<Page<PeeringServiceProviderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> call(ServiceResponse<Page<PeeringServiceProviderInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the available peering service locations for the specified kind of peering.
     *
    ServiceResponse<PageImpl<PeeringServiceProviderInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PeeringServiceProviderInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PeeringServiceProviderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeeringServiceProviderInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PeeringServiceProviderInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PeeringServiceProviderInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PeeringServiceProviderInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PeeringServiceProviderInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PeeringServiceProviderInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
