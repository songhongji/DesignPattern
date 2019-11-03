package com.xys.designpattern.imageloader.dagger;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;

import com.xys.designpattern.imageloader.ImageCache;

import javax.inject.Inject;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

public class ImageLoader {

    // 默认使用图片内存缓存
    @Inject
    public ImageCache mImageCache;

    public ImageLoader() {
        // 完成注入
        DaggerImageLoaderComponent.builder().imageCacheModel(new ImageCacheModel()).build().inject(this);
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