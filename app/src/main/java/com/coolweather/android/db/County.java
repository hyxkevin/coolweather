package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @创建者 Admin
 * @创建时间 2017/3/12 13:04
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 */
//县
public class County extends DataSupport {
    private int id;
    //县的名字
    private String countyName;
    //对应的天气id
    private String weatherId;
    //城市id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
