package com.example.asus.loveweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/3/24.
 */

public class Basic {

    @SerializedName("city")
    public  String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
