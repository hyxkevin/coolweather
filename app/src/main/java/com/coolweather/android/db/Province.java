package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @创建者 Admin
 * @创建时间 2017/3/12 12:59
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 */
//省 bean类
public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
