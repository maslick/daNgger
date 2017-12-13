package com.maslick.dagger.weather;

import dagger.Module;
import dagger.Provides;

@Module
public class YahooWeatherModule {
    @Provides
    WeatherService provideWeatherService() {
        return new YahooWeather();
    }
}