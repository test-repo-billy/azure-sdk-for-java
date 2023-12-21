/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01.implementation;

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
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineScaleSetRollingUpgrades.
 */
public class VirtualMachineScaleSetRollingUpgradesInner {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineScaleSetRollingUpgradesService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineScaleSetRollingUpgradesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineScaleSetRollingUpgradesInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(VirtualMachineScaleSetRollingUpgradesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineScaleSetRollingUpgrades to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineScaleSetRollingUpgradesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSetRollingUpgrades cancel" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        Observable<Response<ResponseBody>> cancel(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSetRollingUpgrades beginCancel" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/cancel")
        Observable<Response<ResponseBody>> beginCancel(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSetRollingUpgrades startOSUpgrade" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        Observable<Response<ResponseBody>> startOSUpgrade(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSetRollingUpgrades beginStartOSUpgrade" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/osRollingUpgrade")
        Observable<Response<ResponseBody>> beginStartOSUpgrade(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSetRollingUpgrades startExtensionUpgrade" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensionRollingUpgrade")
        Observable<Response<ResponseBody>> startExtensionUpgrade(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSetRollingUpgrades beginStartExtensionUpgrade" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensionRollingUpgrade")
        Observable<Response<ResponseBody>> beginStartExtensionUpgrade(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSetRollingUpgrades getLatest" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/rollingUpgrades/latest")
        Observable<Response<ResponseBody>> getLatest(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void cancel(String resourceGroupName, String vmScaleSetName) {
        cancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().last().body();
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> cancelAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(cancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> cancelAsync(String resourceGroupName, String vmScaleSetName) {
        return cancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> cancelWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-07-01";
        Observable<Response<ResponseBody>> observable = service.cancel(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginCancel(String resourceGroupName, String vmScaleSetName) {
        beginCancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().single().body();
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginCancelAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginCancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginCancelAsync(String resourceGroupName, String vmScaleSetName) {
        return beginCancelWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Cancels the current virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginCancelWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-07-01";
        return service.beginCancel(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginCancelDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginCancelDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void startOSUpgrade(String resourceGroupName, String vmScaleSetName) {
        startOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().last().body();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> startOSUpgradeAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(startOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> startOSUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        return startOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> startOSUpgradeWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-07-01";
        Observable<Response<ResponseBody>> observable = service.startOSUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginStartOSUpgrade(String resourceGroupName, String vmScaleSetName) {
        beginStartOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().single().body();
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginStartOSUpgradeAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginStartOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginStartOSUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        return beginStartOSUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Starts a rolling upgrade to move all virtual machine scale set instances to the latest available Platform Image OS version. Instances which are already running the latest available OS version are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginStartOSUpgradeWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-07-01";
        return service.beginStartOSUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginStartOSUpgradeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginStartOSUpgradeDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void startExtensionUpgrade(String resourceGroupName, String vmScaleSetName) {
        startExtensionUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().last().body();
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> startExtensionUpgradeAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(startExtensionUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> startExtensionUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        return startExtensionUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> startExtensionUpgradeWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-07-01";
        Observable<Response<ResponseBody>> observable = service.startExtensionUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginStartExtensionUpgrade(String resourceGroupName, String vmScaleSetName) {
        beginStartExtensionUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().single().body();
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginStartExtensionUpgradeAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginStartExtensionUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginStartExtensionUpgradeAsync(String resourceGroupName, String vmScaleSetName) {
        return beginStartExtensionUpgradeWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Starts a rolling upgrade to move all extensions for all virtual machine scale set instances to the latest available extension version. Instances which are already running the latest extension versions are not affected.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginStartExtensionUpgradeWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-07-01";
        return service.beginStartExtensionUpgrade(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginStartExtensionUpgradeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginStartExtensionUpgradeDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RollingUpgradeStatusInfoInner object if successful.
     */
    public RollingUpgradeStatusInfoInner getLatest(String resourceGroupName, String vmScaleSetName) {
        return getLatestWithServiceResponseAsync(resourceGroupName, vmScaleSetName).toBlocking().single().body();
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RollingUpgradeStatusInfoInner> getLatestAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<RollingUpgradeStatusInfoInner> serviceCallback) {
        return ServiceFuture.fromResponse(getLatestWithServiceResponseAsync(resourceGroupName, vmScaleSetName), serviceCallback);
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RollingUpgradeStatusInfoInner object
     */
    public Observable<RollingUpgradeStatusInfoInner> getLatestAsync(String resourceGroupName, String vmScaleSetName) {
        return getLatestWithServiceResponseAsync(resourceGroupName, vmScaleSetName).map(new Func1<ServiceResponse<RollingUpgradeStatusInfoInner>, RollingUpgradeStatusInfoInner>() {
            @Override
            public RollingUpgradeStatusInfoInner call(ServiceResponse<RollingUpgradeStatusInfoInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the status of the latest virtual machine scale set rolling upgrade.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the VM scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RollingUpgradeStatusInfoInner object
     */
    public Observable<ServiceResponse<RollingUpgradeStatusInfoInner>> getLatestWithServiceResponseAsync(String resourceGroupName, String vmScaleSetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vmScaleSetName == null) {
            throw new IllegalArgumentException("Parameter vmScaleSetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-07-01";
        return service.getLatest(resourceGroupName, vmScaleSetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RollingUpgradeStatusInfoInner>>>() {
                @Override
                public Observable<ServiceResponse<RollingUpgradeStatusInfoInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RollingUpgradeStatusInfoInner> clientResponse = getLatestDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RollingUpgradeStatusInfoInner> getLatestDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RollingUpgradeStatusInfoInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RollingUpgradeStatusInfoInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
