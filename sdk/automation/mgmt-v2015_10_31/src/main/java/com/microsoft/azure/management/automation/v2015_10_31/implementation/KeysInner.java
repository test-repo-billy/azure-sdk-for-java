/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.automation.v2015_10_31.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Keys.
 */
public class KeysInner {
    /** The Retrofit service to perform REST calls. */
    private KeysService service;
    /** The service client containing this operation class. */
    private AutomationClientImpl client;

    /**
     * Initializes an instance of KeysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public KeysInner(Retrofit retrofit, AutomationClientImpl client) {
        this.service = retrofit.create(KeysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Keys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface KeysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.automation.v2015_10_31.Keys listByAutomationAccount" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Automation/automationAccounts/{automationAccountName}/listKeys")
        Observable<Response<ResponseBody>> listByAutomationAccount(@Path("resourceGroupName") String resourceGroupName, @Path("automationAccountName") String automationAccountName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieve the automation keys for an account.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KeyListResultInner object if successful.
     */
    public KeyListResultInner listByAutomationAccount(String resourceGroupName, String automationAccountName) {
        return listByAutomationAccountWithServiceResponseAsync(resourceGroupName, automationAccountName).toBlocking().single().body();
    }

    /**
     * Retrieve the automation keys for an account.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<KeyListResultInner> listByAutomationAccountAsync(String resourceGroupName, String automationAccountName, final ServiceCallback<KeyListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByAutomationAccountWithServiceResponseAsync(resourceGroupName, automationAccountName), serviceCallback);
    }

    /**
     * Retrieve the automation keys for an account.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KeyListResultInner object
     */
    public Observable<KeyListResultInner> listByAutomationAccountAsync(String resourceGroupName, String automationAccountName) {
        return listByAutomationAccountWithServiceResponseAsync(resourceGroupName, automationAccountName).map(new Func1<ServiceResponse<KeyListResultInner>, KeyListResultInner>() {
            @Override
            public KeyListResultInner call(ServiceResponse<KeyListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve the automation keys for an account.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KeyListResultInner object
     */
    public Observable<ServiceResponse<KeyListResultInner>> listByAutomationAccountWithServiceResponseAsync(String resourceGroupName, String automationAccountName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (automationAccountName == null) {
            throw new IllegalArgumentException("Parameter automationAccountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2015-10-31";
        return service.listByAutomationAccount(resourceGroupName, automationAccountName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<KeyListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<KeyListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<KeyListResultInner> clientResponse = listByAutomationAccountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<KeyListResultInner> listByAutomationAccountDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<KeyListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<KeyListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
