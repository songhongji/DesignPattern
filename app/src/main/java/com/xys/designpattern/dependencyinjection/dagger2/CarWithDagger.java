package com.xys.designpattern.dependencyinjection.dagger2;

import android.util.Log;

import com.xys.designpattern.dependencyinjection.Engine;
import com.xys.designpattern.dependencyinjection.Seat;
import com.xys.designpattern.dependencyinjection.Wheel;

import javax.inject.Inject;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

// 采用dagger依赖注入的方式
public class CarWithDagger {
    @Inject
    Engine mEngine;

    @Inject
    Seat mSeat;

    @Inject
    Wheel mWheel;

    public CarWithDagger() {
        DaggerCarComponent.builder().carModule(new CarModule()).build().inject(this);
        Log.d(TAG, "CarWithDagger() called");
    }
}
