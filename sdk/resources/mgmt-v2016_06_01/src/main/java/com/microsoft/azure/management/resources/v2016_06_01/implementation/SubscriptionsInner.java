/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
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
 * in Subscriptions.
 */
public class SubscriptionsInner {
    /** The Retrofit service to perform REST calls. */
    private SubscriptionsService service;
    /** The service client containing this operation class. */
    private SubscriptionClientImpl client;

    /**
     * Initializes an instance of SubscriptionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionsInner(Retrofit retrofit, SubscriptionClientImpl client) {
        this.service = retrofit.create(SubscriptionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Subscriptions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SubscriptionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2016_06_01.Subscriptions listLocations" })
        @GET("subscriptions/{subscriptionId}/locations")
        Observable<Response<ResponseBody>> listLocations(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2016_06_01.Subscriptions get" })
        @GET("subscriptions/{subscriptionId}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2016_06_01.Subscriptions list" })
        @GET("subscriptions")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2016_06_01.Subscriptions listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all available geo-locations.
     * This operation provides all the locations that are available for resource providers; however, each resource provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;LocationInner&gt; object if successful.
     */
    public List<LocationInner> listLocations(String subscriptionId) {
        return listLocationsWithServiceResponseAsync(subscriptionId).toBlocking().single().body();
    }

    /**
     * Gets all available geo-locations.
     * This operation provides all the locations that are available for resource providers; however, each resource provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<LocationInner>> listLocationsAsync(String subscriptionId, final ServiceCallback<List<LocationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listLocationsWithServiceResponseAsync(subscriptionId), serviceCallback);
    }

    /**
     * Gets all available geo-locations.
     * This operation provides all the locations that are available for resource providers; however, each resource provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LocationInner&gt; object
     */
    public Observable<List<LocationInner>> listLocationsAsync(String subscriptionId) {
        return listLocationsWithServiceResponseAsync(subscriptionId).map(new Func1<ServiceResponse<List<LocationInner>>, List<LocationInner>>() {
            @Override
            public List<LocationInner> call(ServiceResponse<List<LocationInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets all available geo-locations.
     * This operation provides all the locations that are available for resource providers; however, each resource provider may support a subset of this list.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LocationInner&gt; object
     */
    public Observable<ServiceResponse<List<LocationInner>>> listLocationsWithServiceResponseAsync(String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listLocations(subscriptionId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<LocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<LocationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LocationInner>> result = listLocationsDelegate(response);
                        List<LocationInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<LocationInner>> clientResponse = new ServiceResponse<List<LocationInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LocationInner>> listLocationsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<LocationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<LocationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubscriptionInner object if successful.
     */
    public SubscriptionInner get(String subscriptionId) {
        return getWithServiceResponseAsync(subscriptionId).toBlocking().single().body();
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubscriptionInner> getAsync(String subscriptionId, final ServiceCallback<SubscriptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(subscriptionId), serviceCallback);
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubscriptionInner object
     */
    public Observable<SubscriptionInner> getAsync(String subscriptionId) {
        return getWithServiceResponseAsync(subscriptionId).map(new Func1<ServiceResponse<SubscriptionInner>, SubscriptionInner>() {
            @Override
            public SubscriptionInner call(ServiceResponse<SubscriptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets details about a specified subscription.
     *
     * @param subscriptionId The ID of the target subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubscriptionInner object
     */
    public Observable<ServiceResponse<SubscriptionInner>> getWithServiceResponseAsync(String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(subscriptionId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubscriptionInner>>>() {
                @Override
                public Observable<ServiceResponse<SubscriptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubscriptionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SubscriptionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SubscriptionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SubscriptionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SubscriptionInner&gt; object if successful.
     */
    public PagedList<SubscriptionInner> list() {
        ServiceResponse<Page<SubscriptionInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<SubscriptionInner>(response.body()) {
            @Override
            public Page<SubscriptionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SubscriptionInner>> listAsync(final ListOperationCallback<SubscriptionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionInner&gt; object
     */
    public Observable<Page<SubscriptionInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<SubscriptionInner>>, Page<SubscriptionInner>>() {
                @Override
                public Page<SubscriptionInner> call(ServiceResponse<Page<SubscriptionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<SubscriptionInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<SubscriptionInner>>, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(ServiceResponse<Page<SubscriptionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SubscriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SubscriptionInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<SubscriptionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SubscriptionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<SubscriptionInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<SubscriptionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<SubscriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SubscriptionInner&gt; object if successful.
     */
    public PagedList<SubscriptionInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<SubscriptionInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SubscriptionInner>(response.body()) {
            @Override
            public Page<SubscriptionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SubscriptionInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<SubscriptionInner>> serviceFuture, final ListOperationCallback<SubscriptionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionInner&gt; object
     */
    public Observable<Page<SubscriptionInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SubscriptionInner>>, Page<SubscriptionInner>>() {
                @Override
                public Page<SubscriptionInner> call(ServiceResponse<Page<SubscriptionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all subscriptions for a tenant.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<SubscriptionInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SubscriptionInner>>, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(ServiceResponse<Page<SubscriptionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all subscriptions for a tenant.
     *
    ServiceResponse<PageImpl1<SubscriptionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SubscriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SubscriptionInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SubscriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<SubscriptionInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SubscriptionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<SubscriptionInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<SubscriptionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<SubscriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
