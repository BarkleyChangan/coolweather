package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Barkley.Chang
 * @date 2019-08-27 15:54
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
