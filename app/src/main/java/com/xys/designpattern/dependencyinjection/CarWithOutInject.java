package com.xys.designpattern.dependencyinjection;

import android.util.Log;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

// 传统方式
public class CarWithOutInject {

    private Engine mEngine;
    private Seat mSeat;
    private Wheel mWheel;

    public CarWithOutInject() {
        mEngine = new Engine();
        mSeat = new Seat();
        mWheel = new Wheel();
        Log.d(TAG, "CarWithOutInject() called");
    }
}
