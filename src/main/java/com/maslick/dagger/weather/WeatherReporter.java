package com.maslick.dagger.weather;

import com.maslick.dagger.weather.ifaces.WeatherService;

import javax.inject.Inject;

public class WeatherReporter {

    private final WeatherService weatherService;
    private final LocationManager locationManager;

    @Inject
    public WeatherReporter(WeatherService weatherService, LocationManager locationManager) {
        this.weatherService = weatherService;
        this.locationManager = locationManager;
    }

    public void report() {
        // locationManager.getCurrentLocation()
        // weatherService.getTemperature(location)
        // print(temperature)
    }
}
