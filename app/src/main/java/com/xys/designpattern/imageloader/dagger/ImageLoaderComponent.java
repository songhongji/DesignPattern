package com.xys.designpattern.imageloader.dagger;

import dagger.Component;

// Component: 联系依赖提供者和依赖需求者, 只能用于接口或者抽象类
@Component(modules = ImageCacheModel.class)
public interface ImageLoaderComponent {

    // 需要注入依赖的对象
    void inject(ImageLoader imageLoader);
}