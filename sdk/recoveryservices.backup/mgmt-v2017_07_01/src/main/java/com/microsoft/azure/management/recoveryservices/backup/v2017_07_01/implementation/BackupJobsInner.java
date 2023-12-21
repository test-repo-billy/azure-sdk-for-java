/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

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
 * in BackupJobs.
 */
public class BackupJobsInner {
    /** The Retrofit service to perform REST calls. */
    private BackupJobsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupJobsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupJobsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(BackupJobsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupJobs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupJobsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupJobs list" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupJobs")
        Observable<Response<ResponseBody>> list(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Query("$skipToken") String skipToken, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupJobs listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobResourceInner&gt; object if successful.
     */
    public PagedList<JobResourceInner> list(final String vaultName, final String resourceGroupName) {
        ServiceResponse<Page<JobResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName).toBlocking().single();
        return new PagedList<JobResourceInner>(response.body()) {
            @Override
            public Page<JobResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<JobResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final ListOperationCallback<JobResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<JobResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobResourceInner&gt; object
     */
    public Observable<Page<JobResourceInner>> listAsync(final String vaultName, final String resourceGroupName) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName)
            .map(new Func1<ServiceResponse<Page<JobResourceInner>>, Page<JobResourceInner>>() {
                @Override
                public Page<JobResourceInner> call(ServiceResponse<Page<JobResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<JobResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName) {
        return listSinglePageAsync(vaultName, resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<JobResourceInner>>, Observable<ServiceResponse<Page<JobResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobResourceInner>>> call(ServiceResponse<Page<JobResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;JobResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<JobResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2017-07-01";
        final String filter = null;
        final String skipToken = null;
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<JobResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<JobResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<JobResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobResourceInner&gt; object if successful.
     */
    public PagedList<JobResourceInner> list(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        ServiceResponse<Page<JobResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken).toBlocking().single();
        return new PagedList<JobResourceInner>(response.body()) {
            @Override
            public Page<JobResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<JobResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken, final ListOperationCallback<JobResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken),
            new Func1<String, Observable<ServiceResponse<Page<JobResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobResourceInner&gt; object
     */
    public Observable<Page<JobResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, filter, skipToken)
            .map(new Func1<ServiceResponse<Page<JobResourceInner>>, Page<JobResourceInner>>() {
                @Override
                public Page<JobResourceInner> call(ServiceResponse<Page<JobResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<JobResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        return listSinglePageAsync(vaultName, resourceGroupName, filter, skipToken)
            .concatMap(new Func1<ServiceResponse<Page<JobResourceInner>>, Observable<ServiceResponse<Page<JobResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobResourceInner>>> call(ServiceResponse<Page<JobResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides a pageable list of jobs.
     *
    ServiceResponse<PageImpl<JobResourceInner>> * @param vaultName The name of the recovery services vault.
    ServiceResponse<PageImpl<JobResourceInner>> * @param resourceGroupName The name of the resource group where the recovery services vault is present.
    ServiceResponse<PageImpl<JobResourceInner>> * @param filter OData filter options.
    ServiceResponse<PageImpl<JobResourceInner>> * @param skipToken skipToken Filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;JobResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<JobResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String filter, final String skipToken) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2017-07-01";
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, filter, skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<JobResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<JobResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<JobResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<JobResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<JobResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<JobResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobResourceInner&gt; object if successful.
     */
    public PagedList<JobResourceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<JobResourceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<JobResourceInner>(response.body()) {
            @Override
            public Page<JobResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<JobResourceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<JobResourceInner>> serviceFuture, final ListOperationCallback<JobResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<JobResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobResourceInner&gt; object
     */
    public Observable<Page<JobResourceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<JobResourceInner>>, Page<JobResourceInner>>() {
                @Override
                public Page<JobResourceInner> call(ServiceResponse<Page<JobResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Provides a pageable list of jobs.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<JobResourceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<JobResourceInner>>, Observable<ServiceResponse<Page<JobResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobResourceInner>>> call(ServiceResponse<Page<JobResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Provides a pageable list of jobs.
     *
    ServiceResponse<PageImpl<JobResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;JobResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<JobResourceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<JobResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<JobResourceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<JobResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<JobResourceInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<JobResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<JobResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
