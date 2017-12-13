package com.maslick.dagger.weather;

import com.maslick.dagger.weather.ifaces.AppComponent;
import com.maslick.dagger.weather.ifaces.DaggerAppComponent;

public class Application {
    public static void main(String args[]) {
        AppComponent component = DaggerAppComponent.create();
        WeatherReporter reporter = component.getWeatherReporter();
        reporter.report();
    }
}
