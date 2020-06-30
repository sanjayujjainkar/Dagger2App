package com.hsbc.dagger2app;

import android.app.Application;

import com.hsbc.dagger2app.dagger.AppComponent;
import com.hsbc.dagger2app.dagger.DaggerAppComponent;

public class MyDaggerApplication extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
