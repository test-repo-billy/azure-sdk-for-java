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
 * in Departments.
 */
public class DepartmentsInner {
    /** The Retrofit service to perform REST calls. */
    private DepartmentsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of DepartmentsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DepartmentsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(DepartmentsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Departments to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DepartmentsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.Departments listByBillingAccount" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/departments")
        Observable<Response<ResponseBody>> listByBillingAccount(@Path("billingAccountName") String billingAccountName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.Departments get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/departments/{departmentName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("departmentName") String departmentName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all departments for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentListResultInner object if successful.
     */
    public DepartmentListResultInner listByBillingAccount(String billingAccountName) {
        return listByBillingAccountWithServiceResponseAsync(billingAccountName).toBlocking().single().body();
    }

    /**
     * Lists all departments for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentListResultInner> listByBillingAccountAsync(String billingAccountName, final ServiceCallback<DepartmentListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingAccountWithServiceResponseAsync(billingAccountName), serviceCallback);
    }

    /**
     * Lists all departments for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentListResultInner object
     */
    public Observable<DepartmentListResultInner> listByBillingAccountAsync(String billingAccountName) {
        return listByBillingAccountWithServiceResponseAsync(billingAccountName).map(new Func1<ServiceResponse<DepartmentListResultInner>, DepartmentListResultInner>() {
            @Override
            public DepartmentListResultInner call(ServiceResponse<DepartmentListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all departments for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentListResultInner object
     */
    public Observable<ServiceResponse<DepartmentListResultInner>> listByBillingAccountWithServiceResponseAsync(String billingAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        return service.listByBillingAccount(billingAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentListResultInner> clientResponse = listByBillingAccountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all departments for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentListResultInner object if successful.
     */
    public DepartmentListResultInner listByBillingAccount(String billingAccountName, String expand, String filter) {
        return listByBillingAccountWithServiceResponseAsync(billingAccountName, expand, filter).toBlocking().single().body();
    }

    /**
     * Lists all departments for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentListResultInner> listByBillingAccountAsync(String billingAccountName, String expand, String filter, final ServiceCallback<DepartmentListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingAccountWithServiceResponseAsync(billingAccountName, expand, filter), serviceCallback);
    }

    /**
     * Lists all departments for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentListResultInner object
     */
    public Observable<DepartmentListResultInner> listByBillingAccountAsync(String billingAccountName, String expand, String filter) {
        return listByBillingAccountWithServiceResponseAsync(billingAccountName, expand, filter).map(new Func1<ServiceResponse<DepartmentListResultInner>, DepartmentListResultInner>() {
            @Override
            public DepartmentListResultInner call(ServiceResponse<DepartmentListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all departments for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentListResultInner object
     */
    public Observable<ServiceResponse<DepartmentListResultInner>> listByBillingAccountWithServiceResponseAsync(String billingAccountName, String expand, String filter) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByBillingAccount(billingAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentListResultInner> clientResponse = listByBillingAccountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DepartmentListResultInner> listByBillingAccountDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DepartmentListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DepartmentListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountName billing Account Id.
     * @param departmentName Department Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentInner object if successful.
     */
    public DepartmentInner get(String billingAccountName, String departmentName) {
        return getWithServiceResponseAsync(billingAccountName, departmentName).toBlocking().single().body();
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountName billing Account Id.
     * @param departmentName Department Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentInner> getAsync(String billingAccountName, String departmentName, final ServiceCallback<DepartmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, departmentName), serviceCallback);
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountName billing Account Id.
     * @param departmentName Department Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<DepartmentInner> getAsync(String billingAccountName, String departmentName) {
        return getWithServiceResponseAsync(billingAccountName, departmentName).map(new Func1<ServiceResponse<DepartmentInner>, DepartmentInner>() {
            @Override
            public DepartmentInner call(ServiceResponse<DepartmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountName billing Account Id.
     * @param departmentName Department Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<ServiceResponse<DepartmentInner>> getWithServiceResponseAsync(String billingAccountName, String departmentName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (departmentName == null) {
            throw new IllegalArgumentException("Parameter departmentName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        return service.get(billingAccountName, departmentName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountName billing Account Id.
     * @param departmentName Department Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentInner object if successful.
     */
    public DepartmentInner get(String billingAccountName, String departmentName, String expand, String filter) {
        return getWithServiceResponseAsync(billingAccountName, departmentName, expand, filter).toBlocking().single().body();
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountName billing Account Id.
     * @param departmentName Department Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentInner> getAsync(String billingAccountName, String departmentName, String expand, String filter, final ServiceCallback<DepartmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, departmentName, expand, filter), serviceCallback);
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountName billing Account Id.
     * @param departmentName Department Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<DepartmentInner> getAsync(String billingAccountName, String departmentName, String expand, String filter) {
        return getWithServiceResponseAsync(billingAccountName, departmentName, expand, filter).map(new Func1<ServiceResponse<DepartmentInner>, DepartmentInner>() {
            @Override
            public DepartmentInner call(ServiceResponse<DepartmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountName billing Account Id.
     * @param departmentName Department Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<ServiceResponse<DepartmentInner>> getWithServiceResponseAsync(String billingAccountName, String departmentName, String expand, String filter) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (departmentName == null) {
            throw new IllegalArgumentException("Parameter departmentName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, departmentName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DepartmentInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DepartmentInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DepartmentInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
