package com.maslick.dagger.weather;

import com.thirdparty.gps.GpsSensor;

import javax.inject.Inject;

public class LocationManager {

    private final GpsSensor gps;

    @Inject
    public LocationManager(GpsSensor gps) {
        this.gps = gps;
    }
}
