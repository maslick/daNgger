package com.maslick.dagger.weather.modules;

import com.maslick.dagger.weather.YahooWeather;
import com.maslick.dagger.weather.ifaces.WeatherService;
import dagger.Module;
import dagger.Provides;

@Module
public class YahooWeatherModule {
    @Provides
    WeatherService provideWeatherService() {
        return new YahooWeather();
    }
}