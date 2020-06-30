package com.hsbc.dagger2app.dagger;

import com.hsbc.dagger2app.car.Engine;
import com.hsbc.dagger2app.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine petrolEngine);
}
