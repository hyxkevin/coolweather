package com.coolweather.android.gson;

/**
 * @创建者 Admin
 * @创建时间 2017/3/19 15:48
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 */
public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
