package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @创建者 Admin
 * @创建时间 2017/3/12 13:02
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 */
//市 bean
public class City extends DataSupport {
    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
