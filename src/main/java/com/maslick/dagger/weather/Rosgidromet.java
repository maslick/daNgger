package com.maslick.dagger.weather;

import com.maslick.dagger.weather.ifaces.WeatherService;

import javax.inject.Inject;

public class Rosgidromet implements WeatherService {

    private final WebSocket socket;

    @Inject
    public Rosgidromet(WebSocket socket) {
        this.socket = socket;
    }
}
