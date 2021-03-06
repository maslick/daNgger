package com.maslick.dagger.weather.modules;

import com.maslick.dagger.weather.Rosgidromet;
import com.maslick.dagger.weather.WebSocket;
import com.maslick.dagger.weather.ifaces.WeatherService;
import dagger.Module;
import dagger.Provides;

@Module
public class RosgidrometModule {

    private final String key;

    public RosgidrometModule(String key) {
        this.key = key;
    }

    @Provides
    WeatherService provideWeatherService(WebSocket socket) {
        return new Rosgidromet(socket, key);
    }
}
