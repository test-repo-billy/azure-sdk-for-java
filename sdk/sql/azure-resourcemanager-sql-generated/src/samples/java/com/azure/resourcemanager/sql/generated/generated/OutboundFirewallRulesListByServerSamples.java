// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

/**
 * Samples for OutboundFirewallRules ListByServer.
 */
public final class OutboundFirewallRulesListByServerSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2021-02-01-preview/examples/OutboundFirewallRuleList.
     * json
     */
    /**
     * Sample code: Gets list of outbound firewall rules on a server.
     * 
     * @param manager Entry point to SqlManager.
     */
    public static void
        getsListOfOutboundFirewallRulesOnAServer(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.outboundFirewallRules().listByServer("sqlcrudtest-7398", "sqlcrudtest-4645",
            com.azure.core.util.Context.NONE);
    }
}
