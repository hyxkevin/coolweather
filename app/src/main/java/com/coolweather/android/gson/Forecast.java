package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @创建者 Admin
 * @创建时间 2017/3/19 15:58
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
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
