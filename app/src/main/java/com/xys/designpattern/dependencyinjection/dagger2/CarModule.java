package com.xys.designpattern.dependencyinjection.dagger2;

import com.xys.designpattern.dependencyinjection.Engine;
import com.xys.designpattern.dependencyinjection.Seat;
import com.xys.designpattern.dependencyinjection.Wheel;

import dagger.Module;
import dagger.Provides;

// 表示该类管理并提供依赖
@Module
public class CarModule {
    // 表示该方法提供依赖
    @Provides
    public Engine provideEngine() {
        return new Engine();
    }

    @Provides
    public Seat provideSeat() {
        return new Seat();
    }

    @Provides
    public Wheel provideWheel() {
        return new Wheel();
    }
}
