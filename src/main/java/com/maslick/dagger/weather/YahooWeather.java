package com.maslick.dagger.weather;

import com.maslick.dagger.weather.ifaces.WeatherService;

import javax.inject.Inject;

public class YahooWeather implements WeatherService {
    @Inject
    public YahooWeather() {
    }
}