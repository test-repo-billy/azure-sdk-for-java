// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicelinker.fluent.models.LinkerResourceInner;

/**
 * An immutable client-side representation of LinkerResource.
 */
public interface LinkerResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: The system data.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the targetService property: The target service properties.
     * 
     * @return the targetService value.
     */
    TargetServiceBase targetService();

    /**
     * Gets the authInfo property: The authentication type.
     * 
     * @return the authInfo value.
     */
    AuthInfoBase authInfo();

    /**
     * Gets the clientType property: The application client type.
     * 
     * @return the clientType value.
     */
    ClientType clientType();

    /**
     * Gets the provisioningState property: The provisioning state.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the vNetSolution property: The VNet solution.
     * 
     * @return the vNetSolution value.
     */
    VNetSolution vNetSolution();

    /**
     * Gets the secretStore property: An option to store secret value in secure place.
     * 
     * @return the secretStore value.
     */
    SecretStore secretStore();

    /**
     * Gets the scope property: connection scope in source service.
     * 
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the inner com.azure.resourcemanager.servicelinker.fluent.models.LinkerResourceInner object.
     * 
     * @return the inner object.
     */
    LinkerResourceInner innerModel();

    /**
     * The entirety of the LinkerResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScopeStage, DefinitionStages.WithCreate {
    }

    /**
     * The LinkerResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the LinkerResource definition.
         */
        interface Blank extends WithScopeStage {
        }

        /**
         * The stage of the LinkerResource definition allowing to specify parent resource.
         */
        interface WithScopeStage {
            /**
             * Specifies resourceUri.
             * 
             * @param resourceUri The fully qualified Azure Resource manager identifier of the resource to be connected.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceUri(String resourceUri);
        }

        /**
         * The stage of the LinkerResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTargetService, DefinitionStages.WithAuthInfo, DefinitionStages.WithClientType,
            DefinitionStages.WithVNetSolution, DefinitionStages.WithSecretStore, DefinitionStages.WithScope {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            LinkerResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LinkerResource create(Context context);
        }

        /**
         * The stage of the LinkerResource definition allowing to specify targetService.
         */
        interface WithTargetService {
            /**
             * Specifies the targetService property: The target service properties.
             * 
             * @param targetService The target service properties.
             * @return the next definition stage.
             */
            WithCreate withTargetService(TargetServiceBase targetService);
        }

        /**
         * The stage of the LinkerResource definition allowing to specify authInfo.
         */
        interface WithAuthInfo {
            /**
             * Specifies the authInfo property: The authentication type..
             * 
             * @param authInfo The authentication type.
             * @return the next definition stage.
             */
            WithCreate withAuthInfo(AuthInfoBase authInfo);
        }

        /**
         * The stage of the LinkerResource definition allowing to specify clientType.
         */
        interface WithClientType {
            /**
             * Specifies the clientType property: The application client type.
             * 
             * @param clientType The application client type.
             * @return the next definition stage.
             */
            WithCreate withClientType(ClientType clientType);
        }

        /**
         * The stage of the LinkerResource definition allowing to specify vNetSolution.
         */
        interface WithVNetSolution {
            /**
             * Specifies the vNetSolution property: The VNet solution..
             * 
             * @param vNetSolution The VNet solution.
             * @return the next definition stage.
             */
            WithCreate withVNetSolution(VNetSolution vNetSolution);
        }

        /**
         * The stage of the LinkerResource definition allowing to specify secretStore.
         */
        interface WithSecretStore {
            /**
             * Specifies the secretStore property: An option to store secret value in secure place.
             * 
             * @param secretStore An option to store secret value in secure place.
             * @return the next definition stage.
             */
            WithCreate withSecretStore(SecretStore secretStore);
        }

        /**
         * The stage of the LinkerResource definition allowing to specify scope.
         */
        interface WithScope {
            /**
             * Specifies the scope property: connection scope in source service..
             * 
             * @param scope connection scope in source service.
             * @return the next definition stage.
             */
            WithCreate withScope(String scope);
        }
    }

    /**
     * Begins update for the LinkerResource resource.
     * 
     * @return the stage of resource update.
     */
    LinkerResource.Update update();

    /**
     * The template for LinkerResource update.
     */
    interface Update extends UpdateStages.WithTargetService, UpdateStages.WithAuthInfo, UpdateStages.WithClientType,
        UpdateStages.WithVNetSolution, UpdateStages.WithSecretStore, UpdateStages.WithScope {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        LinkerResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LinkerResource apply(Context context);
    }

    /**
     * The LinkerResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the LinkerResource update allowing to specify targetService.
         */
        interface WithTargetService {
            /**
             * Specifies the targetService property: The target service properties.
             * 
             * @param targetService The target service properties.
             * @return the next definition stage.
             */
            Update withTargetService(TargetServiceBase targetService);
        }

        /**
         * The stage of the LinkerResource update allowing to specify authInfo.
         */
        interface WithAuthInfo {
            /**
             * Specifies the authInfo property: The authentication type..
             * 
             * @param authInfo The authentication type.
             * @return the next definition stage.
             */
            Update withAuthInfo(AuthInfoBase authInfo);
        }

        /**
         * The stage of the LinkerResource update allowing to specify clientType.
         */
        interface WithClientType {
            /**
             * Specifies the clientType property: The application client type.
             * 
             * @param clientType The application client type.
             * @return the next definition stage.
             */
            Update withClientType(ClientType clientType);
        }

        /**
         * The stage of the LinkerResource update allowing to specify vNetSolution.
         */
        interface WithVNetSolution {
            /**
             * Specifies the vNetSolution property: The VNet solution..
             * 
             * @param vNetSolution The VNet solution.
             * @return the next definition stage.
             */
            Update withVNetSolution(VNetSolution vNetSolution);
        }

        /**
         * The stage of the LinkerResource update allowing to specify secretStore.
         */
        interface WithSecretStore {
            /**
             * Specifies the secretStore property: An option to store secret value in secure place.
             * 
             * @param secretStore An option to store secret value in secure place.
             * @return the next definition stage.
             */
            Update withSecretStore(SecretStore secretStore);
        }

        /**
         * The stage of the LinkerResource update allowing to specify scope.
         */
        interface WithScope {
            /**
             * Specifies the scope property: connection scope in source service..
             * 
             * @param scope connection scope in source service.
             * @return the next definition stage.
             */
            Update withScope(String scope);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    LinkerResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LinkerResource refresh(Context context);

    /**
     * Validate a link.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the validation operation result for a linker.
     */
    ValidateOperationResult validate();

    /**
     * Validate a link.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the validation operation result for a linker.
     */
    ValidateOperationResult validate(Context context);

    /**
     * list source configurations for a linker.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configurations for source resource, include appSettings, connectionString and serviceBindings along with
     * {@link Response}.
     */
    Response<SourceConfigurationResult> listConfigurationsWithResponse(Context context);

    /**
     * list source configurations for a linker.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configurations for source resource, include appSettings, connectionString and serviceBindings.
     */
    SourceConfigurationResult listConfigurations();
}
