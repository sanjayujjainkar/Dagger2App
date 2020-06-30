package com.hsbc.dagger2app.dagger;

import com.hsbc.dagger2app.car.Car;
import com.hsbc.dagger2app.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = {WheelModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();
    public void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        ActivityComponent build();
        @BindsInstance
        Builder horsepower(@Named("horsepower") int horsepower);
        @BindsInstance
        Builder engineCapcity(@Named("enginecapacity") int engineCapcity);

        Builder appComponent(AppComponent appComponent);

    }
}
