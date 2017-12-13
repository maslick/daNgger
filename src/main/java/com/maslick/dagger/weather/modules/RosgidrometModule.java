package com.maslick.dagger.weather.modules;

import com.maslick.dagger.weather.Rosgidromet;
import com.maslick.dagger.weather.ifaces.WeatherService;
import dagger.Module;
import dagger.Provides;

@Module
public class RosgidrometModule {
    @Provides
    WeatherService provideWeatherService() {
        return new Rosgidromet();
    }
}
