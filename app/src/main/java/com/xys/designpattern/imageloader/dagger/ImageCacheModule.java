package com.xys.designpattern.imageloader.dagger;

import android.util.Log;

import com.xys.designpattern.imageloader.ImageCache;
import com.xys.designpattern.imageloader.ImageDiskCache;
import com.xys.designpattern.imageloader.ImageMemoryCache;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

// Module: 修饰类，表示改类管理并且提供依赖
// Provides: 修饰方法，该方法提供依赖
@Module
public class ImageCacheModule {

    @MyScope
//    @Singleton
//    @Reusable
    @Named("memory")
    @Provides
    public ImageCache provideMemoryCache() {
        Log.d(TAG, "provideMemoryCache() called");
        return new ImageMemoryCache();
    }

    @MyScope
//    @Singleton
//    @Reusable
    @Named("disk")
    @Provides ImageCache provideMemoryCache2() {
        Log.d(TAG, "provideMemoryCache2() called");
        return new ImageDiskCache();
    }
}