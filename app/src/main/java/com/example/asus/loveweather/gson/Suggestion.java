package com.example.asus.loveweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/3/24.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("text")
        public String info;
    }

    public class CarWash {

        @SerializedName("text")
        public String info;

    }

    public class Sport {

        @SerializedName("text")
        public String info;

    }

}
