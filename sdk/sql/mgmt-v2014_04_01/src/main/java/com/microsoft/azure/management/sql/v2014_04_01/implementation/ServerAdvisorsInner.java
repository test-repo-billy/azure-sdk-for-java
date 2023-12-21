/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.sql.v2014_04_01.AutoExecuteStatus;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ServerAdvisors.
 */
public class ServerAdvisorsInner {
    /** The Retrofit service to perform REST calls. */
    private ServerAdvisorsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ServerAdvisorsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServerAdvisorsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ServerAdvisorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServerAdvisors to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServerAdvisorsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.ServerAdvisors listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/advisors")
        Observable<Response<ResponseBody>> listByServer(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.ServerAdvisors get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/advisors/{advisorName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("advisorName") String advisorName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.ServerAdvisors update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/advisors/{advisorName}")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("advisorName") String advisorName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body AdvisorInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2014_04_01.ServerAdvisors createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/advisors/{advisorName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("advisorName") String advisorName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body AdvisorInner parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdvisorListResultInner object if successful.
     */
    public AdvisorListResultInner listByServer(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdvisorListResultInner> listByServerAsync(String resourceGroupName, String serverName, final ServiceCallback<AdvisorListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorListResultInner object
     */
    public Observable<AdvisorListResultInner> listByServerAsync(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<AdvisorListResultInner>, AdvisorListResultInner>() {
            @Override
            public AdvisorListResultInner call(ServiceResponse<AdvisorListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of server advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorListResultInner object
     */
    public Observable<ServiceResponse<AdvisorListResultInner>> listByServerWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByServer(resourceGroupName, serverName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorListResultInner> clientResponse = listByServerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdvisorListResultInner> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AdvisorListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AdvisorListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdvisorInner object if successful.
     */
    public AdvisorInner get(String resourceGroupName, String serverName, String advisorName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, advisorName).toBlocking().single().body();
    }

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdvisorInner> getAsync(String resourceGroupName, String serverName, String advisorName, final ServiceCallback<AdvisorInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, advisorName), serviceCallback);
    }

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<AdvisorInner> getAsync(String resourceGroupName, String serverName, String advisorName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, advisorName).map(new Func1<ServiceResponse<AdvisorInner>, AdvisorInner>() {
            @Override
            public AdvisorInner call(ServiceResponse<AdvisorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<ServiceResponse<AdvisorInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String advisorName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, serverName, advisorName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdvisorInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AdvisorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AdvisorInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdvisorInner object if successful.
     */
    public AdvisorInner update(String resourceGroupName, String serverName, String advisorName, AutoExecuteStatus autoExecuteValue) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, advisorName, autoExecuteValue).toBlocking().single().body();
    }

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdvisorInner> updateAsync(String resourceGroupName, String serverName, String advisorName, AutoExecuteStatus autoExecuteValue, final ServiceCallback<AdvisorInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, serverName, advisorName, autoExecuteValue), serviceCallback);
    }

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<AdvisorInner> updateAsync(String resourceGroupName, String serverName, String advisorName, AutoExecuteStatus autoExecuteValue) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, advisorName, autoExecuteValue).map(new Func1<ServiceResponse<AdvisorInner>, AdvisorInner>() {
            @Override
            public AdvisorInner call(ServiceResponse<AdvisorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<ServiceResponse<AdvisorInner>> updateWithServiceResponseAsync(String resourceGroupName, String serverName, String advisorName, AutoExecuteStatus autoExecuteValue) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (autoExecuteValue == null) {
            throw new IllegalArgumentException("Parameter autoExecuteValue is required and cannot be null.");
        }
        AdvisorInner parameters = new AdvisorInner();
        parameters.withAutoExecuteValue(autoExecuteValue);
        return service.update(resourceGroupName, serverName, advisorName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdvisorInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AdvisorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AdvisorInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdvisorInner object if successful.
     */
    public AdvisorInner createOrUpdate(String resourceGroupName, String serverName, String advisorName, AutoExecuteStatus autoExecuteValue) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, advisorName, autoExecuteValue).toBlocking().single().body();
    }

    /**
     * Creates or updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdvisorInner> createOrUpdateAsync(String resourceGroupName, String serverName, String advisorName, AutoExecuteStatus autoExecuteValue, final ServiceCallback<AdvisorInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, advisorName, autoExecuteValue), serviceCallback);
    }

    /**
     * Creates or updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<AdvisorInner> createOrUpdateAsync(String resourceGroupName, String serverName, String advisorName, AutoExecuteStatus autoExecuteValue) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, advisorName, autoExecuteValue).map(new Func1<ServiceResponse<AdvisorInner>, AdvisorInner>() {
            @Override
            public AdvisorInner call(ServiceResponse<AdvisorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a server advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param advisorName The name of the Server Advisor.
     * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<ServiceResponse<AdvisorInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, String advisorName, AutoExecuteStatus autoExecuteValue) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (autoExecuteValue == null) {
            throw new IllegalArgumentException("Parameter autoExecuteValue is required and cannot be null.");
        }
        AdvisorInner parameters = new AdvisorInner();
        parameters.withAutoExecuteValue(autoExecuteValue);
        return service.createOrUpdate(resourceGroupName, serverName, advisorName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdvisorInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AdvisorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AdvisorInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
