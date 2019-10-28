package com.xys.designpattern.dependencyinjection.dagger2;

import dagger.Component;

// 中间人，关联依赖提供者和依赖需求者
@Component(modules = CarModule.class)
public interface CarComponent {
    void inject(CarWithDagger carWithDagger);
}
