/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import com.microsoft.azure.management.appservice.v2016_09_01.AddressResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2016_09_01.VirtualIPMapping;

class AddressResponseImpl extends WrapperImpl<AddressResponseInner> implements AddressResponse {
    private final WebManager manager;
    AddressResponseImpl(AddressResponseInner inner, WebManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    public String internalIpAddress() {
        return this.inner().internalIpAddress();
    }

    @Override
    public List<String> outboundIpAddresses() {
        return this.inner().outboundIpAddresses();
    }

    @Override
    public String serviceIpAddress() {
        return this.inner().serviceIpAddress();
    }

    @Override
    public List<VirtualIPMapping> vipMappings() {
        return this.inner().vipMappings();
    }

}
