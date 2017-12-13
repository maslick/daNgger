package com.maslick.dagger.weather.modules;

import com.maslick.dagger.weather.Gismeteo;
import com.maslick.dagger.weather.ifaces.WeatherService;
import dagger.Module;
import dagger.Provides;

@Module
public class GismeteoModule {
    @Provides
    WeatherService provideWeatherService() {
        return new Gismeteo();
    }
}