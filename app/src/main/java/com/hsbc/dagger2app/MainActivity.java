package com.hsbc.dagger2app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.hsbc.dagger2app.car.Car;
import com.hsbc.dagger2app.dagger.ActivityComponent;
import com.hsbc.dagger2app.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ActivityComponent component = DaggerActivityComponent.builder()
                //.dieselEngineModule(new DieselEngineModule(60))
                .horsepower(30)
                .engineCapcity(100)
                .appComponent(((MyDaggerApplication)getApplication()).getAppComponent())
                .build();

        //car = carComponent.getCar();
        component.inject(this);

        car1.drive();
        car2.drive();

    }
}
