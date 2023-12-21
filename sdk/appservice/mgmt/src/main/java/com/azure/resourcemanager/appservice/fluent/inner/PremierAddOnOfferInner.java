// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.AppServicePlanRestrictions;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PremierAddOnOffer model. */
@JsonFlatten
@Fluent
public class PremierAddOnOfferInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PremierAddOnOfferInner.class);

    /*
     * Premier add on SKU.
     */
    @JsonProperty(value = "properties.sku")
    private String sku;

    /*
     * Premier add on offer Product.
     */
    @JsonProperty(value = "properties.product")
    private String product;

    /*
     * Premier add on offer Vendor.
     */
    @JsonProperty(value = "properties.vendor")
    private String vendor;

    /*
     * <code>true</code> if promotion code is required; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.promoCodeRequired")
    private Boolean promoCodeRequired;

    /*
     * Premier add on offer Quota.
     */
    @JsonProperty(value = "properties.quota")
    private Integer quota;

    /*
     * App Service plans this offer is restricted to.
     */
    @JsonProperty(value = "properties.webHostingPlanRestrictions")
    private AppServicePlanRestrictions webHostingPlanRestrictions;

    /*
     * Privacy policy URL.
     */
    @JsonProperty(value = "properties.privacyPolicyUrl")
    private String privacyPolicyUrl;

    /*
     * Legal terms URL.
     */
    @JsonProperty(value = "properties.legalTermsUrl")
    private String legalTermsUrl;

    /*
     * Marketplace publisher.
     */
    @JsonProperty(value = "properties.marketplacePublisher")
    private String marketplacePublisher;

    /*
     * Marketplace offer.
     */
    @JsonProperty(value = "properties.marketplaceOffer")
    private String marketplaceOffer;

    /**
     * Get the sku property: Premier add on SKU.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Premier add on SKU.
     *
     * @param sku the sku value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the product property: Premier add on offer Product.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: Premier add on offer Product.
     *
     * @param product the product value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the vendor property: Premier add on offer Vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set the vendor property: Premier add on offer Vendor.
     *
     * @param vendor the vendor value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get the promoCodeRequired property: &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the promoCodeRequired value.
     */
    public Boolean promoCodeRequired() {
        return this.promoCodeRequired;
    }

    /**
     * Set the promoCodeRequired property: &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param promoCodeRequired the promoCodeRequired value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withPromoCodeRequired(Boolean promoCodeRequired) {
        this.promoCodeRequired = promoCodeRequired;
        return this;
    }

    /**
     * Get the quota property: Premier add on offer Quota.
     *
     * @return the quota value.
     */
    public Integer quota() {
        return this.quota;
    }

    /**
     * Set the quota property: Premier add on offer Quota.
     *
     * @param quota the quota value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * Get the webHostingPlanRestrictions property: App Service plans this offer is restricted to.
     *
     * @return the webHostingPlanRestrictions value.
     */
    public AppServicePlanRestrictions webHostingPlanRestrictions() {
        return this.webHostingPlanRestrictions;
    }

    /**
     * Set the webHostingPlanRestrictions property: App Service plans this offer is restricted to.
     *
     * @param webHostingPlanRestrictions the webHostingPlanRestrictions value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withWebHostingPlanRestrictions(
        AppServicePlanRestrictions webHostingPlanRestrictions) {
        this.webHostingPlanRestrictions = webHostingPlanRestrictions;
        return this;
    }

    /**
     * Get the privacyPolicyUrl property: Privacy policy URL.
     *
     * @return the privacyPolicyUrl value.
     */
    public String privacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    /**
     * Set the privacyPolicyUrl property: Privacy policy URL.
     *
     * @param privacyPolicyUrl the privacyPolicyUrl value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        return this;
    }

    /**
     * Get the legalTermsUrl property: Legal terms URL.
     *
     * @return the legalTermsUrl value.
     */
    public String legalTermsUrl() {
        return this.legalTermsUrl;
    }

    /**
     * Set the legalTermsUrl property: Legal terms URL.
     *
     * @param legalTermsUrl the legalTermsUrl value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withLegalTermsUrl(String legalTermsUrl) {
        this.legalTermsUrl = legalTermsUrl;
        return this;
    }

    /**
     * Get the marketplacePublisher property: Marketplace publisher.
     *
     * @return the marketplacePublisher value.
     */
    public String marketplacePublisher() {
        return this.marketplacePublisher;
    }

    /**
     * Set the marketplacePublisher property: Marketplace publisher.
     *
     * @param marketplacePublisher the marketplacePublisher value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withMarketplacePublisher(String marketplacePublisher) {
        this.marketplacePublisher = marketplacePublisher;
        return this;
    }

    /**
     * Get the marketplaceOffer property: Marketplace offer.
     *
     * @return the marketplaceOffer value.
     */
    public String marketplaceOffer() {
        return this.marketplaceOffer;
    }

    /**
     * Set the marketplaceOffer property: Marketplace offer.
     *
     * @param marketplaceOffer the marketplaceOffer value to set.
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withMarketplaceOffer(String marketplaceOffer) {
        this.marketplaceOffer = marketplaceOffer;
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
    }
}
