package com.xys.designpattern.dependencyinjection.other;

import android.util.Log;

import com.xys.designpattern.dependencyinjection.Engine;
import com.xys.designpattern.dependencyinjection.Seat;
import com.xys.designpattern.dependencyinjection.Wheel;

import static com.xys.designpattern.dependencyinjection.Config.TAG;

// 通过set来注入
public class CarWithSetter {

    private Engine mEngine;
    private Seat mSeat;
    private Wheel mWheel;

    public void setEngine(Engine engine) {
        mEngine = engine;
    }

    public void setSeat(Seat seat) {
        mSeat = seat;
    }

    public void setWheel(Wheel wheel) {
        mWheel = wheel;
    }

    public CarWithSetter() {
        Log.d(TAG, "CarWithSetter() called");
    }
}
