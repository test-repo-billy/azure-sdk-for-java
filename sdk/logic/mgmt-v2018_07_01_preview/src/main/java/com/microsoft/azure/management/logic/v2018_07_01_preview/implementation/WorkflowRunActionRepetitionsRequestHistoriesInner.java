/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.logic.v2018_07_01_preview.ErrorResponseException;
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
 * in WorkflowRunActionRepetitionsRequestHistories.
 */
public class WorkflowRunActionRepetitionsRequestHistoriesInner {
    /** The Retrofit service to perform REST calls. */
    private WorkflowRunActionRepetitionsRequestHistoriesService service;
    /** The service client containing this operation class. */
    private LogicManagementClientImpl client;

    /**
     * Initializes an instance of WorkflowRunActionRepetitionsRequestHistoriesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WorkflowRunActionRepetitionsRequestHistoriesInner(Retrofit retrofit, LogicManagementClientImpl client) {
        this.service = retrofit.create(WorkflowRunActionRepetitionsRequestHistoriesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WorkflowRunActionRepetitionsRequestHistories to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WorkflowRunActionRepetitionsRequestHistoriesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActionRepetitionsRequestHistories list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/runs/{runName}/actions/{actionName}/repetitions/{repetitionName}/requestHistories")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workflowName") String workflowName, @Path("runName") String runName, @Path("actionName") String actionName, @Path("repetitionName") String repetitionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActionRepetitionsRequestHistories get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/runs/{runName}/actions/{actionName}/repetitions/{repetitionName}/requestHistories/{requestHistoryName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workflowName") String workflowName, @Path("runName") String runName, @Path("actionName") String actionName, @Path("repetitionName") String repetitionName, @Path("requestHistoryName") String requestHistoryName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActionRepetitionsRequestHistories listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RequestHistoryInner&gt; object if successful.
     */
    public PagedList<RequestHistoryInner> list(final String resourceGroupName, final String workflowName, final String runName, final String actionName, final String repetitionName) {
        ServiceResponse<Page<RequestHistoryInner>> response = listSinglePageAsync(resourceGroupName, workflowName, runName, actionName, repetitionName).toBlocking().single();
        return new PagedList<RequestHistoryInner>(response.body()) {
            @Override
            public Page<RequestHistoryInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RequestHistoryInner>> listAsync(final String resourceGroupName, final String workflowName, final String runName, final String actionName, final String repetitionName, final ListOperationCallback<RequestHistoryInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, workflowName, runName, actionName, repetitionName),
            new Func1<String, Observable<ServiceResponse<Page<RequestHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RequestHistoryInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RequestHistoryInner&gt; object
     */
    public Observable<Page<RequestHistoryInner>> listAsync(final String resourceGroupName, final String workflowName, final String runName, final String actionName, final String repetitionName) {
        return listWithServiceResponseAsync(resourceGroupName, workflowName, runName, actionName, repetitionName)
            .map(new Func1<ServiceResponse<Page<RequestHistoryInner>>, Page<RequestHistoryInner>>() {
                @Override
                public Page<RequestHistoryInner> call(ServiceResponse<Page<RequestHistoryInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RequestHistoryInner&gt; object
     */
    public Observable<ServiceResponse<Page<RequestHistoryInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String workflowName, final String runName, final String actionName, final String repetitionName) {
        return listSinglePageAsync(resourceGroupName, workflowName, runName, actionName, repetitionName)
            .concatMap(new Func1<ServiceResponse<Page<RequestHistoryInner>>, Observable<ServiceResponse<Page<RequestHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RequestHistoryInner>>> call(ServiceResponse<Page<RequestHistoryInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List a workflow run repetition request history.
     *
    ServiceResponse<PageImpl<RequestHistoryInner>> * @param resourceGroupName The resource group name.
    ServiceResponse<PageImpl<RequestHistoryInner>> * @param workflowName The workflow name.
    ServiceResponse<PageImpl<RequestHistoryInner>> * @param runName The workflow run name.
    ServiceResponse<PageImpl<RequestHistoryInner>> * @param actionName The workflow action name.
    ServiceResponse<PageImpl<RequestHistoryInner>> * @param repetitionName The workflow repetition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RequestHistoryInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RequestHistoryInner>>> listSinglePageAsync(final String resourceGroupName, final String workflowName, final String runName, final String actionName, final String repetitionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (runName == null) {
            throw new IllegalArgumentException("Parameter runName is required and cannot be null.");
        }
        if (actionName == null) {
            throw new IllegalArgumentException("Parameter actionName is required and cannot be null.");
        }
        if (repetitionName == null) {
            throw new IllegalArgumentException("Parameter repetitionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workflowName, runName, actionName, repetitionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RequestHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RequestHistoryInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RequestHistoryInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RequestHistoryInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RequestHistoryInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RequestHistoryInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RequestHistoryInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RequestHistoryInner object if successful.
     */
    public RequestHistoryInner get(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName, String requestHistoryName) {
        return getWithServiceResponseAsync(resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName).toBlocking().single().body();
    }

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RequestHistoryInner> getAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName, String requestHistoryName, final ServiceCallback<RequestHistoryInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName), serviceCallback);
    }

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RequestHistoryInner object
     */
    public Observable<RequestHistoryInner> getAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName, String requestHistoryName) {
        return getWithServiceResponseAsync(resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName).map(new Func1<ServiceResponse<RequestHistoryInner>, RequestHistoryInner>() {
            @Override
            public RequestHistoryInner call(ServiceResponse<RequestHistoryInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a workflow run repetition request history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param actionName The workflow action name.
     * @param repetitionName The workflow repetition.
     * @param requestHistoryName The request history name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RequestHistoryInner object
     */
    public Observable<ServiceResponse<RequestHistoryInner>> getWithServiceResponseAsync(String resourceGroupName, String workflowName, String runName, String actionName, String repetitionName, String requestHistoryName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (runName == null) {
            throw new IllegalArgumentException("Parameter runName is required and cannot be null.");
        }
        if (actionName == null) {
            throw new IllegalArgumentException("Parameter actionName is required and cannot be null.");
        }
        if (repetitionName == null) {
            throw new IllegalArgumentException("Parameter repetitionName is required and cannot be null.");
        }
        if (requestHistoryName == null) {
            throw new IllegalArgumentException("Parameter requestHistoryName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workflowName, runName, actionName, repetitionName, requestHistoryName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RequestHistoryInner>>>() {
                @Override
                public Observable<ServiceResponse<RequestHistoryInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RequestHistoryInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RequestHistoryInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RequestHistoryInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RequestHistoryInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RequestHistoryInner&gt; object if successful.
     */
    public PagedList<RequestHistoryInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<RequestHistoryInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RequestHistoryInner>(response.body()) {
            @Override
            public Page<RequestHistoryInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RequestHistoryInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<RequestHistoryInner>> serviceFuture, final ListOperationCallback<RequestHistoryInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RequestHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RequestHistoryInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RequestHistoryInner&gt; object
     */
    public Observable<Page<RequestHistoryInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RequestHistoryInner>>, Page<RequestHistoryInner>>() {
                @Override
                public Page<RequestHistoryInner> call(ServiceResponse<Page<RequestHistoryInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List a workflow run repetition request history.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RequestHistoryInner&gt; object
     */
    public Observable<ServiceResponse<Page<RequestHistoryInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RequestHistoryInner>>, Observable<ServiceResponse<Page<RequestHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RequestHistoryInner>>> call(ServiceResponse<Page<RequestHistoryInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List a workflow run repetition request history.
     *
    ServiceResponse<PageImpl<RequestHistoryInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RequestHistoryInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RequestHistoryInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RequestHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RequestHistoryInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RequestHistoryInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RequestHistoryInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RequestHistoryInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RequestHistoryInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RequestHistoryInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
