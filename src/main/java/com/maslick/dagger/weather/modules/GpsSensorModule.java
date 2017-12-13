package com.maslick.dagger.weather.modules;

import com.thirdparty.gps.GpsSensor;
import dagger.Module;
import dagger.Provides;

@Module
public class GpsSensorModule {
    @Provides
    GpsSensor provideGpsSensor() {
        GpsSensor gps = new GpsSensor();
        gps.calibrate();
        return gps;
    }
}