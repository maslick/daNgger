package com.maslick.dagger.weather;

import com.maslick.dagger.weather.ifaces.WeatherService;

import javax.inject.Inject;

public class Gismeteo implements WeatherService {
    @Inject
    public Gismeteo() {
    }
}