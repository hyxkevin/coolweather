package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @创建者 Admin
 * @创建时间 2017/3/19 15:44
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 */
//和风天气返回数据里的5个实体类 basic
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
