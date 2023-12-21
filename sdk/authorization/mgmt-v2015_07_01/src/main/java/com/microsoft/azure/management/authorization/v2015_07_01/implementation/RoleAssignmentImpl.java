/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01.implementation;

import com.microsoft.azure.management.authorization.v2015_07_01.RoleAssignment;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.authorization.v2015_07_01.RoleAssignmentProperties;
import com.microsoft.azure.management.authorization.v2015_07_01.RoleAssignmentPropertiesWithScope;
import rx.functions.Func1;

class RoleAssignmentImpl extends CreatableUpdatableImpl<RoleAssignment, RoleAssignmentInner, RoleAssignmentImpl> implements RoleAssignment, RoleAssignment.Definition, RoleAssignment.Update {
    private final AuthorizationManager manager;
    private String scope;
    private String roleAssignmentName;
    private RoleAssignmentProperties cproperties;
    private RoleAssignmentProperties uproperties;

    RoleAssignmentImpl(String name, AuthorizationManager manager) {
        super(name, new RoleAssignmentInner());
        this.manager = manager;
        // Set resource name
        this.roleAssignmentName = name;
        //
        this.cproperties = new RoleAssignmentProperties();
        this.uproperties = new RoleAssignmentProperties();
    }

    RoleAssignmentImpl(RoleAssignmentInner inner, AuthorizationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.roleAssignmentName = inner.name();
        // set resource ancestor and positional variables
        this.roleAssignmentName = IdParsingUtils.getValueFromIdByName(inner.id(), "roleAssignments");
        this.scope = IdParsingUtils.getValueFromIdByPosition(inner.id(), 0);
        //
        this.cproperties = new RoleAssignmentProperties();
        this.uproperties = new RoleAssignmentProperties();
    }

    @Override
    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RoleAssignment> createResourceAsync() {
        RoleAssignmentsInner client = this.manager().inner().roleAssignments();
        return client.createAsync(this.scope, this.roleAssignmentName, this.cproperties)
            .map(new Func1<RoleAssignmentInner, RoleAssignmentInner>() {
               @Override
               public RoleAssignmentInner call(RoleAssignmentInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RoleAssignment> updateResourceAsync() {
        RoleAssignmentsInner client = this.manager().inner().roleAssignments();
        return client.createAsync(this.scope, this.roleAssignmentName, this.uproperties)
            .map(new Func1<RoleAssignmentInner, RoleAssignmentInner>() {
               @Override
               public RoleAssignmentInner call(RoleAssignmentInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RoleAssignmentInner> getInnerAsync() {
        RoleAssignmentsInner client = this.manager().inner().roleAssignments();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new RoleAssignmentProperties();
        this.uproperties = new RoleAssignmentProperties();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public RoleAssignmentPropertiesWithScope properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public RoleAssignmentImpl withExistingProvider() {
        return this;
    }

    @Override
    public RoleAssignmentImpl withScope(String scope) {
        this.scope = scope;
        return this;
    }

    @Override
    public RoleAssignmentImpl withProperties(RoleAssignmentProperties properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
