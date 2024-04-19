// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.ManagedEnvironmentInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of ManagedEnvironment.
 */
public interface ManagedEnvironment {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the kind property: Kind of the Environment.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the identity property: Managed identities for the Managed Environment to interact with other Azure services
     * without maintaining any secrets or credentials in code.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the Environment.
     * 
     * @return the provisioningState value.
     */
    EnvironmentProvisioningState provisioningState();

    /**
     * Gets the daprAIInstrumentationKey property: Azure Monitor instrumentation key used by Dapr to export Service to
     * Service communication telemetry.
     * 
     * @return the daprAIInstrumentationKey value.
     */
    String daprAIInstrumentationKey();

    /**
     * Gets the daprAIConnectionString property: Application Insights connection string used by Dapr to export Service
     * to Service communication telemetry.
     * 
     * @return the daprAIConnectionString value.
     */
    String daprAIConnectionString();

    /**
     * Gets the vnetConfiguration property: Vnet configuration for the environment.
     * 
     * @return the vnetConfiguration value.
     */
    VnetConfiguration vnetConfiguration();

    /**
     * Gets the deploymentErrors property: Any errors that occurred during deployment or deployment validation.
     * 
     * @return the deploymentErrors value.
     */
    String deploymentErrors();

    /**
     * Gets the defaultDomain property: Default Domain Name for the cluster.
     * 
     * @return the defaultDomain value.
     */
    String defaultDomain();

    /**
     * Gets the staticIp property: Static IP of the Environment.
     * 
     * @return the staticIp value.
     */
    String staticIp();

    /**
     * Gets the appLogsConfiguration property: Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only "log-analytics" is
     * supported.
     * 
     * @return the appLogsConfiguration value.
     */
    AppLogsConfiguration appLogsConfiguration();

    /**
     * Gets the appInsightsConfiguration property: Environment level Application Insights configuration.
     * 
     * @return the appInsightsConfiguration value.
     */
    AppInsightsConfiguration appInsightsConfiguration();

    /**
     * Gets the openTelemetryConfiguration property: Environment Open Telemetry configuration.
     * 
     * @return the openTelemetryConfiguration value.
     */
    OpenTelemetryConfiguration openTelemetryConfiguration();

    /**
     * Gets the zoneRedundant property: Whether or not this Managed Environment is zone-redundant.
     * 
     * @return the zoneRedundant value.
     */
    Boolean zoneRedundant();

    /**
     * Gets the customDomainConfiguration property: Custom domain configuration for the environment.
     * 
     * @return the customDomainConfiguration value.
     */
    CustomDomainConfiguration customDomainConfiguration();

    /**
     * Gets the eventStreamEndpoint property: The endpoint of the eventstream of the Environment.
     * 
     * @return the eventStreamEndpoint value.
     */
    String eventStreamEndpoint();

    /**
     * Gets the workloadProfiles property: Workload profiles configured for the Managed Environment.
     * 
     * @return the workloadProfiles value.
     */
    List<WorkloadProfile> workloadProfiles();

    /**
     * Gets the kedaConfiguration property: The configuration of Keda component.
     * 
     * @return the kedaConfiguration value.
     */
    KedaConfiguration kedaConfiguration();

    /**
     * Gets the daprConfiguration property: The configuration of Dapr component.
     * 
     * @return the daprConfiguration value.
     */
    DaprConfiguration daprConfiguration();

    /**
     * Gets the infrastructureResourceGroup property: Name of the platform-managed resource group created for the
     * Managed Environment to host infrastructure resources. If a subnet ID is provided, this resource group will be
     * created in the same subscription as the subnet.
     * 
     * @return the infrastructureResourceGroup value.
     */
    String infrastructureResourceGroup();

    /**
     * Gets the peerAuthentication property: Peer authentication settings for the Managed Environment.
     * 
     * @return the peerAuthentication value.
     */
    ManagedEnvironmentPropertiesPeerAuthentication peerAuthentication();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.ManagedEnvironmentInner object.
     * 
     * @return the inner object.
     */
    ManagedEnvironmentInner innerModel();

    /**
     * The entirety of the ManagedEnvironment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The ManagedEnvironment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ManagedEnvironment definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the ManagedEnvironment definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithKind,
            DefinitionStages.WithIdentity, DefinitionStages.WithDaprAIInstrumentationKey,
            DefinitionStages.WithDaprAIConnectionString, DefinitionStages.WithVnetConfiguration,
            DefinitionStages.WithAppLogsConfiguration, DefinitionStages.WithAppInsightsConfiguration,
            DefinitionStages.WithOpenTelemetryConfiguration, DefinitionStages.WithZoneRedundant,
            DefinitionStages.WithCustomDomainConfiguration, DefinitionStages.WithWorkloadProfiles,
            DefinitionStages.WithKedaConfiguration, DefinitionStages.WithDaprConfiguration,
            DefinitionStages.WithInfrastructureResourceGroup, DefinitionStages.WithPeerAuthentication {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ManagedEnvironment create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedEnvironment create(Context context);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of the Environment..
             * 
             * @param kind Kind of the Environment.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed identities for the Managed Environment to interact with other
             * Azure services without maintaining any secrets or credentials in code..
             * 
             * @param identity Managed identities for the Managed Environment to interact with other Azure services
             * without maintaining any secrets or credentials in code.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify daprAIInstrumentationKey.
         */
        interface WithDaprAIInstrumentationKey {
            /**
             * Specifies the daprAIInstrumentationKey property: Azure Monitor instrumentation key used by Dapr to export
             * Service to Service communication telemetry.
             * 
             * @param daprAIInstrumentationKey Azure Monitor instrumentation key used by Dapr to export Service to
             * Service communication telemetry.
             * @return the next definition stage.
             */
            WithCreate withDaprAIInstrumentationKey(String daprAIInstrumentationKey);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify daprAIConnectionString.
         */
        interface WithDaprAIConnectionString {
            /**
             * Specifies the daprAIConnectionString property: Application Insights connection string used by Dapr to
             * export Service to Service communication telemetry.
             * 
             * @param daprAIConnectionString Application Insights connection string used by Dapr to export Service to
             * Service communication telemetry.
             * @return the next definition stage.
             */
            WithCreate withDaprAIConnectionString(String daprAIConnectionString);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify vnetConfiguration.
         */
        interface WithVnetConfiguration {
            /**
             * Specifies the vnetConfiguration property: Vnet configuration for the environment.
             * 
             * @param vnetConfiguration Vnet configuration for the environment.
             * @return the next definition stage.
             */
            WithCreate withVnetConfiguration(VnetConfiguration vnetConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify appLogsConfiguration.
         */
        interface WithAppLogsConfiguration {
            /**
             * Specifies the appLogsConfiguration property: Cluster configuration which enables the log daemon to export
             * app logs to a destination. Currently only "log-analytics" is
             * supported.
             * 
             * @param appLogsConfiguration Cluster configuration which enables the log daemon to export
             * app logs to a destination. Currently only "log-analytics" is
             * supported.
             * @return the next definition stage.
             */
            WithCreate withAppLogsConfiguration(AppLogsConfiguration appLogsConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify appInsightsConfiguration.
         */
        interface WithAppInsightsConfiguration {
            /**
             * Specifies the appInsightsConfiguration property: Environment level Application Insights configuration.
             * 
             * @param appInsightsConfiguration Environment level Application Insights configuration.
             * @return the next definition stage.
             */
            WithCreate withAppInsightsConfiguration(AppInsightsConfiguration appInsightsConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify openTelemetryConfiguration.
         */
        interface WithOpenTelemetryConfiguration {
            /**
             * Specifies the openTelemetryConfiguration property: Environment Open Telemetry configuration.
             * 
             * @param openTelemetryConfiguration Environment Open Telemetry configuration.
             * @return the next definition stage.
             */
            WithCreate withOpenTelemetryConfiguration(OpenTelemetryConfiguration openTelemetryConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify zoneRedundant.
         */
        interface WithZoneRedundant {
            /**
             * Specifies the zoneRedundant property: Whether or not this Managed Environment is zone-redundant..
             * 
             * @param zoneRedundant Whether or not this Managed Environment is zone-redundant.
             * @return the next definition stage.
             */
            WithCreate withZoneRedundant(Boolean zoneRedundant);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify customDomainConfiguration.
         */
        interface WithCustomDomainConfiguration {
            /**
             * Specifies the customDomainConfiguration property: Custom domain configuration for the environment.
             * 
             * @param customDomainConfiguration Custom domain configuration for the environment.
             * @return the next definition stage.
             */
            WithCreate withCustomDomainConfiguration(CustomDomainConfiguration customDomainConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify workloadProfiles.
         */
        interface WithWorkloadProfiles {
            /**
             * Specifies the workloadProfiles property: Workload profiles configured for the Managed Environment..
             * 
             * @param workloadProfiles Workload profiles configured for the Managed Environment.
             * @return the next definition stage.
             */
            WithCreate withWorkloadProfiles(List<WorkloadProfile> workloadProfiles);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify kedaConfiguration.
         */
        interface WithKedaConfiguration {
            /**
             * Specifies the kedaConfiguration property: The configuration of Keda component..
             * 
             * @param kedaConfiguration The configuration of Keda component.
             * @return the next definition stage.
             */
            WithCreate withKedaConfiguration(KedaConfiguration kedaConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify daprConfiguration.
         */
        interface WithDaprConfiguration {
            /**
             * Specifies the daprConfiguration property: The configuration of Dapr component..
             * 
             * @param daprConfiguration The configuration of Dapr component.
             * @return the next definition stage.
             */
            WithCreate withDaprConfiguration(DaprConfiguration daprConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify infrastructureResourceGroup.
         */
        interface WithInfrastructureResourceGroup {
            /**
             * Specifies the infrastructureResourceGroup property: Name of the platform-managed resource group created
             * for the Managed Environment to host infrastructure resources. If a subnet ID is provided, this resource
             * group will be created in the same subscription as the subnet..
             * 
             * @param infrastructureResourceGroup Name of the platform-managed resource group created for the Managed
             * Environment to host infrastructure resources. If a subnet ID is provided, this resource group will be
             * created in the same subscription as the subnet.
             * @return the next definition stage.
             */
            WithCreate withInfrastructureResourceGroup(String infrastructureResourceGroup);
        }

        /**
         * The stage of the ManagedEnvironment definition allowing to specify peerAuthentication.
         */
        interface WithPeerAuthentication {
            /**
             * Specifies the peerAuthentication property: Peer authentication settings for the Managed Environment.
             * 
             * @param peerAuthentication Peer authentication settings for the Managed Environment.
             * @return the next definition stage.
             */
            WithCreate withPeerAuthentication(ManagedEnvironmentPropertiesPeerAuthentication peerAuthentication);
        }
    }

    /**
     * Begins update for the ManagedEnvironment resource.
     * 
     * @return the stage of resource update.
     */
    ManagedEnvironment.Update update();

    /**
     * The template for ManagedEnvironment update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithKind, UpdateStages.WithIdentity,
        UpdateStages.WithDaprAIInstrumentationKey, UpdateStages.WithDaprAIConnectionString,
        UpdateStages.WithVnetConfiguration, UpdateStages.WithAppLogsConfiguration,
        UpdateStages.WithAppInsightsConfiguration, UpdateStages.WithOpenTelemetryConfiguration,
        UpdateStages.WithCustomDomainConfiguration, UpdateStages.WithWorkloadProfiles,
        UpdateStages.WithKedaConfiguration, UpdateStages.WithDaprConfiguration, UpdateStages.WithPeerAuthentication {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ManagedEnvironment apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedEnvironment apply(Context context);
    }

    /**
     * The ManagedEnvironment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ManagedEnvironment update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of the Environment..
             * 
             * @param kind Kind of the Environment.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed identities for the Managed Environment to interact with other
             * Azure services without maintaining any secrets or credentials in code..
             * 
             * @param identity Managed identities for the Managed Environment to interact with other Azure services
             * without maintaining any secrets or credentials in code.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify daprAIInstrumentationKey.
         */
        interface WithDaprAIInstrumentationKey {
            /**
             * Specifies the daprAIInstrumentationKey property: Azure Monitor instrumentation key used by Dapr to export
             * Service to Service communication telemetry.
             * 
             * @param daprAIInstrumentationKey Azure Monitor instrumentation key used by Dapr to export Service to
             * Service communication telemetry.
             * @return the next definition stage.
             */
            Update withDaprAIInstrumentationKey(String daprAIInstrumentationKey);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify daprAIConnectionString.
         */
        interface WithDaprAIConnectionString {
            /**
             * Specifies the daprAIConnectionString property: Application Insights connection string used by Dapr to
             * export Service to Service communication telemetry.
             * 
             * @param daprAIConnectionString Application Insights connection string used by Dapr to export Service to
             * Service communication telemetry.
             * @return the next definition stage.
             */
            Update withDaprAIConnectionString(String daprAIConnectionString);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify vnetConfiguration.
         */
        interface WithVnetConfiguration {
            /**
             * Specifies the vnetConfiguration property: Vnet configuration for the environment.
             * 
             * @param vnetConfiguration Vnet configuration for the environment.
             * @return the next definition stage.
             */
            Update withVnetConfiguration(VnetConfiguration vnetConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify appLogsConfiguration.
         */
        interface WithAppLogsConfiguration {
            /**
             * Specifies the appLogsConfiguration property: Cluster configuration which enables the log daemon to export
             * app logs to a destination. Currently only "log-analytics" is
             * supported.
             * 
             * @param appLogsConfiguration Cluster configuration which enables the log daemon to export
             * app logs to a destination. Currently only "log-analytics" is
             * supported.
             * @return the next definition stage.
             */
            Update withAppLogsConfiguration(AppLogsConfiguration appLogsConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify appInsightsConfiguration.
         */
        interface WithAppInsightsConfiguration {
            /**
             * Specifies the appInsightsConfiguration property: Environment level Application Insights configuration.
             * 
             * @param appInsightsConfiguration Environment level Application Insights configuration.
             * @return the next definition stage.
             */
            Update withAppInsightsConfiguration(AppInsightsConfiguration appInsightsConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify openTelemetryConfiguration.
         */
        interface WithOpenTelemetryConfiguration {
            /**
             * Specifies the openTelemetryConfiguration property: Environment Open Telemetry configuration.
             * 
             * @param openTelemetryConfiguration Environment Open Telemetry configuration.
             * @return the next definition stage.
             */
            Update withOpenTelemetryConfiguration(OpenTelemetryConfiguration openTelemetryConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify customDomainConfiguration.
         */
        interface WithCustomDomainConfiguration {
            /**
             * Specifies the customDomainConfiguration property: Custom domain configuration for the environment.
             * 
             * @param customDomainConfiguration Custom domain configuration for the environment.
             * @return the next definition stage.
             */
            Update withCustomDomainConfiguration(CustomDomainConfiguration customDomainConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify workloadProfiles.
         */
        interface WithWorkloadProfiles {
            /**
             * Specifies the workloadProfiles property: Workload profiles configured for the Managed Environment..
             * 
             * @param workloadProfiles Workload profiles configured for the Managed Environment.
             * @return the next definition stage.
             */
            Update withWorkloadProfiles(List<WorkloadProfile> workloadProfiles);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify kedaConfiguration.
         */
        interface WithKedaConfiguration {
            /**
             * Specifies the kedaConfiguration property: The configuration of Keda component..
             * 
             * @param kedaConfiguration The configuration of Keda component.
             * @return the next definition stage.
             */
            Update withKedaConfiguration(KedaConfiguration kedaConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify daprConfiguration.
         */
        interface WithDaprConfiguration {
            /**
             * Specifies the daprConfiguration property: The configuration of Dapr component..
             * 
             * @param daprConfiguration The configuration of Dapr component.
             * @return the next definition stage.
             */
            Update withDaprConfiguration(DaprConfiguration daprConfiguration);
        }

        /**
         * The stage of the ManagedEnvironment update allowing to specify peerAuthentication.
         */
        interface WithPeerAuthentication {
            /**
             * Specifies the peerAuthentication property: Peer authentication settings for the Managed Environment.
             * 
             * @param peerAuthentication Peer authentication settings for the Managed Environment.
             * @return the next definition stage.
             */
            Update withPeerAuthentication(ManagedEnvironmentPropertiesPeerAuthentication peerAuthentication);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ManagedEnvironment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedEnvironment refresh(Context context);

    /**
     * Get auth token for a managed environment
     * 
     * Checks if resource name is available.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment Auth Token along with {@link Response}.
     */
    Response<EnvironmentAuthToken> getAuthTokenWithResponse(Context context);

    /**
     * Get auth token for a managed environment
     * 
     * Checks if resource name is available.
     * 
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment Auth Token.
     */
    EnvironmentAuthToken getAuthToken();
}
