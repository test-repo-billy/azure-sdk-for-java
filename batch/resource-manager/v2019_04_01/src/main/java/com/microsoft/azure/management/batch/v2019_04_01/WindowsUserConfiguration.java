/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties used to create a user account on a Windows node.
 */
public class WindowsUserConfiguration {
    /**
     * Login mode for user.
     * Specifies login mode for the user. The default value for
     * VirtualMachineConfiguration pools is interactive mode and for
     * CloudServiceConfiguration pools is batch mode. Possible values include:
     * 'Batch', 'Interactive'.
     */
    @JsonProperty(value = "loginMode")
    private LoginMode loginMode;

    /**
     * Get specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode. Possible values include: 'Batch', 'Interactive'.
     *
     * @return the loginMode value
     */
    public LoginMode loginMode() {
        return this.loginMode;
    }

    /**
     * Set specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode. Possible values include: 'Batch', 'Interactive'.
     *
     * @param loginMode the loginMode value to set
     * @return the WindowsUserConfiguration object itself.
     */
    public WindowsUserConfiguration withLoginMode(LoginMode loginMode) {
        this.loginMode = loginMode;
        return this;
    }

}
