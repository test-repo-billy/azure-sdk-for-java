// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.NatRulesClient;
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayNatRuleInner;
import com.azure.resourcemanager.network.generated.models.NatRules;
import com.azure.resourcemanager.network.generated.models.VpnGatewayNatRule;

public final class NatRulesImpl implements NatRules {
    private static final ClientLogger LOGGER = new ClientLogger(NatRulesImpl.class);

    private final NatRulesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public NatRulesImpl(NatRulesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<VpnGatewayNatRule> getWithResponse(String resourceGroupName, String gatewayName, String natRuleName,
        Context context) {
        Response<VpnGatewayNatRuleInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, gatewayName, natRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VpnGatewayNatRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VpnGatewayNatRule get(String resourceGroupName, String gatewayName, String natRuleName) {
        VpnGatewayNatRuleInner inner = this.serviceClient().get(resourceGroupName, gatewayName, natRuleName);
        if (inner != null) {
            return new VpnGatewayNatRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String gatewayName, String natRuleName) {
        this.serviceClient().delete(resourceGroupName, gatewayName, natRuleName);
    }

    public void delete(String resourceGroupName, String gatewayName, String natRuleName, Context context) {
        this.serviceClient().delete(resourceGroupName, gatewayName, natRuleName, context);
    }

    public PagedIterable<VpnGatewayNatRule> listByVpnGateway(String resourceGroupName, String gatewayName) {
        PagedIterable<VpnGatewayNatRuleInner> inner
            = this.serviceClient().listByVpnGateway(resourceGroupName, gatewayName);
        return Utils.mapPage(inner, inner1 -> new VpnGatewayNatRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnGatewayNatRule> listByVpnGateway(String resourceGroupName, String gatewayName,
        Context context) {
        PagedIterable<VpnGatewayNatRuleInner> inner
            = this.serviceClient().listByVpnGateway(resourceGroupName, gatewayName, context);
        return Utils.mapPage(inner, inner1 -> new VpnGatewayNatRuleImpl(inner1, this.manager()));
    }

    public VpnGatewayNatRule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = Utils.getValueFromIdByName(id, "vpnGateways");
        if (gatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnGateways'.", id)));
        }
        String natRuleName = Utils.getValueFromIdByName(id, "natRules");
        if (natRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'natRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, gatewayName, natRuleName, Context.NONE).getValue();
    }

    public Response<VpnGatewayNatRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = Utils.getValueFromIdByName(id, "vpnGateways");
        if (gatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnGateways'.", id)));
        }
        String natRuleName = Utils.getValueFromIdByName(id, "natRules");
        if (natRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'natRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, gatewayName, natRuleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = Utils.getValueFromIdByName(id, "vpnGateways");
        if (gatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnGateways'.", id)));
        }
        String natRuleName = Utils.getValueFromIdByName(id, "natRules");
        if (natRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'natRules'.", id)));
        }
        this.delete(resourceGroupName, gatewayName, natRuleName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String gatewayName = Utils.getValueFromIdByName(id, "vpnGateways");
        if (gatewayName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vpnGateways'.", id)));
        }
        String natRuleName = Utils.getValueFromIdByName(id, "natRules");
        if (natRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'natRules'.", id)));
        }
        this.delete(resourceGroupName, gatewayName, natRuleName, context);
    }

    private NatRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public VpnGatewayNatRuleImpl define(String name) {
        return new VpnGatewayNatRuleImpl(name, this.manager());
    }
}
