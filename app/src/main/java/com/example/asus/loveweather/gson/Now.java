package com.example.asus.loveweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/3/24.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("text")
        public String info;

    }

}
