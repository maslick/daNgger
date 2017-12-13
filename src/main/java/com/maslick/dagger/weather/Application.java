package com.maslick.dagger.weather;

import com.maslick.dagger.weather.ifaces.AppComponent;
import com.maslick.dagger.weather.ifaces.DaggerAppComponent;
import com.maslick.dagger.weather.modules.RosgidrometModule;

public class Application {
    public static void main(String args[]) {

        // WebSocket ws = new WebSocket();
        // WeatherService rosgidromet = new Rosgidromet(ws, "1234567890");
        // GpsSensor gps = new GpsSensor();
        // LocationManager locationManager = new LocationManager(gps);
        // WeatherReporter reporter = new WeatherReporter(rosgidromet, locationManager);
        // reporter.report();

        RosgidrometModule rosgidromet = new RosgidrometModule("1234567890");
        AppComponent component = DaggerAppComponent.builder().rosgidrometModule(rosgidromet).build();
        WeatherReporter reporter = component.getWeatherReporter();
        reporter.report();
    }
}
