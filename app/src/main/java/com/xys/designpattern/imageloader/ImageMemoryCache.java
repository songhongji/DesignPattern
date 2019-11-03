package com.xys.designpattern.imageloader;

import android.graphics.Bitmap;
import android.util.Log;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

public class ImageMemoryCache implements ImageCache {

    public ImageMemoryCache() {
        Log.d(TAG, "ImageMemoryCache() called");
    }

    @Override public Bitmap get(String url) {
        return null;
    }

    @Override public void put(String url, Bitmap bmp) {

    }
}
