package com.maslick.dagger.weather.ifaces;

import com.maslick.dagger.weather.WeatherReporter;
import com.maslick.dagger.weather.modules.GpsSensorModule;
import com.maslick.dagger.weather.modules.RosgidrometModule;
import dagger.Component;

@Component(modules = {RosgidrometModule.class, GpsSensorModule.class})
public interface AppComponent {
    WeatherReporter getWeatherReporter();
}