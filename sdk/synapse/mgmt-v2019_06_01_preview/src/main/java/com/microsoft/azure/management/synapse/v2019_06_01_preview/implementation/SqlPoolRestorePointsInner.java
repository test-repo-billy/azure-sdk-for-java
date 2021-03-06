/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.CreateSqlPoolRestorePointDefinition;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;

/**
 * An instance of this class provides access to all the operations defined
 * in SqlPoolRestorePoints.
 */
public class SqlPoolRestorePointsInner {
    /** The Retrofit service to perform REST calls. */
    private SqlPoolRestorePointsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolRestorePointsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SqlPoolRestorePointsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(SqlPoolRestorePointsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlPoolRestorePoints to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SqlPoolRestorePointsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolRestorePoints list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/restorePoints")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolRestorePoints create" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/restorePoints")
        Observable<Response<ResponseBody>> create(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CreateSqlPoolRestorePointDefinition parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolRestorePoints beginCreate" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/restorePoints")
        Observable<Response<ResponseBody>> beginCreate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CreateSqlPoolRestorePointDefinition parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolRestorePoints listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RestorePointInner&gt; object if successful.
     */
    public PagedList<RestorePointInner> list(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        ServiceResponse<Page<RestorePointInner>> response = listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single();
        return new PagedList<RestorePointInner>(response.body()) {
            @Override
            public Page<RestorePointInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RestorePointInner>> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final ListOperationCallback<RestorePointInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName),
            new Func1<String, Observable<ServiceResponse<Page<RestorePointInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RestorePointInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RestorePointInner&gt; object
     */
    public Observable<Page<RestorePointInner>> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName)
            .map(new Func1<ServiceResponse<Page<RestorePointInner>>, Page<RestorePointInner>>() {
                @Override
                public Page<RestorePointInner> call(ServiceResponse<Page<RestorePointInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RestorePointInner&gt; object
     */
    public Observable<ServiceResponse<Page<RestorePointInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        return listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName)
            .concatMap(new Func1<ServiceResponse<Page<RestorePointInner>>, Observable<ServiceResponse<Page<RestorePointInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RestorePointInner>>> call(ServiceResponse<Page<RestorePointInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
    ServiceResponse<PageImpl<RestorePointInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<RestorePointInner>> * @param workspaceName The name of the workspace
    ServiceResponse<PageImpl<RestorePointInner>> * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RestorePointInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RestorePointInner>>> listSinglePageAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RestorePointInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RestorePointInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RestorePointInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RestorePointInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RestorePointInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RestorePointInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RestorePointInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param restorePointLabel The restore point label to apply
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RestorePointInner object if successful.
     */
    public RestorePointInner create(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel) {
        return createWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointLabel).toBlocking().last().body();
    }

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param restorePointLabel The restore point label to apply
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RestorePointInner> createAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel, final ServiceCallback<RestorePointInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointLabel), serviceCallback);
    }

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param restorePointLabel The restore point label to apply
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<RestorePointInner> createAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel) {
        return createWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointLabel).map(new Func1<ServiceResponse<RestorePointInner>, RestorePointInner>() {
            @Override
            public RestorePointInner call(ServiceResponse<RestorePointInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param restorePointLabel The restore point label to apply
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<RestorePointInner>> createWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (restorePointLabel == null) {
            throw new IllegalArgumentException("Parameter restorePointLabel is required and cannot be null.");
        }
        CreateSqlPoolRestorePointDefinition parameters = new CreateSqlPoolRestorePointDefinition();
        parameters.withRestorePointLabel(restorePointLabel);
        Observable<Response<ResponseBody>> observable = service.create(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new LongRunningOperationOptions().withFinalStateVia(LongRunningFinalState.LOCATION), new TypeToken<RestorePointInner>() { }.getType());
    }

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param restorePointLabel The restore point label to apply
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RestorePointInner object if successful.
     */
    public RestorePointInner beginCreate(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel) {
        return beginCreateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointLabel).toBlocking().single().body();
    }

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param restorePointLabel The restore point label to apply
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RestorePointInner> beginCreateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel, final ServiceCallback<RestorePointInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointLabel), serviceCallback);
    }

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param restorePointLabel The restore point label to apply
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RestorePointInner object
     */
    public Observable<RestorePointInner> beginCreateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel) {
        return beginCreateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, restorePointLabel).map(new Func1<ServiceResponse<RestorePointInner>, RestorePointInner>() {
            @Override
            public RestorePointInner call(ServiceResponse<RestorePointInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a restore point for a data warehouse.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param restorePointLabel The restore point label to apply
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RestorePointInner object
     */
    public Observable<ServiceResponse<RestorePointInner>> beginCreateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String restorePointLabel) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (restorePointLabel == null) {
            throw new IllegalArgumentException("Parameter restorePointLabel is required and cannot be null.");
        }
        CreateSqlPoolRestorePointDefinition parameters = new CreateSqlPoolRestorePointDefinition();
        parameters.withRestorePointLabel(restorePointLabel);
        return service.beginCreate(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RestorePointInner>>>() {
                @Override
                public Observable<ServiceResponse<RestorePointInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RestorePointInner> clientResponse = beginCreateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RestorePointInner> beginCreateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RestorePointInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RestorePointInner>() { }.getType())
                .register(201, new TypeToken<RestorePointInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RestorePointInner&gt; object if successful.
     */
    public PagedList<RestorePointInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<RestorePointInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RestorePointInner>(response.body()) {
            @Override
            public Page<RestorePointInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RestorePointInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<RestorePointInner>> serviceFuture, final ListOperationCallback<RestorePointInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RestorePointInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RestorePointInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RestorePointInner&gt; object
     */
    public Observable<Page<RestorePointInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RestorePointInner>>, Page<RestorePointInner>>() {
                @Override
                public Page<RestorePointInner> call(ServiceResponse<Page<RestorePointInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RestorePointInner&gt; object
     */
    public Observable<ServiceResponse<Page<RestorePointInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RestorePointInner>>, Observable<ServiceResponse<Page<RestorePointInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RestorePointInner>>> call(ServiceResponse<Page<RestorePointInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get SQL pool backup.
     * Get SQL pool backup information.
     *
    ServiceResponse<PageImpl<RestorePointInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RestorePointInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RestorePointInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RestorePointInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RestorePointInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RestorePointInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RestorePointInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RestorePointInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RestorePointInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RestorePointInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
