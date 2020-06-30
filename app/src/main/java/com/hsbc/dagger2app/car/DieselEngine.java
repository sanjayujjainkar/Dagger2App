package com.hsbc.dagger2app.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";
    private int horsepower;

    @Inject
    public DieselEngine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started..horse power:"+horsepower);
    }
}
