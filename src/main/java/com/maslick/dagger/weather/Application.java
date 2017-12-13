package com.maslick.dagger.weather;

import com.maslick.dagger.weather.ifaces.AppComponent;
import com.maslick.dagger.weather.ifaces.DaggerAppComponent;
import com.maslick.dagger.weather.modules.RosgidrometModule;

public class Application {
    public static void main(String args[]) {
        RosgidrometModule rosgidromet = new RosgidrometModule("1234567890");
        AppComponent component = DaggerAppComponent.builder()
                .rosgidrometModule(rosgidromet)
                .build();
        WeatherReporter reporter = component.getWeatherReporter();
        reporter.report();
    }
}
