package com.hsbc.dagger2app.dagger;

import com.hsbc.dagger2app.Driver;

import dagger.Component;

@PerApplication
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
