package com.maslick.dagger.weather;

import com.maslick.dagger.weather.ifaces.WeatherService;

public class Rosgidromet implements WeatherService {

    private final WebSocket socket;
    private final String key;

    public Rosgidromet(WebSocket socket, String key) {
        this.socket = socket;
        this.key = key;
    }

    @Override
    public String getTemperature(String location) {
        return "+7";
    }
}
