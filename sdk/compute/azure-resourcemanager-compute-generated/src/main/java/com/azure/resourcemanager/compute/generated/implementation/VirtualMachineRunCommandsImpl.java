// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineRunCommandsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.RunCommandDocumentBaseInner;
import com.azure.resourcemanager.compute.generated.fluent.models.RunCommandDocumentInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineRunCommandInner;
import com.azure.resourcemanager.compute.generated.models.RunCommandDocument;
import com.azure.resourcemanager.compute.generated.models.RunCommandDocumentBase;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommand;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineRunCommands;

public final class VirtualMachineRunCommandsImpl implements VirtualMachineRunCommands {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineRunCommandsImpl.class);

    private final VirtualMachineRunCommandsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public VirtualMachineRunCommandsImpl(VirtualMachineRunCommandsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RunCommandDocumentBase> list(String location) {
        PagedIterable<RunCommandDocumentBaseInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new RunCommandDocumentBaseImpl(inner1, this.manager()));
    }

    public PagedIterable<RunCommandDocumentBase> list(String location, Context context) {
        PagedIterable<RunCommandDocumentBaseInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new RunCommandDocumentBaseImpl(inner1, this.manager()));
    }

    public Response<RunCommandDocument> getWithResponse(String location, String commandId, Context context) {
        Response<RunCommandDocumentInner> inner = this.serviceClient().getWithResponse(location, commandId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RunCommandDocumentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RunCommandDocument get(String location, String commandId) {
        RunCommandDocumentInner inner = this.serviceClient().get(location, commandId);
        if (inner != null) {
            return new RunCommandDocumentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String vmName, String runCommandName) {
        this.serviceClient().delete(resourceGroupName, vmName, runCommandName);
    }

    public void delete(String resourceGroupName, String vmName, String runCommandName, Context context) {
        this.serviceClient().delete(resourceGroupName, vmName, runCommandName, context);
    }

    public Response<VirtualMachineRunCommand> getByVirtualMachineWithResponse(String resourceGroupName, String vmName,
        String runCommandName, String expand, Context context) {
        Response<VirtualMachineRunCommandInner> inner = this.serviceClient()
            .getByVirtualMachineWithResponse(resourceGroupName, vmName, runCommandName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VirtualMachineRunCommandImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineRunCommand getByVirtualMachine(String resourceGroupName, String vmName,
        String runCommandName) {
        VirtualMachineRunCommandInner inner
            = this.serviceClient().getByVirtualMachine(resourceGroupName, vmName, runCommandName);
        if (inner != null) {
            return new VirtualMachineRunCommandImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualMachineRunCommand> listByVirtualMachine(String resourceGroupName, String vmName) {
        PagedIterable<VirtualMachineRunCommandInner> inner
            = this.serviceClient().listByVirtualMachine(resourceGroupName, vmName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineRunCommandImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineRunCommand> listByVirtualMachine(String resourceGroupName, String vmName,
        String expand, Context context) {
        PagedIterable<VirtualMachineRunCommandInner> inner
            = this.serviceClient().listByVirtualMachine(resourceGroupName, vmName, expand, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineRunCommandImpl(inner1, this.manager()));
    }

    public VirtualMachineRunCommand getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String runCommandName = Utils.getValueFromIdByName(id, "runCommands");
        if (runCommandName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'runCommands'.", id)));
        }
        String localExpand = null;
        return this
            .getByVirtualMachineWithResponse(resourceGroupName, vmName, runCommandName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<VirtualMachineRunCommand> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String runCommandName = Utils.getValueFromIdByName(id, "runCommands");
        if (runCommandName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'runCommands'.", id)));
        }
        return this.getByVirtualMachineWithResponse(resourceGroupName, vmName, runCommandName, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String runCommandName = Utils.getValueFromIdByName(id, "runCommands");
        if (runCommandName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'runCommands'.", id)));
        }
        this.delete(resourceGroupName, vmName, runCommandName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String runCommandName = Utils.getValueFromIdByName(id, "runCommands");
        if (runCommandName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'runCommands'.", id)));
        }
        this.delete(resourceGroupName, vmName, runCommandName, context);
    }

    private VirtualMachineRunCommandsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineRunCommandImpl define(String name) {
        return new VirtualMachineRunCommandImpl(name, this.manager());
    }
}
