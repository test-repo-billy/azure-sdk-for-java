// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.healthcareapis.fluent.models.FhirServiceInner;
import com.azure.resourcemanager.healthcareapis.models.Encryption;
import com.azure.resourcemanager.healthcareapis.models.FhirService;
import com.azure.resourcemanager.healthcareapis.models.FhirServiceAcrConfiguration;
import com.azure.resourcemanager.healthcareapis.models.FhirServiceAuthenticationConfiguration;
import com.azure.resourcemanager.healthcareapis.models.FhirServiceCorsConfiguration;
import com.azure.resourcemanager.healthcareapis.models.FhirServiceExportConfiguration;
import com.azure.resourcemanager.healthcareapis.models.FhirServiceImportConfiguration;
import com.azure.resourcemanager.healthcareapis.models.FhirServiceKind;
import com.azure.resourcemanager.healthcareapis.models.FhirServicePatchResource;
import com.azure.resourcemanager.healthcareapis.models.ImplementationGuidesConfiguration;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpointConnection;
import com.azure.resourcemanager.healthcareapis.models.ProvisioningState;
import com.azure.resourcemanager.healthcareapis.models.PublicNetworkAccess;
import com.azure.resourcemanager.healthcareapis.models.ResourceVersionPolicyConfiguration;
import com.azure.resourcemanager.healthcareapis.models.ServiceEventState;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityIdentity;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class FhirServiceImpl implements FhirService, FhirService.Definition, FhirService.Update {
    private FhirServiceInner innerObject;

    private final com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public FhirServiceKind kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ServiceManagedIdentityIdentity identity() {
        return this.innerModel().identity();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public FhirServiceAcrConfiguration acrConfiguration() {
        return this.innerModel().acrConfiguration();
    }

    public FhirServiceAuthenticationConfiguration authenticationConfiguration() {
        return this.innerModel().authenticationConfiguration();
    }

    public FhirServiceCorsConfiguration corsConfiguration() {
        return this.innerModel().corsConfiguration();
    }

    public FhirServiceExportConfiguration exportConfiguration() {
        return this.innerModel().exportConfiguration();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnection> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public ServiceEventState eventState() {
        return this.innerModel().eventState();
    }

    public ResourceVersionPolicyConfiguration resourceVersionPolicyConfiguration() {
        return this.innerModel().resourceVersionPolicyConfiguration();
    }

    public FhirServiceImportConfiguration importConfiguration() {
        return this.innerModel().importConfiguration();
    }

    public ImplementationGuidesConfiguration implementationGuidesConfiguration() {
        return this.innerModel().implementationGuidesConfiguration();
    }

    public Encryption encryption() {
        return this.innerModel().encryption();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public FhirServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String fhirServiceName;

    private FhirServicePatchResource updateFhirservicePatchResource;

    public FhirServiceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public FhirService create() {
        this.innerObject = serviceManager.serviceClient().getFhirServices().createOrUpdate(resourceGroupName,
            workspaceName, fhirServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public FhirService create(Context context) {
        this.innerObject = serviceManager.serviceClient().getFhirServices().createOrUpdate(resourceGroupName,
            workspaceName, fhirServiceName, this.innerModel(), context);
        return this;
    }

    FhirServiceImpl(String name, com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerObject = new FhirServiceInner();
        this.serviceManager = serviceManager;
        this.fhirServiceName = name;
    }

    public FhirServiceImpl update() {
        this.updateFhirservicePatchResource = new FhirServicePatchResource();
        return this;
    }

    public FhirService apply() {
        this.innerObject = serviceManager.serviceClient().getFhirServices().update(resourceGroupName, fhirServiceName,
            workspaceName, updateFhirservicePatchResource, Context.NONE);
        return this;
    }

    public FhirService apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getFhirServices().update(resourceGroupName, fhirServiceName,
            workspaceName, updateFhirservicePatchResource, context);
        return this;
    }

    FhirServiceImpl(FhirServiceInner innerObject,
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.fhirServiceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "fhirservices");
        this.workspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaces");
    }

    public FhirService refresh() {
        this.innerObject = serviceManager.serviceClient().getFhirServices()
            .getWithResponse(resourceGroupName, workspaceName, fhirServiceName, Context.NONE).getValue();
        return this;
    }

    public FhirService refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getFhirServices()
            .getWithResponse(resourceGroupName, workspaceName, fhirServiceName, context).getValue();
        return this;
    }

    public FhirServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public FhirServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public FhirServiceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateFhirservicePatchResource.withTags(tags);
            return this;
        }
    }

    public FhirServiceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public FhirServiceImpl withKind(FhirServiceKind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public FhirServiceImpl withIdentity(ServiceManagedIdentityIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateFhirservicePatchResource.withIdentity(identity);
            return this;
        }
    }

    public FhirServiceImpl withAcrConfiguration(FhirServiceAcrConfiguration acrConfiguration) {
        this.innerModel().withAcrConfiguration(acrConfiguration);
        return this;
    }

    public FhirServiceImpl
        withAuthenticationConfiguration(FhirServiceAuthenticationConfiguration authenticationConfiguration) {
        this.innerModel().withAuthenticationConfiguration(authenticationConfiguration);
        return this;
    }

    public FhirServiceImpl withCorsConfiguration(FhirServiceCorsConfiguration corsConfiguration) {
        this.innerModel().withCorsConfiguration(corsConfiguration);
        return this;
    }

    public FhirServiceImpl withExportConfiguration(FhirServiceExportConfiguration exportConfiguration) {
        this.innerModel().withExportConfiguration(exportConfiguration);
        return this;
    }

    public FhirServiceImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    public FhirServiceImpl
        withResourceVersionPolicyConfiguration(ResourceVersionPolicyConfiguration resourceVersionPolicyConfiguration) {
        this.innerModel().withResourceVersionPolicyConfiguration(resourceVersionPolicyConfiguration);
        return this;
    }

    public FhirServiceImpl withImportConfiguration(FhirServiceImportConfiguration importConfiguration) {
        this.innerModel().withImportConfiguration(importConfiguration);
        return this;
    }

    public FhirServiceImpl
        withImplementationGuidesConfiguration(ImplementationGuidesConfiguration implementationGuidesConfiguration) {
        this.innerModel().withImplementationGuidesConfiguration(implementationGuidesConfiguration);
        return this;
    }

    public FhirServiceImpl withEncryption(Encryption encryption) {
        this.innerModel().withEncryption(encryption);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
