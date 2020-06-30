package com.hsbc.dagger2app.dagger;

import com.hsbc.dagger2app.car.Rim;
import com.hsbc.dagger2app.car.Tire;
import com.hsbc.dagger2app.car.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    static Rim provideRim() {
        return new Rim();
    }

    @Provides
    static Tire provideTire() {
        Tire tire = new Tire();
        tire.inflate();
        return tire;
    }

    @Provides
    static Wheel provideWheel(Rim rim, Tire tire) {
        return new Wheel(rim, tire);
    }

}
