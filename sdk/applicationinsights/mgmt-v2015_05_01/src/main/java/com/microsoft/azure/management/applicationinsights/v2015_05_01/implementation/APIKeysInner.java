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
import com.microsoft.azure.management.applicationinsights.v2015_05_01.APIKeyRequest;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined
 * in APIKeys.
 */
public class APIKeysInner {
    /** The Retrofit service to perform REST calls. */
    private APIKeysService service;
    /** The service client containing this operation class. */
    private ApplicationInsightsManagementClientImpl client;

    /**
     * Initializes an instance of APIKeysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public APIKeysInner(Retrofit retrofit, ApplicationInsightsManagementClientImpl client) {
        this.service = retrofit.create(APIKeysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for APIKeys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface APIKeysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.APIKeys list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/ApiKeys")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.APIKeys create" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/ApiKeys")
        Observable<Response<ResponseBody>> create(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Body APIKeyRequest aPIKeyProperties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.APIKeys delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/APIKeys/{keyId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Path("keyId") String keyId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.APIKeys get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components/{resourceName}/APIKeys/{keyId}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("resourceName") String resourceName, @Path("keyId") String keyId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of API keys of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ApplicationInsightsComponentAPIKeyInner&gt; object if successful.
     */
    public List<ApplicationInsightsComponentAPIKeyInner> list(String resourceGroupName, String resourceName) {
        return listWithServiceResponseAsync(resourceGroupName, resourceName).toBlocking().single().body();
    }

    /**
     * Gets a list of API keys of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ApplicationInsightsComponentAPIKeyInner>> listAsync(String resourceGroupName, String resourceName, final ServiceCallback<List<ApplicationInsightsComponentAPIKeyInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, resourceName), serviceCallback);
    }

    /**
     * Gets a list of API keys of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ApplicationInsightsComponentAPIKeyInner&gt; object
     */
    public Observable<List<ApplicationInsightsComponentAPIKeyInner>> listAsync(String resourceGroupName, String resourceName) {
        return listWithServiceResponseAsync(resourceGroupName, resourceName).map(new Func1<ServiceResponse<List<ApplicationInsightsComponentAPIKeyInner>>, List<ApplicationInsightsComponentAPIKeyInner>>() {
            @Override
            public List<ApplicationInsightsComponentAPIKeyInner> call(ServiceResponse<List<ApplicationInsightsComponentAPIKeyInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of API keys of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ApplicationInsightsComponentAPIKeyInner&gt; object
     */
    public Observable<ServiceResponse<List<ApplicationInsightsComponentAPIKeyInner>>> listWithServiceResponseAsync(String resourceGroupName, String resourceName) {
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
        return service.list(resourceGroupName, this.client.subscriptionId(), resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ApplicationInsightsComponentAPIKeyInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ApplicationInsightsComponentAPIKeyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ApplicationInsightsComponentAPIKeyInner>> result = listDelegate(response);
                        List<ApplicationInsightsComponentAPIKeyInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ApplicationInsightsComponentAPIKeyInner>> clientResponse = new ServiceResponse<List<ApplicationInsightsComponentAPIKeyInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ApplicationInsightsComponentAPIKeyInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ApplicationInsightsComponentAPIKeyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ApplicationInsightsComponentAPIKeyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param aPIKeyProperties Properties that need to be specified to create an API key of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInsightsComponentAPIKeyInner object if successful.
     */
    public ApplicationInsightsComponentAPIKeyInner create(String resourceGroupName, String resourceName, APIKeyRequest aPIKeyProperties) {
        return createWithServiceResponseAsync(resourceGroupName, resourceName, aPIKeyProperties).toBlocking().single().body();
    }

    /**
     * Create an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param aPIKeyProperties Properties that need to be specified to create an API key of a Application Insights component.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInsightsComponentAPIKeyInner> createAsync(String resourceGroupName, String resourceName, APIKeyRequest aPIKeyProperties, final ServiceCallback<ApplicationInsightsComponentAPIKeyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceGroupName, resourceName, aPIKeyProperties), serviceCallback);
    }

    /**
     * Create an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param aPIKeyProperties Properties that need to be specified to create an API key of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentAPIKeyInner object
     */
    public Observable<ApplicationInsightsComponentAPIKeyInner> createAsync(String resourceGroupName, String resourceName, APIKeyRequest aPIKeyProperties) {
        return createWithServiceResponseAsync(resourceGroupName, resourceName, aPIKeyProperties).map(new Func1<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>, ApplicationInsightsComponentAPIKeyInner>() {
            @Override
            public ApplicationInsightsComponentAPIKeyInner call(ServiceResponse<ApplicationInsightsComponentAPIKeyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param aPIKeyProperties Properties that need to be specified to create an API key of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentAPIKeyInner object
     */
    public Observable<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>> createWithServiceResponseAsync(String resourceGroupName, String resourceName, APIKeyRequest aPIKeyProperties) {
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
        if (aPIKeyProperties == null) {
            throw new IllegalArgumentException("Parameter aPIKeyProperties is required and cannot be null.");
        }
        Validator.validate(aPIKeyProperties);
        return service.create(resourceGroupName, this.client.subscriptionId(), resourceName, this.client.apiVersion(), aPIKeyProperties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInsightsComponentAPIKeyInner> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInsightsComponentAPIKeyInner> createDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInsightsComponentAPIKeyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInsightsComponentAPIKeyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInsightsComponentAPIKeyInner object if successful.
     */
    public ApplicationInsightsComponentAPIKeyInner delete(String resourceGroupName, String resourceName, String keyId) {
        return deleteWithServiceResponseAsync(resourceGroupName, resourceName, keyId).toBlocking().single().body();
    }

    /**
     * Delete an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInsightsComponentAPIKeyInner> deleteAsync(String resourceGroupName, String resourceName, String keyId, final ServiceCallback<ApplicationInsightsComponentAPIKeyInner> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, resourceName, keyId), serviceCallback);
    }

    /**
     * Delete an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentAPIKeyInner object
     */
    public Observable<ApplicationInsightsComponentAPIKeyInner> deleteAsync(String resourceGroupName, String resourceName, String keyId) {
        return deleteWithServiceResponseAsync(resourceGroupName, resourceName, keyId).map(new Func1<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>, ApplicationInsightsComponentAPIKeyInner>() {
            @Override
            public ApplicationInsightsComponentAPIKeyInner call(ServiceResponse<ApplicationInsightsComponentAPIKeyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete an API Key of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentAPIKeyInner object
     */
    public Observable<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>> deleteWithServiceResponseAsync(String resourceGroupName, String resourceName, String keyId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (keyId == null) {
            throw new IllegalArgumentException("Parameter keyId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, this.client.subscriptionId(), resourceName, keyId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInsightsComponentAPIKeyInner> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInsightsComponentAPIKeyInner> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInsightsComponentAPIKeyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInsightsComponentAPIKeyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get the API Key for this key id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInsightsComponentAPIKeyInner object if successful.
     */
    public ApplicationInsightsComponentAPIKeyInner get(String resourceGroupName, String resourceName, String keyId) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName, keyId).toBlocking().single().body();
    }

    /**
     * Get the API Key for this key id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationInsightsComponentAPIKeyInner> getAsync(String resourceGroupName, String resourceName, String keyId, final ServiceCallback<ApplicationInsightsComponentAPIKeyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, resourceName, keyId), serviceCallback);
    }

    /**
     * Get the API Key for this key id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentAPIKeyInner object
     */
    public Observable<ApplicationInsightsComponentAPIKeyInner> getAsync(String resourceGroupName, String resourceName, String keyId) {
        return getWithServiceResponseAsync(resourceGroupName, resourceName, keyId).map(new Func1<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>, ApplicationInsightsComponentAPIKeyInner>() {
            @Override
            public ApplicationInsightsComponentAPIKeyInner call(ServiceResponse<ApplicationInsightsComponentAPIKeyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the API Key for this key id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param keyId The API Key ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInsightsComponentAPIKeyInner object
     */
    public Observable<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>> getWithServiceResponseAsync(String resourceGroupName, String resourceName, String keyId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (keyId == null) {
            throw new IllegalArgumentException("Parameter keyId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, this.client.subscriptionId(), resourceName, keyId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationInsightsComponentAPIKeyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationInsightsComponentAPIKeyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationInsightsComponentAPIKeyInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationInsightsComponentAPIKeyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationInsightsComponentAPIKeyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
