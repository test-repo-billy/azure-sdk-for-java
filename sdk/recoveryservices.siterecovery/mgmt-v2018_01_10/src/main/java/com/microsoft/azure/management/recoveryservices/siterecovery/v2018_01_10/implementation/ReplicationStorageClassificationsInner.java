/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

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
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined
 * in ReplicationStorageClassifications.
 */
public class ReplicationStorageClassificationsInner {
    /** The Retrofit service to perform REST calls. */
    private ReplicationStorageClassificationsService service;
    /** The service client containing this operation class. */
    private SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of ReplicationStorageClassificationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ReplicationStorageClassificationsInner(Retrofit retrofit, SiteRecoveryManagementClientImpl client) {
        this.service = retrofit.create(ReplicationStorageClassificationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ReplicationStorageClassifications to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ReplicationStorageClassificationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationStorageClassifications listByReplicationFabrics" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationStorageClassifications")
        Observable<Response<ResponseBody>> listByReplicationFabrics(@Path("resourceName") String resourceName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationStorageClassifications get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationStorageClassifications/{storageClassificationName}")
        Observable<Response<ResponseBody>> get(@Path("resourceName") String resourceName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("fabricName") String fabricName, @Path("storageClassificationName") String storageClassificationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationStorageClassifications list" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{resourceName}/replicationStorageClassifications")
        Observable<Response<ResponseBody>> list(@Path("resourceName") String resourceName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationStorageClassifications listByReplicationFabricsNext" })
        @GET
        Observable<Response<ResponseBody>> listByReplicationFabricsNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationStorageClassifications listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
     * @param fabricName Site name of interest.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;StorageClassificationInner&gt; object if successful.
     */
    public PagedList<StorageClassificationInner> listByReplicationFabrics(final String fabricName) {
        ServiceResponse<Page<StorageClassificationInner>> response = listByReplicationFabricsSinglePageAsync(fabricName).toBlocking().single();
        return new PagedList<StorageClassificationInner>(response.body()) {
            @Override
            public Page<StorageClassificationInner> nextPage(String nextPageLink) {
                return listByReplicationFabricsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
     * @param fabricName Site name of interest.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<StorageClassificationInner>> listByReplicationFabricsAsync(final String fabricName, final ListOperationCallback<StorageClassificationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByReplicationFabricsSinglePageAsync(fabricName),
            new Func1<String, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(String nextPageLink) {
                    return listByReplicationFabricsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
     * @param fabricName Site name of interest.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;StorageClassificationInner&gt; object
     */
    public Observable<Page<StorageClassificationInner>> listByReplicationFabricsAsync(final String fabricName) {
        return listByReplicationFabricsWithServiceResponseAsync(fabricName)
            .map(new Func1<ServiceResponse<Page<StorageClassificationInner>>, Page<StorageClassificationInner>>() {
                @Override
                public Page<StorageClassificationInner> call(ServiceResponse<Page<StorageClassificationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
     * @param fabricName Site name of interest.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;StorageClassificationInner&gt; object
     */
    public Observable<ServiceResponse<Page<StorageClassificationInner>>> listByReplicationFabricsWithServiceResponseAsync(final String fabricName) {
        return listByReplicationFabricsSinglePageAsync(fabricName)
            .concatMap(new Func1<ServiceResponse<Page<StorageClassificationInner>>, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(ServiceResponse<Page<StorageClassificationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByReplicationFabricsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
    ServiceResponse<PageImpl<StorageClassificationInner>> * @param fabricName Site name of interest.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;StorageClassificationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<StorageClassificationInner>>> listByReplicationFabricsSinglePageAsync(final String fabricName) {
        if (this.client.resourceName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceName() is required and cannot be null.");
        }
        if (this.client.resourceGroupName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceGroupName() is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (fabricName == null) {
            throw new IllegalArgumentException("Parameter fabricName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByReplicationFabrics(this.client.resourceName(), this.client.resourceGroupName(), this.client.subscriptionId(), fabricName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<StorageClassificationInner>> result = listByReplicationFabricsDelegate(response);
                        return Observable.just(new ServiceResponse<Page<StorageClassificationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<StorageClassificationInner>> listByReplicationFabricsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<StorageClassificationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<StorageClassificationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the details of a storage classification.
     * Gets the details of the specified storage classification.
     *
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the StorageClassificationInner object if successful.
     */
    public StorageClassificationInner get(String fabricName, String storageClassificationName) {
        return getWithServiceResponseAsync(fabricName, storageClassificationName).toBlocking().single().body();
    }

    /**
     * Gets the details of a storage classification.
     * Gets the details of the specified storage classification.
     *
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<StorageClassificationInner> getAsync(String fabricName, String storageClassificationName, final ServiceCallback<StorageClassificationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(fabricName, storageClassificationName), serviceCallback);
    }

    /**
     * Gets the details of a storage classification.
     * Gets the details of the specified storage classification.
     *
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the StorageClassificationInner object
     */
    public Observable<StorageClassificationInner> getAsync(String fabricName, String storageClassificationName) {
        return getWithServiceResponseAsync(fabricName, storageClassificationName).map(new Func1<ServiceResponse<StorageClassificationInner>, StorageClassificationInner>() {
            @Override
            public StorageClassificationInner call(ServiceResponse<StorageClassificationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the details of a storage classification.
     * Gets the details of the specified storage classification.
     *
     * @param fabricName Fabric name.
     * @param storageClassificationName Storage classification name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the StorageClassificationInner object
     */
    public Observable<ServiceResponse<StorageClassificationInner>> getWithServiceResponseAsync(String fabricName, String storageClassificationName) {
        if (this.client.resourceName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceName() is required and cannot be null.");
        }
        if (this.client.resourceGroupName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceGroupName() is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (fabricName == null) {
            throw new IllegalArgumentException("Parameter fabricName is required and cannot be null.");
        }
        if (storageClassificationName == null) {
            throw new IllegalArgumentException("Parameter storageClassificationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.resourceName(), this.client.resourceGroupName(), this.client.subscriptionId(), fabricName, storageClassificationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<StorageClassificationInner>>>() {
                @Override
                public Observable<ServiceResponse<StorageClassificationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<StorageClassificationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<StorageClassificationInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<StorageClassificationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<StorageClassificationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;StorageClassificationInner&gt; object if successful.
     */
    public PagedList<StorageClassificationInner> list() {
        ServiceResponse<Page<StorageClassificationInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<StorageClassificationInner>(response.body()) {
            @Override
            public Page<StorageClassificationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<StorageClassificationInner>> listAsync(final ListOperationCallback<StorageClassificationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;StorageClassificationInner&gt; object
     */
    public Observable<Page<StorageClassificationInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<StorageClassificationInner>>, Page<StorageClassificationInner>>() {
                @Override
                public Page<StorageClassificationInner> call(ServiceResponse<Page<StorageClassificationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;StorageClassificationInner&gt; object
     */
    public Observable<ServiceResponse<Page<StorageClassificationInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<StorageClassificationInner>>, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(ServiceResponse<Page<StorageClassificationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;StorageClassificationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<StorageClassificationInner>>> listSinglePageAsync() {
        if (this.client.resourceName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceName() is required and cannot be null.");
        }
        if (this.client.resourceGroupName() == null) {
            throw new IllegalArgumentException("Parameter this.client.resourceGroupName() is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.resourceName(), this.client.resourceGroupName(), this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<StorageClassificationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<StorageClassificationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<StorageClassificationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<StorageClassificationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<StorageClassificationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;StorageClassificationInner&gt; object if successful.
     */
    public PagedList<StorageClassificationInner> listByReplicationFabricsNext(final String nextPageLink) {
        ServiceResponse<Page<StorageClassificationInner>> response = listByReplicationFabricsNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<StorageClassificationInner>(response.body()) {
            @Override
            public Page<StorageClassificationInner> nextPage(String nextPageLink) {
                return listByReplicationFabricsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<StorageClassificationInner>> listByReplicationFabricsNextAsync(final String nextPageLink, final ServiceFuture<List<StorageClassificationInner>> serviceFuture, final ListOperationCallback<StorageClassificationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByReplicationFabricsNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(String nextPageLink) {
                    return listByReplicationFabricsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;StorageClassificationInner&gt; object
     */
    public Observable<Page<StorageClassificationInner>> listByReplicationFabricsNextAsync(final String nextPageLink) {
        return listByReplicationFabricsNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<StorageClassificationInner>>, Page<StorageClassificationInner>>() {
                @Override
                public Page<StorageClassificationInner> call(ServiceResponse<Page<StorageClassificationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;StorageClassificationInner&gt; object
     */
    public Observable<ServiceResponse<Page<StorageClassificationInner>>> listByReplicationFabricsNextWithServiceResponseAsync(final String nextPageLink) {
        return listByReplicationFabricsNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<StorageClassificationInner>>, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(ServiceResponse<Page<StorageClassificationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByReplicationFabricsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the list of storage classification objects under a fabric.
     * Lists the storage classifications available in the specified fabric.
     *
    ServiceResponse<PageImpl<StorageClassificationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;StorageClassificationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<StorageClassificationInner>>> listByReplicationFabricsNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByReplicationFabricsNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<StorageClassificationInner>> result = listByReplicationFabricsNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<StorageClassificationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<StorageClassificationInner>> listByReplicationFabricsNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<StorageClassificationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<StorageClassificationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;StorageClassificationInner&gt; object if successful.
     */
    public PagedList<StorageClassificationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<StorageClassificationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<StorageClassificationInner>(response.body()) {
            @Override
            public Page<StorageClassificationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<StorageClassificationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<StorageClassificationInner>> serviceFuture, final ListOperationCallback<StorageClassificationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;StorageClassificationInner&gt; object
     */
    public Observable<Page<StorageClassificationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<StorageClassificationInner>>, Page<StorageClassificationInner>>() {
                @Override
                public Page<StorageClassificationInner> call(ServiceResponse<Page<StorageClassificationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;StorageClassificationInner&gt; object
     */
    public Observable<ServiceResponse<Page<StorageClassificationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<StorageClassificationInner>>, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(ServiceResponse<Page<StorageClassificationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the list of storage classification objects under a vault.
     * Lists the storage classifications in the vault.
     *
    ServiceResponse<PageImpl<StorageClassificationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;StorageClassificationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<StorageClassificationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<StorageClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<StorageClassificationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<StorageClassificationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<StorageClassificationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<StorageClassificationInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<StorageClassificationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<StorageClassificationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
