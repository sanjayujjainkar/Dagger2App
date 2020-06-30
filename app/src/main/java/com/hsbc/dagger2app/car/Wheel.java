package com.hsbc.dagger2app.car;

public class Wheel {

    private Rim rim;
    private Tire tire;

    public Wheel(Rim rim, Tire tire) {
        this.rim = rim;
        this.tire = tire;
    }
}
