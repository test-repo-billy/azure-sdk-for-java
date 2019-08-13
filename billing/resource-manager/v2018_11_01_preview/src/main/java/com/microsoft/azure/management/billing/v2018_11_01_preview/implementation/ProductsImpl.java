/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Products;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ProductsListResult;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ProductSummary;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ValidateProductTransferEligibilityResult;
import com.microsoft.azure.management.billing.v2018_11_01_preview.UpdateAutoRenewOperationSummary;
import com.microsoft.azure.management.billing.v2018_11_01_preview.TransferProductRequestProperties;

class ProductsImpl extends WrapperImpl<ProductsInner> implements Products {
    private final BillingManager manager;

    ProductsImpl(BillingManager manager) {
        super(manager.inner().products());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private ProductSummaryImpl wrapModel(ProductSummaryInner inner) {
        return  new ProductSummaryImpl(inner, manager());
    }

    @Override
    public Observable<ProductsListResult> listByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName) {
        ProductsInner client = this.inner();
        return client.listByInvoiceSectionNameAsync(billingAccountName, invoiceSectionName)
        .map(new Func1<ProductsListResultInner, ProductsListResult>() {
            @Override
            public ProductsListResult call(ProductsListResultInner inner) {
                return new ProductsListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProductSummary> getAsync(String billingAccountName, String invoiceSectionName, String productName) {
        ProductsInner client = this.inner();
        return client.getAsync(billingAccountName, invoiceSectionName, productName)
        .map(new Func1<ProductSummaryInner, ProductSummary>() {
            @Override
            public ProductSummary call(ProductSummaryInner inner) {
                return new ProductSummaryImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProductSummary> transferAsync(String billingAccountName, String invoiceSectionName, String productName, TransferProductRequestProperties parameters) {
        ProductsInner client = this.inner();
        return client.transferAsync(billingAccountName, invoiceSectionName, productName, parameters)
        .map(new Func1<ProductSummaryInner, ProductSummary>() {
            @Override
            public ProductSummary call(ProductSummaryInner inner) {
                return new ProductSummaryImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ValidateProductTransferEligibilityResult> validateTransferAsync(String billingAccountName, String invoiceSectionName, String productName, TransferProductRequestProperties parameters) {
        ProductsInner client = this.inner();
        return client.validateTransferAsync(billingAccountName, invoiceSectionName, productName, parameters)
        .map(new Func1<ValidateProductTransferEligibilityResultInner, ValidateProductTransferEligibilityResult>() {
            @Override
            public ValidateProductTransferEligibilityResult call(ValidateProductTransferEligibilityResultInner inner) {
                return new ValidateProductTransferEligibilityResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UpdateAutoRenewOperationSummary> updateAutoRenewByBillingAccountNameAsync(String billingAccountName, String productName) {
        ProductsInner client = this.inner();
        return client.updateAutoRenewByBillingAccountNameAsync(billingAccountName, productName)
        .map(new Func1<UpdateAutoRenewOperationSummaryInner, UpdateAutoRenewOperationSummary>() {
            @Override
            public UpdateAutoRenewOperationSummary call(UpdateAutoRenewOperationSummaryInner inner) {
                return new UpdateAutoRenewOperationSummaryImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UpdateAutoRenewOperationSummary> updateAutoRenewByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName, String productName) {
        ProductsInner client = this.inner();
        return client.updateAutoRenewByInvoiceSectionNameAsync(billingAccountName, invoiceSectionName, productName)
        .map(new Func1<UpdateAutoRenewOperationSummaryInner, UpdateAutoRenewOperationSummary>() {
            @Override
            public UpdateAutoRenewOperationSummary call(UpdateAutoRenewOperationSummaryInner inner) {
                return new UpdateAutoRenewOperationSummaryImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProductSummary> listByBillingAccountNameAsync(final String billingAccountName) {
        ProductsInner client = this.inner();
        return client.listByBillingAccountNameAsync(billingAccountName)
        .flatMapIterable(new Func1<Page<ProductSummaryInner>, Iterable<ProductSummaryInner>>() {
            @Override
            public Iterable<ProductSummaryInner> call(Page<ProductSummaryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProductSummaryInner, ProductSummary>() {
            @Override
            public ProductSummary call(ProductSummaryInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
