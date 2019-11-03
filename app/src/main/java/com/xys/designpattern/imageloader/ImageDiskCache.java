package com.xys.designpattern.imageloader;

import android.graphics.Bitmap;
import android.util.Log;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

public class ImageDiskCache implements ImageCache {

    public ImageDiskCache() {
        Log.d(TAG, "ImageDiskCache() called");
    }

    @Override public Bitmap get(String url) {
        return null;
    }

    @Override public void put(String url, Bitmap bmp) {

    }
}
