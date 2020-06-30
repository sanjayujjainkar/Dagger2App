package com.hsbc.dagger2app.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";
    private int horsepower;
    private int engineCapcity;

    @Inject
    public PetrolEngine(@Named("horsepower") int horsepower, @Named("enginecapacity") int engineCapcity) {
        this.horsepower = horsepower;
        this.engineCapcity = engineCapcity;
    }

    @Override
    public void start() {

        Log.d(TAG, "PetrolEngine started...Horsepower: "+horsepower+ " Capacity:"+engineCapcity);
    }
}
