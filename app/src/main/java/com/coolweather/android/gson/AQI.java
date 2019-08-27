package com.coolweather.android.gson;

/**
 * @author Barkley.Chang
 * @date 2019-08-27 15:55
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}