package com.xys.designpattern.imageloader;

import android.graphics.Bitmap;

// 抽象接口
public interface ImageCache {
    Bitmap get(String url);

    void put(String url, Bitmap bmp);
}