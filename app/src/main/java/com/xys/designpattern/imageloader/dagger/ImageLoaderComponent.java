package com.xys.designpattern.imageloader.dagger;

import com.xys.designpattern.imageloader.ImageCache;

import dagger.BindsInstance;
import dagger.Component;

// Component: 联系依赖提供者和依赖需求者, 只能用于接口或者抽象类
// Scope：将实例的生命周期绑定到Component上面
@MyScope
//@Singleton
@Component(modules = ImageCacheModule.class)
public interface ImageLoaderComponent {

    // 需要注入依赖的对象
    void inject(ImageLoader imageLoader);

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder imageCache(ImageCache imageCache);
//        ImageLoaderComponent build();
//    }
}