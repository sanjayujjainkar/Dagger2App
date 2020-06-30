package com.hsbc.dagger2app.dagger;

import com.hsbc.dagger2app.car.DieselEngine;
import com.hsbc.dagger2app.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsepower;

    public DieselEngineModule(int horsepower) {
        this.horsepower = horsepower;
    }

    @Provides
    public int getHorsepower() {
        return horsepower;
    }

    @Provides
    public Engine providelEngine(DieselEngine dieselEngine) {
        return dieselEngine;
    }
}
