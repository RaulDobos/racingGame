package org.fasttrackit;

//"is-a" relationship / inheritance

public class AutoVehicle extends Vehicle{

    // "has-a" relationship / Aggregation
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
}
