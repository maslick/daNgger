package com.maslick.dagger.weather;

import dagger.Component;

@Component
public interface AppComponent {
    WeatherReporter getWeatherReporter();
}
