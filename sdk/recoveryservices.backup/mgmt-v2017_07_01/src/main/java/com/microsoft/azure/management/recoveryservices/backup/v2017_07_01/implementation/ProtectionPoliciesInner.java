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
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ProtectionPolicies.
 */
public class ProtectionPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private ProtectionPoliciesService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectionPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProtectionPoliciesInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(ProtectionPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProtectionPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProtectionPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionPolicies get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupPolicies/{policyName}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("policyName") String policyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionPolicies createOrUpdate" })
        @PUT("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupPolicies/{policyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("policyName") String policyName, @Query("api-version") String apiVersion, @Body ProtectionPolicyResourceInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ProtectionPolicies delete" })
        @HTTP(path = "Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupPolicies/{policyName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("policyName") String policyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Provides the details of the backup policies associated to Recovery Services Vault. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy information to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProtectionPolicyResourceInner object if successful.
     */
    public ProtectionPolicyResourceInner get(String vaultName, String resourceGroupName, String policyName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, policyName).toBlocking().single().body();
    }

    /**
     * Provides the details of the backup policies associated to Recovery Services Vault. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy information to be fetched.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProtectionPolicyResourceInner> getAsync(String vaultName, String resourceGroupName, String policyName, final ServiceCallback<ProtectionPolicyResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, policyName), serviceCallback);
    }

    /**
     * Provides the details of the backup policies associated to Recovery Services Vault. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy information to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ProtectionPolicyResourceInner> getAsync(String vaultName, String resourceGroupName, String policyName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, policyName).map(new Func1<ServiceResponse<ProtectionPolicyResourceInner>, ProtectionPolicyResourceInner>() {
            @Override
            public ProtectionPolicyResourceInner call(ServiceResponse<ProtectionPolicyResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Provides the details of the backup policies associated to Recovery Services Vault. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy information to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ServiceResponse<ProtectionPolicyResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String policyName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (policyName == null) {
            throw new IllegalArgumentException("Parameter policyName is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), policyName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProtectionPolicyResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ProtectionPolicyResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProtectionPolicyResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProtectionPolicyResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProtectionPolicyResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProtectionPolicyResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be created.
     * @param parameters resource backup policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProtectionPolicyResourceInner object if successful.
     */
    public ProtectionPolicyResourceInner createOrUpdate(String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner parameters) {
        return createOrUpdateWithServiceResponseAsync(vaultName, resourceGroupName, policyName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be created.
     * @param parameters resource backup policy
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProtectionPolicyResourceInner> createOrUpdateAsync(String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner parameters, final ServiceCallback<ProtectionPolicyResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(vaultName, resourceGroupName, policyName, parameters), serviceCallback);
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be created.
     * @param parameters resource backup policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ProtectionPolicyResourceInner> createOrUpdateAsync(String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner parameters) {
        return createOrUpdateWithServiceResponseAsync(vaultName, resourceGroupName, policyName, parameters).map(new Func1<ServiceResponse<ProtectionPolicyResourceInner>, ProtectionPolicyResourceInner>() {
            @Override
            public ProtectionPolicyResourceInner call(ServiceResponse<ProtectionPolicyResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be created.
     * @param parameters resource backup policy
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ServiceResponse<ProtectionPolicyResourceInner>> createOrUpdateWithServiceResponseAsync(String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner parameters) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (policyName == null) {
            throw new IllegalArgumentException("Parameter policyName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2016-12-01";
        return service.createOrUpdate(vaultName, resourceGroupName, this.client.subscriptionId(), policyName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProtectionPolicyResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ProtectionPolicyResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProtectionPolicyResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProtectionPolicyResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProtectionPolicyResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProtectionPolicyResourceInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String vaultName, String resourceGroupName, String policyName) {
        deleteWithServiceResponseAsync(vaultName, resourceGroupName, policyName).toBlocking().single().body();
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String vaultName, String resourceGroupName, String policyName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(vaultName, resourceGroupName, policyName), serviceCallback);
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String vaultName, String resourceGroupName, String policyName) {
        return deleteWithServiceResponseAsync(vaultName, resourceGroupName, policyName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String vaultName, String resourceGroupName, String policyName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (policyName == null) {
            throw new IllegalArgumentException("Parameter policyName is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        return service.delete(vaultName, resourceGroupName, this.client.subscriptionId(), policyName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
