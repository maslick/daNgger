package com.maslick.dagger.weather.ifaces;

import com.maslick.dagger.weather.WeatherReporter;
import com.maslick.dagger.weather.modules.RosgidrometModule;
import dagger.Component;

@Component(modules = {RosgidrometModule.class})
public interface AppComponent {
    WeatherReporter getWeatherReporter();
}

