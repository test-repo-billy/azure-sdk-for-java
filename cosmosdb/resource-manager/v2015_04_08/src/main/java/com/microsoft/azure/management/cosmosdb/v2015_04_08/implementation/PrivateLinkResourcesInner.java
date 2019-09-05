/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PrivateLinkResources.
 */
public class PrivateLinkResourcesInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateLinkResourcesService service;
    /** The service client containing this operation class. */
    private CosmosDBImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateLinkResourcesInner(Retrofit retrofit, CosmosDBImpl client) {
        this.service = retrofit.create(PrivateLinkResourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateLinkResources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateLinkResourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cosmosdb.v2015_04_08.PrivateLinkResources listByAccount" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/privateLinkResources")
        Observable<Response<ResponseBody>> listByAccount(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateLinkResourceListResultInner object if successful.
     */
    public PrivateLinkResourceListResultInner listByAccount(String resourceGroupName, String accountName) {
        return listByAccountWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateLinkResourceListResultInner> listByAccountAsync(String resourceGroupName, String accountName, final ServiceCallback<PrivateLinkResourceListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByAccountWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceListResultInner object
     */
    public Observable<PrivateLinkResourceListResultInner> listByAccountAsync(String resourceGroupName, String accountName) {
        return listByAccountWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<PrivateLinkResourceListResultInner>, PrivateLinkResourceListResultInner>() {
            @Override
            public PrivateLinkResourceListResultInner call(ServiceResponse<PrivateLinkResourceListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceListResultInner object
     */
    public Observable<ServiceResponse<PrivateLinkResourceListResultInner>> listByAccountWithServiceResponseAsync(String resourceGroupName, String accountName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByAccount(this.client.subscriptionId(), resourceGroupName, accountName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateLinkResourceListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateLinkResourceListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateLinkResourceListResultInner> clientResponse = listByAccountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateLinkResourceListResultInner> listByAccountDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateLinkResourceListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateLinkResourceListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
