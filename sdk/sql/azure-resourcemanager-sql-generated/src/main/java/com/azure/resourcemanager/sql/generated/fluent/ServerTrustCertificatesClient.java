// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerTrustCertificateInner;

/**
 * An instance of this class provides access to all the operations defined in ServerTrustCertificatesClient.
 */
public interface ServerTrustCertificatesClient {
    /**
     * Gets a list of server trust certificates that were uploaded from box to the given Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server trust certificates that were uploaded from box to the given Sql Managed Instance as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerTrustCertificateInner> listByInstance(String resourceGroupName, String managedInstanceName);

    /**
     * Gets a list of server trust certificates that were uploaded from box to the given Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server trust certificates that were uploaded from box to the given Sql Managed Instance as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerTrustCertificateInner> listByInstance(String resourceGroupName, String managedInstanceName,
        Context context);

    /**
     * Gets a server trust certificate that was uploaded from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server trust certificate that was uploaded from box to Sql Managed Instance along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerTrustCertificateInner> getWithResponse(String resourceGroupName, String managedInstanceName,
        String certificateName, Context context);

    /**
     * Gets a server trust certificate that was uploaded from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server trust certificate that was uploaded from box to Sql Managed Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerTrustCertificateInner get(String resourceGroupName, String managedInstanceName, String certificateName);

    /**
     * Uploads a server trust certificate from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to upload.
     * @param parameters The server trust certificate info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of server trust certificate imported from box to enable connection
     * between box and Sql Managed Instance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerTrustCertificateInner>, ServerTrustCertificateInner> beginCreateOrUpdate(
        String resourceGroupName, String managedInstanceName, String certificateName,
        ServerTrustCertificateInner parameters);

    /**
     * Uploads a server trust certificate from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to upload.
     * @param parameters The server trust certificate info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of server trust certificate imported from box to enable connection
     * between box and Sql Managed Instance.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ServerTrustCertificateInner>, ServerTrustCertificateInner> beginCreateOrUpdate(
        String resourceGroupName, String managedInstanceName, String certificateName,
        ServerTrustCertificateInner parameters, Context context);

    /**
     * Uploads a server trust certificate from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to upload.
     * @param parameters The server trust certificate info.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server trust certificate imported from box to enable connection between box and Sql Managed Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerTrustCertificateInner createOrUpdate(String resourceGroupName, String managedInstanceName,
        String certificateName, ServerTrustCertificateInner parameters);

    /**
     * Uploads a server trust certificate from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to upload.
     * @param parameters The server trust certificate info.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server trust certificate imported from box to enable connection between box and Sql Managed Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerTrustCertificateInner createOrUpdate(String resourceGroupName, String managedInstanceName,
        String certificateName, ServerTrustCertificateInner parameters, Context context);

    /**
     * Deletes a server trust certificate that was uploaded from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String managedInstanceName,
        String certificateName);

    /**
     * Deletes a server trust certificate that was uploaded from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String managedInstanceName,
        String certificateName, Context context);

    /**
     * Deletes a server trust certificate that was uploaded from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String managedInstanceName, String certificateName);

    /**
     * Deletes a server trust certificate that was uploaded from box to Sql Managed Instance.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param certificateName Name of of the certificate to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String managedInstanceName, String certificateName, Context context);
}
