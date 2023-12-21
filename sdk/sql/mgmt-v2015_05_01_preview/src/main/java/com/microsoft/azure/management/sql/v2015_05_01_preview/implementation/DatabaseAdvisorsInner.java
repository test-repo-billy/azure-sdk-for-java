/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.sql.v2015_05_01_preview.AutoExecuteStatus;
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
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DatabaseAdvisors.
 */
public class DatabaseAdvisorsInner {
    /** The Retrofit service to perform REST calls. */
    private DatabaseAdvisorsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseAdvisorsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DatabaseAdvisorsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(DatabaseAdvisorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DatabaseAdvisors to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DatabaseAdvisorsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseAdvisors listByDatabase" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/advisors")
        Observable<Response<ResponseBody>> listByDatabase(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseAdvisors get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/advisors/{advisorName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("advisorName") String advisorName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseAdvisors update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/advisors/{advisorName}")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("advisorName") String advisorName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body AdvisorInner parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;AdvisorInner&gt; object if successful.
     */
    public List<AdvisorInner> listByDatabase(String resourceGroupName, String serverName, String databaseName) {
        return listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName).toBlocking().single().body();
    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AdvisorInner>> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName, final ServiceCallback<List<AdvisorInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;AdvisorInner&gt; object
     */
    public Observable<List<AdvisorInner>> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        return listByDatabaseWithServiceResponseAsync(resourceGroupName, serverName, databaseName).map(new Func1<ServiceResponse<List<AdvisorInner>>, List<AdvisorInner>>() {
            @Override
            public List<AdvisorInner> call(ServiceResponse<List<AdvisorInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of database advisors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;AdvisorInner&gt; object
     */
    public Observable<ServiceResponse<List<AdvisorInner>>> listByDatabaseWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByDatabase(resourceGroupName, serverName, databaseName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<AdvisorInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<AdvisorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<AdvisorInner>> clientResponse = listByDatabaseDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<AdvisorInner>> listByDatabaseDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<AdvisorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<AdvisorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdvisorInner object if successful.
     */
    public AdvisorInner get(String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName).toBlocking().single().body();
    }

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdvisorInner> getAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, final ServiceCallback<AdvisorInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName), serviceCallback);
    }

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<AdvisorInner> getAsync(String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName).map(new Func1<ServiceResponse<AdvisorInner>, AdvisorInner>() {
            @Override
            public AdvisorInner call(ServiceResponse<AdvisorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<ServiceResponse<AdvisorInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, String advisorName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
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
        return service.get(resourceGroupName, serverName, databaseName, advisorName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param autoExecuteStatus Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdvisorInner object if successful.
     */
    public AdvisorInner update(String resourceGroupName, String serverName, String databaseName, String advisorName, AutoExecuteStatus autoExecuteStatus) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName, autoExecuteStatus).toBlocking().single().body();
    }

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param autoExecuteStatus Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdvisorInner> updateAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, AutoExecuteStatus autoExecuteStatus, final ServiceCallback<AdvisorInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName, autoExecuteStatus), serviceCallback);
    }

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param autoExecuteStatus Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<AdvisorInner> updateAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, AutoExecuteStatus autoExecuteStatus) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName, autoExecuteStatus).map(new Func1<ServiceResponse<AdvisorInner>, AdvisorInner>() {
            @Override
            public AdvisorInner call(ServiceResponse<AdvisorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a database advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param autoExecuteStatus Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<ServiceResponse<AdvisorInner>> updateWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, AutoExecuteStatus autoExecuteStatus) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
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
        if (autoExecuteStatus == null) {
            throw new IllegalArgumentException("Parameter autoExecuteStatus is required and cannot be null.");
        }
        AdvisorInner parameters = new AdvisorInner();
        parameters.withAutoExecuteStatus(autoExecuteStatus);
        return service.update(resourceGroupName, serverName, databaseName, advisorName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
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

}
