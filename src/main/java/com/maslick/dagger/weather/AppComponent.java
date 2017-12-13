package com.maslick.dagger.weather;

import dagger.Component;

@Component(modules = {YahooWeatherModule.class})
public interface AppComponent {
    WeatherReporter getWeatherReporter();
}

