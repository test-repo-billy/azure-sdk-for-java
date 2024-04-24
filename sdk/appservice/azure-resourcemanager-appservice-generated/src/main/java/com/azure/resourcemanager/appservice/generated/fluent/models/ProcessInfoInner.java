// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Process Information.
 */
@Fluent
public final class ProcessInfoInner extends ProxyOnlyResource {
    /*
     * ProcessInfo resource specific properties
     */
    @JsonProperty(value = "properties")
    private ProcessInfoProperties innerProperties;

    /**
     * Creates an instance of ProcessInfoInner class.
     */
    public ProcessInfoInner() {
    }

    /**
     * Get the innerProperties property: ProcessInfo resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private ProcessInfoProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProcessInfoInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the identifier property: ARM Identifier for deployment.
     * 
     * @return the identifier value.
     */
    public Integer identifier() {
        return this.innerProperties() == null ? null : this.innerProperties().identifier();
    }

    /**
     * Get the deploymentName property: Deployment name.
     * 
     * @return the deploymentName value.
     */
    public String deploymentName() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentName();
    }

    /**
     * Set the deploymentName property: Deployment name.
     * 
     * @param deploymentName the deploymentName value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withDeploymentName(String deploymentName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withDeploymentName(deploymentName);
        return this;
    }

    /**
     * Get the href property: HRef URI.
     * 
     * @return the href value.
     */
    public String href() {
        return this.innerProperties() == null ? null : this.innerProperties().href();
    }

    /**
     * Set the href property: HRef URI.
     * 
     * @param href the href value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withHref(String href) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withHref(href);
        return this;
    }

    /**
     * Get the minidump property: Minidump URI.
     * 
     * @return the minidump value.
     */
    public String minidump() {
        return this.innerProperties() == null ? null : this.innerProperties().minidump();
    }

    /**
     * Set the minidump property: Minidump URI.
     * 
     * @param minidump the minidump value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withMinidump(String minidump) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withMinidump(minidump);
        return this;
    }

    /**
     * Get the isProfileRunning property: Is profile running?.
     * 
     * @return the isProfileRunning value.
     */
    public Boolean isProfileRunning() {
        return this.innerProperties() == null ? null : this.innerProperties().isProfileRunning();
    }

    /**
     * Set the isProfileRunning property: Is profile running?.
     * 
     * @param isProfileRunning the isProfileRunning value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIsProfileRunning(Boolean isProfileRunning) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withIsProfileRunning(isProfileRunning);
        return this;
    }

    /**
     * Get the isIisProfileRunning property: Is the IIS Profile running?.
     * 
     * @return the isIisProfileRunning value.
     */
    public Boolean isIisProfileRunning() {
        return this.innerProperties() == null ? null : this.innerProperties().isIisProfileRunning();
    }

    /**
     * Set the isIisProfileRunning property: Is the IIS Profile running?.
     * 
     * @param isIisProfileRunning the isIisProfileRunning value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIsIisProfileRunning(Boolean isIisProfileRunning) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withIsIisProfileRunning(isIisProfileRunning);
        return this;
    }

    /**
     * Get the iisProfileTimeoutInSeconds property: IIS Profile timeout (seconds).
     * 
     * @return the iisProfileTimeoutInSeconds value.
     */
    public Double iisProfileTimeoutInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().iisProfileTimeoutInSeconds();
    }

    /**
     * Set the iisProfileTimeoutInSeconds property: IIS Profile timeout (seconds).
     * 
     * @param iisProfileTimeoutInSeconds the iisProfileTimeoutInSeconds value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIisProfileTimeoutInSeconds(Double iisProfileTimeoutInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withIisProfileTimeoutInSeconds(iisProfileTimeoutInSeconds);
        return this;
    }

    /**
     * Get the parent property: Parent process.
     * 
     * @return the parent value.
     */
    public String parent() {
        return this.innerProperties() == null ? null : this.innerProperties().parent();
    }

    /**
     * Set the parent property: Parent process.
     * 
     * @param parent the parent value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withParent(String parent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withParent(parent);
        return this;
    }

    /**
     * Get the children property: Child process list.
     * 
     * @return the children value.
     */
    public List<String> children() {
        return this.innerProperties() == null ? null : this.innerProperties().children();
    }

    /**
     * Set the children property: Child process list.
     * 
     * @param children the children value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withChildren(List<String> children) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withChildren(children);
        return this;
    }

    /**
     * Get the threads property: Thread list.
     * 
     * @return the threads value.
     */
    public List<ProcessThreadInfoInner> threads() {
        return this.innerProperties() == null ? null : this.innerProperties().threads();
    }

    /**
     * Set the threads property: Thread list.
     * 
     * @param threads the threads value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withThreads(List<ProcessThreadInfoInner> threads) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withThreads(threads);
        return this;
    }

    /**
     * Get the openFileHandles property: List of open files.
     * 
     * @return the openFileHandles value.
     */
    public List<String> openFileHandles() {
        return this.innerProperties() == null ? null : this.innerProperties().openFileHandles();
    }

    /**
     * Set the openFileHandles property: List of open files.
     * 
     * @param openFileHandles the openFileHandles value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withOpenFileHandles(List<String> openFileHandles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withOpenFileHandles(openFileHandles);
        return this;
    }

    /**
     * Get the modules property: List of modules.
     * 
     * @return the modules value.
     */
    public List<ProcessModuleInfoInner> modules() {
        return this.innerProperties() == null ? null : this.innerProperties().modules();
    }

    /**
     * Set the modules property: List of modules.
     * 
     * @param modules the modules value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withModules(List<ProcessModuleInfoInner> modules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withModules(modules);
        return this;
    }

    /**
     * Get the fileName property: File name of this process.
     * 
     * @return the fileName value.
     */
    public String fileName() {
        return this.innerProperties() == null ? null : this.innerProperties().fileName();
    }

    /**
     * Set the fileName property: File name of this process.
     * 
     * @param fileName the fileName value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withFileName(String fileName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the commandLine property: Command line.
     * 
     * @return the commandLine value.
     */
    public String commandLine() {
        return this.innerProperties() == null ? null : this.innerProperties().commandLine();
    }

    /**
     * Set the commandLine property: Command line.
     * 
     * @param commandLine the commandLine value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withCommandLine(String commandLine) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withCommandLine(commandLine);
        return this;
    }

    /**
     * Get the username property: User name.
     * 
     * @return the username value.
     */
    public String username() {
        return this.innerProperties() == null ? null : this.innerProperties().username();
    }

    /**
     * Set the username property: User name.
     * 
     * @param username the username value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withUsername(String username) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withUsername(username);
        return this;
    }

    /**
     * Get the handleCount property: Handle count.
     * 
     * @return the handleCount value.
     */
    public Integer handleCount() {
        return this.innerProperties() == null ? null : this.innerProperties().handleCount();
    }

    /**
     * Set the handleCount property: Handle count.
     * 
     * @param handleCount the handleCount value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withHandleCount(Integer handleCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withHandleCount(handleCount);
        return this;
    }

    /**
     * Get the moduleCount property: Module count.
     * 
     * @return the moduleCount value.
     */
    public Integer moduleCount() {
        return this.innerProperties() == null ? null : this.innerProperties().moduleCount();
    }

    /**
     * Set the moduleCount property: Module count.
     * 
     * @param moduleCount the moduleCount value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withModuleCount(Integer moduleCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withModuleCount(moduleCount);
        return this;
    }

    /**
     * Get the threadCount property: Thread count.
     * 
     * @return the threadCount value.
     */
    public Integer threadCount() {
        return this.innerProperties() == null ? null : this.innerProperties().threadCount();
    }

    /**
     * Set the threadCount property: Thread count.
     * 
     * @param threadCount the threadCount value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withThreadCount(Integer threadCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withThreadCount(threadCount);
        return this;
    }

    /**
     * Get the startTime property: Start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: Start time.
     * 
     * @param startTime the startTime value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the totalCpuTime property: Total CPU time.
     * 
     * @return the totalCpuTime value.
     */
    public String totalCpuTime() {
        return this.innerProperties() == null ? null : this.innerProperties().totalCpuTime();
    }

    /**
     * Set the totalCpuTime property: Total CPU time.
     * 
     * @param totalCpuTime the totalCpuTime value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withTotalCpuTime(String totalCpuTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withTotalCpuTime(totalCpuTime);
        return this;
    }

    /**
     * Get the userCpuTime property: User CPU time.
     * 
     * @return the userCpuTime value.
     */
    public String userCpuTime() {
        return this.innerProperties() == null ? null : this.innerProperties().userCpuTime();
    }

    /**
     * Set the userCpuTime property: User CPU time.
     * 
     * @param userCpuTime the userCpuTime value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withUserCpuTime(String userCpuTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withUserCpuTime(userCpuTime);
        return this;
    }

    /**
     * Get the privilegedCpuTime property: Privileged CPU time.
     * 
     * @return the privilegedCpuTime value.
     */
    public String privilegedCpuTime() {
        return this.innerProperties() == null ? null : this.innerProperties().privilegedCpuTime();
    }

    /**
     * Set the privilegedCpuTime property: Privileged CPU time.
     * 
     * @param privilegedCpuTime the privilegedCpuTime value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPrivilegedCpuTime(String privilegedCpuTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withPrivilegedCpuTime(privilegedCpuTime);
        return this;
    }

    /**
     * Get the workingSet property: Working set.
     * 
     * @return the workingSet value.
     */
    public Long workingSet() {
        return this.innerProperties() == null ? null : this.innerProperties().workingSet();
    }

    /**
     * Set the workingSet property: Working set.
     * 
     * @param workingSet the workingSet value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withWorkingSet(Long workingSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withWorkingSet(workingSet);
        return this;
    }

    /**
     * Get the peakWorkingSet property: Peak working set.
     * 
     * @return the peakWorkingSet value.
     */
    public Long peakWorkingSet() {
        return this.innerProperties() == null ? null : this.innerProperties().peakWorkingSet();
    }

    /**
     * Set the peakWorkingSet property: Peak working set.
     * 
     * @param peakWorkingSet the peakWorkingSet value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPeakWorkingSet(Long peakWorkingSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withPeakWorkingSet(peakWorkingSet);
        return this;
    }

    /**
     * Get the privateMemory property: Private memory size.
     * 
     * @return the privateMemory value.
     */
    public Long privateMemory() {
        return this.innerProperties() == null ? null : this.innerProperties().privateMemory();
    }

    /**
     * Set the privateMemory property: Private memory size.
     * 
     * @param privateMemory the privateMemory value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPrivateMemory(Long privateMemory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withPrivateMemory(privateMemory);
        return this;
    }

    /**
     * Get the virtualMemory property: Virtual memory size.
     * 
     * @return the virtualMemory value.
     */
    public Long virtualMemory() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMemory();
    }

    /**
     * Set the virtualMemory property: Virtual memory size.
     * 
     * @param virtualMemory the virtualMemory value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withVirtualMemory(Long virtualMemory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withVirtualMemory(virtualMemory);
        return this;
    }

    /**
     * Get the peakVirtualMemory property: Peak virtual memory usage.
     * 
     * @return the peakVirtualMemory value.
     */
    public Long peakVirtualMemory() {
        return this.innerProperties() == null ? null : this.innerProperties().peakVirtualMemory();
    }

    /**
     * Set the peakVirtualMemory property: Peak virtual memory usage.
     * 
     * @param peakVirtualMemory the peakVirtualMemory value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPeakVirtualMemory(Long peakVirtualMemory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withPeakVirtualMemory(peakVirtualMemory);
        return this;
    }

    /**
     * Get the pagedSystemMemory property: Paged system memory.
     * 
     * @return the pagedSystemMemory value.
     */
    public Long pagedSystemMemory() {
        return this.innerProperties() == null ? null : this.innerProperties().pagedSystemMemory();
    }

    /**
     * Set the pagedSystemMemory property: Paged system memory.
     * 
     * @param pagedSystemMemory the pagedSystemMemory value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPagedSystemMemory(Long pagedSystemMemory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withPagedSystemMemory(pagedSystemMemory);
        return this;
    }

    /**
     * Get the nonPagedSystemMemory property: Non-paged system memory.
     * 
     * @return the nonPagedSystemMemory value.
     */
    public Long nonPagedSystemMemory() {
        return this.innerProperties() == null ? null : this.innerProperties().nonPagedSystemMemory();
    }

    /**
     * Set the nonPagedSystemMemory property: Non-paged system memory.
     * 
     * @param nonPagedSystemMemory the nonPagedSystemMemory value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withNonPagedSystemMemory(Long nonPagedSystemMemory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withNonPagedSystemMemory(nonPagedSystemMemory);
        return this;
    }

    /**
     * Get the pagedMemory property: Paged memory.
     * 
     * @return the pagedMemory value.
     */
    public Long pagedMemory() {
        return this.innerProperties() == null ? null : this.innerProperties().pagedMemory();
    }

    /**
     * Set the pagedMemory property: Paged memory.
     * 
     * @param pagedMemory the pagedMemory value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPagedMemory(Long pagedMemory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withPagedMemory(pagedMemory);
        return this;
    }

    /**
     * Get the peakPagedMemory property: Peak paged memory.
     * 
     * @return the peakPagedMemory value.
     */
    public Long peakPagedMemory() {
        return this.innerProperties() == null ? null : this.innerProperties().peakPagedMemory();
    }

    /**
     * Set the peakPagedMemory property: Peak paged memory.
     * 
     * @param peakPagedMemory the peakPagedMemory value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPeakPagedMemory(Long peakPagedMemory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withPeakPagedMemory(peakPagedMemory);
        return this;
    }

    /**
     * Get the timestamp property: Time stamp.
     * 
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().timestamp();
    }

    /**
     * Set the timestamp property: Time stamp.
     * 
     * @param timestamp the timestamp value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withTimestamp(OffsetDateTime timestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withTimestamp(timestamp);
        return this;
    }

    /**
     * Get the environmentVariables property: List of environment variables.
     * 
     * @return the environmentVariables value.
     */
    public Map<String, String> environmentVariables() {
        return this.innerProperties() == null ? null : this.innerProperties().environmentVariables();
    }

    /**
     * Set the environmentVariables property: List of environment variables.
     * 
     * @param environmentVariables the environmentVariables value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withEnvironmentVariables(Map<String, String> environmentVariables) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Get the isScmSite property: Is this the SCM site?.
     * 
     * @return the isScmSite value.
     */
    public Boolean isScmSite() {
        return this.innerProperties() == null ? null : this.innerProperties().isScmSite();
    }

    /**
     * Set the isScmSite property: Is this the SCM site?.
     * 
     * @param isScmSite the isScmSite value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIsScmSite(Boolean isScmSite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withIsScmSite(isScmSite);
        return this;
    }

    /**
     * Get the isWebjob property: Is this a Web Job?.
     * 
     * @return the isWebjob value.
     */
    public Boolean isWebjob() {
        return this.innerProperties() == null ? null : this.innerProperties().isWebjob();
    }

    /**
     * Set the isWebjob property: Is this a Web Job?.
     * 
     * @param isWebjob the isWebjob value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIsWebjob(Boolean isWebjob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withIsWebjob(isWebjob);
        return this;
    }

    /**
     * Get the description property: Description of process.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of process.
     * 
     * @param description the description value to set.
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProcessInfoProperties();
        }
        this.innerProperties().withDescription(description);
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
