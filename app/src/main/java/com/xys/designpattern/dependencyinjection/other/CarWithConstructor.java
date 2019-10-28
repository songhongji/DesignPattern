package com.xys.designpattern.dependencyinjection.other;

import android.util.Log;

import com.xys.designpattern.dependencyinjection.Engine;
import com.xys.designpattern.dependencyinjection.Seat;
import com.xys.designpattern.dependencyinjection.Wheel;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

// 通过构造函数注入
public class CarWithConstructor {
    private Engine mEngine;
    private Seat mSeat;
    private Wheel mWheel;

    public CarWithConstructor(Engine engine, Seat seat, Wheel wheel) {
        this.mEngine = engine;
        this.mSeat = seat;
        this.mWheel = wheel;
        Log.d(TAG, "CarWithConstructor() called with: engine = [" + engine + "], seat = [" + seat + "], wheel = [" + wheel + "]");
    }
}
