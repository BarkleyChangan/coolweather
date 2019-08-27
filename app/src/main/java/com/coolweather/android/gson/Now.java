package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Barkley.Chang
 * @date 2019-08-27 15:56
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}