package com.xys.designpattern.dependencyinjection.other;

import android.util.Log;

import com.xys.designpattern.dependencyinjection.Engine;
import com.xys.designpattern.dependencyinjection.Seat;
import com.xys.designpattern.dependencyinjection.Wheel;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

// 通过接口注入
public class CarWithInterface implements CarInterface {

    private Engine mEngine;
    private Seat mSeat;
    private Wheel mWheel;

    @Override public void set(Engine engine) {
        mEngine = engine;
    }

    @Override public void set(Seat seat) {
        mSeat = seat;
    }

    @Override public void set(Wheel wheel) {
        mWheel = wheel;
    }

    public CarWithInterface() {
        Log.d(TAG, "CarWithInterface() called");
    }
}
