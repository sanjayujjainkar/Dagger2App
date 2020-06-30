package com.hsbc.dagger2app.car;

import android.util.Log;

import com.hsbc.dagger2app.Driver;
import com.hsbc.dagger2app.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheel;
    private Driver driver;

    @Inject
    public Car(Driver driver, Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
        this.driver = driver;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driver "+driver+" driving..Car: "+this);
    }
}
