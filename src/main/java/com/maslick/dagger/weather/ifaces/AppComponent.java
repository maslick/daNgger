package com.maslick.dagger.weather.ifaces;

import com.maslick.dagger.weather.WeatherReporter;
import com.maslick.dagger.weather.modules.YahooWeatherModule;
import dagger.Component;

@Component(modules = {YahooWeatherModule.class})
public interface AppComponent {
    WeatherReporter getWeatherReporter();
}

