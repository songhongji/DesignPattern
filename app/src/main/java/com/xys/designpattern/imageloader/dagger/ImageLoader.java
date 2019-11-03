package com.xys.designpattern.imageloader.dagger;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;

import com.xys.designpattern.dependencyinjection.dagger2.DaggerCarComponent;
import com.xys.designpattern.imageloader.ImageCache;

import javax.inject.Inject;
import javax.inject.Named;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

public class ImageLoader {

    // 默认使用图片内存缓存
    @Named("disk")
    @Inject
    public ImageCache mImageCache;

//    // 多个注入
//    @Inject
//    public Provider<ImageCache> mImageCacheProvider;
//
//    // 延迟注入
//    @Inject Lazy<ImageCache> mImageCacheLazy;

    public ImageLoader() {
        // 完成注入
        DaggerImageLoaderComponent.builder().imageCacheModule(new ImageCacheModule()).build().inject(this);
//        DaggerImageLoaderComponent.builder().imageCache()
        Log.d(TAG, "ImageLoader() called");
    }

    // 展示图片，优先使用缓存，最后下载
    public void displayImage(final String url, final ImageView imageView) {
        // ...
    }

    // 下载图片
    public Bitmap downloadImage(String imageUrl) {
        //...
        return null;
    }
}