// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.models.KeyVaultSecretReference;
import com.azure.resourcemanager.compute.generated.models.SubResourceReadOnly;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a Virtual Machine Scale Set Extension.
 */
@Fluent
public final class VirtualMachineScaleSetExtensionInner extends SubResourceReadOnly {
    /*
     * The name of the extension.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Describes the properties of a Virtual Machine Scale Set Extension.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineScaleSetExtensionProperties innerProperties;

    /**
     * Creates an instance of VirtualMachineScaleSetExtensionInner class.
     */
    public VirtualMachineScaleSetExtensionInner() {
    }

    /**
     * Get the name property: The name of the extension.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the extension.
     * 
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Describes the properties of a Virtual Machine Scale Set Extension.
     * 
     * @return the innerProperties value.
     */
    private VirtualMachineScaleSetExtensionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the forceUpdateTag property: If a value is provided and is different from the previous value, the extension
     * handler will be forced to update even if the extension configuration has not changed.
     * 
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.innerProperties() == null ? null : this.innerProperties().forceUpdateTag();
    }

    /**
     * Set the forceUpdateTag property: If a value is provided and is different from the previous value, the extension
     * handler will be forced to update even if the extension configuration has not changed.
     * 
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withForceUpdateTag(String forceUpdateTag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withForceUpdateTag(forceUpdateTag);
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerProperties() == null ? null : this.innerProperties().publisher();
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     * 
     * @param publisher the publisher value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withPublisher(String publisher) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withPublisher(publisher);
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @return the type value.
     */
    public String typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @param type the type value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withTypePropertiesType(String type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().typeHandlerVersion();
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withTypeHandlerVersion(String typeHandlerVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withTypeHandlerVersion(typeHandlerVersion);
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     * 
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().autoUpgradeMinorVersion();
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     * 
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     * 
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.innerProperties() == null ? null : this.innerProperties().enableAutomaticUpgrade();
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     * 
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withEnableAutomaticUpgrade(enableAutomaticUpgrade);
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     * 
     * @return the settings value.
     */
    public Object settings() {
        return this.innerProperties() == null ? null : this.innerProperties().settings();
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     * 
     * @param settings the settings value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withSettings(Object settings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withSettings(settings);
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     * 
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().protectedSettings();
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     * 
     * @param protectedSettings the protectedSettings value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withProtectedSettings(Object protectedSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withProtectedSettings(protectedSettings);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the provisionAfterExtensions property: Collection of extension names after which this extension needs to be
     * provisioned.
     * 
     * @return the provisionAfterExtensions value.
     */
    public List<String> provisionAfterExtensions() {
        return this.innerProperties() == null ? null : this.innerProperties().provisionAfterExtensions();
    }

    /**
     * Set the provisionAfterExtensions property: Collection of extension names after which this extension needs to be
     * provisioned.
     * 
     * @param provisionAfterExtensions the provisionAfterExtensions value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withProvisionAfterExtensions(List<String> provisionAfterExtensions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withProvisionAfterExtensions(provisionAfterExtensions);
        return this;
    }

    /**
     * Get the suppressFailures property: Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed regardless of this value). The
     * default is false.
     * 
     * @return the suppressFailures value.
     */
    public Boolean suppressFailures() {
        return this.innerProperties() == null ? null : this.innerProperties().suppressFailures();
    }

    /**
     * Set the suppressFailures property: Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed regardless of this value). The
     * default is false.
     * 
     * @param suppressFailures the suppressFailures value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner withSuppressFailures(Boolean suppressFailures) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withSuppressFailures(suppressFailures);
        return this;
    }

    /**
     * Get the protectedSettingsFromKeyVault property: The extensions protected settings that are passed by reference,
     * and consumed from key vault.
     * 
     * @return the protectedSettingsFromKeyVault value.
     */
    public KeyVaultSecretReference protectedSettingsFromKeyVault() {
        return this.innerProperties() == null ? null : this.innerProperties().protectedSettingsFromKeyVault();
    }

    /**
     * Set the protectedSettingsFromKeyVault property: The extensions protected settings that are passed by reference,
     * and consumed from key vault.
     * 
     * @param protectedSettingsFromKeyVault the protectedSettingsFromKeyVault value to set.
     * @return the VirtualMachineScaleSetExtensionInner object itself.
     */
    public VirtualMachineScaleSetExtensionInner
        withProtectedSettingsFromKeyVault(KeyVaultSecretReference protectedSettingsFromKeyVault) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetExtensionProperties();
        }
        this.innerProperties().withProtectedSettingsFromKeyVault(protectedSettingsFromKeyVault);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
