package com.maslick.dagger.weather;

public class Application {
    public static void main(String args[]) {
        AppComponent component = DaggerAppComponent.create();
        WeatherReporter reporter = component.getWeatherReporter();
        reporter.report();
    }
}
