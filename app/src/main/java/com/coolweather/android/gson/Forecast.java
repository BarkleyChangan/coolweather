package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Barkley.Chang
 * @date 2019-08-27 15:59
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}