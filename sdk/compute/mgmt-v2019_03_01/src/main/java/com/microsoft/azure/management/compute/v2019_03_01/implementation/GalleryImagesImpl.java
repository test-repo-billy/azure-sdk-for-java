/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2019_03_01.GalleryImages;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2019_03_01.GalleryImage;

class GalleryImagesImpl extends WrapperImpl<GalleryImagesInner> implements GalleryImages {
    private final ComputeManager manager;

    GalleryImagesImpl(ComputeManager manager) {
        super(manager.inner().galleryImages());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public GalleryImageImpl define(String name) {
        return wrapModel(name);
    }

    private GalleryImageImpl wrapModel(GalleryImageInner inner) {
        return  new GalleryImageImpl(inner, manager());
    }

    private GalleryImageImpl wrapModel(String name) {
        return new GalleryImageImpl(name, this.manager());
    }

    @Override
    public Observable<GalleryImage> listByGalleryAsync(final String resourceGroupName, final String galleryName) {
        GalleryImagesInner client = this.inner();
        return client.listByGalleryAsync(resourceGroupName, galleryName)
        .flatMapIterable(new Func1<Page<GalleryImageInner>, Iterable<GalleryImageInner>>() {
            @Override
            public Iterable<GalleryImageInner> call(Page<GalleryImageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GalleryImageInner, GalleryImage>() {
            @Override
            public GalleryImage call(GalleryImageInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<GalleryImage> getAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        GalleryImagesInner client = this.inner();
        return client.getAsync(resourceGroupName, galleryName, galleryImageName)
        .flatMap(new Func1<GalleryImageInner, Observable<GalleryImage>>() {
            @Override
            public Observable<GalleryImage> call(GalleryImageInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((GalleryImage)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        GalleryImagesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, galleryName, galleryImageName).toCompletable();
    }

}
