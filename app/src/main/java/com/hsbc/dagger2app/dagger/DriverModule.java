package com.hsbc.dagger2app.dagger;

import com.hsbc.dagger2app.Driver;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @PerApplication
    static Driver gerDriver() {
        return new Driver();
    }
}
