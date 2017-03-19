package com.coolweather.android;

import com.facebook.stetho.Stetho;

import org.litepal.LitePalApplication;

/**
 * @创建者 Admin
 * @创建时间 2017/3/19 14:19
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 */
public class CoolWeatherAppcaliton extends LitePalApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());
    }
}
