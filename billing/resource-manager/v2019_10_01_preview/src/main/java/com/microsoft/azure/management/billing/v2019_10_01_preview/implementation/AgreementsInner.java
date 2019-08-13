/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.billing.v2019_10_01_preview.ErrorResponseException;
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
 * in Agreements.
 */
public class AgreementsInner {
    /** The Retrofit service to perform REST calls. */
    private AgreementsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of AgreementsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AgreementsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(AgreementsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Agreements to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AgreementsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.Agreements listByBillingAccountName" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/agreements")
        Observable<Response<ResponseBody>> listByBillingAccountName(@Path("billingAccountName") String billingAccountName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.Agreements get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/agreements/{agreementName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("agreementName") String agreementName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AgreementListResultInner object if successful.
     */
    public AgreementListResultInner listByBillingAccountName(String billingAccountName) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName).toBlocking().single().body();
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AgreementListResultInner> listByBillingAccountNameAsync(String billingAccountName, final ServiceCallback<AgreementListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingAccountNameWithServiceResponseAsync(billingAccountName), serviceCallback);
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementListResultInner object
     */
    public Observable<AgreementListResultInner> listByBillingAccountNameAsync(String billingAccountName) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName).map(new Func1<ServiceResponse<AgreementListResultInner>, AgreementListResultInner>() {
            @Override
            public AgreementListResultInner call(ServiceResponse<AgreementListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementListResultInner object
     */
    public Observable<ServiceResponse<AgreementListResultInner>> listByBillingAccountNameWithServiceResponseAsync(String billingAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AgreementListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<AgreementListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AgreementListResultInner> clientResponse = listByBillingAccountNameDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AgreementListResultInner object if successful.
     */
    public AgreementListResultInner listByBillingAccountName(String billingAccountName, String expand) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand).toBlocking().single().body();
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the participants.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AgreementListResultInner> listByBillingAccountNameAsync(String billingAccountName, String expand, final ServiceCallback<AgreementListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand), serviceCallback);
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementListResultInner object
     */
    public Observable<AgreementListResultInner> listByBillingAccountNameAsync(String billingAccountName, String expand) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand).map(new Func1<ServiceResponse<AgreementListResultInner>, AgreementListResultInner>() {
            @Override
            public AgreementListResultInner call(ServiceResponse<AgreementListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all agreements for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementListResultInner object
     */
    public Observable<ServiceResponse<AgreementListResultInner>> listByBillingAccountNameWithServiceResponseAsync(String billingAccountName, String expand) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AgreementListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<AgreementListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AgreementListResultInner> clientResponse = listByBillingAccountNameDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AgreementListResultInner> listByBillingAccountNameDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AgreementListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AgreementListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName billing Account Id.
     * @param agreementName Agreement Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AgreementInner object if successful.
     */
    public AgreementInner get(String billingAccountName, String agreementName) {
        return getWithServiceResponseAsync(billingAccountName, agreementName).toBlocking().single().body();
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName billing Account Id.
     * @param agreementName Agreement Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AgreementInner> getAsync(String billingAccountName, String agreementName, final ServiceCallback<AgreementInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, agreementName), serviceCallback);
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName billing Account Id.
     * @param agreementName Agreement Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementInner object
     */
    public Observable<AgreementInner> getAsync(String billingAccountName, String agreementName) {
        return getWithServiceResponseAsync(billingAccountName, agreementName).map(new Func1<ServiceResponse<AgreementInner>, AgreementInner>() {
            @Override
            public AgreementInner call(ServiceResponse<AgreementInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName billing Account Id.
     * @param agreementName Agreement Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementInner object
     */
    public Observable<ServiceResponse<AgreementInner>> getWithServiceResponseAsync(String billingAccountName, String agreementName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (agreementName == null) {
            throw new IllegalArgumentException("Parameter agreementName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        return service.get(billingAccountName, agreementName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AgreementInner>>>() {
                @Override
                public Observable<ServiceResponse<AgreementInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AgreementInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName billing Account Id.
     * @param agreementName Agreement Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AgreementInner object if successful.
     */
    public AgreementInner get(String billingAccountName, String agreementName, String expand) {
        return getWithServiceResponseAsync(billingAccountName, agreementName, expand).toBlocking().single().body();
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName billing Account Id.
     * @param agreementName Agreement Id.
     * @param expand May be used to expand the participants.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AgreementInner> getAsync(String billingAccountName, String agreementName, String expand, final ServiceCallback<AgreementInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, agreementName, expand), serviceCallback);
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName billing Account Id.
     * @param agreementName Agreement Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementInner object
     */
    public Observable<AgreementInner> getAsync(String billingAccountName, String agreementName, String expand) {
        return getWithServiceResponseAsync(billingAccountName, agreementName, expand).map(new Func1<ServiceResponse<AgreementInner>, AgreementInner>() {
            @Override
            public AgreementInner call(ServiceResponse<AgreementInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the agreement by name.
     *
     * @param billingAccountName billing Account Id.
     * @param agreementName Agreement Id.
     * @param expand May be used to expand the participants.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AgreementInner object
     */
    public Observable<ServiceResponse<AgreementInner>> getWithServiceResponseAsync(String billingAccountName, String agreementName, String expand) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (agreementName == null) {
            throw new IllegalArgumentException("Parameter agreementName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, agreementName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AgreementInner>>>() {
                @Override
                public Observable<ServiceResponse<AgreementInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AgreementInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AgreementInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AgreementInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AgreementInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
