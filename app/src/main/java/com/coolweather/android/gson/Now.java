package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @创建者 Admin
 * @创建时间 2017/3/19 15:50
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String  info;
    }
}
