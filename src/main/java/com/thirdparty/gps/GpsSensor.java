package com.thirdparty.gps;

public class GpsSensor {

    public GpsSensor() {
    }

    public void calibrate() {
        System.out.println("calibration");
    }

    public String getCurrentLocation() {
        return "Ljubljana, Slovenia";
    }
}