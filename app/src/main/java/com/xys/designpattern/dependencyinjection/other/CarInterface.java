package com.xys.designpattern.dependencyinjection.other;

import com.xys.designpattern.dependencyinjection.Engine;
import com.xys.designpattern.dependencyinjection.Seat;
import com.xys.designpattern.dependencyinjection.Wheel;

public interface CarInterface {
    void set(Engine engine);

    void set(Seat seat);

    void set(Wheel wheel);
}
